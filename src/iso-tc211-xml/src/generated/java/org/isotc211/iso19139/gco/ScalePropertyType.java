/**
 */
package org.isotc211.iso19139.gco;

import net.opengis.gml32.ScaleType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scale Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.ScalePropertyType#getScale <em>Scale</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.ScalePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getScalePropertyType()
 * @model extendedMetaData="name='Scale_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface ScalePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' containment reference.
	 * @see #setScale(ScaleType)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getScalePropertyType_Scale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Scale' namespace='##targetNamespace'"
	 * @generated
	 */
	ScaleType getScale();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.ScalePropertyType#getScale <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' containment reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(ScaleType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getScalePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.ScalePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // ScalePropertyType
