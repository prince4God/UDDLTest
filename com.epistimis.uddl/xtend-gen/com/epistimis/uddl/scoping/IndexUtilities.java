package com.epistimis.uddl.scoping;

import com.epistimis.uddl.exceptions.NameCollisionException;
import com.epistimis.uddl.exceptions.NamedObjectNotFoundException;
import com.epistimis.uddl.uddl.UddlPackage;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * This is modified from the book (See https://github.com/LorenzoBettini/packtpub-xtext-book-2nd-examples)
 * Smalljava = SmallJavaIndex.xtend
 */
@SuppressWarnings("all")
public class IndexUtilities {
  @Inject
  private ResourceDescriptionsProvider rdp;

  @Inject
  private IContainer.Manager cm;

  @Inject
  private IQualifiedNameProvider qnp;

  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o, final EClass type) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer container) -> {
      return container.getExportedObjectsByType(type);
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(o), _function));
  }

  public Iterable<EObject> getVisibleObjects(final EObject context, final EClass type) {
    final Function1<IEObjectDescription, EObject> _function = (IEObjectDescription it) -> {
      return IndexUtilities.objectFromDescription(context.eResource(), it);
    };
    return IterableExtensions.<IEObjectDescription, EObject>map(this.getVisibleEObjectDescriptions(context, type), _function);
  }

  /**
   * Find all containers visible from this object
   */
  public List<IContainer> getVisibleContainers(final EObject o) {
    List<IContainer> _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(o.eResource());
      final IResourceDescription rd = index.getResourceDescription(o.eResource().getURI());
      List<IContainer> _xifexpression = null;
      if ((rd != null)) {
        _xifexpression = this.cm.getVisibleContainers(rd, index);
      } else {
        return new ArrayList<IContainer>();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public IResourceDescription getResourceDescription(final EObject o) {
    IResourceDescription _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(o.eResource());
      _xblockexpression = index.getResourceDescription(o.eResource().getURI());
    }
    return _xblockexpression;
  }

  public Iterable<IEObjectDescription> getExportedEObjectDescriptions(final EObject o) {
    return this.getResourceDescription(o).getExportedObjects();
  }

  public Iterable<IEObjectDescription> getExportedEObjectDescriptionsByType(final EObject o, final EClass type) {
    return this.getResourceDescription(o).getExportedObjectsByType(type);
  }

  public Map<QualifiedName, IEObjectDescription> getVisibleExternalEObjectDescriptionsByType(final EObject o, final EClass type) {
    final Iterable<IEObjectDescription> allVisibleEObjectDescriptions = this.getVisibleEObjectDescriptions(o, type);
    final Iterable<IEObjectDescription> allExportedEObjectDescriptions = this.getExportedEObjectDescriptionsByType(o, type);
    final Set<IEObjectDescription> difference = IterableExtensions.<IEObjectDescription>toSet(allVisibleEObjectDescriptions);
    difference.removeAll(IterableExtensions.<IEObjectDescription>toSet(allExportedEObjectDescriptions));
    final Function1<IEObjectDescription, QualifiedName> _function = (IEObjectDescription it) -> {
      return it.getQualifiedName();
    };
    return IterableExtensions.<QualifiedName, IEObjectDescription>toMap(difference, _function);
  }

  /**
   * Find all visible EObjects that match this type and name. The name may be
   * a leaf, RQN, or FQN. Note the following:
   * 1) We are checking the name from the leaf up. The assumption here is that
   * in most cases, a leaf or RQN will be used - so starting with that comparison
   * will return success more quickly.
   * 2) If the leaf is not in the name, then the name won't match at all - so
   * there is no point in continuing to check.
   * 
   * NOTE: This defaults to ignoring case. You can specify if you want to use case with
   * an optional 4th parameter.
   * @param context The context to search
   * @param type The EClass to search for
   * @param name The name of the instance to search for
   * 
   * @return A list of all the all the objects visible in this context of that type
   * with that name
   */
  public List<IEObjectDescription> searchAllVisibleEObjectDescriptions(final EObject context, final EClass type, final String name) {
    return this.searchAllVisibleEObjectDescriptions(context, type, name, true);
  }

  /**
   * Find all visible EObjects that match this type and name. The name may be
   * a leaf, RQN, or FQN. Note the following:
   * 1) We are checking the name from the leaf up. The assumption here is that
   * in most cases, a leaf or RQN will be used - so starting with that comparison
   * will return success more quickly.
   * 2) If the leaf is not in the name, then the name won't match at all - so
   * there is no point in continuing to check.
   * 
   * @param context The context to search
   * @param type The EClass to search for
   * @param name The name of the instance to search for
   * @param ignoreCase true to ignore case, false to use case
   * 
   * NOTE: This method returns a synchronized list just in case there is a threading issue
   * @return A list of all the all the objects visible in this context of that type
   * with that name
   */
  public List<IEObjectDescription> searchAllVisibleEObjectDescriptions(final EObject context, final EClass type, final String name, final boolean ignoreCase) {
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      final QualifiedName qn = it.getQualifiedName();
      for (int i = (qn.getSegmentCount() - 1); (i >= 0); i--) {
        {
          final String rqn = qn.skipFirst(i).toString();
          int _xifexpression = (int) 0;
          if (ignoreCase) {
            _xifexpression = name.toLowerCase().indexOf(rqn.toLowerCase());
          } else {
            _xifexpression = name.indexOf(rqn);
          }
          final int ndx = _xifexpression;
          if ((ndx == (-1))) {
            return Boolean.valueOf(false);
          } else {
            if ((ndx == 0)) {
              return Boolean.valueOf(true);
            } else {
            }
          }
        }
      }
      return Boolean.valueOf(false);
    };
    return Collections.<IEObjectDescription>synchronizedList(IterableExtensions.<IEObjectDescription>toList(IterableExtensions.<IEObjectDescription>filter(this.getVisibleEObjectDescriptions(context, type), _function)));
  }

  public List<EObject> searchAllVisibleObjects(final EObject context, final EClass type, final String name) {
    final Function1<IEObjectDescription, EObject> _function = (IEObjectDescription it) -> {
      return IndexUtilities.objectFromDescription(context.eResource(), it);
    };
    return ListExtensions.<IEObjectDescription, EObject>map(this.searchAllVisibleEObjectDescriptions(context, type, name), _function);
  }

  public static EObject objectFromDescription(final Resource res, final IEObjectDescription desc) {
    if ((desc == null)) {
      return null;
    }
    EObject o = desc.getEObjectOrProxy();
    boolean _eIsProxy = o.eIsProxy();
    if (_eIsProxy) {
      o = res.getResourceSet().getEObject(desc.getEObjectURI(), true);
    }
    return o;
  }

  /**
   * Find a unique object of the specified type and name. Log errors if none or more
   * than one is found.
   */
  public EObject getUniqueObjectForName(final EObject context, final EClass type, final String name) {
    EObject _xblockexpression = null;
    {
      final List<EObject> objList = this.searchAllVisibleObjects(context, type, name);
      EObject _switchResult = null;
      int _size = objList.size();
      switch (_size) {
        case 0:
          final String msg = MessageFormat.format("No EObject found with name {0}", name);
          throw new NamedObjectNotFoundException(msg);
        case 1:
          _switchResult = objList.get(0);
          break;
        default:
          String _printEObjectNameCollisions = this.printEObjectNameCollisions(name, type.getName(), objList);
          throw new NameCollisionException(_printEObjectNameCollisions);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }

  private static String COLLISION_MSG_FMT = "{0} makes ambiguous reference to instances of type {1}. It could be: \n";

  /**
   * It is possible that there are name collisions from searches. This is a standard way to list them.
   * @param qn A string version of a possibly qualified name
   * @param typeName The type we were looking for
   * @param descriptions What we found
   */
  public String printIEObjectDescriptionNameCollisions(final String qn, final String typeName, final List<IEObjectDescription> descriptions) {
    String msg = MessageFormat.format(IndexUtilities.COLLISION_MSG_FMT, qn, typeName);
    for (final IEObjectDescription d : descriptions) {
      String _msg = msg;
      String _format = MessageFormat.format("\t {0}\n", d.getQualifiedName().toString());
      msg = (_msg + _format);
    }
    return msg;
  }

  /**
   * It is possible that there are name collisions from searches. This is a standard way to list them.
   * @param qn A string version of a possibly qualified name
   * @param typeName The type we were looking for
   * @param objects What we found
   */
  public String printEObjectNameCollisions(final String qn, final String typeName, final List<EObject> objects) {
    String msg = MessageFormat.format(IndexUtilities.COLLISION_MSG_FMT, qn, typeName);
    for (final EObject o : objects) {
      String _msg = msg;
      String _format = MessageFormat.format("\t {0}\n", this.qnp.getFullyQualifiedName(o).toString());
      msg = (_msg + _format);
    }
    return msg;
  }

  /**
   * These methods are specific to this package
   */
  public Iterable<IEObjectDescription> getVisibleDataModelDescriptions(final EObject o) {
    return this.getVisibleEObjectDescriptions(o, UddlPackage.eINSTANCE.getDataModel());
  }

  public Iterable<IEObjectDescription> getExportedDataModelEObjectDescriptions(final EObject o) {
    return this.getResourceDescription(o).getExportedObjectsByType(UddlPackage.eINSTANCE.getDataModel());
  }

  public Map<QualifiedName, IEObjectDescription> getVisibleExternalDataModelDescriptions(final EObject o) {
    return this.getVisibleExternalEObjectDescriptionsByType(o, UddlPackage.eINSTANCE.getDataModel());
  }

  /**
   * Find all the resources that reference the referenceTarget
   * from: https://www.eclipse.org/forums/index.php/t/165076/
   * NOTE: This is from an old post - UsageCrossReferencer is likely newer
   */
  public List<Resource> getReferencingResources(final EObject referenceTarget) {
    final Resource res = referenceTarget.eResource();
    final ResourceSet rs = res.getResourceSet();
    ECrossReferenceAdapter crossReferencer = null;
    List<Adapter> adapters = rs.eAdapters();
    for (final Adapter adapter : adapters) {
      if ((adapter instanceof ECrossReferenceAdapter)) {
        crossReferencer = ((ECrossReferenceAdapter) adapter);
      }
    }
    if ((crossReferencer == null)) {
      ECrossReferenceAdapter _eCrossReferenceAdapter = new ECrossReferenceAdapter();
      crossReferencer = _eCrossReferenceAdapter;
      rs.eAdapters().add(crossReferencer);
    }
    List<Resource> referers = new LinkedList<Resource>();
    final Collection<EStructuralFeature.Setting> referencers = crossReferencer.getInverseReferences(referenceTarget, true);
    for (final EStructuralFeature.Setting setting : referencers) {
      {
        final EObject referer = setting.getEObject();
        final Resource resource = referer.eResource();
        boolean _equals = resource.equals(res);
        boolean _not = (!_equals);
        if (_not) {
          URI uri = resource.getURI();
          uri = rs.getURIConverter().normalize(uri);
          boolean _isPlatformResource = uri.isPlatformResource();
          if (_isPlatformResource) {
            referers.add(resource);
          }
        }
      }
    }
    return referers;
  }

  /**
   * Find all the cross references to the specified target, no matter
   * where they are in the resource set
   * 
   * See EcoreUtil.delete() for an example of why it might be done this way
   */
  public Collection<EStructuralFeature.Setting> getReferencingObjects(final EObject referenceTarget) {
    final Resource res = referenceTarget.eResource();
    final ResourceSet rs = res.getResourceSet();
    return EcoreUtil.UsageCrossReferencer.find(referenceTarget, rs);
  }
}
