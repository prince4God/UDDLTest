package com.epistimis.uddl;

import com.epistimis.uddl.uddl.ConceptualAssociation;
import com.epistimis.uddl.uddl.ConceptualCharacteristic;
import com.epistimis.uddl.uddl.ConceptualComposition;
import com.epistimis.uddl.uddl.ConceptualEntity;
import com.epistimis.uddl.uddl.ConceptualObservable;
import com.epistimis.uddl.uddl.ConceptualParticipant;
import com.epistimis.uddl.uddl.LogicalAssociation;
import com.epistimis.uddl.uddl.LogicalCharacteristic;
import com.epistimis.uddl.uddl.LogicalComposition;
import com.epistimis.uddl.uddl.LogicalEntity;
import com.epistimis.uddl.uddl.LogicalMeasurement;
import com.epistimis.uddl.uddl.LogicalParticipant;
import com.epistimis.uddl.uddl.PlatformAssociation;
import com.epistimis.uddl.uddl.PlatformCharacteristic;
import com.epistimis.uddl.uddl.PlatformComposition;
import com.epistimis.uddl.uddl.PlatformDataType;
import com.epistimis.uddl.uddl.PlatformEntity;
import com.epistimis.uddl.uddl.PlatformParticipant;
import com.epistimis.uddl.uddl.UddlElement;
import com.epistimis.uddl.uddl.UddlFactory;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A set of dispatch methods that can be used to drill down through a UDDL model to find the observables that are
 * actually realized by something. Why does this matter? Because Logical and Platform levels may down-select (not include)
 * all the composition elements they could
 */
@SuppressWarnings("all")
public class RealizedConceptuals {
  private UddlFactory factory = UddlFactory.eINSTANCE;

  protected Set<String> _constituentObservables(final ConceptualObservable elem) {
    return Set.<String>of(elem.getName().toLowerCase());
  }

  protected Set<String> _constituentObservables(final ConceptualEntity elem) {
    HashSet<String> constituents = new HashSet<String>();
    ConceptualEntity _specializes = elem.getSpecializes();
    Set<String> _constituentObservables = null;
    if (_specializes!=null) {
      _constituentObservables=this.constituentObservables(_specializes);
    }
    final Set<String> constituentSpecializes = _constituentObservables;
    final Function<ConceptualComposition, Stream<String>> _function = (ConceptualComposition it) -> {
      return this.constituentObservables(it).stream();
    };
    final Set<String> constituentComposition = elem.getComposition().stream().<String>flatMap(_function).collect(
      Collectors.<String>toSet());
    if ((constituentSpecializes != null)) {
      constituents.addAll(constituentSpecializes);
    }
    if ((constituentComposition != null)) {
      constituents.addAll(constituentComposition);
    }
    return constituents;
  }

  protected Set<String> _constituentObservables(final ConceptualAssociation elem) {
    HashSet<String> constituents = new HashSet<String>();
    ConceptualEntity _specializes = elem.getSpecializes();
    Set<String> _constituentObservables = null;
    if (_specializes!=null) {
      _constituentObservables=this.constituentObservables(_specializes);
    }
    final Set<String> constituentSpecializes = _constituentObservables;
    final Function<ConceptualComposition, Stream<String>> _function = (ConceptualComposition it) -> {
      return this.constituentObservables(it).stream();
    };
    final Set<String> constituentComposition = elem.getComposition().stream().<String>flatMap(_function).collect(
      Collectors.<String>toSet());
    final Function<ConceptualParticipant, Stream<String>> _function_1 = (ConceptualParticipant it) -> {
      return this.constituentObservables(it).stream();
    };
    final Set<String> constituentParticipant = elem.getParticipant().stream().<String>flatMap(_function_1).collect(
      Collectors.<String>toSet());
    if ((constituentSpecializes != null)) {
      constituents.addAll(constituentSpecializes);
    }
    if ((constituentComposition != null)) {
      constituents.addAll(constituentComposition);
    }
    if ((constituentParticipant != null)) {
      constituents.addAll(constituentParticipant);
    }
    return constituents;
  }

