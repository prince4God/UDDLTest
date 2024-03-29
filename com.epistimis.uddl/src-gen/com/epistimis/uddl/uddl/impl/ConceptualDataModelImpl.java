/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.ConceptualDataModel;
import com.epistimis.uddl.uddl.ConceptualElement;
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
 * An implementation of the model object '<em><b>Conceptual Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.ConceptualDataModelImpl#getElement <em>Element</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.ConceptualDataModelImpl#getCdm <em>Cdm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptualDataModelImpl extends UddlElementImpl implements ConceptualDataModel
{
  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected EList<ConceptualElement> element;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConceptualDataModelImpl()
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
    return UddlPackage.Literals.CONCEPTUAL_DATA_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ConceptualElement> getElement()
  {
    if (element == null)
    {
      element = new EObjectContainmentEList<ConceptualElement>(ConceptualElement.class, this, UddlPackage.CONCEPTUAL_DATA_MODEL__ELEMENT);
    }
    return element;
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
      cdm = new EObjectContainmentEList<ConceptualDataModel>(ConceptualDataModel.class, this, UddlPackage.CONCEPTUAL_DATA_MODEL__CDM);
    }
    return cdm;
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
      case UddlPackage.CONCEPTUAL_DATA_MODEL__ELEMENT:
        return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
      case UddlPackage.CONCEPTUAL_DATA_MODEL__CDM:
        return ((InternalEList<?>)getCdm()).basicRemove(otherEnd, msgs);
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
      case UddlPackage.CONCEPTUAL_DATA_MODEL__ELEMENT:
        return getElement();
      case UddlPackage.CONCEPTUAL_DATA_MODEL__CDM:
        return getCdm();
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
      case UddlPackage.CONCEPTUAL_DATA_MODEL__ELEMENT:
        getElement().clear();
        getElement().addAll((Collection<? extends ConceptualElement>)newValue);
        return;
      case UddlPackage.CONCEPTUAL_DATA_MODEL__CDM:
        getCdm().clear();
        getCdm().addAll((Collection<? extends ConceptualDataModel>)newValue);
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
      case UddlPackage.CONCEPTUAL_DATA_MODEL__ELEMENT:
        getElement().clear();
        return;
      case UddlPackage.CONCEPTUAL_DATA_MODEL__CDM:
        getCdm().clear();
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
      case UddlPackage.CONCEPTUAL_DATA_MODEL__ELEMENT:
        return element != null && !element.isEmpty();
      case UddlPackage.CONCEPTUAL_DATA_MODEL__CDM:
        return cdm != null && !cdm.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConceptualDataModelImpl
