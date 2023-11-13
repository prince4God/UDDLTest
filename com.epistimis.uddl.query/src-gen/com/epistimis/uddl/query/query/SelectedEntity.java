/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selected Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.SelectedEntity#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.SelectedEntity#getSelectedEntityAlias <em>Selected Entity Alias</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getSelectedEntity()
 * @model
 * @generated
 */
public interface SelectedEntity extends JoinEntity
{
  /**
   * Returns the value of the '<em><b>Entity Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Type</em>' containment reference.
   * @see #setEntityType(EntityTypeReference)
   * @see com.epistimis.uddl.query.query.QueryPackage#getSelectedEntity_EntityType()
   * @model containment="true"
   * @generated
   */
  EntityTypeReference getEntityType();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.SelectedEntity#getEntityType <em>Entity Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Type</em>' containment reference.
   * @see #getEntityType()
   * @generated
   */
  void setEntityType(EntityTypeReference value);

  /**
   * Returns the value of the '<em><b>Selected Entity Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selected Entity Alias</em>' containment reference.
   * @see #setSelectedEntityAlias(SelectedEntityAlias)
   * @see com.epistimis.uddl.query.query.QueryPackage#getSelectedEntity_SelectedEntityAlias()
   * @model containment="true"
   * @generated
   */
  SelectedEntityAlias getSelectedEntityAlias();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.SelectedEntity#getSelectedEntityAlias <em>Selected Entity Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selected Entity Alias</em>' containment reference.
   * @see #getSelectedEntityAlias()
   * @generated
   */
  void setSelectedEntityAlias(SelectedEntityAlias value);

} // SelectedEntity