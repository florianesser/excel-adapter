/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.AbstractObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDReferenceSystemType#getReferenceSystemIdentifier <em>Reference System Identifier</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDReferenceSystemType()
 * @model extendedMetaData="name='MD_ReferenceSystem_Type' kind='elementOnly'"
 * @generated
 */
public interface MDReferenceSystemType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Reference System Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference System Identifier</em>' containment reference.
	 * @see #setReferenceSystemIdentifier(RSIdentifierPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDReferenceSystemType_ReferenceSystemIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSystemIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	RSIdentifierPropertyType getReferenceSystemIdentifier();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDReferenceSystemType#getReferenceSystemIdentifier <em>Reference System Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference System Identifier</em>' containment reference.
	 * @see #getReferenceSystemIdentifier()
	 * @generated
	 */
	void setReferenceSystemIdentifier(RSIdentifierPropertyType value);

} // MDReferenceSystemType
