/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.CharacterStringPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDIdentifierType#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDIdentifierType#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDIdentifierType()
 * @model extendedMetaData="name='MD_Identifier_Type' kind='elementOnly'"
 * @generated
 */
public interface MDIdentifierType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority</em>' containment reference.
	 * @see #setAuthority(CICitationPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDIdentifierType_Authority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authority' namespace='##targetNamespace'"
	 * @generated
	 */
	CICitationPropertyType getAuthority();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDIdentifierType#getAuthority <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' containment reference.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(CICitationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CharacterStringPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDIdentifierType_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDIdentifierType#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CharacterStringPropertyType value);

} // MDIdentifierType
