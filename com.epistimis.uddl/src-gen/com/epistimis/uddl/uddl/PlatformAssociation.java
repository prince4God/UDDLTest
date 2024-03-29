/**
 * generated by Xtext 2.32.0
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformAssociation#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformAssociation()
 * @model
 * @generated
 */
public interface PlatformAssociation extends PlatformEntity
{
  /**
   * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.uddl.PlatformParticipant}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Participant</em>' containment reference list.
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformAssociation_Participant()
   * @model containment="true"
   * @generated
   */
  EList<PlatformParticipant> getParticipant();

} // PlatformAssociation
