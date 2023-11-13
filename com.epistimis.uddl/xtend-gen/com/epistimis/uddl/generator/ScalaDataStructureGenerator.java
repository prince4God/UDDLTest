package com.epistimis.uddl.generator;

import com.epistimis.uddl.RealizedComposableElement;
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
import com.epistimis.uddl.uddl.PlatformFloat;
import com.epistimis.uddl.uddl.PlatformInteger;
import com.epistimis.uddl.uddl.PlatformLong;
import com.epistimis.uddl.uddl.PlatformLongLong;
import com.epistimis.uddl.uddl.PlatformParticipant;
import com.epistimis.uddl.uddl.PlatformShort;
import com.epistimis.uddl.uddl.PlatformString;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * This is the common portion of a data structure generator. It will be the base class for every data structure
 * generator for each language.
 */
@SuppressWarnings("all")
public class ScalaDataStructureGenerator extends CommonDataStructureGenerator {
  public ScalaDataStructureGenerator(final Map<PlatformComposableElement, RealizedComposableElement> ace) {
    super(ace);
  }

  public ScalaDataStructureGenerator() {
    super();
    this.initialize();
  }

  @Override
  public String getRootDirectory() {
    return "scala/";
  }

  @Override
  public String getWriteFileExtension() {
    return ".scala";
  }

  @Override
  public String getReadFileExtension() {
    return ".scala";
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
      _switchResult = "String";
    }
    if (!_matched) {
      if (pdt instanceof PlatformCharArray) {
        _matched=true;
        int _length = ((PlatformCharArray)pdt).getLength();
        String _plus = ("[" + Integer.valueOf(_length));
        _switchResult = (_plus + "]Char");
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformString) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformBoolean) {
        _matched=true;
        _switchResult = "Boolean";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformChar) {
        _matched=true;
        _switchResult = "Char";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformFloat) {
        _matched=true;
        _switchResult = "Float";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformDouble) {
        _matched=true;
        _switchResult = "Double";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformShort) {
        _matched=true;
        _switchResult = "Short";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformLong) {
        _matched=true;
        _switchResult = "Int";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformLongLong) {
        _matched=true;
        _switchResult = "Long";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformInteger) {
        _matched=true;
        _switchResult = "Int";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }

  @Override
  public String getImportPrefix() {
    return "import ";
  }

  @Override
  public String getImportSuffix() {
    return ".* \n";
  }

  @Override
  public String pdmHeader(final PlatformDataModel pdm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Types from ");
    QualifiedName _fullyQualifiedName = this.qnp.getFullyQualifiedName(pdm);
    _builder.append(_fullyQualifiedName);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    QualifiedName _fullyQualifiedName_1 = this.qnp.getFullyQualifiedName(pdm);
    _builder.append(_fullyQualifiedName_1);
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }

  @Override
  public String defNewType(final PlatformDataType pdt) {
    StringConcatenation _builder = new StringConcatenation();
    String _nDent = this.nDent(1);
    _builder.append(_nDent);
    _builder.append("opaque type ");
    String _name = pdt.getName();
    _builder.append(_name);
    _builder.append("  = ");
    String _typeString = this.getTypeString(pdt);
    _builder.append(_typeString);
    _builder.newLineIfNotEmpty();
    String _nDent_1 = this.nDent(1);
    _builder.append(_nDent_1);
    _builder.append("object ");
    String _name_1 = pdt.getName();
    _builder.append(_name_1);
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    String _nDent_2 = this.nDent(1);
    _builder.append(_nDent_2);
    _builder.append("\tdef apply(i: ");
    String _typeString_1 = this.getTypeString(pdt);
    _builder.append(_typeString_1);
    _builder.append("): ");
    String _name_2 = pdt.getName();
    _builder.append(_name_2);
    _builder.append(" = i");
    _builder.newLineIfNotEmpty();
    String _nDent_3 = this.nDent(1);
    _builder.append(_nDent_3);
    _builder.append("given Eql[");
    String _name_3 = pdt.getName();
    _builder.append(_name_3);
    _builder.append(", ");
    String _name_4 = pdt.getName();
    _builder.append(_name_4);
    _builder.append("] = Eql.derived");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }

  @Override
  public String generateImportStatement(final PlatformDataModel pdm, final EObject ctx) {
    String _importPrefix = this.getImportPrefix();
    QualifiedName _fullyQualifiedName = this.qnp.getFullyQualifiedName(pdm);
    String _plus = (_importPrefix + _fullyQualifiedName);
    String _importSuffix = this.getImportSuffix();
    return (_plus + _importSuffix);
  }

  @Override
  public String generateImportStatement(final PlatformEntity entType, final EObject ctx) {
    String _importPrefix = this.getImportPrefix();
    QualifiedName _fullyQualifiedName = this.qnp.getFullyQualifiedName(entType);
    return (_importPrefix + _fullyQualifiedName);
  }

  @Override
  public String getTypeDefPrefix() {
    return "type";
  }

  @Override
  public String getNamespaceKwd() {
    return "object";
  }

  @Override
  public String getClazzKwd() {
    return "trait";
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
    String _rolename = composition.getRolename();
    _builder.append(_rolename);
    _builder.append(": ");
    {
      int _upperBound = composition.getUpperBound();
      boolean _greaterThan = (_upperBound > 1);
      if (_greaterThan) {
        _builder.append("[");
        String _genTypeName = this.genTypeName(composition.getType());
        _builder.append(_genTypeName);
        _builder.append("]");
      } else {
        String _genTypeName_1 = this.genTypeName(composition.getType());
        _builder.append(_genTypeName_1);
      }
    }
    _builder.append("   // ");
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
    String _rolename = participant.getRolename();
    _builder.append(_rolename);
    _builder.append(": ");
    {
      int _upperBound = participant.getUpperBound();
      boolean _greaterThan = (_upperBound > 1);
      if (_greaterThan) {
        _builder.append("[");
        String _genTypeName = this.genTypeName(participant.getType());
        _builder.append(_genTypeName);
        _builder.append("]");
      } else {
        String _genTypeName_1 = this.genTypeName(participant.getType());
        _builder.append(_genTypeName_1);
      }
    }
    _builder.append("   // ");
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
    _builder.append(" :\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  public String clazzEndDecl(final PlatformEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
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
