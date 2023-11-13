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
import com.epistimis.uddl.uddl.PlatformEntity;
import com.epistimis.uddl.uddl.PlatformNumber;
import com.epistimis.uddl.uddl.PlatformParticipant;
import com.epistimis.uddl.uddl.PlatformString;
import com.google.common.collect.Iterables;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * This is the common portion of a data structure generator. It will be the base class for every data structure
 * generator for each language.
 */
@SuppressWarnings("all")
public class TypescriptDataStructureGenerator extends CommonDataStructureGenerator {
  public TypescriptDataStructureGenerator(final Map<PlatformComposableElement, RealizedComposableElement> ace) {
    super(ace);
  }

  public TypescriptDataStructureGenerator() {
    super();
    this.initialize();
  }

  @Override
  public String getRootDirectory() {
    return "typescript/";
  }

  @Override
  public String getWriteFileExtension() {
    return ".ts";
  }

  @Override
  public String getReadFileExtension() {
    return ".js";
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
        _switchResult = "string";
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
      if (pdt instanceof PlatformChar) {
        _matched=true;
        _switchResult = "string";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformNumber) {
        _matched=true;
        _switchResult = "number";
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
    _builder.append("export type ");
    String _name = pdt.getName();
    _builder.append(_name);
    _builder.append(" = ");
    String _typeString = this.getTypeString(pdt);
    _builder.append(_typeString);
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  public String generateImportStatement(final PlatformDataModel pdm, final EObject ctx) {
    String _xblockexpression = null;
    {
      final Iterable<PlatformDataType> pdts = Iterables.<PlatformDataType>filter(pdm.eContents(), PlatformDataType.class);
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _hasElements = false;
        for(final PlatformDataType pdt : pdts) {
          if (!_hasElements) {
            _hasElements = true;
            _builder.append("import { ");
          } else {
            _builder.appendImmediate(", ", "");
          }
          String _genTypeName = this.genTypeName(pdt);
          _builder.append(_genTypeName);
        }
        if (_hasElements) {
          _builder.append(" }");
        }
      }
      _builder.append(" from \"");
      String _generateRelativeReadFileName = this.generateRelativeReadFileName(pdm, ctx);
      _builder.append(_generateRelativeReadFileName);
      _builder.append("\";");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  @Override
  public String generateImportStatement(final PlatformEntity entType, final EObject ctx) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import {");
    String _genTypeName = this.genTypeName(entType);
    _builder.append(_genTypeName);
    _builder.append("} from \"");
    String _generateRelativeReadFileName = this.generateRelativeReadFileName(entType, ctx);
    _builder.append(_generateRelativeReadFileName);
    _builder.append("\"");
    return _builder.toString();
  }

  @Override
  public String getTypeDefPrefix() {
    return "type";
  }

  @Override
  public String getNamespaceKwd() {
    return "namespace";
  }

  @Override
  public String getClazzKwd() {
    return "interface";
  }

  @Override
  public String getSpecializesKwd() {
    return "extends";
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
    String _rolename = composition.getRolename();
    _builder.append(_rolename);
    _builder.append(": ");
    {
      int _upperBound = composition.getUpperBound();
      boolean _greaterThan = (_upperBound > 1);
      if (_greaterThan) {
        String _genTypeName = this.genTypeName(composition.getType());
        _builder.append(_genTypeName);
        _builder.append("[]");
      } else {
        String _genTypeName_1 = this.genTypeName(composition.getType());
        _builder.append(_genTypeName_1);
      }
    }
    _builder.append(";   // ");
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
    String _rolename = participant.getRolename();
    _builder.append(_rolename);
    _builder.append(": ");
    {
      int _upperBound = participant.getUpperBound();
      boolean _greaterThan = (_upperBound > 1);
      if (_greaterThan) {
        String _genTypeName = this.genTypeName(participant.getType());
        _builder.append(_genTypeName);
        _builder.append("[]");
      } else {
        String _genTypeName_1 = this.genTypeName(participant.getType());
        _builder.append(_genTypeName_1);
      }
    }
    _builder.append(";   // ");
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
