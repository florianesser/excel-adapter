/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.RectangleType#getExterior <em>Exterior</em>}</li>
 *   <li>{@link net.opengis.gml32.RectangleType#getInterpolation <em>Interpolation</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getRectangleType()
 * @model extendedMetaData="name='RectangleType' kind='elementOnly'"
 * @generated
 */
public interface RectangleType extends AbstractSurfacePatchType
{
	/**
	 * Returns the value of the '<em><b>Exterior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boundary of a surface consists of a number of rings. In the normal 2D case, one of these rings is distinguished as being the exterior boundary. In a general manifold this is not always possible, in which case all boundaries shall be listed as interior boundaries, and the exterior will be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exterior</em>' containment reference.
	 * @see #setExterior(AbstractRingPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getRectangleType_Exterior()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='exterior' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractRingPropertyType getExterior();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.RectangleType#getExterior <em>Exterior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exterior</em>' containment reference.
	 * @see #getExterior()
	 * @generated
	 */
	void setExterior(AbstractRingPropertyType value);

	/**
	 * Returns the value of the '<em><b>Interpolation</b></em>' attribute.
	 * The default value is <code>"planar"</code>.
	 * The literals are from the enumeration {@link net.opengis.gml32.SurfaceInterpolationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpolation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpolation</em>' attribute.
	 * @see net.opengis.gml32.SurfaceInterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #setInterpolation(SurfaceInterpolationType)
	 * @see net.opengis.gml32.GMLPackage#getRectangleType_Interpolation()
	 * @model default="planar" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='interpolation'"
	 * @generated
	 */
	SurfaceInterpolationType getInterpolation();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.RectangleType#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation</em>' attribute.
	 * @see net.opengis.gml32.SurfaceInterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @generated
	 */
	void setInterpolation(SurfaceInterpolationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.RectangleType#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(SurfaceInterpolationType)
	 * @generated
	 */
	void unsetInterpolation();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.RectangleType#getInterpolation <em>Interpolation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interpolation</em>' attribute is set.
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(SurfaceInterpolationType)
	 * @generated
	 */
	boolean isSetInterpolation();

} // RectangleType
