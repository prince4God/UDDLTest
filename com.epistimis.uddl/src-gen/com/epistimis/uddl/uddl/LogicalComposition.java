/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalComposition#getType <em>Type</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalComposition#getRealizes <em>Realizes</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalComposition()
 * @model
 * @generated
 */
public interface LogicalComposition extends LogicalCharacteristic
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(LogicalComposableElement)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalComposition_Type()
   * @model
   * @generated
   */
  LogicalComposableElement getType();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalComposition#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(LogicalComposableElement value);

  /**
   * Returns the value of the '<em><b>Realizes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realizes</em>' reference.
   * @see #setRealizes(ConceptualComposition)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalComposition_Realizes()
   * @model
   * @generated
   */
  ConceptualComposition getRealizes();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalComposition#getRealizes <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realizes</em>' reference.
   * @see #getRealizes()
   * @generated
   */
  void setRealizes(ConceptualComposition value);

} // LogicalComposition
