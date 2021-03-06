/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertical CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.VerticalCRSType#getVerticalCSGroup <em>Vertical CS Group</em>}</li>
 *   <li>{@link net.opengis.gml32.VerticalCRSType#getVerticalCS <em>Vertical CS</em>}</li>
 *   <li>{@link net.opengis.gml32.VerticalCRSType#getVerticalDatumGroup <em>Vertical Datum Group</em>}</li>
 *   <li>{@link net.opengis.gml32.VerticalCRSType#getVerticalDatum <em>Vertical Datum</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getVerticalCRSType()
 * @model extendedMetaData="name='VerticalCRSType' kind='elementOnly'"
 * @generated
 */
public interface VerticalCRSType extends AbstractCRSType
{
	/**
	 * Returns the value of the '<em><b>Vertical CS Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:verticalCS is an association role to the vertical coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical CS Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getVerticalCRSType_VerticalCSGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='verticalCS:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVerticalCSGroup();

	/**
	 * Returns the value of the '<em><b>Vertical CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:verticalCS is an association role to the vertical coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical CS</em>' containment reference.
	 * @see #setVerticalCS(VerticalCSPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getVerticalCRSType_VerticalCS()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='verticalCS' namespace='##targetNamespace' group='verticalCS:group'"
	 * @generated
	 */
	VerticalCSPropertyType getVerticalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.VerticalCRSType#getVerticalCS <em>Vertical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical CS</em>' containment reference.
	 * @see #getVerticalCS()
	 * @generated
	 */
	void setVerticalCS(VerticalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Vertical Datum Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:verticalDatum is an association role to the vertical datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Datum Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getVerticalCRSType_VerticalDatumGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='verticalDatum:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVerticalDatumGroup();

	/**
	 * Returns the value of the '<em><b>Vertical Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:verticalDatum is an association role to the vertical datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Datum</em>' containment reference.
	 * @see #setVerticalDatum(VerticalDatumPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getVerticalCRSType_VerticalDatum()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='verticalDatum' namespace='##targetNamespace' group='verticalDatum:group'"
	 * @generated
	 */
	VerticalDatumPropertyType getVerticalDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.VerticalCRSType#getVerticalDatum <em>Vertical Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Datum</em>' containment reference.
	 * @see #getVerticalDatum()
	 * @generated
	 */
	void setVerticalDatum(VerticalDatumPropertyType value);

} // VerticalCRSType
