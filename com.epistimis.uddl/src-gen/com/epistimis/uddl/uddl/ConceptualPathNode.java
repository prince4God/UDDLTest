/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conceptual Path Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.ConceptualPathNode#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getConceptualPathNode()
 * @model
 * @generated
 */
public interface ConceptualPathNode extends EObject
{
  /**
   * Returns the value of the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' containment reference.
   * @see #setNode(ConceptualPathNode)
   * @see com.epistimis.uddl.uddl.UddlPackage#getConceptualPathNode_Node()
   * @model containment="true"
   * @generated
   */
  ConceptualPathNode getNode();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.ConceptualPathNode#getNode <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' containment reference.
   * @see #getNode()
   * @generated
   */
  void setNode(ConceptualPathNode value);

} // ConceptualPathNode