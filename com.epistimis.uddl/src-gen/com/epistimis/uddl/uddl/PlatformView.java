/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformView#getRealizes <em>Realizes</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformView()
 * @model
 * @generated
 */
public interface PlatformView extends PlatformElement
{
  /**
   * Returns the value of the '<em><b>Realizes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realizes</em>' reference.
   * @see #setRealizes(LogicalQuery)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformView_Realizes()
   * @model
   * @generated
   */
  LogicalQuery getRealizes();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformView#getRealizes <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realizes</em>' reference.
   * @see #getRealizes()
   * @generated
   */
  void setRealizes(LogicalQuery value);

} // PlatformView
