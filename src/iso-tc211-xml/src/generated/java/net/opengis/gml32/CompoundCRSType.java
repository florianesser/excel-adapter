/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.CompoundCRSType#getComponentReferenceSystemGroup <em>Component Reference System Group</em>}</li>
 *   <li>{@link net.opengis.gml32.CompoundCRSType#getComponentReferenceSystem <em>Component Reference System</em>}</li>
 *   <li>{@link net.opengis.gml32.CompoundCRSType#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getCompoundCRSType()
 * @model extendedMetaData="name='CompoundCRSType' kind='elementOnly'"
 * @generated
 */
public interface CompoundCRSType extends AbstractCRSType {
	/**
	 * Returns the value of the '<em><b>Component Reference System Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:componentReferenceSystem elements are an ordered sequence of associations to all the component coordinate reference systems included in this compound coordinate reference system. The gml:AggregationAttributeGroup should be used to specify that the gml:componentReferenceSystem properties are ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Reference System Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getCompoundCRSType_ComponentReferenceSystemGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" lower="2" many="true"
	 *        extendedMetaData="kind='group' name='componentReferenceSystem:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getComponentReferenceSystemGroup();

	/**
	 * Returns the value of the '<em><b>Component Reference System</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.SingleCRSPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:componentReferenceSystem elements are an ordered sequence of associations to all the component coordinate reference systems included in this compound coordinate reference system. The gml:AggregationAttributeGroup should be used to specify that the gml:componentReferenceSystem properties are ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Reference System</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getCompoundCRSType_ComponentReferenceSystem()
	 * @model containment="true" lower="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='componentReferenceSystem' namespace='##targetNamespace' group='componentReferenceSystem:group'"
	 * @generated
	 */
	EList<SingleCRSPropertyType> getComponentReferenceSystem();

	/**
	 * Returns the value of the '<em><b>Aggregation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml32.AggregationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml32.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @see net.opengis.gml32.GMLPackage#getCompoundCRSType_AggregationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregationType'"
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.CompoundCRSType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml32.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @generated
	 */
	void setAggregationType(AggregationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.CompoundCRSType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	void unsetAggregationType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.CompoundCRSType#getAggregationType <em>Aggregation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Type</em>' attribute is set.
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	boolean isSetAggregationType();

} // CompoundCRSType
