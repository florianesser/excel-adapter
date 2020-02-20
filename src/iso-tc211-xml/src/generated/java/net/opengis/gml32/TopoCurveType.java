/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TopoCurveType#getDirectedEdge <em>Directed Edge</em>}</li>
 *   <li>{@link net.opengis.gml32.TopoCurveType#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTopoCurveType()
 * @model extendedMetaData="name='TopoCurveType' kind='elementOnly'"
 * @generated
 */
public interface TopoCurveType extends AbstractTopologyType {
	/**
	 * Returns the value of the '<em><b>Directed Edge</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.DirectedEdgePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:directedEdge property element describes the boundary of topology faces, the coBoundary of topology nodes and is used in the support of topological line features via the gml:TopoCurve expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included edge is used, i.e. forward or reverse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Edge</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getTopoCurveType_DirectedEdge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='directedEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectedEdgePropertyType> getDirectedEdge();

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
	 * @see net.opengis.gml32.GMLPackage#getTopoCurveType_AggregationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregationType'"
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TopoCurveType#getAggregationType <em>Aggregation Type</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml32.TopoCurveType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	void unsetAggregationType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.TopoCurveType#getAggregationType <em>Aggregation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Type</em>' attribute is set.
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	boolean isSetAggregationType();

} // TopoCurveType
