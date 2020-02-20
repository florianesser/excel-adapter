/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knot Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * gml:KnotPropertyType encapsulates a knot to use it in a geometric type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.KnotPropertyType#getKnot <em>Knot</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getKnotPropertyType()
 * @model extendedMetaData="name='KnotPropertyType' kind='elementOnly'"
 * @generated
 */
public interface KnotPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Knot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A knot is a breakpoint on a piecewise spline curve.
	 * value is the value of the parameter at the knot of the spline (see ISO 19107:2003, 6.4.24.2).
	 * multiplicity is the multiplicity of this knot used in the definition of the spline (with the same weight).
	 * weight is the value of the averaging weight used for this knot of the spline.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Knot</em>' containment reference.
	 * @see #setKnot(KnotType)
	 * @see net.opengis.gml32.GMLPackage#getKnotPropertyType_Knot()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Knot' namespace='##targetNamespace'"
	 * @generated
	 */
	KnotType getKnot();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.KnotPropertyType#getKnot <em>Knot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knot</em>' containment reference.
	 * @see #getKnot()
	 * @generated
	 */
	void setKnot(KnotType value);

} // KnotPropertyType
