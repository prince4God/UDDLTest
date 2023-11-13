/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalDataModel#getElement <em>Element</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalDataModel#getLdm <em>Ldm</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalDataModel()
 * @model
 * @generated
 */
public interface LogicalDataModel extends UddlElement
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.uddl.LogicalElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference list.
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalDataModel_Element()
   * @model containment="true"
   * @generated
   */
  EList<LogicalElement> getElement();

  /**
   * Returns the value of the '<em><b>Ldm</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.uddl.LogicalDataModel}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ldm</em>' containment reference list.
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalDataModel_Ldm()
   * @model containment="true"
   * @generated
   */
  EList<LogicalDataModel> getLdm();

} // LogicalDataModel
