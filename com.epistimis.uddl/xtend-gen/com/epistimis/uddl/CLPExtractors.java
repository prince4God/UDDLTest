package com.epistimis.uddl;

import com.epistimis.uddl.exceptions.CharacteristicNotFoundException;
import com.epistimis.uddl.uddl.ConceptualAssociation;
import com.epistimis.uddl.uddl.ConceptualCharacteristic;
import com.epistimis.uddl.uddl.ConceptualComposableElement;
import com.epistimis.uddl.uddl.ConceptualCompositeQuery;
import com.epistimis.uddl.uddl.ConceptualComposition;
import com.epistimis.uddl.uddl.ConceptualEntity;
import com.epistimis.uddl.uddl.ConceptualParticipant;
import com.epistimis.uddl.uddl.ConceptualQuery;
import com.epistimis.uddl.uddl.ConceptualQueryComposition;
import com.epistimis.uddl.uddl.ConceptualView;
import com.epistimis.uddl.uddl.LogicalAssociation;
import com.epistimis.uddl.uddl.LogicalCharacteristic;
import com.epistimis.uddl.uddl.LogicalComposableElement;
import com.epistimis.uddl.uddl.LogicalCompositeQuery;
import com.epistimis.uddl.uddl.LogicalComposition;
import com.epistimis.uddl.uddl.LogicalEntity;
import com.epistimis.uddl.uddl.LogicalParticipant;
import com.epistimis.uddl.uddl.LogicalQuery;
import com.epistimis.uddl.uddl.LogicalQueryComposition;
import com.epistimis.uddl.uddl.LogicalView;
import com.epistimis.uddl.uddl.PlatformAssociation;
import com.epistimis.uddl.uddl.PlatformCharacteristic;
import com.epistimis.uddl.uddl.PlatformComposableElement;
import com.epistimis.uddl.uddl.PlatformCompositeQuery;
import com.epistimis.uddl.uddl.PlatformComposition;
import com.epistimis.uddl.uddl.PlatformEntity;
import com.epistimis.uddl.uddl.PlatformParticipant;
import com.epistimis.uddl.uddl.PlatformQuery;
import com.epistimis.uddl.uddl.PlatformQueryComposition;
import com.epistimis.uddl.uddl.PlatformView;
import com.epistimis.uddl.uddl.UddlElement;
import com.epistimis.uddl.uddl.UddlPackage;
import com.google.inject.Inject;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * This is a set of methods that extract values from instances for use with templated methods
 * @author stevehickman
 */
@SuppressWarnings("all")
public class CLPExtractors {
  @Inject
  private IQualifiedNameProvider qnp;

  protected static ConceptualEntity _getSpecializes(final EObject ent) {
    return null;
  }

  protected static ConceptualEntity _getSpecializes(final ConceptualEntity ent) {
    return ent.getSpecializes();
  }

  protected static LogicalEntity _getSpecializes(final LogicalEntity ent) {
    return ent.getSpecializes();
  }

  protected static PlatformEntity _getSpecializes(final PlatformEntity ent) {
    return ent.getSpecializes();
  }

  /**
   * Type checking defaults to false
   */
  protected static boolean _isAssociation(final EObject ent) {
    return false;
  }

  protected static boolean _isAssociation(final ConceptualEntity ent) {
    return (ent instanceof ConceptualAssociation);
  }

  protected static boolean _isAssociation(final LogicalEntity ent) {
    return (ent instanceof LogicalAssociation);
  }

  protected static boolean _isAssociation(final PlatformEntity ent) {
    return (ent instanceof PlatformAssociation);
  }

  protected static ConceptualAssociation _conv2Association(final ConceptualEntity ent) {
    return ((ConceptualAssociation) ent);
  }

  protected static LogicalAssociation _conv2Association(final LogicalEntity ent) {
    return ((LogicalAssociation) ent);
  }

  protected static PlatformAssociation _conv2Association(final PlatformEntity ent) {
    return ((PlatformAssociation) ent);
  }

  protected static EList<ConceptualComposition> _getComposition(final ConceptualEntity obj) {
    return obj.getComposition();
  }

  protected static EList<LogicalComposition> _getComposition(final LogicalEntity obj) {
    return obj.getComposition();
  }

  protected static EList<PlatformComposition> _getComposition(final PlatformEntity obj) {
    return obj.getComposition();
  }

  protected static EList<ConceptualParticipant> _getParticipant(final ConceptualAssociation obj) {
    return obj.getParticipant();
  }

  protected static EList<LogicalParticipant> _getParticipant(final LogicalAssociation obj) {
    return obj.getParticipant();
  }

  protected static EList<PlatformParticipant> _getParticipant(final PlatformAssociation obj) {
    return obj.getParticipant();
  }

  protected static String _getSpecification(final ConceptualQuery obj) {
    return obj.getSpecification();
  }

  protected static String _getSpecification(final LogicalQuery obj) {
    return obj.getSpecification();
  }

  protected static String _getSpecification(final PlatformQuery obj) {
    return obj.getSpecification();
  }

  protected static Class<? extends UddlElement> _getClassForQuery(final ConceptualQuery obj) {
    return ConceptualEntity.class;
  }

  protected static Class<? extends UddlElement> _getClassForQuery(final LogicalQuery obj) {
    return LogicalEntity.class;
  }

  protected static Class<? extends UddlElement> _getClassForQuery(final PlatformQuery obj) {
    return PlatformEntity.class;
  }

  protected static EList<ConceptualQueryComposition> _getQueryComposition(final ConceptualCompositeQuery ent) {
    return ent.getComposition();
  }

  protected static EList<LogicalQueryComposition> _getQueryComposition(final LogicalCompositeQuery ent) {
    return ent.getComposition();
  }

  protected static EList<PlatformQueryComposition> _getQueryComposition(final PlatformCompositeQuery ent) {
    return ent.getComposition();
  }

  protected static ConceptualView _getType(final ConceptualQueryComposition obj) {
    return obj.getType();
  }

  protected static ConceptualComposableElement _getType(final ConceptualComposition obj) {
    return obj.getType();
  }

  protected static ConceptualComposableElement _getType(final ConceptualParticipant obj) {
    return obj.getType();
  }

  protected static LogicalView _getType(final LogicalQueryComposition obj) {
    return obj.getType();
  }

  protected static LogicalComposableElement _getType(final LogicalComposition obj) {
    return obj.getType();
  }

  protected static LogicalComposableElement _getType(final LogicalParticipant obj) {
    return obj.getType();
  }

  protected static PlatformView _getType(final PlatformQueryComposition obj) {
    return obj.getType();
  }

  protected static PlatformComposableElement _getType(final PlatformComposition obj) {
    return obj.getType();
  }

  protected static PlatformComposableElement _getType(final PlatformParticipant obj) {
    return obj.getType();
  }

  /**
   * Type checking defaults to false
   */
  protected static boolean _isCompositeQuery(final EObject ent) {
    return false;
  }

  protected static boolean _isCompositeQuery(final ConceptualView obj) {
    return (obj instanceof ConceptualCompositeQuery);
  }

  protected static boolean _isCompositeQuery(final LogicalView obj) {
    return (obj instanceof LogicalCompositeQuery);
  }

  protected static boolean _isCompositeQuery(final PlatformView obj) {
    return (obj instanceof PlatformCompositeQuery);
  }

  protected static EClass _getRelatedPackageEntityInstance(final ConceptualQuery obj) {
    return UddlPackage.eINSTANCE.getConceptualEntity();
  }

  protected static EClass _getRelatedPackageEntityInstance(final LogicalQuery obj) {
    return UddlPackage.eINSTANCE.getLogicalEntity();
  }

  protected static EClass _getRelatedPackageEntityInstance(final PlatformQuery obj) {
    return UddlPackage.eINSTANCE.getPlatformEntity();
  }

  private static MessageFormat CharacteristicNotFoundMsgFmt = new MessageFormat(
    "Entity {0} does not have a characteristic with rolename {1}");

