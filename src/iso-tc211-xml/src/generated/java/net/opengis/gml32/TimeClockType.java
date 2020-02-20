/**
 */
package net.opengis.gml32;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Clock Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TimeClockType#getReferenceEvent <em>Reference Event</em>}</li>
 *   <li>{@link net.opengis.gml32.TimeClockType#getReferenceTime <em>Reference Time</em>}</li>
 *   <li>{@link net.opengis.gml32.TimeClockType#getUtcReference <em>Utc Reference</em>}</li>
 *   <li>{@link net.opengis.gml32.TimeClockType#getDateBasis <em>Date Basis</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTimeClockType()
 * @model extendedMetaData="name='TimeClockType' kind='elementOnly'"
 * @generated
 */
public interface TimeClockType extends TimeReferenceSystemType {
	/**
	 * Returns the value of the '<em><b>Reference Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Event</em>' containment reference.
	 * @see #setReferenceEvent(StringOrRefType)
	 * @see net.opengis.gml32.GMLPackage#getTimeClockType_ReferenceEvent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getReferenceEvent();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimeClockType#getReferenceEvent <em>Reference Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Event</em>' containment reference.
	 * @see #getReferenceEvent()
	 * @generated
	 */
	void setReferenceEvent(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Reference Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Time</em>' attribute.
	 * @see #setReferenceTime(XMLGregorianCalendar)
	 * @see net.opengis.gml32.GMLPackage#getTimeClockType_ReferenceTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time" required="true"
	 *        extendedMetaData="kind='element' name='referenceTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getReferenceTime();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimeClockType#getReferenceTime <em>Reference Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Time</em>' attribute.
	 * @see #getReferenceTime()
	 * @generated
	 */
	void setReferenceTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Utc Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utc Reference</em>' attribute.
	 * @see #setUtcReference(XMLGregorianCalendar)
	 * @see net.opengis.gml32.GMLPackage#getTimeClockType_UtcReference()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time" required="true"
	 *        extendedMetaData="kind='element' name='utcReference' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getUtcReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimeClockType#getUtcReference <em>Utc Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utc Reference</em>' attribute.
	 * @see #getUtcReference()
	 * @generated
	 */
	void setUtcReference(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Basis</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.TimeCalendarPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Basis</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getTimeClockType_DateBasis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateBasis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeCalendarPropertyType> getDateBasis();

} // TimeClockType
