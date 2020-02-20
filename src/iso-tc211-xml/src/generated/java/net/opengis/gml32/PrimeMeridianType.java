/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prime Meridian Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.PrimeMeridianType#getGreenwichLongitude <em>Greenwich Longitude</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getPrimeMeridianType()
 * @model extendedMetaData="name='PrimeMeridianType' kind='elementOnly'"
 * @generated
 */
public interface PrimeMeridianType extends IdentifiedObjectType {
	/**
	 * Returns the value of the '<em><b>Greenwich Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:greenwichLongitude is the longitude of the prime meridian measured from the Greenwich meridian, positive eastward. If the value of the prime meridian "name" is "Greenwich" then the value of greenwichLongitude shall be 0 degrees.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Greenwich Longitude</em>' containment reference.
	 * @see #setGreenwichLongitude(AngleType)
	 * @see net.opengis.gml32.GMLPackage#getPrimeMeridianType_GreenwichLongitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='greenwichLongitude' namespace='##targetNamespace'"
	 * @generated
	 */
	AngleType getGreenwichLongitude();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.PrimeMeridianType#getGreenwichLongitude <em>Greenwich Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Greenwich Longitude</em>' containment reference.
	 * @see #getGreenwichLongitude()
	 * @generated
	 */
	void setGreenwichLongitude(AngleType value);

} // PrimeMeridianType
