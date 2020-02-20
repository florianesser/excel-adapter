/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ring Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A property with the content model of gml:RingPropertyType encapsulates a ring to represent a component of a surface boundary.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.RingPropertyType#getRing <em>Ring</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getRingPropertyType()
 * @model extendedMetaData="name='RingPropertyType' kind='elementOnly'"
 * @generated
 */
public interface RingPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ring is used to represent a single connected component of a surface boundary as specified in ISO 19107:2003, 6.3.6.
	 * Every gml:curveMember references or contains one curve, i.e. any element which is substitutable for gml:AbstractCurve. In the context of a ring, the curves describe the boundary of the surface. The sequence of curves shall be contiguous and connected in a cycle.
	 * If provided, the aggregationType attribute shall have the value "sequence".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ring</em>' containment reference.
	 * @see #setRing(RingType)
	 * @see net.opengis.gml32.GMLPackage#getRingPropertyType_Ring()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ring' namespace='##targetNamespace'"
	 * @generated
	 */
	RingType getRing();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.RingPropertyType#getRing <em>Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring</em>' containment reference.
	 * @see #getRing()
	 * @generated
	 */
	void setRing(RingType value);

} // RingPropertyType