  protected Set<String> _constituentObservables(final ConceptualComposition elem) {
    HashSet<String> constituents = new HashSet<String>();
    ConceptualCharacteristic _specializes = elem.getSpecializes();
    Set<String> _constituentObservables = null;
    if (_specializes!=null) {
      _constituentObservables=this.constituentObservables(_specializes);
    }
    final Set<String> constituentSpecializes = _constituentObservables;
    final Set<String> constituentType = this.constituentObservables(elem.getType());
    if ((constituentSpecializes != null)) {
      constituents.addAll(constituentSpecializes);
    }
    if ((constituentType != null)) {
      constituents.addAll(constituentType);
    }
    return constituents;
  }

  protected Set<String> _constituentObservables(final ConceptualParticipant elem) {
    HashSet<String> constituents = new HashSet<String>();
    ConceptualCharacteristic _specializes = elem.getSpecializes();
    Set<String> _constituentObservables = null;
    if (_specializes!=null) {
      _constituentObservables=this.constituentObservables(_specializes);
    }
    final Set<String> constituentSpecializes = _constituentObservables;
    final Set<String> constituentType = this.constituentObservables(elem.getType());
    if ((constituentSpecializes != null)) {
      constituents.addAll(constituentSpecializes);
    }
    if ((constituentType != null)) {
      constituents.addAll(constituentType);
    }
    return constituents;
  }

  protected Set<String> _constituentObservables(final LogicalMeasurement elem) {
    if ((elem != null)) {
      return this.constituentObservables(elem.getRealizes());
    } else {
      return new HashSet<String>();
    }
  }

  /**
   * Note that we do *not* look at the ConceptualEntity that this LogicalEntity realizes. Why? Because
   * what we care about is not what *could* have been realized but what was *actually* realized. That
   * means looking at the composition elements only (directly or via specialization)
   */
  protected Set<String> _constituentObservables(final LogicalEntity elem) {
    HashSet<String> constituents = new HashSet<String>();
    LogicalEntity _specializes = elem.getSpecializes();
    Set<String> _constituentObservables = null;
    if (_specializes!=null) {
      _constituentObservables=this.constituentObservables(_specializes);
    }
    final Set<String> constituentSpecializes = _constituentObservables;
    final Function<LogicalComposition, Stream<String>> _function = (LogicalComposition it) -> {
      ConceptualComposition _realizes = it.getRealizes();
      Set<String> _constituentObservables_1 = null;
      if (_realizes!=null) {
        _constituentObservables_1=this.constituentObservables(_realizes);
      }
      return _constituentObservables_1.stream();
    };
    final Set<String> constituentComposition = elem.getComposition().stream().<String>flatMap(_function).collect(Collectors.<String>toSet());
    if ((constituentSpecializes != null)) {
      constituents.addAll(constituentSpecializes);
    }
    if ((constituentComposition != null)) {
      constituents.addAll(constituentComposition);
    }
    return constituents;
  }

