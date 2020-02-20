/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.ObjectReferencePropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localised Character String Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.LocalisedCharacterStringPropertyType#getLocalisedCharacterString <em>Localised Character String</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getLocalisedCharacterStringPropertyType()
 * @model extendedMetaData="name='LocalisedCharacterString_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface LocalisedCharacterStringPropertyType extends ObjectReferencePropertyType {
	/**
	 * Returns the value of the '<em><b>Localised Character String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localised Character String</em>' containment reference.
	 * @see #setLocalisedCharacterString(LocalisedCharacterStringType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getLocalisedCharacterStringPropertyType_LocalisedCharacterString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocalisedCharacterString' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalisedCharacterStringType getLocalisedCharacterString();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.LocalisedCharacterStringPropertyType#getLocalisedCharacterString <em>Localised Character String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localised Character String</em>' containment reference.
	 * @see #getLocalisedCharacterString()
	 * @generated
	 */
	void setLocalisedCharacterString(LocalisedCharacterStringType value);

} // LocalisedCharacterStringPropertyType
