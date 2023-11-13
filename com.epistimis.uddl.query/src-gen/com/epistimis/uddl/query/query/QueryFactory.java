/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.epistimis.uddl.query.query.QueryPackage
 * @generated
 */
public interface QueryFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QueryFactory eINSTANCE = com.epistimis.uddl.query.query.impl.QueryFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Specification</em>'.
   * @generated
   */
  QuerySpecification createQuerySpecification();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  QueryStatement createQueryStatement();

  /**
   * Returns a new object of class '<em>Projected Characteristic List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Projected Characteristic List</em>'.
   * @generated
   */
  ProjectedCharacteristicList createProjectedCharacteristicList();

  /**
   * Returns a new object of class '<em>Projected Characteristic Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Projected Characteristic Expression</em>'.
   * @generated
   */
  ProjectedCharacteristicExpression createProjectedCharacteristicExpression();

  /**
   * Returns a new object of class '<em>Selected Entity Characteristic Wildcard Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selected Entity Characteristic Wildcard Reference</em>'.
   * @generated
   */
  SelectedEntityCharacteristicWildcardReference createSelectedEntityCharacteristicWildcardReference();

  /**
   * Returns a new object of class '<em>Explicit Selected Entity Characteristic Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Explicit Selected Entity Characteristic Reference</em>'.
   * @generated
   */
  ExplicitSelectedEntityCharacteristicReference createExplicitSelectedEntityCharacteristicReference();

  /**
   * Returns a new object of class '<em>Selected Entity Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selected Entity Expression</em>'.
   * @generated
   */
  SelectedEntityExpression createSelectedEntityExpression();

  /**
   * Returns a new object of class '<em>From Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From Clause</em>'.
   * @generated
   */
  FromClause createFromClause();

  /**
   * Returns a new object of class '<em>Entity Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Expression</em>'.
   * @generated
   */
  EntityExpression createEntityExpression();

  /**
   * Returns a new object of class '<em>Selected Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selected Entity</em>'.
   * @generated
   */
  SelectedEntity createSelectedEntity();

  /**
   * Returns a new object of class '<em>Entity Join Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Join Expression</em>'.
   * @generated
   */
  EntityJoinExpression createEntityJoinExpression();

  /**
   * Returns a new object of class '<em>Join Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Entity</em>'.
   * @generated
   */
  JoinEntity createJoinEntity();

  /**
   * Returns a new object of class '<em>Entity Join Criteria</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Join Criteria</em>'.
   * @generated
   */
  EntityJoinCriteria createEntityJoinCriteria();

  /**
   * Returns a new object of class '<em>Entity Type Characteristic Equivalence Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Type Characteristic Equivalence Expression</em>'.
   * @generated
   */
  EntityTypeCharacteristicEquivalenceExpression createEntityTypeCharacteristicEquivalenceExpression();

  /**
   * Returns a new object of class '<em>Selected Entity Characteristic Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selected Entity Characteristic Reference</em>'.
   * @generated
   */
  SelectedEntityCharacteristicReference createSelectedEntityCharacteristicReference();

  /**
   * Returns a new object of class '<em>Selected Entity Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selected Entity Reference</em>'.
   * @generated
   */
  SelectedEntityReference createSelectedEntityReference();

  /**
   * Returns a new object of class '<em>Where Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where Clause</em>'.
   * @generated
   */
  WhereClause createWhereClause();

  /**
   * Returns a new object of class '<em>Criteria</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Criteria</em>'.
   * @generated
   */
  Criteria createCriteria();

  /**
   * Returns a new object of class '<em>Order By Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Order By Clause</em>'.
   * @generated
   */
  OrderByClause createOrderByClause();

  /**
   * Returns a new object of class '<em>Ordering Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordering Expression</em>'.
   * @generated
   */
  OrderingExpression createOrderingExpression();

  /**
   * Returns a new object of class '<em>Projected Characteristic Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Projected Characteristic Reference</em>'.
   * @generated
   */
  ProjectedCharacteristicReference createProjectedCharacteristicReference();

  /**
   * Returns a new object of class '<em>Qualified Projected Characteristic Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Projected Characteristic Reference</em>'.
   * @generated
   */
  QualifiedProjectedCharacteristicReference createQualifiedProjectedCharacteristicReference();

  /**
   * Returns a new object of class '<em>Unqualified Projected Characteristic Reference Or Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unqualified Projected Characteristic Reference Or Alias</em>'.
   * @generated
   */
  UnqualifiedProjectedCharacteristicReferenceOrAlias createUnqualifiedProjectedCharacteristicReferenceOrAlias();

  /**
   * Returns a new object of class '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Expression</em>'.
   * @generated
   */
  BooleanExpression createBooleanExpression();

  /**
   * Returns a new object of class '<em>Boolean Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Term</em>'.
   * @generated
   */
  BooleanTerm createBooleanTerm();

  /**
   * Returns a new object of class '<em>Boolean Factor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Factor</em>'.
   * @generated
   */
  BooleanFactor createBooleanFactor();

  /**
   * Returns a new object of class '<em>Boolean Predicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Predicate</em>'.
   * @generated
   */
  BooleanPredicate createBooleanPredicate();

  /**
   * Returns a new object of class '<em>Scalar Compare Predicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scalar Compare Predicate</em>'.
   * @generated
   */
  ScalarComparePredicate createScalarComparePredicate();

  /**
   * Returns a new object of class '<em>Set Membership Predicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Membership Predicate</em>'.
   * @generated
   */
  SetMembershipPredicate createSetMembershipPredicate();

  /**
   * Returns a new object of class '<em>Logical Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Set</em>'.
   * @generated
   */
  LogicalSet createLogicalSet();

  /**
   * Returns a new object of class '<em>Characteristic Basis Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Characteristic Basis Set</em>'.
   * @generated
   */
  CharacteristicBasisSet createCharacteristicBasisSet();

  /**
   * Returns a new object of class '<em>Set Compare Predicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Compare Predicate</em>'.
   * @generated
   */
  SetComparePredicate createSetComparePredicate();

  /**
   * Returns a new object of class '<em>Compare Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compare Set</em>'.
   * @generated
   */
  CompareSet createCompareSet();

  /**
   * Returns a new object of class '<em>Exists Predicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exists Predicate</em>'.
   * @generated
   */
  ExistsPredicate createExistsPredicate();

  /**
   * Returns a new object of class '<em>Predicate Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Term</em>'.
   * @generated
   */
  PredicateTerm createPredicateTerm();

  /**
   * Returns a new object of class '<em>Characteristic Basis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Characteristic Basis</em>'.
   * @generated
   */
  CharacteristicBasis createCharacteristicBasis();

  /**
   * Returns a new object of class '<em>Subquery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subquery</em>'.
   * @generated
   */
  Subquery createSubquery();

  /**
   * Returns a new object of class '<em>Characteristic Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Characteristic Reference</em>'.
   * @generated
   */
  CharacteristicReference createCharacteristicReference();

  /**
   * Returns a new object of class '<em>Entity Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Type Reference</em>'.
   * @generated
   */
  EntityTypeReference createEntityTypeReference();

  /**
   * Returns a new object of class '<em>Enum Literal Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Literal Set</em>'.
   * @generated
   */
  EnumLiteralSet createEnumLiteralSet();

  /**
   * Returns a new object of class '<em>Enum Literal Reference Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Literal Reference Expression</em>'.
   * @generated
   */
  EnumLiteralReferenceExpression createEnumLiteralReferenceExpression();

  /**
   * Returns a new object of class '<em>Enumeration Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration Type Reference</em>'.
   * @generated
   */
  EnumerationTypeReference createEnumerationTypeReference();

  /**
   * Returns a new object of class '<em>Enumeration Literal Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration Literal Reference</em>'.
   * @generated
   */
  EnumerationLiteralReference createEnumerationLiteralReference();

  /**
   * Returns a new object of class '<em>Selected Entity Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selected Entity Alias</em>'.
   * @generated
   */
  SelectedEntityAlias createSelectedEntityAlias();

  /**
   * Returns a new object of class '<em>Projected Characteristic Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Projected Characteristic Alias</em>'.
   * @generated
   */
  ProjectedCharacteristicAlias createProjectedCharacteristicAlias();

  /**
   * Returns a new object of class '<em>Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identifier</em>'.
   * @generated
   */
  QueryIdentifier createQueryIdentifier();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  QueryPackage getQueryPackage();

} //QueryFactory