/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.BooleanExpression#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends Criteria, BooleanPredicate
{
  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.query.query.BooleanTerm}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference list.
   * @see com.epistimis.uddl.query.query.QueryPackage#getBooleanExpression_Term()
   * @model containment="true"
   * @generated
   */
  EList<BooleanTerm> getTerm();

} // BooleanExpression