  protected String _getCharacteristicRolename(final ConceptualCharacteristic obj) {
    return obj.getRolename();
  }

  protected String _getCharacteristicRolename(final LogicalCharacteristic obj) {
    return obj.getRolename();
  }

  protected String _getCharacteristicRolename(final PlatformCharacteristic obj) {
    return obj.getRolename();
  }

  /**
   * We recurse up the specializes hierarchy to collect the 'parent'. As we do
   * this, we create a 'specialization' tree.As we pop out of that, we bring the
   * characteristics from the prior levels to this one. When we are finished at
   * each level
   */
  public <Entity extends UddlElement> boolean isA(final Entity obj, final QualifiedName typeName) {
    boolean _equalsIgnoreCase = this.qnp.getFullyQualifiedName(obj).equalsIgnoreCase(typeName);
    if (_equalsIgnoreCase) {
      return true;
    }
    final UddlElement specializes = CLPExtractors.getSpecializes(obj);
    if ((specializes != null)) {
      return this.<UddlElement>isA(specializes, typeName);
    }
    return false;
  }

  /**
   * Get all the characteristics
   * @param obj
   * @return the list of characteristics.
   */
  public <Entity extends UddlElement, Characteristic extends EObject> Map<String, Characteristic> getCharacteristics(final Entity obj) {
    Map<String, Characteristic> characteristics = new HashMap<String, Characteristic>();
    this.<Entity, Characteristic>getCharacteristicsAndRecurse(obj, characteristics);
    return characteristics;
  }

  /**
   * Get the set of all characteristics from this entity - across the entire
   * specialization hierarchy. Note that, because we start from the bottom, any
   * specializing characteristics will override same named elements higher in the
   * hierarchy
   * 
   * This actually implements collecting the characteristics. It handles the recursion
   * @param obj
   * @param the map of characteristics. Starts empty and gets filled.
   */
  public <Entity extends UddlElement, Characteristic extends EObject> void getCharacteristicsAndRecurse(final Entity obj, final Map<String, Characteristic> characteristics) {
    EList<? extends EObject> _composition = CLPExtractors.getComposition(obj);
    for (final EObject pc : _composition) {
      characteristics.putIfAbsent(this.getCharacteristicRolename(pc), ((Characteristic) pc));
    }
    boolean _isAssociation = CLPExtractors.isAssociation(obj);
    if (_isAssociation) {
      EList<? extends EObject> _participant = CLPExtractors.getParticipant(obj);
      for (final EObject pp : _participant) {
        characteristics.putIfAbsent(this.getCharacteristicRolename(pp), ((Characteristic) pp));
      }
    }
    final UddlElement specializes = CLPExtractors.getSpecializes(obj);
    if ((specializes != null)) {
      this.<Entity, Characteristic>getCharacteristicsAndRecurse(((Entity) specializes), characteristics);
    }
  }

  /**
   * Return the named characteristic - which could be a composition or a
   * participant
   * 
   * @param ent      The Entity containing the characteristic
   * @param roleName The rolename of the characteristic to find
   * @return The found characteristic
   */
  public <Entity extends UddlElement, Characteristic extends EObject> Characteristic getCharacteristicByRolename(final Entity ent, final String roleName) throws CharacteristicNotFoundException {
    EList<? extends EObject> _composition = CLPExtractors.getComposition(ent);
    for (final EObject obj : _composition) {
      {
        final Characteristic comp = ((Characteristic) obj);
        boolean _equals = this.getCharacteristicRolename(comp).equals(roleName);
        if (_equals) {
          return comp;
        }
      }
    }
    boolean _isAssociation = CLPExtractors.isAssociation(ent);
    if (_isAssociation) {
      EList<? extends EObject> _participant = CLPExtractors.getParticipant(ent);
      for (final EObject obj_1 : _participant) {
        {
          final Characteristic part = ((Characteristic) obj_1);
          boolean _equals = this.getCharacteristicRolename(part).equals(roleName);
          if (_equals) {
            return part;
          }
        }
      }
    }
    UddlElement _specializes = CLPExtractors.getSpecializes(ent);
    boolean _tripleNotEquals = (_specializes != null);
    if (_tripleNotEquals) {
      UddlElement _specializes_1 = CLPExtractors.getSpecializes(ent);
      return this.<Entity, Characteristic>getCharacteristicByRolename(((Entity) _specializes_1), roleName);
    }
    final Object[] args = { ent, roleName };
    String _format = CLPExtractors.CharacteristicNotFoundMsgFmt.format(args);
    throw new CharacteristicNotFoundException(_format);
  }

  /**
   * Given a string containing a (possibly qualified) rolename, return a map of all Characteristics that contain that rolename in their
   * FQN somewhere. In some ways this is the inverse of Scopes.scopeFor. A Scope determines what can be found from the current context
   * point using the specified name and reference type.  That means that RQNs are relative to this point.
   * 
   * What we want here is anything where the specified RQN is a part of the name of something contained in or referenced by the context object -
   * and the name may not give a complete enough path to be reachable just using the RQN from this context point.
   * 
   * Net result: We can't just use Scopes.scopeFor to find what we want.
   */
  public <Entity extends UddlElement, Characteristic extends EObject, Composition extends Characteristic> Map<QualifiedName, Characteristic> getFQRoleName(final Entity ent, final String roleName) {
    Map<QualifiedName, Characteristic> result = new HashMap<QualifiedName, Characteristic>();
    try {
      final Characteristic c = this.<Entity, Characteristic>getCharacteristicByRolename(ent, roleName);
      result.put(this.qnp.getFullyQualifiedName(c), c);
    } catch (final Throwable _t) {
      if (_t instanceof CharacteristicNotFoundException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    final EList<? extends EObject> comps = CLPExtractors.getComposition(ent);
    for (final EObject obj : comps) {
    }
    return result;
  }

  public static UddlElement getSpecializes(final EObject ent) {
    if (ent instanceof ConceptualEntity) {
      return _getSpecializes((ConceptualEntity)ent);
    } else if (ent instanceof LogicalEntity) {
      return _getSpecializes((LogicalEntity)ent);
    } else if (ent instanceof PlatformEntity) {
      return _getSpecializes((PlatformEntity)ent);
    } else if (ent != null) {
      return _getSpecializes(ent);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ent).toString());
    }
  }

