/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalParticipant#getType <em>Type</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalParticipant#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalParticipant#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalParticipant#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalParticipant#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalParticipant()
 * @model
 * @generated
 */
public interface LogicalParticipant extends LogicalCharacteristic
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(LogicalEntity)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalParticipant_Type()
   * @model
   * @generated
   */
  LogicalEntity getType();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalParticipant#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(LogicalEntity value);

  /**
   * Returns the value of the '<em><b>Realizes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realizes</em>' reference.
   * @see #setRealizes(ConceptualParticipant)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalParticipant_Realizes()
   * @model
   * @generated
   */
  ConceptualParticipant getRealizes();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalParticipant#getRealizes <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realizes</em>' reference.
   * @see #getRealizes()
   * @generated
   */
  void setRealizes(ConceptualParticipant value);

  /**
   * Returns the value of the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Lower Bound</em>' attribute.
   * @see #setSourceLowerBound(int)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalParticipant_SourceLowerBound()
   * @model
   * @generated
   */
  int getSourceLowerBound();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalParticipant#getSourceLowerBound <em>Source Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Lower Bound</em>' attribute.
   * @see #getSourceLowerBound()
   * @generated
   */
  void setSourceLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Upper Bound</em>' attribute.
   * @see #setSourceUpperBound(int)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalParticipant_SourceUpperBound()
   * @model
   * @generated
   */
  int getSourceUpperBound();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalParticipant#getSourceUpperBound <em>Source Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Upper Bound</em>' attribute.
   * @see #getSourceUpperBound()
   * @generated
   */
  void setSourceUpperBound(int value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(LogicalPathNode)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalParticipant_Path()
   * @model containment="true"
   * @generated
   */
  LogicalPathNode getPath();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalParticipant#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(LogicalPathNode value);

} // LogicalParticipant
