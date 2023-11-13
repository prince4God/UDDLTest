package com.epistimis.uddl.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(UddlInjectorProvider.class)
@SuppressWarnings("all")
public class UddlScopeProviderTest {
  /**
   * Read in the UDDL SDM into a resource. Then add to that simple models that
   */
  public static Object initializeSDM() {
    return null;
  }
}
