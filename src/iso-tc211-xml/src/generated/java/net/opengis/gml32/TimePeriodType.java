/**
 */
package net.opengis.gml32;

import javax.xml.datatype.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Period Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TimePeriodType#getBeginPosition <em>Begin Position</em>}</li>
 *   <li>{@link net.opengis.gml32.TimePeriodType#getBegin <em>Begin</em>}</li>
 *   <li>{@link net.opengis.gml32.TimePeriodType#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link net.opengis.gml32.TimePeriodType#getEnd <em>End</em>}</li>
 *   <li>{@link net.opengis.gml32.TimePeriodType#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.opengis.gml32.TimePeriodType#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTimePeriodType()
 * @model extendedMetaData="name='TimePeriodType' kind='elementOnly'"
 * @generated
 */
public interface TimePeriodType extends AbstractTimeGeometricPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Begin Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Position</em>' containment reference.
	 * @see #setBeginPosition(TimePositionType)
	 * @see net.opengis.gml32.GMLPackage#getTimePeriodType_BeginPosition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='beginPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePositionType getBeginPosition();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimePeriodType#getBeginPosition <em>Begin Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Position</em>' containment reference.
	 * @see #getBeginPosition()
	 * @generated
	 */
	void setBeginPosition(TimePositionType value);

	/**
	 * Returns the value of the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' containment reference.
	 * @see #setBegin(TimeInstantPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getTimePeriodType_Begin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='begin' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeInstantPropertyType getBegin();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimePeriodType#getBegin <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' containment reference.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(TimeInstantPropertyType value);

	/**
	 * Returns the value of the '<em><b>End Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Position</em>' containment reference.
	 * @see #setEndPosition(TimePositionType)
	 * @see net.opengis.gml32.GMLPackage#getTimePeriodType_EndPosition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePositionType getEndPosition();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimePeriodType#getEndPosition <em>End Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Position</em>' containment reference.
	 * @see #getEndPosition()
	 * @generated
	 */
	void setEndPosition(TimePositionType value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(TimeInstantPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getTimePeriodType_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeInstantPropertyType getEnd();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimePeriodType#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(TimeInstantPropertyType value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:duration conforms to the ISO 8601 syntax for temporal length as implemented by the XML Schema duration type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Duration)
	 * @see net.opengis.gml32.GMLPackage#getTimePeriodType_Duration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimePeriodType#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  gml:timeInterval conforms to ISO 11404 which is based on floating point values for temporal length.
	 * ISO 11404 syntax specifies the use of a positiveInteger together with appropriate values for radix and factor. The resolution of the time interval is to one radix ^(-factor) of the specified time unit.
	 * The value of the unit is either selected from the units for time intervals from ISO 31-1:1992, or is another suitable unit.  The encoding is defined for GML in gml:TimeUnitType. The second component of this union type provides a method for indicating time units other than the six standard units given in the enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Interval</em>' containment reference.
	 * @see #setTimeInterval(TimeIntervalLengthType)
	 * @see net.opengis.gml32.GMLPackage#getTimePeriodType_TimeInterval()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeIntervalLengthType getTimeInterval();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimePeriodType#getTimeInterval <em>Time Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' containment reference.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(TimeIntervalLengthType value);

} // TimePeriodType
