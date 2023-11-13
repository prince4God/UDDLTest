/*
 * generated by Xtext 2.32.0
 */
/*
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.tests

import com.epistimis.uddl.scoping.IndexUtilities
import com.epistimis.uddl.uddl.DataModel
import com.epistimis.uddl.uddl.UddlPackage
import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static extension org.junit.jupiter.api.Assertions.assertEquals

@ExtendWith(InjectionExtension)
@InjectWith(UddlInjectorProvider)
class UddlParsingTest {
	@Inject extension ParseHelper<DataModel> parseHelper

	@Inject extension IndexUtilities

	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
dm Conceptual_Model  {
	cdm FACE_Shared_Data_Model_Conceptual  {
	  cdm Observables {
		observable NonPhysicalAddress "A scheme applied over a non-physical location/space used to delineate different elements or parts (e.g. IPv4, IPv4, telephone number)." ;
	  }
	}
}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')

	}



	@Test def void testExportedEObjectDescriptions() {
				val result = parseHelper.parse(
		'''
dm d  {
	cdm c1  {
	  cdm c2 {
		observable o "A scheme applied over a non-physical location/space used to delineate different elements or parts (e.g. IPv4, IPv4, telephone number)." ;
	  }
	}
}
		''');
		result.assertExportedEObjectDescriptions("d, d.c1, d.c1.c2, d.c1.c2.o");

	}

	@Test def void testClassesInIndex() {
		val first = '''
dm d  {
	cdm c1  {
	  cdm c2 {
	  }
	}
}'''.parse

		'''
dm d2  {
	cdm c1  {
	  cdm c2 {
		observable o "A scheme applied over a non-physical location/space used to delineate different elements or parts (e.g. IPv4, IPv4, telephone number)." ;
	  }
	}
}
		'''.parse(first.eResource.resourceSet).cdm.head.assertTypesInIndex(UddlPackage.eINSTANCE.conceptualDataModel,"d.c1, d.c1.c2, d2.c1, d2.c1.c2")
	}


	def private assertExportedEObjectDescriptions(EObject o, CharSequence expected) {
		val actual = o.getExportedEObjectDescriptions.map[qualifiedName].join(", ");
		expected.toString.compareTo(actual).assertEquals(0)
	}

	def private assertTypesInIndex(EObject o, EClass type, String expected) {
		val visibleClassesDescriptions = o.getVisibleEObjectDescriptions(type)
		expected.assertEquals(visibleClassesDescriptions.
			map[it.qualifiedName].join(", "))
	}

//	def private assertExternalTypesInIndex(EObject o, EClass type, String expected) {
//		val visibleExternalDescriptions = o.getVisibleExternalEObjectDescriptionsByType(type)
//		expected.assertEquals(visibleExternalDescriptions.values.
//			map[it.qualifiedName].join(", "))
//	}
}