  /**
   * Note that we do *not* look at the ConceptualAssociation that this LogicalAssociation realizes. Why? Because
   * what we care about is not what *could* have been realized but what was *actually* realized. That
   * means looking at the composition elements only (directly or via specialization)
   */
  protected Set<String> _constituentObservables(final LogicalAssociation elem) {
    HashSet<String> constituents = new HashSet<String>();
    LogicalEntity _specializes = elem.getSpecializes();
    Set<String> _constituentObservables = null;
    if (_specializes!=null) {
      _constituentObservables=this.constituentObservables(_specializes);
    }
    final Set<String> constituentSpecializes = _constituentObservables;
    final Function<LogicalComposition, Stream<String>> _function = (LogicalComposition it) -> {
      ConceptualComposition _realizes = it.getRealizes();
      Set<String> _constituentObservables_1 = null;
      if (_realizes!=null) {
        _constituentObservables_1=this.constituentObservables(_realizes);
      }
      return _constituentObservables_1.stream();
    };
    final Set<String> constituentComposition = elem.getComposition().stream().<String>flatMap(_function).collect(Collectors.<String>toSet());
    final Function<LogicalParticipant, Stream<String>> _function_1 = (LogicalParticipant it) -> {
      ConceptualParticipant _realizes = it.getRealizes();
      Set<String> _constituentObservables_1 = null;
      if (_realizes!=null) {
        _constituentObservables_1=this.constituentObservables(_realizes);
      }
      return _constituentObservables_1.stream();
    };
    final Set<String> constituentParticipant = elem.getParticipant().stream().<String>flatMap(_function_1).collect(Collectors.<String>toSet());
    if ((constituentSpecializes != null)) {
      constituents.addAll(constituentSpecializes);
    }
    if ((constituentComposition != null)) {
      constituents.addAll(constituentComposition);
    }
    if ((constituentParticipant != null)) {
      constituents.addAll(constituentParticipant);
    }
    return constituents;
  }

  protected Set<String> _constituentObservables(final LogicalComposition elem) {
    HashSet<String> constituents = new HashSet<String>();
    LogicalCharacteristic _specializes = elem.getSpecializes();
    Set<String> _constituentObservables = null;
    if (_specializes!=null) {
      _constituentObservables=this.constituentObservables(_specializes);
    }
    final Set<String> constituentSpecializes = _constituentObservables;
    final Set<String> constituentType = this.constituentObservables(elem.getType());
    if ((constituentSpecializes != null)) {
      constituents.addAll(constituentSpecializes);
    }
    if ((constituentType != null)) {
      constituents.addAll(constituentType);
    }
    return constituents;
  }

  protected Set<String> _constituentObservables(final LogicalParticipant elem) {
    HashSet<String> constituents = new HashSet<String>();
    LogicalCharacteristic _specializes = elem.getSpecializes();
    Set<String> _constituentObservables = null;
    if (_specializes!=null) {
      _constituentObservables=this.constituentObservables(_specializes);
    }
    final Set<String> constituentSpecializes = _constituentObservables;
    final Set<String> constituentType = this.constituentObservables(elem.getType());
    if ((constituentSpecializes != null)) {
      constituents.addAll(constituentSpecializes);
    }
    if ((constituentType != null)) {
      constituents.addAll(constituentType);
    }
    return constituents;
  }

  protected Set<String> _constituentObservables(final PlatformDataType elem) {
    if ((elem != null)) {
      return this.constituentObservables(elem.getRealizes());
    } else {
      return new HashSet<String>();
    }
  }

  /**
   * Note that we do *not* look at the Conceptual/LogicalEntity that this PlatformEntity realizes. Why? Because
   * what we care about is not what *could* have been realized but what was *actually* realized. That
   * means looking at the composition elements only (directly or via specialization)
   */
  protected Set<String> _constituentObservables(final PlatformEntity elem) {
    HashSet<String> constituents = new HashSet<String>();
    PlatformEntity _specializes = elem.getSpecializes();
    Set<String> _constituentObservables = null;
    if (_specializes!=null) {
      _constituentObservables=this.constituentObservables(_specializes);
    }
    final Set<String> constituentSpecializes = _constituentObservables;
    final Function<PlatformComposition, Stream<String>> _function = (PlatformComposition it) -> {
      LogicalComposition _realizes = it.getRealizes();
      ConceptualComposition _realizes_1 = null;
      if (_realizes!=null) {
        _realizes_1=_realizes.getRealizes();
      }
      Set<String> _constituentObservables_1 = null;
      if (_realizes_1!=null) {
        _constituentObservables_1=this.constituentObservables(_realizes_1);
      }
      return _constituentObservables_1.stream();
    };
    final Set<String> constituentComposition = elem.getComposition().stream().<String>flatMap(_function).collect(Collectors.<String>toSet());
    if ((constituentSpecializes != null)) {
      constituents.addAll(constituentSpecializes);
    }
    if ((constituentComposition != null)) {
      constituents.addAll(constituentComposition);
    }
    return constituents;
  }

