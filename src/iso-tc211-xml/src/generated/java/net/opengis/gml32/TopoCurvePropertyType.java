/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Curve Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TopoCurvePropertyType#getTopoCurve <em>Topo Curve</em>}</li>
 *   <li>{@link net.opengis.gml32.TopoCurvePropertyType#isOwns <em>Owns</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTopoCurvePropertyType()
 * @model extendedMetaData="name='TopoCurvePropertyType' kind='elementOnly'"
 * @generated
 */
public interface TopoCurvePropertyType extends EObject
{
	/**
	 * Returns the value of the '<em><b>Topo Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TopoCurve represents a homogeneous topological expression, a sequence of directed edges, which if realised are isomorphic to a geometric curve primitive. The intended use of gml:TopoCurve is to appear within a line feature to express the structural and geometric relationships of this feature to other features via the shared edge definitions.
	 * If provided, the aggregationType attribute shall have the value "sequence".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Curve</em>' containment reference.
	 * @see #setTopoCurve(TopoCurveType)
	 * @see net.opengis.gml32.GMLPackage#getTopoCurvePropertyType_TopoCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TopoCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoCurveType getTopoCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TopoCurvePropertyType#getTopoCurve <em>Topo Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Curve</em>' containment reference.
	 * @see #getTopoCurve()
	 * @generated
	 */
	void setTopoCurve(TopoCurveType value);

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #setOwns(boolean)
	 * @see net.opengis.gml32.GMLPackage#getTopoCurvePropertyType_Owns()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='owns'"
	 * @generated
	 */
	boolean isOwns();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TopoCurvePropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @generated
	 */
	void setOwns(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.TopoCurvePropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	void unsetOwns();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.TopoCurvePropertyType#isOwns <em>Owns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owns</em>' attribute is set.
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	boolean isSetOwns();

} // TopoCurvePropertyType
