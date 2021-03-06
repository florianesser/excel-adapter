/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orientable Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.OrientableCurveType#getBaseCurve <em>Base Curve</em>}</li>
 *   <li>{@link net.opengis.gml32.OrientableCurveType#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getOrientableCurveType()
 * @model extendedMetaData="name='OrientableCurveType' kind='elementOnly'"
 * @generated
 */
public interface OrientableCurveType extends AbstractCurveType
{
	/**
	 * Returns the value of the '<em><b>Base Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property baseCurve references or contains the base curve, i.e. it either references the base curve via the XLink-attributes or contains the curve element. A curve element is any element which is substitutable for AbstractCurve. The base curve has positive orientation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Curve</em>' containment reference.
	 * @see #setBaseCurve(CurvePropertyType)
	 * @see net.opengis.gml32.GMLPackage#getOrientableCurveType_BaseCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='baseCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePropertyType getBaseCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.OrientableCurveType#getBaseCurve <em>Base Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Curve</em>' containment reference.
	 * @see #getBaseCurve()
	 * @generated
	 */
	void setBaseCurve(CurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The default value is <code>"+"</code>.
	 * The literals are from the enumeration {@link net.opengis.gml32.SignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see net.opengis.gml32.SignType
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(SignType)
	 * @see net.opengis.gml32.GMLPackage#getOrientableCurveType_Orientation()
	 * @model default="+" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='orientation'"
	 * @generated
	 */
	SignType getOrientation();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.OrientableCurveType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see net.opengis.gml32.SignType
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(SignType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.OrientableCurveType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(SignType)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.OrientableCurveType#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(SignType)
	 * @generated
	 */
	boolean isSetOrientation();

} // OrientableCurveType
