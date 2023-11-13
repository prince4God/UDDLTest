/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.LogicalCoordinateSystemAxis;
import com.epistimis.uddl.uddl.LogicalMeasurementConstraint;
import com.epistimis.uddl.uddl.LogicalMeasurementSystemAxis;
import com.epistimis.uddl.uddl.LogicalValueTypeUnit;
import com.epistimis.uddl.uddl.UddlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Measurement System Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementSystemAxisImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementSystemAxisImpl#getDefaultValueTypeUnit <em>Default Value Type Unit</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementSystemAxisImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalMeasurementSystemAxisImpl extends LogicalElementImpl implements LogicalMeasurementSystemAxis
{
  /**
   * The cached value of the '{@link #getAxis() <em>Axis</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxis()
   * @generated
   * @ordered
   */
  protected LogicalCoordinateSystemAxis axis;

  /**
   * The cached value of the '{@link #getDefaultValueTypeUnit() <em>Default Value Type Unit</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValueTypeUnit()
   * @generated
   * @ordered
   */
  protected EList<LogicalValueTypeUnit> defaultValueTypeUnit;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected EList<LogicalMeasurementConstraint> constraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalMeasurementSystemAxisImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UddlPackage.Literals.LOGICAL_MEASUREMENT_SYSTEM_AXIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalCoordinateSystemAxis getAxis()
  {
    if (axis != null && axis.eIsProxy())
    {
      InternalEObject oldAxis = (InternalEObject)axis;
      axis = (LogicalCoordinateSystemAxis)eResolveProxy(oldAxis);
      if (axis != oldAxis)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__AXIS, oldAxis, axis));
      }
    }
    return axis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalCoordinateSystemAxis basicGetAxis()
  {
    return axis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAxis(LogicalCoordinateSystemAxis newAxis)
  {
    LogicalCoordinateSystemAxis oldAxis = axis;
    axis = newAxis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__AXIS, oldAxis, axis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LogicalValueTypeUnit> getDefaultValueTypeUnit()
  {
    if (defaultValueTypeUnit == null)
    {
      defaultValueTypeUnit = new EObjectResolvingEList<LogicalValueTypeUnit>(LogicalValueTypeUnit.class, this, UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT);
    }
    return defaultValueTypeUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LogicalMeasurementConstraint> getConstraint()
  {
    if (constraint == null)
    {
      constraint = new EObjectContainmentEList<LogicalMeasurementConstraint>(LogicalMeasurementConstraint.class, this, UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__CONSTRAINT);
    }
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__CONSTRAINT:
        return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__AXIS:
        if (resolve) return getAxis();
        return basicGetAxis();
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT:
        return getDefaultValueTypeUnit();
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__CONSTRAINT:
        return getConstraint();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__AXIS:
        setAxis((LogicalCoordinateSystemAxis)newValue);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT:
        getDefaultValueTypeUnit().clear();
        getDefaultValueTypeUnit().addAll((Collection<? extends LogicalValueTypeUnit>)newValue);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__CONSTRAINT:
        getConstraint().clear();
        getConstraint().addAll((Collection<? extends LogicalMeasurementConstraint>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__AXIS:
        setAxis((LogicalCoordinateSystemAxis)null);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT:
        getDefaultValueTypeUnit().clear();
        return;
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__CONSTRAINT:
        getConstraint().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__AXIS:
        return axis != null;
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__DEFAULT_VALUE_TYPE_UNIT:
        return defaultValueTypeUnit != null && !defaultValueTypeUnit.isEmpty();
      case UddlPackage.LOGICAL_MEASUREMENT_SYSTEM_AXIS__CONSTRAINT:
        return constraint != null && !constraint.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LogicalMeasurementSystemAxisImpl