  /**
   * Note that we do *not* look at the Conceptual/LogicalAssociation that this PlatformAssociation realizes. Why? Because
   * what we care about is not what *could* have been realized but what was *actually* realized. That
   * means looking at the composition elements only (directly or via specialization)
   * 
   * Note that this implementation drills down via realization immediately, getting to the Conceptual level without
   * going through other paths.
   */
  protected Set<String> _constituentObservables(final PlatformAssociation elem) {
    HashSet<String> constituents = new HashSet<String>();
    PlatformEntity _specializes = elem.getSpecializes();
    Set<String> _constituentObservables = null;
    if (_specializes!=null) {
      _constituentObservables=this.constituentObservables(_specializes);
    }
    final Set<String> constituentSpecializes = _constituentObservables;
    final Function<PlatformComposition, Stream<String>> _function = (PlatformComposition it) -> {
      LogicalComposition _realizes = it.getRealizes();
      ConceptualComposition _realizes_1 = null;
      if (_realizes!=null) {
        _realizes_1=_realizes.getRealizes();
      }
      Set<String> _constituentObservables_1 = null;
      if (_realizes_1!=null) {
        _constituentObservables_1=this.constituentObservables(_realizes_1);
      }
      return _constituentObservables_1.stream();
    };
    final Set<String> constituentComposition = elem.getComposition().stream().<String>flatMap(_function).collect(Collectors.<String>toSet());
    final Function<PlatformParticipant, Stream<String>> _function_1 = (PlatformParticipant it) -> {
      LogicalParticipant _realizes = it.getRealizes();
      ConceptualParticipant _realizes_1 = null;
      if (_realizes!=null) {
        _realizes_1=_realizes.getRealizes();
      }
      Set<String> _constituentObservables_1 = null;
      if (_realizes_1!=null) {
        _constituentObservables_1=this.constituentObservables(_realizes_1);
      }
      return _constituentObservables_1.stream();
    };
    final Set<String> constituentParticipant = elem.getParticipant().stream().<String>flatMap(_function_1).collect(Collectors.<String>toSet());
    if ((constituentSpecializes != null)) {
      constituents.addAll(constituentSpecializes);
    }
    if ((constituentComposition != null)) {
      constituents.addAll(constituentComposition);
    }
    if ((constituentParticipant != null)) {
      constituents.addAll(constituentParticipant);
    }
    return constituents;
  }

  /**
   * TODO: Is it possible that the type of a PlatformComposition will be complex and introduce Conceptual/Logical elements via
   * realization that would not otherwise show up by following the realization path directly? I don't think so - but need to
   * think that through.
   */
  protected Set<String> _constituentObservables(final PlatformComposition elem) {
    HashSet<String> constituents = new HashSet<String>();
    PlatformCharacteristic _specializes = elem.getSpecializes();
    Set<String> _constituentObservables = null;
    if (_specializes!=null) {
      _constituentObservables=this.constituentObservables(_specializes);
    }
    final Set<String> constituentSpecializes = _constituentObservables;
    final Set<String> constituentType = this.constituentObservables(elem.getType());
    if ((constituentSpecializes != null)) {
      constituents.addAll(constituentSpecializes);
    }
    if ((constituentType != null)) {
      constituents.addAll(constituentType);
    }
    return constituents;
  }

