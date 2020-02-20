/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.CharacterStringPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Restrictions on the access and use of a dataset or metadata
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDConstraintsType#getUseLimitation <em>Use Limitation</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDConstraintsType()
 * @model extendedMetaData="name='MD_Constraints_Type' kind='elementOnly'"
 * @generated
 */
public interface MDConstraintsType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Use Limitation</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Limitation</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDConstraintsType_UseLimitation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useLimitation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getUseLimitation();

} // MDConstraintsType
