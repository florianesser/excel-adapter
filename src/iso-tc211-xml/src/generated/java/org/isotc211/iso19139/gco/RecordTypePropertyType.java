/**
 */
package org.isotc211.iso19139.gco;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.RecordTypePropertyType#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.RecordTypePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getRecordTypePropertyType()
 * @model extendedMetaData="name='RecordType_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface RecordTypePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Record Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Type</em>' containment reference.
	 * @see #setRecordType(RecordTypeType)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getRecordTypePropertyType_RecordType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RecordType' namespace='##targetNamespace'"
	 * @generated
	 */
	RecordTypeType getRecordType();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.RecordTypePropertyType#getRecordType <em>Record Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Type</em>' containment reference.
	 * @see #getRecordType()
	 * @generated
	 */
	void setRecordType(RecordTypeType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getRecordTypePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.RecordTypePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // RecordTypePropertyType