  protected Set<String> _constituentObservables(final PlatformParticipant elem) {
    HashSet<String> constituents = new HashSet<String>();
    PlatformCharacteristic _specializes = elem.getSpecializes();
    Set<String> _constituentObservables = null;
    if (_specializes!=null) {
      _constituentObservables=this.constituentObservables(_specializes);
    }
    final Set<String> constituentSpecializes = _constituentObservables;
    final Set<String> constituentType = this.constituentObservables(elem.getType());
    if ((constituentSpecializes != null)) {
      constituents.addAll(constituentSpecializes);
    }
    if ((constituentType != null)) {
      constituents.addAll(constituentType);
    }
    return constituents;
  }

  /**
   * Return the Conceptual equivalent of this PlatformEntity. This accounts for any
   * down-selecting that might occur (compositions not realized)
   */
  protected ConceptualEntity _effectiveConceptualEntity(final PlatformEntity elem) {
    ConceptualEntity ce = this.factory.createConceptualEntity();
    return this.populateFromPlatformEntity(ce, elem);
  }

  /**
   * Return the Conceptual equivalent of this PlatformAssociation. This accounts for any
   * down-selecting that might occur (compositions not realized)
   */
  protected ConceptualEntity _effectiveConceptualEntity(final PlatformAssociation elem) {
    ConceptualAssociation ca = this.factory.createConceptualAssociation();
    this.populateFromPlatformEntity(ca, elem);
    EList<PlatformParticipant> _participant = elem.getParticipant();
    for (final PlatformParticipant part : _participant) {
      EList<ConceptualParticipant> _participant_1 = ca.getParticipant();
      LogicalParticipant _realizes = null;
      if (part!=null) {
        _realizes=part.getRealizes();
      }
      ConceptualParticipant _realizes_1 = null;
      if (_realizes!=null) {
        _realizes_1=_realizes.getRealizes();
      }
      _participant_1.add(_realizes_1);
    }
    return ca;
  }

  public ConceptualEntity populateFromPlatformEntity(final ConceptualEntity ce, final PlatformEntity elem) {
    ce.setName(elem.getName());
    ce.setDescription(elem.getDescription());
    LogicalEntity _realizes = null;
    if (elem!=null) {
      _realizes=elem.getRealizes();
    }
    ConceptualEntity _realizes_1 = null;
    if (_realizes!=null) {
      _realizes_1=_realizes.getRealizes();
    }
    ce.getBasisEntity().addAll(_realizes_1.getBasisEntity());
    EList<PlatformComposition> _composition = elem.getComposition();
    for (final PlatformComposition comp : _composition) {
      {
        ConceptualComposition cc = this.factory.createConceptualComposition();
        cc.setType(this.effectiveConceptualEntity(comp.getType()));
        LogicalComposition _realizes_2 = null;
        if (comp!=null) {
          _realizes_2=comp.getRealizes();
        }
        ConceptualComposition _realizes_3 = null;
        if (_realizes_2!=null) {
          _realizes_3=_realizes_2.getRealizes();
        }
        cc.setRolename(_realizes_3.getRolename());
        ce.getComposition().add(cc);
      }
    }
    PlatformEntity _specializes = elem.getSpecializes();
    boolean _tripleNotEquals = (_specializes != null);
    if (_tripleNotEquals) {
      ce.setSpecializes(this.effectiveConceptualEntity(elem.getSpecializes()));
    }
    return ce;
  }

  /**
   * Return the Conceptual equivalent of this LogicalEntity. This accounts for any
   * down-selecting that might occur (compositions not realized)
   */
  protected ConceptualEntity _effectiveConceptualEntity(final LogicalEntity elem) {
    ConceptualEntity ce = this.factory.createConceptualEntity();
    return this.populateFromLogicalEntity(ce, elem);
  }

