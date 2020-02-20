/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.NodeType#getContainer <em>Container</em>}</li>
 *   <li>{@link net.opengis.gml32.NodeType#getDirectedEdge <em>Directed Edge</em>}</li>
 *   <li>{@link net.opengis.gml32.NodeType#getPointProperty <em>Point Property</em>}</li>
 *   <li>{@link net.opengis.gml32.NodeType#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getNodeType()
 * @model extendedMetaData="name='NodeType' kind='elementOnly'"
 * @generated
 */
public interface NodeType extends AbstractTopoPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(FaceOrTopoSolidPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getNodeType_Container()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='container' namespace='##targetNamespace'"
	 * @generated
	 */
	FaceOrTopoSolidPropertyType getContainer();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.NodeType#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(FaceOrTopoSolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Directed Edge</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.DirectedEdgePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of planar topology, a gml:Node must have a clockwise sequence of gml:directedEdge properties, to ensure a lossless topology representation as defined by Kuijpers, et. al. (see OGC 05-102 Topology IPR).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Edge</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getNodeType_DirectedEdge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='directedEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectedEdgePropertyType> getDirectedEdge();

	/**
	 * Returns the value of the '<em><b>Point Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a point via the XLink-attributes or contains the point element. pointProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for Point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Property</em>' containment reference.
	 * @see #setPointProperty(PointPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getNodeType_PointProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPropertyType getPointProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.NodeType#getPointProperty <em>Point Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Property</em>' containment reference.
	 * @see #getPointProperty()
	 * @generated
	 */
	void setPointProperty(PointPropertyType value);

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
	 * @see net.opengis.gml32.GMLPackage#getNodeType_AggregationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregationType'"
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.NodeType#getAggregationType <em>Aggregation Type</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml32.NodeType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	void unsetAggregationType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.NodeType#getAggregationType <em>Aggregation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Type</em>' attribute is set.
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	boolean isSetAggregationType();

} // NodeType
