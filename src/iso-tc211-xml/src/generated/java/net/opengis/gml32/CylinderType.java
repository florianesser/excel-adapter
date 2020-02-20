/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cylinder Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.CylinderType#getHorizontalCurveType <em>Horizontal Curve Type</em>}</li>
 *   <li>{@link net.opengis.gml32.CylinderType#getVerticalCurveType <em>Vertical Curve Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getCylinderType()
 * @model extendedMetaData="name='CylinderType' kind='elementOnly'"
 * @generated
 */
public interface CylinderType extends AbstractGriddedSurfaceType {
	/**
	 * Returns the value of the '<em><b>Horizontal Curve Type</b></em>' attribute.
	 * The default value is <code>"circularArc3Points"</code>.
	 * The literals are from the enumeration {@link net.opengis.gml32.CurveInterpolationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Curve Type</em>' attribute.
	 * @see net.opengis.gml32.CurveInterpolationType
	 * @see #isSetHorizontalCurveType()
	 * @see #unsetHorizontalCurveType()
	 * @see #setHorizontalCurveType(CurveInterpolationType)
	 * @see net.opengis.gml32.GMLPackage#getCylinderType_HorizontalCurveType()
	 * @model default="circularArc3Points" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='horizontalCurveType'"
	 * @generated
	 */
	CurveInterpolationType getHorizontalCurveType();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.CylinderType#getHorizontalCurveType <em>Horizontal Curve Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Curve Type</em>' attribute.
	 * @see net.opengis.gml32.CurveInterpolationType
	 * @see #isSetHorizontalCurveType()
	 * @see #unsetHorizontalCurveType()
	 * @see #getHorizontalCurveType()
	 * @generated
	 */
	void setHorizontalCurveType(CurveInterpolationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.CylinderType#getHorizontalCurveType <em>Horizontal Curve Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHorizontalCurveType()
	 * @see #getHorizontalCurveType()
	 * @see #setHorizontalCurveType(CurveInterpolationType)
	 * @generated
	 */
	void unsetHorizontalCurveType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.CylinderType#getHorizontalCurveType <em>Horizontal Curve Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Horizontal Curve Type</em>' attribute is set.
	 * @see #unsetHorizontalCurveType()
	 * @see #getHorizontalCurveType()
	 * @see #setHorizontalCurveType(CurveInterpolationType)
	 * @generated
	 */
	boolean isSetHorizontalCurveType();

	/**
	 * Returns the value of the '<em><b>Vertical Curve Type</b></em>' attribute.
	 * The default value is <code>"linear"</code>.
	 * The literals are from the enumeration {@link net.opengis.gml32.CurveInterpolationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Curve Type</em>' attribute.
	 * @see net.opengis.gml32.CurveInterpolationType
	 * @see #isSetVerticalCurveType()
	 * @see #unsetVerticalCurveType()
	 * @see #setVerticalCurveType(CurveInterpolationType)
	 * @see net.opengis.gml32.GMLPackage#getCylinderType_VerticalCurveType()
	 * @model default="linear" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='verticalCurveType'"
	 * @generated
	 */
	CurveInterpolationType getVerticalCurveType();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.CylinderType#getVerticalCurveType <em>Vertical Curve Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Curve Type</em>' attribute.
	 * @see net.opengis.gml32.CurveInterpolationType
	 * @see #isSetVerticalCurveType()
	 * @see #unsetVerticalCurveType()
	 * @see #getVerticalCurveType()
	 * @generated
	 */
	void setVerticalCurveType(CurveInterpolationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.CylinderType#getVerticalCurveType <em>Vertical Curve Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerticalCurveType()
	 * @see #getVerticalCurveType()
	 * @see #setVerticalCurveType(CurveInterpolationType)
	 * @generated
	 */
	void unsetVerticalCurveType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.CylinderType#getVerticalCurveType <em>Vertical Curve Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical Curve Type</em>' attribute is set.
	 * @see #unsetVerticalCurveType()
	 * @see #getVerticalCurveType()
	 * @see #setVerticalCurveType(CurveInterpolationType)
	 * @generated
	 */
	boolean isSetVerticalCurveType();

} // CylinderType
