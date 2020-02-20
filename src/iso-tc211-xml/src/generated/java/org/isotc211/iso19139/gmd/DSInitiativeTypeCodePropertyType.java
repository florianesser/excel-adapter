/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

import org.isotc211.iso19139.gco.CodeListValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS Initiative Type Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.DSInitiativeTypeCodePropertyType#getDSInitiativeTypeCode <em>DS Initiative Type Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DSInitiativeTypeCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getDSInitiativeTypeCodePropertyType()
 * @model extendedMetaData="name='DS_InitiativeTypeCode_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface DSInitiativeTypeCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>DS Initiative Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Initiative Type Code</em>' containment reference.
	 * @see #setDSInitiativeTypeCode(CodeListValueType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDSInitiativeTypeCodePropertyType_DSInitiativeTypeCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DS_InitiativeTypeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeListValueType getDSInitiativeTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DSInitiativeTypeCodePropertyType#getDSInitiativeTypeCode <em>DS Initiative Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Initiative Type Code</em>' containment reference.
	 * @see #getDSInitiativeTypeCode()
	 * @generated
	 */
	void setDSInitiativeTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDSInitiativeTypeCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DSInitiativeTypeCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // DSInitiativeTypeCodePropertyType
