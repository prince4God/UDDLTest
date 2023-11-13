package com.epistimis.uddl.generator;

import com.epistimis.uddl.RealizedComposableElement;
import com.epistimis.uddl.uddl.PlatformBoolean;
import com.epistimis.uddl.uddl.PlatformBoundedString;
import com.epistimis.uddl.uddl.PlatformCharArray;
import com.epistimis.uddl.uddl.PlatformComposableElement;
import com.epistimis.uddl.uddl.PlatformComposition;
import com.epistimis.uddl.uddl.PlatformDataModel;
import com.epistimis.uddl.uddl.PlatformDataType;
import com.epistimis.uddl.uddl.PlatformDouble;
import com.epistimis.uddl.uddl.PlatformEntity;
import com.epistimis.uddl.uddl.PlatformFixed;
import com.epistimis.uddl.uddl.PlatformFloat;
import com.epistimis.uddl.uddl.PlatformInteger;
import com.epistimis.uddl.uddl.PlatformLong;
import com.epistimis.uddl.uddl.PlatformParticipant;
import com.epistimis.uddl.uddl.PlatformString;
import com.epistimis.uddl.uddl.PlatformULong;
import com.epistimis.uddl.uddl.PlatformUnsignedInteger;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * This is the common portion of a data structure generator. It will be the base class for every data structure
 * generator for each language.
 */
@SuppressWarnings("all")
public class ProtobufDataStructureGenerator extends CommonDataStructureGenerator {
  public ProtobufDataStructureGenerator(final Map<PlatformComposableElement, RealizedComposableElement> ace) {
    super(ace);
  }

  public ProtobufDataStructureGenerator() {
    super();
    this.initialize();
  }

  @Override
  public String getRootDirectory() {
    return "protobuf/";
  }

  @Override
  public String getWriteFileExtension() {
    return ".proto";
  }

  @Override
  public String getReadFileExtension() {
    return ".proto";
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
      _switchResult = "string";
    }
    if (!_matched) {
      if (pdt instanceof PlatformCharArray) {
        _matched=true;
        int _length = ((PlatformCharArray)pdt).getLength();
        String _plus = ("[" + Integer.valueOf(_length));
        _switchResult = (_plus + "]bytes");
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
        _switchResult = "bool";
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
      if (pdt instanceof PlatformLong) {
        _matched=true;
        _switchResult = "int64";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformULong) {
        _matched=true;
        _switchResult = "uint64";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformFixed) {
        _matched=true;
        _switchResult = "fixed32";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformUnsignedInteger) {
        _matched=true;
        _switchResult = "uint32";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformInteger) {
        _matched=true;
        _switchResult = "int32";
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
    _builder.append("message ");
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
    return "message";
  }

  @Override
  public String getNamespaceKwd() {
    return "package";
  }

  @Override
  public String getClazzKwd() {
    return "message";
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
    _builder.append("syntax = \"proto3\";");
    _builder.newLine();
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
    {
      int _upperBound = composition.getUpperBound();
      boolean _greaterThan = (_upperBound > 1);
      if (_greaterThan) {
        _builder.append("repeated ");
      }
    }
    String _compositionVisibility = this.getCompositionVisibility();
    _builder.append(_compositionVisibility);
    _builder.append(" ");
    String _name = composition.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _rolename = composition.getRolename();
    _builder.append(_rolename);
    _builder.append(" = ");
    _builder.append((ndx + 1));
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
    {
      int _upperBound = participant.getUpperBound();
      boolean _greaterThan = (_upperBound > 1);
      if (_greaterThan) {
        _builder.append("repeated ");
      }
    }
    String _compositionVisibility = this.getCompositionVisibility();
    _builder.append(_compositionVisibility);
    _builder.append(" ");
    String _name = participant.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _rolename = participant.getRolename();
    _builder.append(_rolename);
    _builder.append(" = ");
    _builder.append((ndx + 1));
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
  public String getStructEnd() {
    return "}";
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
