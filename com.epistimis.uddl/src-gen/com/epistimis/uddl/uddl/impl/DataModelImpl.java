/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.ConceptualDataModel;
import com.epistimis.uddl.uddl.DataModel;
import com.epistimis.uddl.uddl.LogicalDataModel;
import com.epistimis.uddl.uddl.PlatformDataModel;
import com.epistimis.uddl.uddl.UddlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.DataModelImpl#getCdm <em>Cdm</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.DataModelImpl#getLdm <em>Ldm</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.DataModelImpl#getPdm <em>Pdm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataModelImpl extends UddlElementImpl implements DataModel
{
  /**
   * The cached value of the '{@link #getCdm() <em>Cdm</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCdm()
   * @generated
   * @ordered
   */
  protected EList<ConceptualDataModel> cdm;

  /**
   * The cached value of the '{@link #getLdm() <em>Ldm</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLdm()
   * @generated
   * @ordered
   */
  protected EList<LogicalDataModel> ldm;

  /**
   * The cached value of the '{@link #getPdm() <em>Pdm</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPdm()
   * @generated
   * @ordered
   */
  protected EList<PlatformDataModel> pdm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataModelImpl()
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
    return UddlPackage.Literals.DATA_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ConceptualDataModel> getCdm()
  {
    if (cdm == null)
    {
      cdm = new EObjectContainmentEList<ConceptualDataModel>(ConceptualDataModel.class, this, UddlPackage.DATA_MODEL__CDM);
    }
    return cdm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LogicalDataModel> getLdm()
  {
    if (ldm == null)
    {
      ldm = new EObjectContainmentEList<LogicalDataModel>(LogicalDataModel.class, this, UddlPackage.DATA_MODEL__LDM);
    }
    return ldm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PlatformDataModel> getPdm()
  {
    if (pdm == null)
    {
      pdm = new EObjectContainmentEList<PlatformDataModel>(PlatformDataModel.class, this, UddlPackage.DATA_MODEL__PDM);
    }
    return pdm;
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
      case UddlPackage.DATA_MODEL__CDM:
        return ((InternalEList<?>)getCdm()).basicRemove(otherEnd, msgs);
      case UddlPackage.DATA_MODEL__LDM:
        return ((InternalEList<?>)getLdm()).basicRemove(otherEnd, msgs);
      case UddlPackage.DATA_MODEL__PDM:
        return ((InternalEList<?>)getPdm()).basicRemove(otherEnd, msgs);
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
      case UddlPackage.DATA_MODEL__CDM:
        return getCdm();
      case UddlPackage.DATA_MODEL__LDM:
        return getLdm();
      case UddlPackage.DATA_MODEL__PDM:
        return getPdm();
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
      case UddlPackage.DATA_MODEL__CDM:
        getCdm().clear();
        getCdm().addAll((Collection<? extends ConceptualDataModel>)newValue);
        return;
      case UddlPackage.DATA_MODEL__LDM:
        getLdm().clear();
        getLdm().addAll((Collection<? extends LogicalDataModel>)newValue);
        return;
      case UddlPackage.DATA_MODEL__PDM:
        getPdm().clear();
        getPdm().addAll((Collection<? extends PlatformDataModel>)newValue);
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
      case UddlPackage.DATA_MODEL__CDM:
        getCdm().clear();
        return;
      case UddlPackage.DATA_MODEL__LDM:
        getLdm().clear();
        return;
      case UddlPackage.DATA_MODEL__PDM:
        getPdm().clear();
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
      case UddlPackage.DATA_MODEL__CDM:
        return cdm != null && !cdm.isEmpty();
      case UddlPackage.DATA_MODEL__LDM:
        return ldm != null && !ldm.isEmpty();
      case UddlPackage.DATA_MODEL__PDM:
        return pdm != null && !pdm.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DataModelImpl
