/*
 * generated by Xtext 2.32.0
 */
/*
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.ui.tests;

import com.epistimis.uddl.ui.internal.UddlActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class UddlUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return UddlActivator.getInstance().getInjector("com.epistimis.uddl.Uddl");
	}

}
