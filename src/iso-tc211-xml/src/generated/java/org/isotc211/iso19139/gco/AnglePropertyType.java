/**
 */
package org.isotc211.iso19139.gco;

import net.opengis.gml32.AngleType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.AnglePropertyType#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.AnglePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getAnglePropertyType()
 * @model extendedMetaData="name='Angle_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface AnglePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(AngleType)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getAnglePropertyType_Angle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Angle' namespace='##targetNamespace'"
	 * @generated
	 */
	AngleType getAngle();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.AnglePropertyType#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(AngleType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getAnglePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.AnglePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // AnglePropertyType
