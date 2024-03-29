/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conceptual Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.ConceptualCharacteristic#getRolename <em>Rolename</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.ConceptualCharacteristic#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.ConceptualCharacteristic#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.ConceptualCharacteristic#getDescription <em>Description</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.ConceptualCharacteristic#getSpecializes <em>Specializes</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getConceptualCharacteristic()
 * @model
 * @generated
 */
public interface ConceptualCharacteristic extends EObject
{
  /**
   * Returns the value of the '<em><b>Rolename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rolename</em>' attribute.
   * @see #setRolename(String)
   * @see com.epistimis.uddl.uddl.UddlPackage#getConceptualCharacteristic_Rolename()
   * @model
   * @generated
   */
  String getRolename();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.ConceptualCharacteristic#getRolename <em>Rolename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rolename</em>' attribute.
   * @see #getRolename()
   * @generated
   */
  void setRolename(String value);

  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' attribute.
   * @see #setLowerBound(int)
   * @see com.epistimis.uddl.uddl.UddlPackage#getConceptualCharacteristic_LowerBound()
   * @model
   * @generated
   */
  int getLowerBound();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.ConceptualCharacteristic#getLowerBound <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' attribute.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' attribute.
   * @see #setUpperBound(int)
   * @see com.epistimis.uddl.uddl.UddlPackage#getConceptualCharacteristic_UpperBound()
   * @model
   * @generated
   */
  int getUpperBound();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.ConceptualCharacteristic#getUpperBound <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' attribute.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(int value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.epistimis.uddl.uddl.UddlPackage#getConceptualCharacteristic_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.ConceptualCharacteristic#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Specializes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specializes</em>' reference.
   * @see #setSpecializes(ConceptualCharacteristic)
   * @see com.epistimis.uddl.uddl.UddlPackage#getConceptualCharacteristic_Specializes()
   * @model
   * @generated
   */
  ConceptualCharacteristic getSpecializes();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.ConceptualCharacteristic#getSpecializes <em>Specializes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specializes</em>' reference.
   * @see #getSpecializes()
   * @generated
   */
  void setSpecializes(ConceptualCharacteristic value);

} // ConceptualCharacteristic
