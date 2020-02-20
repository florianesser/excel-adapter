/**
 */
package org.isotc211.iso19139.gco;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.DateTimePropertyType#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.DateTimePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getDateTimePropertyType()
 * @model extendedMetaData="name='DateTime_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface DateTimePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(XMLGregorianCalendar)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getDateTimePropertyType_DateTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='DateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateTime();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.DateTimePropertyType#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getDateTimePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.DateTimePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // DateTimePropertyType
