/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Coordinate System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AbstractCoordinateSystemType#getAxisGroup <em>Axis Group</em>}</li>
 *   <li>{@link net.opengis.gml32.AbstractCoordinateSystemType#getAxis <em>Axis</em>}</li>
 *   <li>{@link net.opengis.gml32.AbstractCoordinateSystemType#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAbstractCoordinateSystemType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractCoordinateSystemType' kind='elementOnly'"
 * @generated
 */
public interface AbstractCoordinateSystemType extends IdentifiedObjectType {
	/**
	 * Returns the value of the '<em><b>Axis Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:axis property is an association role (ordered sequence) to the coordinate system axes included in this coordinate system. The coordinate values in a coordinate tuple shall be recorded in the order in which the coordinate system axes associations are recorded, whenever those coordinates use a coordinate reference system that uses this coordinate system. The gml:AggregationAttributeGroup should be used to specify that the axis objects are ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axis Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getAbstractCoordinateSystemType_AxisGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='group' name='axis:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAxisGroup();

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.CoordinateSystemAxisPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:axis property is an association role (ordered sequence) to the coordinate system axes included in this coordinate system. The coordinate values in a coordinate tuple shall be recorded in the order in which the coordinate system axes associations are recorded, whenever those coordinates use a coordinate reference system that uses this coordinate system. The gml:AggregationAttributeGroup should be used to specify that the axis objects are ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getAbstractCoordinateSystemType_Axis()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='axis' namespace='##targetNamespace' group='axis:group'"
	 * @generated
	 */
	EList<CoordinateSystemAxisPropertyType> getAxis();

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
	 * @see net.opengis.gml32.GMLPackage#getAbstractCoordinateSystemType_AggregationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregationType'"
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractCoordinateSystemType#getAggregationType <em>Aggregation Type</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml32.AbstractCoordinateSystemType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	void unsetAggregationType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.AbstractCoordinateSystemType#getAggregationType <em>Aggregation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Type</em>' attribute is set.
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	boolean isSetAggregationType();

} // AbstractCoordinateSystemType