  public static boolean isAssociation(final EObject ent) {
    if (ent instanceof ConceptualEntity) {
      return _isAssociation((ConceptualEntity)ent);
    } else if (ent instanceof LogicalEntity) {
      return _isAssociation((LogicalEntity)ent);
    } else if (ent instanceof PlatformEntity) {
      return _isAssociation((PlatformEntity)ent);
    } else if (ent != null) {
      return _isAssociation(ent);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ent).toString());
    }
  }

  public static UddlElement conv2Association(final UddlElement ent) {
    if (ent instanceof ConceptualEntity) {
      return _conv2Association((ConceptualEntity)ent);
    } else if (ent instanceof LogicalEntity) {
      return _conv2Association((LogicalEntity)ent);
    } else if (ent instanceof PlatformEntity) {
      return _conv2Association((PlatformEntity)ent);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ent).toString());
    }
  }

  public static EList<? extends EObject> getComposition(final UddlElement obj) {
    if (obj instanceof ConceptualEntity) {
      return _getComposition((ConceptualEntity)obj);
    } else if (obj instanceof LogicalEntity) {
      return _getComposition((LogicalEntity)obj);
    } else if (obj instanceof PlatformEntity) {
      return _getComposition((PlatformEntity)obj);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(obj).toString());
    }
  }

  public static EList<? extends EObject> getParticipant(final UddlElement obj) {
    if (obj instanceof ConceptualAssociation) {
      return _getParticipant((ConceptualAssociation)obj);
    } else if (obj instanceof LogicalAssociation) {
      return _getParticipant((LogicalAssociation)obj);
    } else if (obj instanceof PlatformAssociation) {
      return _getParticipant((PlatformAssociation)obj);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(obj).toString());
    }
  }

  public static String getSpecification(final UddlElement obj) {
    if (obj instanceof ConceptualQuery) {
      return _getSpecification((ConceptualQuery)obj);
    } else if (obj instanceof LogicalQuery) {
      return _getSpecification((LogicalQuery)obj);
    } else if (obj instanceof PlatformQuery) {
      return _getSpecification((PlatformQuery)obj);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(obj).toString());
    }
  }

  public static Class<? extends UddlElement> getClassForQuery(final UddlElement obj) {
    if (obj instanceof ConceptualQuery) {
      return _getClassForQuery((ConceptualQuery)obj);
    } else if (obj instanceof LogicalQuery) {
      return _getClassForQuery((LogicalQuery)obj);
    } else if (obj instanceof PlatformQuery) {
      return _getClassForQuery((PlatformQuery)obj);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(obj).toString());
    }
  }

  public static EList<? extends EObject> getQueryComposition(final UddlElement ent) {
    if (ent instanceof ConceptualCompositeQuery) {
      return _getQueryComposition((ConceptualCompositeQuery)ent);
    } else if (ent instanceof LogicalCompositeQuery) {
      return _getQueryComposition((LogicalCompositeQuery)ent);
    } else if (ent instanceof PlatformCompositeQuery) {
      return _getQueryComposition((PlatformCompositeQuery)ent);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ent).toString());
    }
  }

  public static UddlElement getType(final EObject obj) {
    if (obj instanceof ConceptualComposition) {
      return _getType((ConceptualComposition)obj);
    } else if (obj instanceof ConceptualParticipant) {
      return _getType((ConceptualParticipant)obj);
    } else if (obj instanceof LogicalComposition) {
      return _getType((LogicalComposition)obj);
    } else if (obj instanceof LogicalParticipant) {
      return _getType((LogicalParticipant)obj);
    } else if (obj instanceof PlatformComposition) {
      return _getType((PlatformComposition)obj);
    } else if (obj instanceof PlatformParticipant) {
      return _getType((PlatformParticipant)obj);
    } else if (obj instanceof ConceptualQueryComposition) {
      return _getType((ConceptualQueryComposition)obj);
    } else if (obj instanceof LogicalQueryComposition) {
      return _getType((LogicalQueryComposition)obj);
    } else if (obj instanceof PlatformQueryComposition) {
      return _getType((PlatformQueryComposition)obj);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(obj).toString());
    }
  }

  public static boolean isCompositeQuery(final EObject obj) {
    if (obj instanceof ConceptualView) {
      return _isCompositeQuery((ConceptualView)obj);
    } else if (obj instanceof LogicalView) {
      return _isCompositeQuery((LogicalView)obj);
    } else if (obj instanceof PlatformView) {
      return _isCompositeQuery((PlatformView)obj);
    } else if (obj != null) {
      return _isCompositeQuery(obj);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(obj).toString());
    }
  }

  public static EClass getRelatedPackageEntityInstance(final UddlElement obj) {
    if (obj instanceof ConceptualQuery) {
      return _getRelatedPackageEntityInstance((ConceptualQuery)obj);
    } else if (obj instanceof LogicalQuery) {
      return _getRelatedPackageEntityInstance((LogicalQuery)obj);
    } else if (obj instanceof PlatformQuery) {
      return _getRelatedPackageEntityInstance((PlatformQuery)obj);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(obj).toString());
    }
  }

  public String getCharacteristicRolename(final EObject obj) {
    if (obj instanceof ConceptualCharacteristic) {
      return _getCharacteristicRolename((ConceptualCharacteristic)obj);
    } else if (obj instanceof LogicalCharacteristic) {
      return _getCharacteristicRolename((LogicalCharacteristic)obj);
    } else if (obj instanceof PlatformCharacteristic) {
      return _getCharacteristicRolename((PlatformCharacteristic)obj);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(obj).toString());
    }
  }
}
