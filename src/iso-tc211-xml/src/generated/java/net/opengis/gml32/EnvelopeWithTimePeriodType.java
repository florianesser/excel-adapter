/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Envelope With Time Period Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.EnvelopeWithTimePeriodType#getBeginPosition <em>Begin Position</em>}</li>
 *   <li>{@link net.opengis.gml32.EnvelopeWithTimePeriodType#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link net.opengis.gml32.EnvelopeWithTimePeriodType#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getEnvelopeWithTimePeriodType()
 * @model extendedMetaData="name='EnvelopeWithTimePeriodType' kind='elementOnly'"
 * @generated
 */
public interface EnvelopeWithTimePeriodType extends EnvelopeType {
	/**
	 * Returns the value of the '<em><b>Begin Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Position</em>' containment reference.
	 * @see #setBeginPosition(TimePositionType)
	 * @see net.opengis.gml32.GMLPackage#getEnvelopeWithTimePeriodType_BeginPosition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='beginPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePositionType getBeginPosition();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.EnvelopeWithTimePeriodType#getBeginPosition <em>Begin Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Position</em>' containment reference.
	 * @see #getBeginPosition()
	 * @generated
	 */
	void setBeginPosition(TimePositionType value);

	/**
	 * Returns the value of the '<em><b>End Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Position</em>' containment reference.
	 * @see #setEndPosition(TimePositionType)
	 * @see net.opengis.gml32.GMLPackage#getEnvelopeWithTimePeriodType_EndPosition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='endPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePositionType getEndPosition();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.EnvelopeWithTimePeriodType#getEndPosition <em>End Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Position</em>' containment reference.
	 * @see #getEndPosition()
	 * @generated
	 */
	void setEndPosition(TimePositionType value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * The default value is <code>"#ISO-8601"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #setFrame(String)
	 * @see net.opengis.gml32.GMLPackage#getEnvelopeWithTimePeriodType_Frame()
	 * @model default="#ISO-8601" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='frame'"
	 * @generated
	 */
	String getFrame();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.EnvelopeWithTimePeriodType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(String value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.EnvelopeWithTimePeriodType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrame()
	 * @see #getFrame()
	 * @see #setFrame(String)
	 * @generated
	 */
	void unsetFrame();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.EnvelopeWithTimePeriodType#getFrame <em>Frame</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame</em>' attribute is set.
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @see #setFrame(String)
	 * @generated
	 */
	boolean isSetFrame();

} // EnvelopeWithTimePeriodType
