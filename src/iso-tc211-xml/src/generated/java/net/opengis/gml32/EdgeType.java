/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.EdgeType#getContainer <em>Container</em>}</li>
 *   <li>{@link net.opengis.gml32.EdgeType#getDirectedNode <em>Directed Node</em>}</li>
 *   <li>{@link net.opengis.gml32.EdgeType#getDirectedFace <em>Directed Face</em>}</li>
 *   <li>{@link net.opengis.gml32.EdgeType#getCurveProperty <em>Curve Property</em>}</li>
 *   <li>{@link net.opengis.gml32.EdgeType#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getEdgeType()
 * @model extendedMetaData="name='EdgeType' kind='elementOnly'"
 * @generated
 */
public interface EdgeType extends AbstractTopoPrimitiveType
{
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(TopoSolidPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getEdgeType_Container()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='container' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoSolidPropertyType getContainer();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.EdgeType#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(TopoSolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Directed Node</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.DirectedNodePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:directedNode property element describes the boundary of topology edges and is used in the support of topological point features via the gml:TopoPoint expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included node is used: start ("-") or end ("+") node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Node</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getEdgeType_DirectedNode()
	 * @model containment="true" lower="2" upper="2"
	 *        extendedMetaData="kind='element' name='directedNode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectedNodePropertyType> getDirectedNode();

	/**
	 * Returns the value of the '<em><b>Directed Face</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.DirectedFacePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:directedFace property element describes the boundary of topology solids, in the coBoundary of topology edges and is used in the support of surface features via the gml:TopoSurface expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included face is used i.e. inward or outward with respect to the surface normal in any geometric realisation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Face</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getEdgeType_DirectedFace()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='directedFace' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectedFacePropertyType> getDirectedFace();

	/**
	 * Returns the value of the '<em><b>Curve Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a curve via the XLink-attributes or contains the curve element. curveProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for AbstractCurve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve Property</em>' containment reference.
	 * @see #setCurveProperty(CurvePropertyType)
	 * @see net.opengis.gml32.GMLPackage#getEdgeType_CurveProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='curveProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePropertyType getCurveProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.EdgeType#getCurveProperty <em>Curve Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Property</em>' containment reference.
	 * @see #getCurveProperty()
	 * @generated
	 */
	void setCurveProperty(CurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Aggregation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml32.AggregationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml32.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @see net.opengis.gml32.GMLPackage#getEdgeType_AggregationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregationType'"
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.EdgeType#getAggregationType <em>Aggregation Type</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml32.EdgeType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	void unsetAggregationType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.EdgeType#getAggregationType <em>Aggregation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Type</em>' attribute is set.
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	boolean isSetAggregationType();

} // EdgeType
