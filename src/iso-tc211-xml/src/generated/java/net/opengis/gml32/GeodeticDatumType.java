/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geodetic Datum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.GeodeticDatumType#getPrimeMeridianGroup <em>Prime Meridian Group</em>}</li>
 *   <li>{@link net.opengis.gml32.GeodeticDatumType#getPrimeMeridian <em>Prime Meridian</em>}</li>
 *   <li>{@link net.opengis.gml32.GeodeticDatumType#getEllipsoidGroup <em>Ellipsoid Group</em>}</li>
 *   <li>{@link net.opengis.gml32.GeodeticDatumType#getEllipsoid <em>Ellipsoid</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getGeodeticDatumType()
 * @model extendedMetaData="name='GeodeticDatumType' kind='elementOnly'"
 * @generated
 */
public interface GeodeticDatumType extends AbstractDatumType {
	/**
	 * Returns the value of the '<em><b>Prime Meridian Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:primeMeridian is an association role to the prime meridian used by this geodetic datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prime Meridian Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getGeodeticDatumType_PrimeMeridianGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='primeMeridian:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPrimeMeridianGroup();

	/**
	 * Returns the value of the '<em><b>Prime Meridian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:primeMeridian is an association role to the prime meridian used by this geodetic datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prime Meridian</em>' containment reference.
	 * @see #setPrimeMeridian(PrimeMeridianPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getGeodeticDatumType_PrimeMeridian()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primeMeridian' namespace='##targetNamespace' group='primeMeridian:group'"
	 * @generated
	 */
	PrimeMeridianPropertyType getPrimeMeridian();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeodeticDatumType#getPrimeMeridian <em>Prime Meridian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prime Meridian</em>' containment reference.
	 * @see #getPrimeMeridian()
	 * @generated
	 */
	void setPrimeMeridian(PrimeMeridianPropertyType value);

	/**
	 * Returns the value of the '<em><b>Ellipsoid Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ellipsoid is an association role to the ellipsoid used by this geodetic datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoid Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getGeodeticDatumType_EllipsoidGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='ellipsoid:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEllipsoidGroup();

	/**
	 * Returns the value of the '<em><b>Ellipsoid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ellipsoid is an association role to the ellipsoid used by this geodetic datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoid</em>' containment reference.
	 * @see #setEllipsoid(EllipsoidPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getGeodeticDatumType_Ellipsoid()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipsoid' namespace='##targetNamespace' group='ellipsoid:group'"
	 * @generated
	 */
	EllipsoidPropertyType getEllipsoid();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeodeticDatumType#getEllipsoid <em>Ellipsoid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoid</em>' containment reference.
	 * @see #getEllipsoid()
	 * @generated
	 */
	void setEllipsoid(EllipsoidPropertyType value);

} // GeodeticDatumType
