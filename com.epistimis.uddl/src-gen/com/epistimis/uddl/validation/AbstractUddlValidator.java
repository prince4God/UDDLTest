/*
 * generated by Xtext 2.32.0
 */
/*
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.NamesAreUniqueValidator;

@ComposedChecks(validators = {NamesAreUniqueValidator.class})
public abstract class AbstractUddlValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.epistimis.uddl.uddl.UddlPackage.eINSTANCE);
		return result;
	}
}
