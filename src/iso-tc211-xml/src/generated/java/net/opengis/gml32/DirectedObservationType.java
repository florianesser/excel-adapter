/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Observation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DirectedObservationType#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDirectedObservationType()
 * @model extendedMetaData="name='DirectedObservationType' kind='elementOnly'"
 * @generated
 */
public interface DirectedObservationType extends ObservationType {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property gml:direction is intended as a pre-defined property expressing a direction to be assigned to features defined in a GML application schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference.
	 * @see #setDirection(DirectionPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getDirectedObservationType_Direction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionPropertyType getDirection();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DirectedObservationType#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionPropertyType value);

} // DirectedObservationType