  /**
   * Return the Conceptual equivalent of this LogicalAssociation. This accounts for any
   * down-selecting that might occur (compositions not realized)
   */
  protected ConceptualEntity _effectiveConceptualEntity(final LogicalAssociation elem) {
    ConceptualAssociation ca = this.factory.createConceptualAssociation();
    this.populateFromLogicalEntity(ca, elem);
    EList<LogicalParticipant> _participant = elem.getParticipant();
    for (final LogicalParticipant part : _participant) {
      EList<ConceptualParticipant> _participant_1 = ca.getParticipant();
      ConceptualParticipant _realizes = null;
      if (part!=null) {
        _realizes=part.getRealizes();
      }
      _participant_1.add(_realizes);
    }
    return ca;
  }

  public ConceptualEntity populateFromLogicalEntity(final ConceptualEntity ce, final LogicalEntity elem) {
    ce.setName(elem.getName());
    ce.setDescription(elem.getDescription());
    ConceptualEntity _realizes = null;
    if (elem!=null) {
      _realizes=elem.getRealizes();
    }
    ce.getBasisEntity().addAll(_realizes.getBasisEntity());
    EList<LogicalComposition> _composition = elem.getComposition();
    for (final LogicalComposition comp : _composition) {
      {
        ConceptualComposition cc = this.factory.createConceptualComposition();
        cc.setType(this.effectiveConceptualEntity(comp.getType()));
        ConceptualComposition _realizes_1 = null;
        if (comp!=null) {
          _realizes_1=comp.getRealizes();
        }
        cc.setRolename(_realizes_1.getRolename());
        ce.getComposition().add(cc);
      }
    }
    LogicalEntity _specializes = elem.getSpecializes();
    boolean _tripleNotEquals = (_specializes != null);
    if (_tripleNotEquals) {
      ce.setSpecializes(this.effectiveConceptualEntity(elem.getSpecializes()));
    }
    return ce;
  }

  public Set<String> constituentObservables(final EObject elem) {
    if (elem instanceof ConceptualAssociation) {
      return _constituentObservables((ConceptualAssociation)elem);
    } else if (elem instanceof LogicalAssociation) {
      return _constituentObservables((LogicalAssociation)elem);
    } else if (elem instanceof PlatformAssociation) {
      return _constituentObservables((PlatformAssociation)elem);
    } else if (elem instanceof ConceptualEntity) {
      return _constituentObservables((ConceptualEntity)elem);
    } else if (elem instanceof ConceptualObservable) {
      return _constituentObservables((ConceptualObservable)elem);
    } else if (elem instanceof LogicalEntity) {
      return _constituentObservables((LogicalEntity)elem);
    } else if (elem instanceof LogicalMeasurement) {
      return _constituentObservables((LogicalMeasurement)elem);
    } else if (elem instanceof PlatformDataType) {
      return _constituentObservables((PlatformDataType)elem);
    } else if (elem instanceof PlatformEntity) {
      return _constituentObservables((PlatformEntity)elem);
    } else if (elem instanceof ConceptualComposition) {
      return _constituentObservables((ConceptualComposition)elem);
    } else if (elem instanceof ConceptualParticipant) {
      return _constituentObservables((ConceptualParticipant)elem);
    } else if (elem instanceof LogicalComposition) {
      return _constituentObservables((LogicalComposition)elem);
    } else if (elem instanceof LogicalParticipant) {
      return _constituentObservables((LogicalParticipant)elem);
    } else if (elem instanceof PlatformComposition) {
      return _constituentObservables((PlatformComposition)elem);
    } else if (elem instanceof PlatformParticipant) {
      return _constituentObservables((PlatformParticipant)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }

  public ConceptualEntity effectiveConceptualEntity(final UddlElement elem) {
    if (elem instanceof LogicalAssociation) {
      return _effectiveConceptualEntity((LogicalAssociation)elem);
    } else if (elem instanceof PlatformAssociation) {
      return _effectiveConceptualEntity((PlatformAssociation)elem);
    } else if (elem instanceof LogicalEntity) {
      return _effectiveConceptualEntity((LogicalEntity)elem);
    } else if (elem instanceof PlatformEntity) {
      return _effectiveConceptualEntity((PlatformEntity)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
}
