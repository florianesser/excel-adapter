/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TopoPointType#getDirectedNode <em>Directed Node</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTopoPointType()
 * @model extendedMetaData="name='TopoPointType' kind='elementOnly'"
 * @generated
 */
public interface TopoPointType extends AbstractTopologyType {
	/**
	 * Returns the value of the '<em><b>Directed Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:directedNode property element describes the boundary of topology edges and is used in the support of topological point features via the gml:TopoPoint expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included node is used: start ("-") or end ("+") node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Node</em>' containment reference.
	 * @see #setDirectedNode(DirectedNodePropertyType)
	 * @see net.opengis.gml32.GMLPackage#getTopoPointType_DirectedNode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='directedNode' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectedNodePropertyType getDirectedNode();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TopoPointType#getDirectedNode <em>Directed Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed Node</em>' containment reference.
	 * @see #getDirectedNode()
	 * @generated
	 */
	void setDirectedNode(DirectedNodePropertyType value);

} // TopoPointType
