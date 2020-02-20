/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.PolygonType#getExterior <em>Exterior</em>}</li>
 *   <li>{@link net.opengis.gml32.PolygonType#getInterior <em>Interior</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getPolygonType()
 * @model extendedMetaData="name='PolygonType' kind='elementOnly'"
 * @generated
 */
public interface PolygonType extends AbstractSurfaceType {
	/**
	 * Returns the value of the '<em><b>Exterior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boundary of a surface consists of a number of rings. In the normal 2D case, one of these rings is distinguished as being the exterior boundary. In a general manifold this is not always possible, in which case all boundaries shall be listed as interior boundaries, and the exterior will be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exterior</em>' containment reference.
	 * @see #setExterior(AbstractRingPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getPolygonType_Exterior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exterior' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractRingPropertyType getExterior();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.PolygonType#getExterior <em>Exterior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exterior</em>' containment reference.
	 * @see #getExterior()
	 * @generated
	 */
	void setExterior(AbstractRingPropertyType value);

	/**
	 * Returns the value of the '<em><b>Interior</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.AbstractRingPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boundary of a surface consists of a number of rings. The "interior" rings separate the surface / surface patch from the area enclosed by the rings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interior</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getPolygonType_Interior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interior' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AbstractRingPropertyType> getInterior();

} // PolygonType
