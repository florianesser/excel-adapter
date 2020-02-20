/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.CharacterStringPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT Free Text Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.PTFreeTextPropertyType#getPTFreeText <em>PT Free Text</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getPTFreeTextPropertyType()
 * @model extendedMetaData="name='PT_FreeText_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface PTFreeTextPropertyType extends CharacterStringPropertyType {
	/**
	 * Returns the value of the '<em><b>PT Free Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PT Free Text</em>' containment reference.
	 * @see #setPTFreeText(PTFreeTextType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getPTFreeTextPropertyType_PTFreeText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PT_FreeText' namespace='##targetNamespace'"
	 * @generated
	 */
	PTFreeTextType getPTFreeText();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.PTFreeTextPropertyType#getPTFreeText <em>PT Free Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PT Free Text</em>' containment reference.
	 * @see #getPTFreeText()
	 * @generated
	 */
	void setPTFreeText(PTFreeTextType value);

} // PTFreeTextPropertyType
