/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.LogicalAffineConversion;
import com.epistimis.uddl.uddl.UddlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Affine Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalAffineConversionImpl#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalAffineConversionImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalAffineConversionImpl extends LogicalConversionImpl implements LogicalAffineConversion
{
  /**
   * The default value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConversionFactor()
   * @generated
   * @ordered
   */
  protected static final float CONVERSION_FACTOR_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConversionFactor()
   * @generated
   * @ordered
   */
  protected float conversionFactor = CONVERSION_FACTOR_EDEFAULT;

  /**
   * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected static final float OFFSET_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected float offset = OFFSET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalAffineConversionImpl()
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
    return UddlPackage.Literals.LOGICAL_AFFINE_CONVERSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getConversionFactor()
  {
    return conversionFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConversionFactor(float newConversionFactor)
  {
    float oldConversionFactor = conversionFactor;
    conversionFactor = newConversionFactor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_AFFINE_CONVERSION__CONVERSION_FACTOR, oldConversionFactor, conversionFactor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getOffset()
  {
    return offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOffset(float newOffset)
  {
    float oldOffset = offset;
    offset = newOffset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_AFFINE_CONVERSION__OFFSET, oldOffset, offset));
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
      case UddlPackage.LOGICAL_AFFINE_CONVERSION__CONVERSION_FACTOR:
        return getConversionFactor();
      case UddlPackage.LOGICAL_AFFINE_CONVERSION__OFFSET:
        return getOffset();
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
      case UddlPackage.LOGICAL_AFFINE_CONVERSION__CONVERSION_FACTOR:
        setConversionFactor((Float)newValue);
        return;
      case UddlPackage.LOGICAL_AFFINE_CONVERSION__OFFSET:
        setOffset((Float)newValue);
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
      case UddlPackage.LOGICAL_AFFINE_CONVERSION__CONVERSION_FACTOR:
        setConversionFactor(CONVERSION_FACTOR_EDEFAULT);
        return;
      case UddlPackage.LOGICAL_AFFINE_CONVERSION__OFFSET:
        setOffset(OFFSET_EDEFAULT);
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
      case UddlPackage.LOGICAL_AFFINE_CONVERSION__CONVERSION_FACTOR:
        return conversionFactor != CONVERSION_FACTOR_EDEFAULT;
      case UddlPackage.LOGICAL_AFFINE_CONVERSION__OFFSET:
        return offset != OFFSET_EDEFAULT;
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
    result.append(" (conversionFactor: ");
    result.append(conversionFactor);
    result.append(", offset: ");
    result.append(offset);
    result.append(')');
    return result.toString();
  }

} //LogicalAffineConversionImpl
