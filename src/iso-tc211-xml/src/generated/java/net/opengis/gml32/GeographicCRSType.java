/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geographic CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.GeographicCRSType#getUsesEllipsoidalCS <em>Uses Ellipsoidal CS</em>}</li>
 *   <li>{@link net.opengis.gml32.GeographicCRSType#getUsesGeodeticDatum <em>Uses Geodetic Datum</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getGeographicCRSType()
 * @model extendedMetaData="name='GeographicCRSType' kind='elementOnly'"
 * @generated
 */
public interface GeographicCRSType extends AbstractCRSType {
	/**
	 * Returns the value of the '<em><b>Uses Ellipsoidal CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Ellipsoidal CS</em>' containment reference.
	 * @see #setUsesEllipsoidalCS(EllipsoidalCSPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getGeographicCRSType_UsesEllipsoidalCS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesEllipsoidalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	EllipsoidalCSPropertyType getUsesEllipsoidalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeographicCRSType#getUsesEllipsoidalCS <em>Uses Ellipsoidal CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Ellipsoidal CS</em>' containment reference.
	 * @see #getUsesEllipsoidalCS()
	 * @generated
	 */
	void setUsesEllipsoidalCS(EllipsoidalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Geodetic Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Geodetic Datum</em>' containment reference.
	 * @see #setUsesGeodeticDatum(GeodeticDatumPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getGeographicCRSType_UsesGeodeticDatum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesGeodeticDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	GeodeticDatumPropertyType getUsesGeodeticDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeographicCRSType#getUsesGeodeticDatum <em>Uses Geodetic Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Geodetic Datum</em>' containment reference.
	 * @see #getUsesGeodeticDatum()
	 * @generated
	 */
	void setUsesGeodeticDatum(GeodeticDatumPropertyType value);

} // GeographicCRSType
