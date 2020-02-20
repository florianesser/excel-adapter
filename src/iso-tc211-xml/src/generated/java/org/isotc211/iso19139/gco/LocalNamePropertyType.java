/**
 */
package org.isotc211.iso19139.gco;

import net.opengis.gml32.CodeType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Name Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.LocalNamePropertyType#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.LocalNamePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getLocalNamePropertyType()
 * @model extendedMetaData="name='LocalName_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface LocalNamePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Name</em>' containment reference.
	 * @see #setLocalName(CodeType)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getLocalNamePropertyType_LocalName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocalName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getLocalName();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.LocalNamePropertyType#getLocalName <em>Local Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Name</em>' containment reference.
	 * @see #getLocalName()
	 * @generated
	 */
	void setLocalName(CodeType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getLocalNamePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.LocalNamePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // LocalNamePropertyType
