/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.CurveType#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getCurveType()
 * @model extendedMetaData="name='CurveType' kind='elementOnly'"
 * @generated
 */
public interface CurveType extends AbstractCurveType {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of curve segments. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference.
	 * @see #setSegments(CurveSegmentArrayPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getCurveType_Segments()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segments' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveSegmentArrayPropertyType getSegments();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.CurveType#getSegments <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' containment reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(CurveSegmentArrayPropertyType value);

} // CurveType
