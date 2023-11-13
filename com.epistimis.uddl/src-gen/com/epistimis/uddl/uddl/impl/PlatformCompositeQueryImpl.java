/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.PlatformCompositeQuery;
import com.epistimis.uddl.uddl.PlatformQueryComposition;
import com.epistimis.uddl.uddl.UddlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Composite Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformCompositeQueryImpl#isIsUnion <em>Is Union</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformCompositeQueryImpl#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformCompositeQueryImpl extends PlatformViewImpl implements PlatformCompositeQuery
{
  /**
   * The default value of the '{@link #isIsUnion() <em>Is Union</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsUnion()
   * @generated
   * @ordered
   */
  protected static final boolean IS_UNION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsUnion() <em>Is Union</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsUnion()
   * @generated
   * @ordered
   */
  protected boolean isUnion = IS_UNION_EDEFAULT;

  /**
   * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposition()
   * @generated
   * @ordered
   */
  protected EList<PlatformQueryComposition> composition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlatformCompositeQueryImpl()
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
    return UddlPackage.Literals.PLATFORM_COMPOSITE_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsUnion()
  {
    return isUnion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsUnion(boolean newIsUnion)
  {
    boolean oldIsUnion = isUnion;
    isUnion = newIsUnion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.PLATFORM_COMPOSITE_QUERY__IS_UNION, oldIsUnion, isUnion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PlatformQueryComposition> getComposition()
  {
    if (composition == null)
    {
      composition = new EObjectContainmentEList<PlatformQueryComposition>(PlatformQueryComposition.class, this, UddlPackage.PLATFORM_COMPOSITE_QUERY__COMPOSITION);
    }
    return composition;
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
      case UddlPackage.PLATFORM_COMPOSITE_QUERY__COMPOSITION:
        return ((InternalEList<?>)getComposition()).basicRemove(otherEnd, msgs);
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
      case UddlPackage.PLATFORM_COMPOSITE_QUERY__IS_UNION:
        return isIsUnion();
      case UddlPackage.PLATFORM_COMPOSITE_QUERY__COMPOSITION:
        return getComposition();
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
      case UddlPackage.PLATFORM_COMPOSITE_QUERY__IS_UNION:
        setIsUnion((Boolean)newValue);
        return;
      case UddlPackage.PLATFORM_COMPOSITE_QUERY__COMPOSITION:
        getComposition().clear();
        getComposition().addAll((Collection<? extends PlatformQueryComposition>)newValue);
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
      case UddlPackage.PLATFORM_COMPOSITE_QUERY__IS_UNION:
        setIsUnion(IS_UNION_EDEFAULT);
        return;
      case UddlPackage.PLATFORM_COMPOSITE_QUERY__COMPOSITION:
        getComposition().clear();
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
      case UddlPackage.PLATFORM_COMPOSITE_QUERY__IS_UNION:
        return isUnion != IS_UNION_EDEFAULT;
      case UddlPackage.PLATFORM_COMPOSITE_QUERY__COMPOSITION:
        return composition != null && !composition.isEmpty();
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
    result.append(" (isUnion: ");
    result.append(isUnion);
    result.append(')');
    return result.toString();
  }

} //PlatformCompositeQueryImpl