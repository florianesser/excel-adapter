/**
 */
package org.isotc211.iso19139.gco;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.BooleanPropertyType#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.BooleanPropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getBooleanPropertyType()
 * @model extendedMetaData="name='Boolean_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface BooleanPropertyType extends EObject
{
	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' attribute.
	 * @see #isSetBoolean()
	 * @see #unsetBoolean()
	 * @see #setBoolean(boolean)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getBooleanPropertyType_Boolean()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Boolean' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBoolean();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.BooleanPropertyType#isBoolean <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' attribute.
	 * @see #isSetBoolean()
	 * @see #unsetBoolean()
	 * @see #isBoolean()
	 * @generated
	 */
	void setBoolean(boolean value);

	/**
	 * Unsets the value of the '{@link org.isotc211.iso19139.gco.BooleanPropertyType#isBoolean <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoolean()
	 * @see #isBoolean()
	 * @see #setBoolean(boolean)
	 * @generated
	 */
	void unsetBoolean();

	/**
	 * Returns whether the value of the '{@link org.isotc211.iso19139.gco.BooleanPropertyType#isBoolean <em>Boolean</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boolean</em>' attribute is set.
	 * @see #unsetBoolean()
	 * @see #isBoolean()
	 * @see #setBoolean(boolean)
	 * @generated
	 */
	boolean isSetBoolean();

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nil Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getBooleanPropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.BooleanPropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // BooleanPropertyType
