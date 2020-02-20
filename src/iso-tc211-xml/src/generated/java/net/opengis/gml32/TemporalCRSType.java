/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TemporalCRSType#getTimeCSGroup <em>Time CS Group</em>}</li>
 *   <li>{@link net.opengis.gml32.TemporalCRSType#getTimeCS <em>Time CS</em>}</li>
 *   <li>{@link net.opengis.gml32.TemporalCRSType#getUsesTemporalCS <em>Uses Temporal CS</em>}</li>
 *   <li>{@link net.opengis.gml32.TemporalCRSType#getTemporalDatumGroup <em>Temporal Datum Group</em>}</li>
 *   <li>{@link net.opengis.gml32.TemporalCRSType#getTemporalDatum <em>Temporal Datum</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTemporalCRSType()
 * @model extendedMetaData="name='TemporalCRSType' kind='elementOnly'"
 * @generated
 */
public interface TemporalCRSType extends AbstractCRSType {
	/**
	 * Returns the value of the '<em><b>Time CS Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:timeCS is an association role to the time coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time CS Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getTemporalCRSType_TimeCSGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='timeCS:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTimeCSGroup();

	/**
	 * Returns the value of the '<em><b>Time CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:timeCS is an association role to the time coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time CS</em>' containment reference.
	 * @see #setTimeCS(TimeCSPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getTemporalCRSType_TimeCS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timeCS' namespace='##targetNamespace' group='timeCS:group'"
	 * @generated
	 */
	TimeCSPropertyType getTimeCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TemporalCRSType#getTimeCS <em>Time CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time CS</em>' containment reference.
	 * @see #getTimeCS()
	 * @generated
	 */
	void setTimeCS(TimeCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Temporal CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Temporal CS</em>' containment reference.
	 * @see #setUsesTemporalCS(TemporalCSPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getTemporalCRSType_UsesTemporalCS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usesTemporalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalCSPropertyType getUsesTemporalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TemporalCRSType#getUsesTemporalCS <em>Uses Temporal CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Temporal CS</em>' containment reference.
	 * @see #getUsesTemporalCS()
	 * @generated
	 */
	void setUsesTemporalCS(TemporalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Temporal Datum Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:temporalDatum is an association role to the temporal datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temporal Datum Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getTemporalCRSType_TemporalDatumGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='temporalDatum:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTemporalDatumGroup();

	/**
	 * Returns the value of the '<em><b>Temporal Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:temporalDatum is an association role to the temporal datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temporal Datum</em>' containment reference.
	 * @see #setTemporalDatum(TemporalDatumPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getTemporalCRSType_TemporalDatum()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='temporalDatum' namespace='##targetNamespace' group='temporalDatum:group'"
	 * @generated
	 */
	TemporalDatumPropertyType getTemporalDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TemporalCRSType#getTemporalDatum <em>Temporal Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Datum</em>' containment reference.
	 * @see #getTemporalDatum()
	 * @generated
	 */
	void setTemporalDatum(TemporalDatumPropertyType value);

} // TemporalCRSType
