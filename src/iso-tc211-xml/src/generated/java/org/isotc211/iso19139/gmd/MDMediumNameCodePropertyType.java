/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

import org.isotc211.iso19139.gco.CodeListValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Medium Name Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDMediumNameCodePropertyType#getMDMediumNameCode <em>MD Medium Name Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDMediumNameCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDMediumNameCodePropertyType()
 * @model extendedMetaData="name='MD_MediumNameCode_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface MDMediumNameCodePropertyType extends EObject
{
	/**
	 * Returns the value of the '<em><b>MD Medium Name Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MD Medium Name Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Medium Name Code</em>' containment reference.
	 * @see #setMDMediumNameCode(CodeListValueType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDMediumNameCodePropertyType_MDMediumNameCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MD_MediumNameCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeListValueType getMDMediumNameCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDMediumNameCodePropertyType#getMDMediumNameCode <em>MD Medium Name Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Medium Name Code</em>' containment reference.
	 * @see #getMDMediumNameCode()
	 * @generated
	 */
	void setMDMediumNameCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nil Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDMediumNameCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDMediumNameCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDMediumNameCodePropertyType
