package com.epistimis.uddl.generator;

import com.epistimis.uddl.RealizedComposableElement;
import com.epistimis.uddl.uddl.LogicalConstraint;
import com.epistimis.uddl.uddl.LogicalElement;
import com.epistimis.uddl.uddl.LogicalMeasurement;
import com.epistimis.uddl.uddl.LogicalMeasurementAxis;
import com.epistimis.uddl.uddl.LogicalValueTypeUnit;
import com.epistimis.uddl.uddl.PlatformArray;
import com.epistimis.uddl.uddl.PlatformBoolean;
import com.epistimis.uddl.uddl.PlatformBoundedString;
import com.epistimis.uddl.uddl.PlatformChar;
import com.epistimis.uddl.uddl.PlatformCharArray;
import com.epistimis.uddl.uddl.PlatformComposableElement;
import com.epistimis.uddl.uddl.PlatformComposition;
import com.epistimis.uddl.uddl.PlatformDataModel;
import com.epistimis.uddl.uddl.PlatformDataType;
import com.epistimis.uddl.uddl.PlatformDouble;
import com.epistimis.uddl.uddl.PlatformEntity;
import com.epistimis.uddl.uddl.PlatformEnumeration;
import com.epistimis.uddl.uddl.PlatformFixed;
import com.epistimis.uddl.uddl.PlatformFloat;
import com.epistimis.uddl.uddl.PlatformLong;
import com.epistimis.uddl.uddl.PlatformLongDouble;
import com.epistimis.uddl.uddl.PlatformLongLong;
import com.epistimis.uddl.uddl.PlatformOctet;
import com.epistimis.uddl.uddl.PlatformParticipant;
import com.epistimis.uddl.uddl.PlatformSequence;
import com.epistimis.uddl.uddl.PlatformShort;
import com.epistimis.uddl.uddl.PlatformString;
import com.epistimis.uddl.uddl.PlatformStruct;
import com.epistimis.uddl.uddl.PlatformStructMember;
import com.epistimis.uddl.uddl.PlatformULong;
import com.epistimis.uddl.uddl.PlatformULongLong;
import com.epistimis.uddl.uddl.PlatformUShort;
import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * This is based on FACE spec Appendix J.8 - the rule for PlatformDataType
 */
@SuppressWarnings("all")
public class IDLDataStructureGenerator extends CommonDataStructureGenerator {
  public IDLDataStructureGenerator(final Map<PlatformComposableElement, RealizedComposableElement> ace) {
    super(ace);
  }

  public IDLDataStructureGenerator() {
    super();
    this.initialize();
  }

  @Override
  public String getRootDirectory() {
    return "idl/";
  }

  @Override
  public String getWriteFileExtension() {
    return ".idl";
  }

  @Override
  public String getReadFileExtension() {
    return ".idl";
  }

