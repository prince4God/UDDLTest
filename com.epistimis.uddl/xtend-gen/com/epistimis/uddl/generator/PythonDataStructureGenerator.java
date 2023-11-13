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
import com.epistimis.uddl.uddl.PlatformString;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * This is the common portion of a data structure generator. It will be the base class for every data structure
 * generator for each language.
 */
@SuppressWarnings("all")
public class PythonDataStructureGenerator extends CommonDataStructureGenerator {
  public PythonDataStructureGenerator(final Map<PlatformComposableElement, RealizedComposableElement> ace) {
    super(ace);
  }

  public PythonDataStructureGenerator() {
    super();
    this.initialize();
  }

  @Override
  public String getRootDirectory() {
    return "python/";
  }

  @Override
  public String getWriteFileExtension() {
    return ".py";
  }

  @Override
  public String getReadFileExtension() {
    return ".py";
  }

  @Override
  public String getScopeStart() {
    return ":";
  }

  @Override
  public String getScopeEnd() {
    return "";
  }

  @Override
  public String getStructStart() {
    return ":";
  }

  @Override
  public String getStructEnd() {
    return "";
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
      _switchResult = "str";
    }
    if (!_matched) {
      if (pdt instanceof PlatformCharArray) {
        _matched=true;
        int _length = ((PlatformCharArray)pdt).getLength();
        String _plus = ("bytearray(" + Integer.valueOf(_length));
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformString) {
        _matched=true;
        _switchResult = "str";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformBoolean) {
        _matched=true;
        _switchResult = "bool";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformChar) {
        _matched=true;
        _switchResult = "bytes";
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
        _switchResult = "float";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformFixed) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (pdt instanceof PlatformInteger) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }

  @Override
  public String pdmHeader(final PlatformDataModel pdm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from typing import NewType");
    _builder.newLine();
    _builder.append("# Types from ");
    QualifiedName _fullyQualifiedName = this.qnp.getFullyQualifiedName(pdm);
    _builder.append(_fullyQualifiedName);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }

  @Override
  public String defNewType(final PlatformDataType pdt) {
    StringConcatenation _builder = new StringConcatenation();
    String _genTypeName = this.genTypeName(pdt);
    _builder.append(_genTypeName);
    _builder.append(" = NewType(\'");
    String _genTypeName_1 = this.genTypeName(pdt);
    _builder.append(_genTypeName_1);
    _builder.append("\', ");
    String _typeString = this.getTypeString(pdt);
    _builder.append(_typeString);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  public String generateImportStatement(final PlatformDataModel pdm, final EObject ctx) {
    String _name = pdm.getName();
    String _plus = ("from " + _name);
    return (_plus + " import *");
  }

  @Override
  public String generateImportStatement(final PlatformEntity entType, final EObject ctx) {
    String _genTypeName = this.genTypeName(entType);
    return ("import " + _genTypeName);
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
  public String getTypeDefPrefix() {
    return "class";
  }

  @Override
  public String getNamespaceKwd() {
    return "namespace";
  }

  @Override
  public String getClazzKwd() {
    return "class";
  }

  @Override
  public String getSpecializesKwd() {
    return "<do not use>";
  }

  @Override
  public String getCompositionVisibility() {
    return "";
  }

  @Override
  public String getFileHeader(final PlatformEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# from model element ");
    QualifiedName _fullyQualifiedName = this.qnp.getFullyQualifiedName(entity);
    _builder.append(_fullyQualifiedName);
    _builder.newLineIfNotEmpty();
    _builder.append("#");
    _builder.newLine();
    _builder.append("# ");
    String _description = entity.getDescription();
    _builder.append(_description);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("#");
    _builder.newLine();
    _builder.newLine();
    _builder.append("from dataclasses import dataclass");
    _builder.newLine();
    _builder.append("#from typing import List");
    _builder.newLine();
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
        _builder.append("list[");
        String _genTypeName = this.genTypeName(composition.getType());
        _builder.append(_genTypeName);
        _builder.append("]");
      } else {
        String _genTypeName_1 = this.genTypeName(composition.getType());
        _builder.append(_genTypeName_1);
      }
    }
    _builder.append("   # ");
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
        _builder.append("list[");
        String _genTypeName = this.genTypeName(participant.getType());
        _builder.append(_genTypeName);
        _builder.append("]");
      } else {
        String _genTypeName_1 = this.genTypeName(participant.getType());
        _builder.append(_genTypeName_1);
      }
    }
    _builder.append("   # ");
    String _description = participant.getDescription();
    _builder.append(_description);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  public String clazzDecl(final PlatformEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.newLine();
    _builder.append("@dataclass");
    _builder.newLine();
    _builder.append("class ");
    String _firstUpper = StringExtensions.toFirstUpper(entity.getName());
    _builder.append(_firstUpper);
    {
      PlatformEntity _specializes = entity.getSpecializes();
      boolean _tripleNotEquals = (_specializes != null);
      if (_tripleNotEquals) {
        _builder.append("( ");
        PlatformEntity _specializes_1 = entity.getSpecializes();
        _builder.append(_specializes_1);
        _builder.append(" )");
      }
    }
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"\"\"");
    String _description = entity.getDescription();
    _builder.append(_description, "\t");
    _builder.append("\"\"\"\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  public String clazzEndDecl(final PlatformEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }

  @Override
  public String genTypeName(final PlatformComposableElement pce) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(pce.getName());
    _builder.append(_firstUpper);
    return _builder.toString();
  }
}
