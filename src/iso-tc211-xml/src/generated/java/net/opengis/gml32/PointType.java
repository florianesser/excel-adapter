/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.PointType#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml32.PointType#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getPointType()
 * @model extendedMetaData="name='PointType' kind='elementOnly'"
 * @generated
 */
public interface PointType extends AbstractGeometricPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference.
	 * @see #setPos(DirectPositionType)
	 * @see net.opengis.gml32.GMLPackage#getPointType_Pos()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pos' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionType getPos();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.PointType#getPos <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' containment reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(DirectPositionType value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(CoordinatesType)
	 * @see net.opengis.gml32.GMLPackage#getPointType_Coordinates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinatesType getCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.PointType#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(CoordinatesType value);

} // PointType