  /**
   * TODO: Structured FDTs aren't currently supported
   */
  @Override
  public String getPDTTypeString(final PlatformDataType pdt) {
    String _switchResult = null;
    boolean _matched = false;
    if (pdt instanceof PlatformBoundedString) {
      _matched=true;
      int _maxLength = ((PlatformBoundedString)pdt).getMaxLength();
      String _plus = ("string<" + Integer.valueOf(_maxLength));
      _switchResult = (_plus + ">");
    }
    if (!_matched) {
      if (pdt instanceof PlatformCharArray) {
        _matched=true;
        int _length = ((PlatformCharArray)pdt).getLength();
        String _plus = ("char[" + Integer.valueOf(_length));
        _switchResult = (_plus + "]");
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformString) {
        _matched=true;
        _switchResult = "string";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformBoolean) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformOctet) {
        _matched=true;
        _switchResult = "octet";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformChar) {
        _matched=true;
        _switchResult = "char";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformFloat) {
        _matched=true;
        _switchResult = "float";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformDouble) {
        _matched=true;
        _switchResult = "double";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformLongDouble) {
        _matched=true;
        _switchResult = "long double";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformShort) {
        _matched=true;
        _switchResult = "short";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformLong) {
        _matched=true;
        _switchResult = "long";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformLongLong) {
        _matched=true;
        _switchResult = "long long";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformUShort) {
        _matched=true;
        _switchResult = "unsigned short";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformULong) {
        _matched=true;
        _switchResult = "unsigned long";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformULongLong) {
        _matched=true;
        _switchResult = "unsigned long long";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformFixed) {
        _matched=true;
        int _digits = ((PlatformFixed)pdt).getDigits();
        String _plus = ("fixed<" + Integer.valueOf(_digits));
        String _plus_1 = (_plus + ",");
        int _scale = ((PlatformFixed)pdt).getScale();
        String _plus_2 = (_plus_1 + Integer.valueOf(_scale));
        _switchResult = (_plus_2 + ">");
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformSequence) {
        _matched=true;
        int _maxSize = ((PlatformSequence)pdt).getMaxSize();
        String _plus = ("sequence<octet," + Integer.valueOf(_maxSize));
        _switchResult = (_plus + ">");
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformArray) {
        _matched=true;
        int _size = ((PlatformArray)pdt).getSize();
        String _plus = ("octet[" + Integer.valueOf(_size));
        _switchResult = (_plus + "]");
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformEnumeration) {
        _matched=true;
        String _xblockexpression = null;
        {
          final LogicalElement absMeasure = ((PlatformEnumeration)pdt).getRealizes();
          LogicalValueTypeUnit vtu = null;
          boolean _matched_1 = false;
          if (Objects.equal(absMeasure, LogicalMeasurement.class)) {
            _matched_1=true;
            final LogicalMeasurementAxis axis = ((LogicalMeasurement) absMeasure).getMeasurementAxis().get(0);
            vtu = axis.getValueTypeUnit().get(0);
          }
          if (!_matched_1) {
            if (Objects.equal(absMeasure, LogicalMeasurementAxis.class)) {
              _matched_1=true;
              vtu = ((LogicalMeasurementAxis) absMeasure).getValueTypeUnit().get(0);
            }
          }
          if (!_matched_1) {
            if (Objects.equal(absMeasure, LogicalValueTypeUnit.class)) {
              _matched_1=true;
              vtu = ((LogicalValueTypeUnit) absMeasure);
            }
          }
          String _xifexpression = null;
          LogicalConstraint _constraint = vtu.getConstraint();
          boolean _tripleNotEquals = (_constraint != null);
          if (_tripleNotEquals) {
            _xifexpression = " enum not finished";
          } else {
            _xifexpression = "enum not finished";
          }
          _xblockexpression = _xifexpression;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformStruct) {
        _matched=true;
        String result = "struct {\n";
        final PlatformStruct struct = ((PlatformStruct) pdt);
        EList<PlatformStructMember> _member = struct.getMember();
        for (final PlatformStructMember m : _member) {
          String _result = result;
          String _name = m.getType().getName();
          String _plus = (_name + " ");
          String _rolename = m.getRolename();
          String _plus_1 = (_plus + _rolename);
          String _plus_2 = (_plus_1 + ";\n");
          result = (_result + _plus_2);
        }
        String _result_1 = result;
        result = (_result_1 + "};\n");
        return result;
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }

  @Override
  public String getImportPrefix() {
    return "import \"";
  }

  @Override
  public String getImportSuffix() {
    return "\"\n";
  }

  @Override
  public String pdmHeader(final PlatformDataModel pdm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Types from ");
    QualifiedName _fullyQualifiedName = this.qnp.getFullyQualifiedName(pdm);
    _builder.append(_fullyQualifiedName);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  public String defNewType(final PlatformDataType pdt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("type ");
    String _typeString = this.getTypeString(pdt);
    _builder.append(_typeString);
    _builder.append(" ");
    String _name = pdt.getName();
    _builder.append(_name);
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  public String generateImportStatement(final PlatformDataModel pdm, final EObject ctx) {
    String _importPrefix = this.getImportPrefix();
    String _generateWriteFileName = this.generateWriteFileName(pdm);
    String _plus = (_importPrefix + _generateWriteFileName);
    String _importSuffix = this.getImportSuffix();
    return (_plus + _importSuffix);
  }

  @Override
  public String generateImportStatement(final PlatformEntity entType, final EObject ctx) {
    String _importPrefix = this.getImportPrefix();
    String _generateWriteFileName = this.generateWriteFileName(entType);
    String _plus = (_importPrefix + _generateWriteFileName);
    String _importSuffix = this.getImportSuffix();
    return (_plus + _importSuffix);
  }

  @Override
  public String getTypeDefPrefix() {
    return "type";
  }

  @Override
  public String getNamespaceKwd() {
    return "package";
  }

  @Override
  public String getClazzKwd() {
    return "class";
  }

  @Override
  public String getSpecializesKwd() {
    return "extends";
  }

  @Override
  public String getCompositionVisibility() {
    return "private";
  }

  @Override
  public String getFileHeader(final PlatformEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    String _multiLineCmtStart = this.getMultiLineCmtStart();
    _builder.append(_multiLineCmtStart);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    String _description = entity.getDescription();
    _builder.append(_description);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    String _multiLineCmtEnd = this.getMultiLineCmtEnd();
    _builder.append(_multiLineCmtEnd);
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  public String compositionElement(final PlatformComposition composition, final int ndx) {
    StringConcatenation _builder = new StringConcatenation();
    String _nDent = this.nDent(ndx);
    _builder.append(_nDent);
    String _compositionVisibility = this.getCompositionVisibility();
    _builder.append(_compositionVisibility);
    _builder.append(" ");
    String _name = composition.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _rolename = composition.getRolename();
    _builder.append(_rolename);
    {
      int _upperBound = composition.getUpperBound();
      boolean _greaterThan = (_upperBound > 1);
      if (_greaterThan) {
        String _arrStart = this.getArrStart();
        _builder.append(_arrStart);
        int _upperBound_1 = composition.getUpperBound();
        _builder.append(_upperBound_1);
        String _arrEnd = this.getArrEnd();
        _builder.append(_arrEnd);
      }
    }
    String _elemEnd = this.getElemEnd();
    _builder.append(_elemEnd);
    _builder.append(" ");
    String _singleLineCmtStart = this.getSingleLineCmtStart();
    _builder.append(_singleLineCmtStart);
    _builder.append(" ");
    String _description = composition.getDescription();
    _builder.append(_description);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  public String participantElement(final PlatformParticipant participant, final int ndx) {
    StringConcatenation _builder = new StringConcatenation();
    String _nDent = this.nDent(ndx);
    _builder.append(_nDent);
    String _compositionVisibility = this.getCompositionVisibility();
    _builder.append(_compositionVisibility);
    _builder.append(" ");
    String _name = participant.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _rolename = participant.getRolename();
    _builder.append(_rolename);
    {
      int _upperBound = participant.getUpperBound();
      boolean _greaterThan = (_upperBound > 1);
      if (_greaterThan) {
        String _arrStart = this.getArrStart();
        _builder.append(_arrStart);
        int _upperBound_1 = participant.getUpperBound();
        _builder.append(_upperBound_1);
        String _arrEnd = this.getArrEnd();
        _builder.append(_arrEnd);
      }
    }
    String _elemEnd = this.getElemEnd();
    _builder.append(_elemEnd);
    _builder.append(" ");
    String _singleLineCmtStart = this.getSingleLineCmtStart();
    _builder.append(_singleLineCmtStart);
    _builder.append(" ");
    String _description = participant.getDescription();
    _builder.append(_description);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  public String clazzDecl(final PlatformEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    String _clazzKwd = this.getClazzKwd();
    _builder.append(_clazzKwd);
    _builder.append(" ");
    String _name = entity.getName();
    _builder.append(_name);
    _builder.append(" ");
    {
      PlatformEntity _specializes = entity.getSpecializes();
      boolean _tripleNotEquals = (_specializes != null);
      if (_tripleNotEquals) {
        _builder.append(" ");
        String _specializesKwd = this.getSpecializesKwd();
        _builder.append(_specializesKwd);
        _builder.append(" ");
        PlatformEntity _specializes_1 = entity.getSpecializes();
        _builder.append(_specializes_1);
        _builder.append(" ");
      }
    }
    _builder.append(" ");
    String _structStart = this.getStructStart();
    _builder.append(_structStart);
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  public String clazzEndDecl(final PlatformEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("};");
    _builder.newLine();
    return _builder.toString();
  }

  @Override
  public String genTypeName(final PlatformComposableElement pce) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = pce.getName();
    _builder.append(_name);
    return _builder.toString();
  }
}
