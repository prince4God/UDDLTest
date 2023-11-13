/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Coordinate System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalCoordinateSystem#getAxisRelationshipDescription <em>Axis Relationship Description</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalCoordinateSystem#getAngleEquation <em>Angle Equation</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalCoordinateSystem#getDistanceEquation <em>Distance Equation</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalCoordinateSystem#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalCoordinateSystem()
 * @model
 * @generated
 */
public interface LogicalCoordinateSystem extends LogicalElement
{
  /**
   * Returns the value of the '<em><b>Axis Relationship Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axis Relationship Description</em>' attribute.
   * @see #setAxisRelationshipDescription(String)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalCoordinateSystem_AxisRelationshipDescription()
   * @model
   * @generated
   */
  String getAxisRelationshipDescription();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalCoordinateSystem#getAxisRelationshipDescription <em>Axis Relationship Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Axis Relationship Description</em>' attribute.
   * @see #getAxisRelationshipDescription()
   * @generated
   */
  void setAxisRelationshipDescription(String value);

  /**
   * Returns the value of the '<em><b>Angle Equation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Angle Equation</em>' attribute.
   * @see #setAngleEquation(String)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalCoordinateSystem_AngleEquation()
   * @model
   * @generated
   */
  String getAngleEquation();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalCoordinateSystem#getAngleEquation <em>Angle Equation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Angle Equation</em>' attribute.
   * @see #getAngleEquation()
   * @generated
   */
  void setAngleEquation(String value);

  /**
   * Returns the value of the '<em><b>Distance Equation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distance Equation</em>' attribute.
   * @see #setDistanceEquation(String)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalCoordinateSystem_DistanceEquation()
   * @model
   * @generated
   */
  String getDistanceEquation();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalCoordinateSystem#getDistanceEquation <em>Distance Equation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distance Equation</em>' attribute.
   * @see #getDistanceEquation()
   * @generated
   */
  void setDistanceEquation(String value);

  /**
   * Returns the value of the '<em><b>Axis</b></em>' reference list.
   * The list contents are of type {@link com.epistimis.uddl.uddl.LogicalCoordinateSystemAxis}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axis</em>' reference list.
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalCoordinateSystem_Axis()
   * @model
   * @generated
   */
  EList<LogicalCoordinateSystemAxis> getAxis();

} // LogicalCoordinateSystem
