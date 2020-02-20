/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

import org.isotc211.iso19139.gco.CodeListValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Restriction Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDRestrictionCodePropertyType#getMDRestrictionCode <em>MD Restriction Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDRestrictionCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDRestrictionCodePropertyType()
 * @model extendedMetaData="name='MD_RestrictionCode_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface MDRestrictionCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>MD Restriction Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Restriction Code</em>' containment reference.
	 * @see #setMDRestrictionCode(CodeListValueType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDRestrictionCodePropertyType_MDRestrictionCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MD_RestrictionCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeListValueType getMDRestrictionCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDRestrictionCodePropertyType#getMDRestrictionCode <em>MD Restriction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Restriction Code</em>' containment reference.
	 * @see #getMDRestrictionCode()
	 * @generated
	 */
	void setMDRestrictionCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDRestrictionCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDRestrictionCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDRestrictionCodePropertyType
