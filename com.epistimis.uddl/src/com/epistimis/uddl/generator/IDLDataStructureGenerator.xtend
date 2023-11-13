package com.epistimis.uddl.generator

import com.epistimis.uddl.uddl.LogicalMeasurement
import com.epistimis.uddl.uddl.LogicalMeasurementAxis
import com.epistimis.uddl.uddl.LogicalValueTypeUnit
import com.epistimis.uddl.uddl.PlatformArray
import com.epistimis.uddl.uddl.PlatformBoolean
import com.epistimis.uddl.uddl.PlatformBoundedString
import com.epistimis.uddl.uddl.PlatformChar
import com.epistimis.uddl.uddl.PlatformCharArray
import com.epistimis.uddl.uddl.PlatformComposableElement
import com.epistimis.uddl.uddl.PlatformDataType
import com.epistimis.uddl.uddl.PlatformDouble
import com.epistimis.uddl.uddl.PlatformEnumeration
import com.epistimis.uddl.uddl.PlatformFixed
import com.epistimis.uddl.uddl.PlatformFloat
import com.epistimis.uddl.uddl.PlatformLong
import com.epistimis.uddl.uddl.PlatformLongDouble
import com.epistimis.uddl.uddl.PlatformLongLong
import com.epistimis.uddl.uddl.PlatformOctet
import com.epistimis.uddl.uddl.PlatformSequence
import com.epistimis.uddl.uddl.PlatformShort
import com.epistimis.uddl.uddl.PlatformString
import com.epistimis.uddl.uddl.PlatformStruct
import com.epistimis.uddl.uddl.PlatformULong
import com.epistimis.uddl.uddl.PlatformULongLong
import com.epistimis.uddl.uddl.PlatformUShort
import java.util.Map
import com.epistimis.uddl.uddl.PlatformDataModel
import com.epistimis.uddl.uddl.PlatformEntity
import com.epistimis.uddl.uddl.PlatformComposition
import com.epistimis.uddl.uddl.PlatformParticipant
import org.eclipse.emf.ecore.EObject
import com.epistimis.uddl.RealizedComposableElement

/**
 * NOTE: Need to handle attribute cardinality in a general way - 2 parts of this: determining cardinality and then rendering.
 * Determining cardinality should be language independent.
 */
/**
 * This is based on FACE spec Appendix J.8 - the rule for PlatformDataType
 */
class IDLDataStructureGenerator extends CommonDataStructureGenerator {

	new(Map<PlatformComposableElement,RealizedComposableElement> ace) {
		super(ace);
	}
	
	new() {
		super();
		initialize();
	}

	override String getRootDirectory() { return "idl/"; }

	override String getWriteFileExtension() { return ".idl"; }
	override String getReadFileExtension() { return ".idl"; }

	/**
	 * TODO: Structured FDTs aren't currently supported 
	 */
	override String getPDTTypeString(PlatformDataType pdt) {
		switch (pdt) {
			PlatformBoundedString:  "string<"+pdt.maxLength + ">"
			PlatformCharArray:  "char["+pdt.length + "]"
			PlatformString :  	"string"
			PlatformBoolean :  	"boolean"
			PlatformOctet :  	"octet"
			PlatformChar:  		"char"
			PlatformFloat:  	"float"
			PlatformDouble:  	"double"
			PlatformLongDouble: "long double"
			PlatformShort:  	"short"
			PlatformLong:  		"long"
			PlatformLongLong:  	"long long"
			PlatformUShort:  	"unsigned short"
			PlatformULong:  	"unsigned long"
			PlatformULongLong:  "unsigned long long"
			PlatformFixed:		"fixed<"+pdt.digits+","+pdt.scale + ">"
			PlatformSequence:   "sequence<octet,"+pdt.maxSize+">"
			PlatformArray:		"octet["+pdt.size+"]"
			PlatformEnumeration: {
				val absMeasure = pdt.realizes;
				var LogicalValueTypeUnit vtu = null;
				switch (absMeasure) {
					case LogicalMeasurement: {
						val axis = (absMeasure as LogicalMeasurement).measurementAxis.get(0);
						vtu =  axis.valueTypeUnit.get(0);
					}
					case LogicalMeasurementAxis: {
						vtu =  (absMeasure as LogicalMeasurementAxis).valueTypeUnit.get(0);
					}
					case LogicalValueTypeUnit: {
						vtu = (absMeasure as LogicalValueTypeUnit);
					}
					
				}
				if (vtu.constraint !== null) {
					// list is only the constraint content
					" enum not finished"
				} else {
					// list is the entire enum
					"enum not finished"
				}
			}
			PlatformStruct: {
				var result = "struct {\n";
				// loop thru struct members
				val struct = pdt as PlatformStruct;
				for (m: struct.member) {
					result += m.type.name + " " + m.rolename + ";\n"
				}
				result += "};\n";
				return result
			}	
			// These two last because they are base classes
			//PlatformUnsignedInteger:"uint" 
			//PlatformInteger:  	"Int"
			// TODO: Others not yet supported
			default: ""
		}
	}
	
	override String getImportPrefix() { return 'import "'; }

	override String getImportSuffix() { return '"\n'; }

	override String pdmHeader(PlatformDataModel pdm) {
		'''
		// Types from «qnp.getFullyQualifiedName(pdm)»
		'''	
	}

	override defNewType(PlatformDataType pdt) {
		'''
		type «pdt.getTypeString» «pdt.name» ;
		'''	
	}
	override String generateImportStatement(PlatformDataModel pdm, EObject ctx) {
			return getImportPrefix() + pdm.generateWriteFileName + getImportSuffix();		
	}
		
	override String generateImportStatement(PlatformEntity entType, EObject ctx) {
			return getImportPrefix() + entType.generateWriteFileName + getImportSuffix();		
	}

	override String getTypeDefPrefix() { return "type"; }

	override String getNamespaceKwd() { return "package";}

	override String getClazzKwd() { return "class";}

	override String getSpecializesKwd() { return "extends" ;}

	override String getCompositionVisibility() { return "private" ;}

	override String getFileHeader(PlatformEntity entity) {
		'''
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
