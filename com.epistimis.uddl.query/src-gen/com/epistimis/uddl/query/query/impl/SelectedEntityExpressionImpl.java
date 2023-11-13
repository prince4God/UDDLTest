/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query.impl;

import com.epistimis.uddl.query.query.FromClause;
import com.epistimis.uddl.query.query.OrderByClause;
import com.epistimis.uddl.query.query.QueryPackage;
import com.epistimis.uddl.query.query.SelectedEntityExpression;
import com.epistimis.uddl.query.query.WhereClause;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selected Entity Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.impl.SelectedEntityExpressionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.impl.SelectedEntityExpressionImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.impl.SelectedEntityExpressionImpl#getOrderBy <em>Order By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectedEntityExpressionImpl extends MinimalEObjectImpl.Container implements SelectedEntityExpression
{
  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected FromClause from;

  /**
   * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected WhereClause where;

  /**
   * The cached value of the '{@link #getOrderBy() <em>Order By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderBy()
   * @generated
   * @ordered
   */
  protected OrderByClause orderBy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectedEntityExpressionImpl()
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
    return QueryPackage.Literals.SELECTED_ENTITY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FromClause getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFrom(FromClause newFrom, NotificationChain msgs)
  {
    FromClause oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SELECTED_ENTITY_EXPRESSION__FROM, oldFrom, newFrom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFrom(FromClause newFrom)
  {
    if (newFrom != from)
    {
      NotificationChain msgs = null;
      if (from != null)
        msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECTED_ENTITY_EXPRESSION__FROM, null, msgs);
      if (newFrom != null)
        msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECTED_ENTITY_EXPRESSION__FROM, null, msgs);
      msgs = basicSetFrom(newFrom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELECTED_ENTITY_EXPRESSION__FROM, newFrom, newFrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WhereClause getWhere()
  {
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhere(WhereClause newWhere, NotificationChain msgs)
  {
    WhereClause oldWhere = where;
    where = newWhere;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SELECTED_ENTITY_EXPRESSION__WHERE, oldWhere, newWhere);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWhere(WhereClause newWhere)
  {
    if (newWhere != where)
    {
      NotificationChain msgs = null;
      if (where != null)
        msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECTED_ENTITY_EXPRESSION__WHERE, null, msgs);
      if (newWhere != null)
        msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECTED_ENTITY_EXPRESSION__WHERE, null, msgs);
      msgs = basicSetWhere(newWhere, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELECTED_ENTITY_EXPRESSION__WHERE, newWhere, newWhere));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrderByClause getOrderBy()
  {
    return orderBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrderBy(OrderByClause newOrderBy, NotificationChain msgs)
  {
    OrderByClause oldOrderBy = orderBy;
    orderBy = newOrderBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SELECTED_ENTITY_EXPRESSION__ORDER_BY, oldOrderBy, newOrderBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOrderBy(OrderByClause newOrderBy)
  {
    if (newOrderBy != orderBy)
    {
      NotificationChain msgs = null;
      if (orderBy != null)
        msgs = ((InternalEObject)orderBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECTED_ENTITY_EXPRESSION__ORDER_BY, null, msgs);
      if (newOrderBy != null)
        msgs = ((InternalEObject)newOrderBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECTED_ENTITY_EXPRESSION__ORDER_BY, null, msgs);
      msgs = basicSetOrderBy(newOrderBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELECTED_ENTITY_EXPRESSION__ORDER_BY, newOrderBy, newOrderBy));
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
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__FROM:
        return basicSetFrom(null, msgs);
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__WHERE:
        return basicSetWhere(null, msgs);
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__ORDER_BY:
        return basicSetOrderBy(null, msgs);
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
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__FROM:
        return getFrom();
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__WHERE:
        return getWhere();
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__ORDER_BY:
        return getOrderBy();
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
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__FROM:
        setFrom((FromClause)newValue);
        return;
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__WHERE:
        setWhere((WhereClause)newValue);
        return;
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__ORDER_BY:
        setOrderBy((OrderByClause)newValue);
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
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__FROM:
        setFrom((FromClause)null);
        return;
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__WHERE:
        setWhere((WhereClause)null);
        return;
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__ORDER_BY:
        setOrderBy((OrderByClause)null);
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
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__FROM:
        return from != null;
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__WHERE:
        return where != null;
      case QueryPackage.SELECTED_ENTITY_EXPRESSION__ORDER_BY:
        return orderBy != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectedEntityExpressionImpl
