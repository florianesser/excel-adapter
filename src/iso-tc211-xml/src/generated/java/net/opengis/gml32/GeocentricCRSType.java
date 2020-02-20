/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geocentric CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.GeocentricCRSType#getUsesCartesianCS <em>Uses Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml32.GeocentricCRSType#getUsesSphericalCS <em>Uses Spherical CS</em>}</li>
 *   <li>{@link net.opengis.gml32.GeocentricCRSType#getUsesGeodeticDatum <em>Uses Geodetic Datum</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getGeocentricCRSType()
 * @model extendedMetaData="name='GeocentricCRSType' kind='elementOnly'"
 * @generated
 */
public interface GeocentricCRSType extends AbstractCRSType {
	/**
	 * Returns the value of the '<em><b>Uses Cartesian CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Cartesian CS</em>' containment reference.
	 * @see #setUsesCartesianCS(CartesianCSPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getGeocentricCRSType_UsesCartesianCS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usesCartesianCS' namespace='##targetNamespace'"
	 * @generated
	 */
	CartesianCSPropertyType getUsesCartesianCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeocentricCRSType#getUsesCartesianCS <em>Uses Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Cartesian CS</em>' containment reference.
	 * @see #getUsesCartesianCS()
	 * @generated
	 */
	void setUsesCartesianCS(CartesianCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Spherical CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Spherical CS</em>' containment reference.
	 * @see #setUsesSphericalCS(SphericalCSPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getGeocentricCRSType_UsesSphericalCS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usesSphericalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	SphericalCSPropertyType getUsesSphericalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeocentricCRSType#getUsesSphericalCS <em>Uses Spherical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Spherical CS</em>' containment reference.
	 * @see #getUsesSphericalCS()
	 * @generated
	 */
	void setUsesSphericalCS(SphericalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Geodetic Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Geodetic Datum</em>' containment reference.
	 * @see #setUsesGeodeticDatum(GeodeticDatumPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getGeocentricCRSType_UsesGeodeticDatum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesGeodeticDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	GeodeticDatumPropertyType getUsesGeodeticDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeocentricCRSType#getUsesGeodeticDatum <em>Uses Geodetic Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Geodetic Datum</em>' containment reference.
	 * @see #getUsesGeodeticDatum()
	 * @generated
	 */
	void setUsesGeodeticDatum(GeodeticDatumPropertyType value);

} // GeocentricCRSType
