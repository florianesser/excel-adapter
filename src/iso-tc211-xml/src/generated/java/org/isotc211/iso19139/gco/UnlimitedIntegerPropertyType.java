/**
 */
package org.isotc211.iso19139.gco;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlimited Integer Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.UnlimitedIntegerPropertyType#getUnlimitedInteger <em>Unlimited Integer</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.UnlimitedIntegerPropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getUnlimitedIntegerPropertyType()
 * @model extendedMetaData="name='UnlimitedInteger_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface UnlimitedIntegerPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Unlimited Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlimited Integer</em>' containment reference.
	 * @see #isSetUnlimitedInteger()
	 * @see #unsetUnlimitedInteger()
	 * @see #setUnlimitedInteger(UnlimitedIntegerType)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getUnlimitedIntegerPropertyType_UnlimitedInteger()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='UnlimitedInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	UnlimitedIntegerType getUnlimitedInteger();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.UnlimitedIntegerPropertyType#getUnlimitedInteger <em>Unlimited Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unlimited Integer</em>' containment reference.
	 * @see #isSetUnlimitedInteger()
	 * @see #unsetUnlimitedInteger()
	 * @see #getUnlimitedInteger()
	 * @generated
	 */
	void setUnlimitedInteger(UnlimitedIntegerType value);

	/**
	 * Unsets the value of the '{@link org.isotc211.iso19139.gco.UnlimitedIntegerPropertyType#getUnlimitedInteger <em>Unlimited Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnlimitedInteger()
	 * @see #getUnlimitedInteger()
	 * @see #setUnlimitedInteger(UnlimitedIntegerType)
	 * @generated
	 */
	void unsetUnlimitedInteger();

	/**
	 * Returns whether the value of the '{@link org.isotc211.iso19139.gco.UnlimitedIntegerPropertyType#getUnlimitedInteger <em>Unlimited Integer</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unlimited Integer</em>' containment reference is set.
	 * @see #unsetUnlimitedInteger()
	 * @see #getUnlimitedInteger()
	 * @see #setUnlimitedInteger(UnlimitedIntegerType)
	 * @generated
	 */
	boolean isSetUnlimitedInteger();

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getUnlimitedIntegerPropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.UnlimitedIntegerPropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // UnlimitedIntegerPropertyType
