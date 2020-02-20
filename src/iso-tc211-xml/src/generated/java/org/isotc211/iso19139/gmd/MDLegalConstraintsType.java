/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.CharacterStringPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Legal Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Restrictions and legal prerequisites for accessing and using the dataset.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDLegalConstraintsType#getAccessConstraints <em>Access Constraints</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDLegalConstraintsType#getUseConstraints <em>Use Constraints</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDLegalConstraintsType#getOtherConstraints <em>Other Constraints</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDLegalConstraintsType()
 * @model extendedMetaData="name='MD_LegalConstraints_Type' kind='elementOnly'"
 * @generated
 */
public interface MDLegalConstraintsType extends MDConstraintsType {
	/**
	 * Returns the value of the '<em><b>Access Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.MDRestrictionCodePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Constraints</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDLegalConstraintsType_AccessConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accessConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDRestrictionCodePropertyType> getAccessConstraints();

	/**
	 * Returns the value of the '<em><b>Use Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.MDRestrictionCodePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Constraints</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDLegalConstraintsType_UseConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDRestrictionCodePropertyType> getUseConstraints();

	/**
	 * Returns the value of the '<em><b>Other Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Constraints</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDLegalConstraintsType_OtherConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getOtherConstraints();

} // MDLegalConstraintsType
