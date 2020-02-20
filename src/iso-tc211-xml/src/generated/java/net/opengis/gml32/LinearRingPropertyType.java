/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Ring Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A property with the content model of gml:LinearRingPropertyType encapsulates a linear ring to represent a component of a surface boundary.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.LinearRingPropertyType#getLinearRing <em>Linear Ring</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getLinearRingPropertyType()
 * @model extendedMetaData="name='LinearRingPropertyType' kind='elementOnly'"
 * @generated
 */
public interface LinearRingPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Linear Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LinearRing is defined by four or more coordinate tuples, with linear interpolation between them; the first and last coordinates shall be coincident. The number of direct positions in the list shall be at least four.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear Ring</em>' containment reference.
	 * @see #setLinearRing(LinearRingType)
	 * @see net.opengis.gml32.GMLPackage#getLinearRingPropertyType_LinearRing()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LinearRing' namespace='##targetNamespace'"
	 * @generated
	 */
	LinearRingType getLinearRing();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.LinearRingPropertyType#getLinearRing <em>Linear Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Ring</em>' containment reference.
	 * @see #getLinearRing()
	 * @generated
	 */
	void setLinearRing(LinearRingType value);

} // LinearRingPropertyType
