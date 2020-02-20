/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.RefLocationType#getAffinePlacement <em>Affine Placement</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getRefLocationType()
 * @model extendedMetaData="name='refLocation_._type' kind='elementOnly'"
 * @generated
 */
public interface RefLocationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Affine Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * location, refDirection, inDimension and outDimension have the same meaning as specified in ISO 19107:2003, 6.4.21.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affine Placement</em>' containment reference.
	 * @see #setAffinePlacement(AffinePlacementType)
	 * @see net.opengis.gml32.GMLPackage#getRefLocationType_AffinePlacement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AffinePlacement' namespace='##targetNamespace'"
	 * @generated
	 */
	AffinePlacementType getAffinePlacement();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.RefLocationType#getAffinePlacement <em>Affine Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affine Placement</em>' containment reference.
	 * @see #getAffinePlacement()
	 * @generated
	 */
	void setAffinePlacement(AffinePlacementType value);

} // RefLocationType
