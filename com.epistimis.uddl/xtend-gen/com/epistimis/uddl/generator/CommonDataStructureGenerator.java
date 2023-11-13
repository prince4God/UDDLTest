package com.epistimis.uddl.generator;

import com.epistimis.uddl.RealizedComposableElement;
import com.epistimis.uddl.UddlQNP;
import com.epistimis.uddl.uddl.PlatformAssociation;
import com.epistimis.uddl.uddl.PlatformComposableElement;
import com.epistimis.uddl.uddl.PlatformComposition;
import com.epistimis.uddl.uddl.PlatformDataModel;
import com.epistimis.uddl.uddl.PlatformDataType;
import com.epistimis.uddl.uddl.PlatformEntity;
import com.epistimis.uddl.uddl.PlatformParticipant;
import com.epistimis.uddl.uddl.UddlElement;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This is the common portion of a data structure generator. It will be the base class for every data structure
 * generator for each language.
 */
@SuppressWarnings("all")
public abstract class CommonDataStructureGenerator implements IGenerator2 {
  @Inject
  @Extension
  protected IQualifiedNameProvider qnp;

  private static Logger logger = Logger.getLogger(CommonDataStructureGenerator.class);

  private List<PlatformEntity> processedEntities;

  private List<PlatformDataModel> processedPDMs;

  protected Map<PlatformComposableElement, RealizedComposableElement> allComposableElements;

  public CommonDataStructureGenerator(final Map<PlatformComposableElement, RealizedComposableElement> ace) {
    this.allComposableElements = ace;
  }

  public CommonDataStructureGenerator() {
    this.initialize();
  }

  public void initialize() {
    if ((this.allComposableElements == null)) {
      HashMap<PlatformComposableElement, RealizedComposableElement> _hashMap = new HashMap<PlatformComposableElement, RealizedComposableElement>();
      this.allComposableElements = _hashMap;
    }
    if ((this.processedEntities == null)) {
      ArrayList<PlatformEntity> _arrayList = new ArrayList<PlatformEntity>();
      this.processedEntities = _arrayList;
    }
    if ((this.processedPDMs == null)) {
      ArrayList<PlatformDataModel> _arrayList_1 = new ArrayList<PlatformDataModel>();
      this.processedPDMs = _arrayList_1;
    }
    if ((this.qnp == null)) {
      UddlQNP _uddlQNP = new UddlQNP();
      this.qnp = _uddlQNP;
    }
  }

  public void cleanup() {
    this.allComposableElements.clear();
    this.processedEntities.clear();
    this.processedPDMs.clear();
  }

  @Override
  public void beforeGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.initialize();
  }

  @Override
  public void afterGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.cleanup();
  }

  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.initialize();
    Set<PlatformComposableElement> _keySet = this.allComposableElements.keySet();
    for (final PlatformComposableElement rce : _keySet) {
      if ((rce instanceof PlatformEntity)) {
        final PlatformEntity re = ((PlatformEntity) rce);
        this.processAnEntity(re, fsa, context);
      }
    }
    this.cleanup();
  }

  public String getDirDelimiter() {
    return System.getProperty("file.separator");
  }

  public abstract String getRootDirectory();

  /**
   * In most cases, the write and read extensions will be the same. However, in some cases,
   * they won't. Examples include Typescript (starts as .ts and is converted to .js), and
   * XTend (starts as .xtend and is converted to .java).
   * By having different extensions, we support the need to read from a different file extension
   * than was originally written.
   */
  public abstract String getWriteFileExtension();

  public abstract String getReadFileExtension();

  public abstract String getFileHeader(final PlatformEntity entity);

  /**
   * These are common across many languages so put them in the base class
   */
  public String getMultiLineCmtStart() {
    return "/*";
  }

  public String getMultiLineCmtEnd() {
    return "*/";
  }

  public String getSingleLineCmtStart() {
    return "//";
  }

  public String getStmtEnd() {
    return ";";
  }

  public String getScopeStart() {
    return "{";
  }

  public String getScopeEnd() {
    return "}";
  }

  public String getStructStart() {
    return "{";
  }

  public String getStructEnd() {
    return "};";
  }

  public String getElemEnd() {
    return ";";
  }

  public String getArrStart() {
    return "[";
  }

  public String getArrEnd() {
    return "]";
  }

  public abstract String getImportPrefix();

  public abstract String getImportSuffix();

  public abstract String pdmHeader(final PlatformDataModel pdm);

  public abstract String defNewType(final PlatformDataType pdt);

  public abstract String getTypeDefPrefix();

  public abstract String getNamespaceKwd();

  public abstract String getClazzKwd();

  public abstract String getSpecializesKwd();

  public abstract String getCompositionVisibility();

  /**
   * This method gets around a problem with inheritance and dispatch methods
   */
  public abstract String getPDTTypeString(final PlatformDataType pdt);

  public abstract String clazzDecl(final PlatformEntity entity);

  public abstract String clazzEndDecl(final PlatformEntity entity);

  /**
   * TODO: Structured FDTs aren't currently supported
   * dispatch methods can't be abstract - so force override
   */
  protected String _getTypeString(final PlatformDataType pdt) {
    return this.getPDTTypeString(pdt);
  }

  protected String _getTypeString(final PlatformEntity ent) {
    return this.genTypeName(ent);
  }

  /**
   * We replace the standard delimiter with a directory delimiter as a way to generate all the directories we want
   */
  public String generateDirectories(final EObject obj) {
    return this.generateDirectories(obj, 0);
  }

  public String generateDirectories(final EObject obj, final int skipCnt) {
    return this.qnp.getFullyQualifiedName(obj).skipLast(skipCnt).toString(this.getDirDelimiter());
  }

  /**
   * Generate a relative path under the assumption that qualified names also describe the
   * directory hierarchy
   */
  public String generateRelativePath(final EObject obj, final EObject ctx, final int skipCnt) {
    final UddlQNP uqnp = ((UddlQNP) this.qnp);
    final QualifiedName downRQN = uqnp.<EObject, EObject>relativeQualifiedName(obj, ctx);
    final QualifiedName upRQN = uqnp.<EObject, EObject>relativeQualifiedName(ctx, obj);
    String result = "";
    for (int i = 2; (i < upRQN.getSegmentCount()); i++) {
      String _result = result;
      String _dirDelimiter = this.getDirDelimiter();
      String _plus = (".." + _dirDelimiter);
      result = (_result + _plus);
    }
    String _string = downRQN.skipFirst(1).skipLast(skipCnt).toString(this.getDirDelimiter());
    return (result + _string);
  }

  public String setTrailingDirDelimiter(final String path) {
    if (((path.length() > 0) && (path.charAt((path.length() - 1)) != this.getDirDelimiter().charAt(0)))) {
      String _dirDelimiter = this.getDirDelimiter();
      return (path + _dirDelimiter);
    } else {
      return path;
    }
  }

  /**
   * Generate a read file name of obj relative to context.
   */
  public String generateRelativeReadFileName(final UddlElement obj, final EObject context) {
    String name = obj.getName();
    if ((obj instanceof PlatformComposableElement)) {
      name = this.genTypeName(((PlatformComposableElement)obj));
    }
    String relPath = this.setTrailingDirDelimiter(this.generateRelativePath(obj, context, 1));
    String _readFileExtension = this.getReadFileExtension();
    return ((relPath + name) + _readFileExtension);
  }

  /**
   * Generate the name of the file to write relative to the root directory
   */
  public String generateWriteFileName(final UddlElement obj) {
    String name = obj.getName();
    if ((obj instanceof PlatformComposableElement)) {
      name = this.genTypeName(((PlatformComposableElement)obj));
    }
    String _rootDirectory = this.getRootDirectory();
    String _setTrailingDirDelimiter = this.setTrailingDirDelimiter(this.generateDirectories(obj, 1));
    String path = (_rootDirectory + _setTrailingDirDelimiter);
    String _writeFileExtension = this.getWriteFileExtension();
    return ((path + name) + _writeFileExtension);
  }

  /**
   * When you only want to process selected Entities (rather than all of them) call this.
   * This will be called from the FaceGenerator. We should have 1 of these in each language specific generator
   */
  public void processEntities(final Collection<PlatformEntity> entities, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.initialize();
    for (final PlatformEntity entity : entities) {
      this.processAnEntity(entity, fsa, context);
    }
    this.cleanup();
  }

  /**
   * Processing an Entity requires both generating the file(s) for this Entity (which will require references to the headers for any referenced
   * types) as well as generating the files for any referenced types. This requires recursion.
   * In this original version, we assume that all PlatformDataTypes will be defined in a header file identified by the PDM container hierarchy.
   * There will be a directory for each PDM - and a header file with the same name as the PDM containing all the PlatformDataTypes defined at that level.
   * 
   * NOTE: processing an Entity or PDT means 2 things: 1) Has a header file been created for this? 2) Has the header for this type been included for
   * current Entity (the Entity whose header is being generated)?  #1 requires a global list; #2 requires a list localized to this recursion level only
   */
  public void processAnEntity(final PlatformEntity entity, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    boolean _contains = this.processedEntities.contains(entity);
    boolean _not = (!_contains);
    if (_not) {
      this.processedEntities.add(entity);
      fsa.generateFile(this.generateWriteFileName(entity), this.compile(entity));
      EList<PlatformComposition> _composition = entity.getComposition();
      for (final PlatformComposition comp : _composition) {
        {
          final PlatformComposableElement pce = comp.getType();
          this.processCompositionElement(pce, fsa, context);
        }
      }
      if ((entity instanceof PlatformAssociation)) {
        final PlatformAssociation assoc = ((PlatformAssociation) entity);
        EList<PlatformParticipant> _participant = assoc.getParticipant();
        for (final PlatformParticipant part : _participant) {
          {
            final PlatformComposableElement pce = part.getType();
            this.processCompositionElement(pce, fsa, context);
          }
        }
      }
    }
  }

  public void processCompositionElement(final PlatformComposableElement pce, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    if ((pce instanceof PlatformDataType)) {
      EObject _eContainer = ((PlatformDataType)pce).eContainer();
      final PlatformDataModel pdtContainer = ((PlatformDataModel) _eContainer);
      boolean _contains = this.processedPDMs.contains(pdtContainer);
      boolean _not = (!_contains);
      if (_not) {
        this.processedPDMs.add(pdtContainer);
        fsa.generateFile(this.generateWriteFileName(pdtContainer), this.compile(pdtContainer));
      }
    } else {
      if ((pce instanceof PlatformEntity)) {
        final PlatformEntity pEnt = ((PlatformEntity) pce);
        boolean _contains_1 = this.processedEntities.contains(pEnt);
        boolean _not_1 = (!_contains_1);
        if (_not_1) {
          this.processAnEntity(pEnt, fsa, context);
        }
      } else {
        String _string = pce.toString();
        String _plus = ("Cannot process unsupported Entity type: " + _string);
        CommonDataStructureGenerator.logger.warn(_plus);
      }
    }
  }

  /**
   * When creating a PDM header file, only include PlatformDataTypes. PlatformEntity gets a header per entity
   */
  public CharSequence compile(final PlatformDataModel pdm) {
    StringConcatenation _builder = new StringConcatenation();
    String _pdmHeader = this.pdmHeader(pdm);
    _builder.append(_pdmHeader);
    _builder.newLineIfNotEmpty();
    final Iterable<PlatformDataType> pdts = Iterables.<PlatformDataType>filter(pdm.eContents(), PlatformDataType.class);
    _builder.newLineIfNotEmpty();
    {
      for(final PlatformDataType pdt : pdts) {
        String _defNewType = this.defNewType(pdt);
        _builder.append(_defNewType);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public abstract String genTypeName(final PlatformComposableElement pce);

  public abstract String generateImportStatement(final PlatformDataModel pdm, final EObject ctx);

  public abstract String generateImportStatement(final PlatformEntity entType, final EObject ctx);

  /**
   * Generate the include reference to the appropriate header file if it hasn't already been included.
   * 
   * TODO: Everything that is included must also be generated in this language.
   */
  public String generateInclude(final PlatformComposableElement type, final EObject ctx, final List<PlatformDataModel> pdmIncludes, final List<PlatformEntity> entityIncludes) {
    if ((type instanceof PlatformDataType)) {
      EObject _eContainer = ((PlatformDataType)type).eContainer();
      final PlatformDataModel pdm = ((PlatformDataModel) _eContainer);
      boolean _contains = pdmIncludes.contains(pdm);
      boolean _not = (!_contains);
      if (_not) {
        pdmIncludes.add(pdm);
        return this.generateImportStatement(pdm, ctx);
      }
    } else {
      final PlatformEntity entType = ((PlatformEntity) type);
      boolean _contains_1 = entityIncludes.contains(entType);
      boolean _not_1 = (!_contains_1);
      if (_not_1) {
        entityIncludes.add(entType);
        return this.generateImportStatement(entType, ctx);
      }
    }
    return "";
  }

  public String nDent(final int tabCnt) {
    if ((tabCnt == 0)) {
      return "";
    } else {
      String _nDent = this.nDent((tabCnt - 1));
      return ("\t" + _nDent);
    }
  }

  /**
   * @param comp the composition element to generate a member for
   * @param ndx the zero based index of this element in the structure
   */
  public abstract String compositionElement(final PlatformComposition comp, final int ndx);

  /**
   * @param participant the participant element to generate a member for
   * @param ndx the zero based index of this element in the structure
   */
  public abstract String participantElement(final PlatformParticipant participant, final int ndx);

  public CharSequence compile(final PlatformEntity entity) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<PlatformEntity> entityIncludes = new ArrayList<PlatformEntity>();
      entityIncludes.add(entity);
      List<PlatformDataModel> pdmIncludes = new ArrayList<PlatformDataModel>();
      int ndx = 0;
      StringConcatenation _builder = new StringConcatenation();
      String _fileHeader = this.getFileHeader(entity);
      _builder.append(_fileHeader);
      _builder.newLineIfNotEmpty();
      {
        EList<PlatformComposition> _composition = entity.getComposition();
        for(final PlatformComposition composition : _composition) {
          String _generateInclude = this.generateInclude(composition.getType(), entity, pdmIncludes, entityIncludes);
          _builder.append(_generateInclude);
          _builder.newLineIfNotEmpty();
        }
      }
      {
        PlatformEntity _specializes = entity.getSpecializes();
        boolean _tripleNotEquals = (_specializes != null);
        if (_tripleNotEquals) {
          String _generateInclude_1 = this.generateInclude(entity.getSpecializes(), entity, pdmIncludes, entityIncludes);
          _builder.append(_generateInclude_1);
          _builder.newLineIfNotEmpty();
        }
      }
      String _clazzDecl = this.clazzDecl(entity);
      _builder.append(_clazzDecl);
      _builder.append(" ");
      _builder.newLineIfNotEmpty();
      {
        EList<PlatformComposition> _composition_1 = entity.getComposition();
        for(final PlatformComposition composition_1 : _composition_1) {
          int _plusPlus = ndx++;
          String _compositionElement = this.compositionElement(composition_1, _plusPlus);
          _builder.append(_compositionElement);
          _builder.newLineIfNotEmpty();
        }
      }
      String _clazzEndDecl = this.clazzEndDecl(entity);
      _builder.append(_clazzEndDecl);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public CharSequence compile(final PlatformAssociation entity) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<PlatformEntity> entityIncludes = new ArrayList<PlatformEntity>();
      entityIncludes.add(entity);
      List<PlatformDataModel> pdmIncludes = new ArrayList<PlatformDataModel>();
      int ndx = 0;
      StringConcatenation _builder = new StringConcatenation();
      String _fileHeader = this.getFileHeader(entity);
      _builder.append(_fileHeader);
      _builder.newLineIfNotEmpty();
      {
        EList<PlatformComposition> _composition = entity.getComposition();
        for(final PlatformComposition composition : _composition) {
          String _generateInclude = this.generateInclude(composition.getType(), entity, pdmIncludes, entityIncludes);
          _builder.append(_generateInclude);
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<PlatformParticipant> _participant = entity.getParticipant();
        for(final PlatformParticipant participant : _participant) {
          String _generateInclude_1 = this.generateInclude(participant.getType(), entity, pdmIncludes, entityIncludes);
          _builder.append(_generateInclude_1);
          _builder.newLineIfNotEmpty();
        }
      }
      {
        PlatformEntity _specializes = entity.getSpecializes();
        boolean _tripleNotEquals = (_specializes != null);
        if (_tripleNotEquals) {
          String _generateInclude_2 = this.generateInclude(entity.getSpecializes(), entity, pdmIncludes, entityIncludes);
          _builder.append(_generateInclude_2);
          _builder.newLineIfNotEmpty();
        }
      }
      String _clazzDecl = this.clazzDecl(entity);
      _builder.append(_clazzDecl);
      _builder.append(" ");
      _builder.newLineIfNotEmpty();
      {
        EList<PlatformComposition> _composition_1 = entity.getComposition();
        for(final PlatformComposition composition_1 : _composition_1) {
          int _plusPlus = ndx++;
          String _compositionElement = this.compositionElement(composition_1, _plusPlus);
          _builder.append(_compositionElement);
          _builder.newLineIfNotEmpty();
          _builder.append(ndx = (ndx + 1));
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<PlatformParticipant> _participant_1 = entity.getParticipant();
        for(final PlatformParticipant participant_1 : _participant_1) {
          int _plusPlus_1 = ndx++;
          String _participantElement = this.participantElement(participant_1, _plusPlus_1);
          _builder.append(_participantElement);
          _builder.newLineIfNotEmpty();
          _builder.append(ndx = (ndx + 1));
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      String _clazzEndDecl = this.clazzEndDecl(entity);
      _builder.append(_clazzEndDecl);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public String getTypeString(final PlatformComposableElement pdt) {
    if (pdt instanceof PlatformDataType) {
      return _getTypeString((PlatformDataType)pdt);
    } else if (pdt instanceof PlatformEntity) {
      return _getTypeString((PlatformEntity)pdt);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(pdt).toString());
    }
  }
}
