/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.AbstractObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT Free Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.PTFreeTextType#getTextGroup <em>Text Group</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getPTFreeTextType()
 * @model extendedMetaData="name='PT_FreeText_Type' kind='elementOnly'"
 * @generated
 */
public interface PTFreeTextType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Text Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.LocalisedCharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Group</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getPTFreeTextType_TextGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='textGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalisedCharacterStringPropertyType> getTextGroup();

} // PTFreeTextType
