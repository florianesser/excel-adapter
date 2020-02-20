/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.DatePropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CI Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.CIDateType#getDate <em>Date</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.CIDateType#getDateType <em>Date Type</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getCIDateType()
 * @model extendedMetaData="name='CI_Date_Type' kind='elementOnly'"
 * @generated
 */
public interface CIDateType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DatePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getCIDateType_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DatePropertyType getDate();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.CIDateType#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DatePropertyType value);

	/**
	 * Returns the value of the '<em><b>Date Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Type</em>' containment reference.
	 * @see #setDateType(CIDateTypeCodePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getCIDateType_DateType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dateType' namespace='##targetNamespace'"
	 * @generated
	 */
	CIDateTypeCodePropertyType getDateType();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.CIDateType#getDateType <em>Date Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Type</em>' containment reference.
	 * @see #getDateType()
	 * @generated
	 */
	void setDateType(CIDateTypeCodePropertyType value);

} // CIDateType
