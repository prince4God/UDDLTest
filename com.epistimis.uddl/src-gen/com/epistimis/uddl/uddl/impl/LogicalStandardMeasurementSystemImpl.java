/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.LogicalStandardMeasurementSystem;
import com.epistimis.uddl.uddl.UddlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Standard Measurement System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalStandardMeasurementSystemImpl#getReferenceStandard <em>Reference Standard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalStandardMeasurementSystemImpl extends LogicalAbstractMeasurementSystemImpl implements LogicalStandardMeasurementSystem
{
  /**
   * The default value of the '{@link #getReferenceStandard() <em>Reference Standard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceStandard()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_STANDARD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferenceStandard() <em>Reference Standard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceStandard()
   * @generated
   * @ordered
   */
  protected String referenceStandard = REFERENCE_STANDARD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalStandardMeasurementSystemImpl()
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
    return UddlPackage.Literals.LOGICAL_STANDARD_MEASUREMENT_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReferenceStandard()
  {
    return referenceStandard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReferenceStandard(String newReferenceStandard)
  {
    String oldReferenceStandard = referenceStandard;
    referenceStandard = newReferenceStandard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_STANDARD_MEASUREMENT_SYSTEM__REFERENCE_STANDARD, oldReferenceStandard, referenceStandard));
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
      case UddlPackage.LOGICAL_STANDARD_MEASUREMENT_SYSTEM__REFERENCE_STANDARD:
        return getReferenceStandard();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UddlPackage.LOGICAL_STANDARD_MEASUREMENT_SYSTEM__REFERENCE_STANDARD:
        setReferenceStandard((String)newValue);
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
      case UddlPackage.LOGICAL_STANDARD_MEASUREMENT_SYSTEM__REFERENCE_STANDARD:
        setReferenceStandard(REFERENCE_STANDARD_EDEFAULT);
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
      case UddlPackage.LOGICAL_STANDARD_MEASUREMENT_SYSTEM__REFERENCE_STANDARD:
        return REFERENCE_STANDARD_EDEFAULT == null ? referenceStandard != null : !REFERENCE_STANDARD_EDEFAULT.equals(referenceStandard);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (referenceStandard: ");
    result.append(referenceStandard);
    result.append(')');
    return result.toString();
  }

} //LogicalStandardMeasurementSystemImpl