package com.epistimis.uddl.generator

import com.epistimis.uddl.uddl.PlatformBoolean
import com.epistimis.uddl.uddl.PlatformBoundedString
import com.epistimis.uddl.uddl.PlatformChar
import com.epistimis.uddl.uddl.PlatformCharArray
import com.epistimis.uddl.uddl.PlatformComposableElement
import com.epistimis.uddl.uddl.PlatformComposition
import com.epistimis.uddl.uddl.PlatformDataModel
import com.epistimis.uddl.uddl.PlatformDataType
import com.epistimis.uddl.uddl.PlatformDouble
import com.epistimis.uddl.uddl.PlatformEntity
import com.epistimis.uddl.uddl.PlatformFloat
import com.epistimis.uddl.uddl.PlatformInteger
import com.epistimis.uddl.uddl.PlatformLong
import com.epistimis.uddl.uddl.PlatformLongDouble
import com.epistimis.uddl.uddl.PlatformLongLong
import com.epistimis.uddl.uddl.PlatformParticipant
import com.epistimis.uddl.uddl.PlatformShort
import com.epistimis.uddl.uddl.PlatformString
import com.epistimis.uddl.uddl.PlatformULong
import com.epistimis.uddl.uddl.PlatformULongLong
import com.epistimis.uddl.uddl.PlatformUShort
import com.epistimis.uddl.uddl.PlatformUnsignedInteger
import java.util.Map
import org.eclipse.emf.ecore.EObject
import com.epistimis.uddl.RealizedComposableElement

/**
 * NOTE: Need to handle attribute cardinality in a general way - 2 parts of this: determining cardinality and then rendering.
 * Determining cardinality should be language independent.
 */
/**
 * This is the common portion of a data structure generator. It will be the base class for every data structure
 * generator for each language.
 */
class CppDataStructureGenerator extends CommonDataStructureGenerator {

	new(Map<PlatformComposableElement,RealizedComposableElement> ace) {
		super(ace);
	}
	
	new() {
		super();
		initialize();
	}

	override String getRootDirectory() { return "cpp/"; }

	override String getWriteFileExtension() { return ".hpp"; }
	override String getReadFileExtension() { return ".hpp"; }

	/**
	 * TODO: Structured FDTs aren't currently supported 
	 * dispatch methods can't be abstract - so force override
	 */
	override String getPDTTypeString(PlatformDataType pdt) {
		switch (pdt) {
			PlatformBoundedString: "string"
			PlatformCharArray: "char[" + pdt.length + "]"
			PlatformString: "std::string"
			PlatformBoolean: "bool"
			PlatformChar: "char"
			PlatformFloat: "float"
			PlatformDouble: "double"
			PlatformLongDouble: "long double"
			PlatformShort: "short"
			PlatformLong: "long"
			PlatformLongLong: "long long"
			PlatformUShort: "unsigned short"
			PlatformULong: "unsigned long"
			PlatformULongLong: "unsigned long long"
			// These two last because they are base classes
			PlatformUnsignedInteger: "unsigned int"
			PlatformInteger: "int"
			// TODO: Others not yet supported
			default: ""
		}
	}

	override String getImportPrefix() { return "#include \""; }

	override String getImportSuffix() { return "\"\n"; }

	override String pdmHeader(PlatformDataModel pdm) {
		'''
		#pragma once
		#include <string>
		// Types from «qnp.getFullyQualifiedName(pdm)»
		'''	
	}

	override defNewType(PlatformDataType pdt) {
		'''
		typedef «pdt.getTypeString» «pdt.name» ;
		'''	
	}

	override String generateImportStatement(PlatformDataModel pdm, EObject ctx) {
			return getImportPrefix() + pdm.generateWriteFileName + getImportSuffix();		
	}
		
	override String generateImportStatement(PlatformEntity entType, EObject ctx) {
			return getImportPrefix() + entType.generateWriteFileName + getImportSuffix();		
	}

	override String getTypeDefPrefix() { return "typedef"; }

	override String getNamespaceKwd() { return "namespace";}

	override String getClazzKwd() { return "class";}

	override String getSpecializesKwd() { return ":" ;}

	override String getCompositionVisibility() { return "private" ;}


	override String getFileHeader(PlatformEntity entity) {
		'''
		#pragma once
		#include <string>
		«multiLineCmtStart» 
		«entity.description» 
		«multiLineCmtEnd»		
		'''
	}
	
	override String compositionElement(PlatformComposition composition, int ndx) {
		'''
		«nDent(ndx)»«compositionVisibility» «composition.type.name» «composition.rolename»«IF composition.upperBound > 1»«arrStart»«composition.upperBound»«arrEnd»«ENDIF»«elemEnd» «singleLineCmtStart» «composition.description»
		'''
	}
	override String participantElement(PlatformParticipant participant, int ndx) {
		'''
		«nDent(ndx)»«compositionVisibility» «participant.type.name» «participant.rolename»«IF participant.upperBound > 1»«arrStart»«participant.upperBound»«arrEnd»«ENDIF»«elemEnd» «singleLineCmtStart» «participant.description»
		'''
	}
	
	override clazzDecl(PlatformEntity entity) '''
		«clazzKwd» «entity.name» «IF entity.specializes !== null» «specializesKwd» «entity.specializes» «ENDIF» «structStart»	
	'''
	
	override clazzEndDecl(PlatformEntity entity)'''
	};
	'''
	override String genTypeName(PlatformComposableElement pce)'''«pce.name»'''
	
}
