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
import com.epistimis.uddl.uddl.PlatformFixed;
import com.epistimis.uddl.uddl.PlatformFloat;
import com.epistimis.uddl.uddl.PlatformInteger;
import com.epistimis.uddl.uddl.PlatformParticipant;
import com.epistimis.uddl.uddl.PlatformShort;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * This is the common portion of a data structure generator. It will be the base class for every data structure
 * generator for each language.
 */
@SuppressWarnings("all")
public class RDBMSDataStructureGenerator extends CommonDataStructureGenerator {
  public RDBMSDataStructureGenerator(final Map<PlatformComposableElement, RealizedComposableElement> ace) {
    super(ace);
  }

  public RDBMSDataStructureGenerator() {
    super();
    this.initialize();
  }

  @Override
  public String getRootDirectory() {
    return "rdbms/";
  }

  @Override
  public String getWriteFileExtension() {
    return ".ddl";
  }

  @Override
  public String getReadFileExtension() {
    return ".ddl";
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
      String _plus = ("VARCHAR(" + Integer.valueOf(_maxLength));
      _switchResult = (_plus + ")");
    }
    if (!_matched) {
      if (pdt instanceof PlatformCharArray) {
        _matched=true;
        int _length = ((PlatformCharArray)pdt).getLength();
        String _plus = ("VARCHAR(" + Integer.valueOf(_length));
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformBoolean) {
        _matched=true;
        _switchResult = "BIT";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformChar) {
        _matched=true;
        _switchResult = "CHAR";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformFloat) {
        _matched=true;
        _switchResult = "FLOAT";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformDouble) {
        _matched=true;
        _switchResult = "DOUBLE PRECISION";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformShort) {
        _matched=true;
        _switchResult = "SMALLINT";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformFixed) {
        _matched=true;
        _switchResult = "DEC";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformInteger) {
        _matched=true;
        _switchResult = "INTEGER";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }

  @Override
  public String getImportPrefix() {
    return "<import \">";
  }

  @Override
  public String getImportSuffix() {
    return "<\"\n>";
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
    _builder.append("<type> ");
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
    return "<type>";
  }

  @Override
  public String getNamespaceKwd() {
    return "<namespace>";
  }

  @Override
  public String getClazzKwd() {
    return "CREATE TABLE";
  }

  @Override
  public String getSpecializesKwd() {
    return "<:>";
  }

  @Override
  public String getCompositionVisibility() {
    return "";
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

  @Override
  public String getStructStart() {
    return "(";
  }

  @Override
  public String getStructEnd() {
    return ");";
  }
}
