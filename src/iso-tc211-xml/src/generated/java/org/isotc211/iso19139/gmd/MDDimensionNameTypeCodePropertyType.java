/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

import org.isotc211.iso19139.gco.CodeListValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Dimension Name Type Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDDimensionNameTypeCodePropertyType#getMDDimensionNameTypeCode <em>MD Dimension Name Type Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDDimensionNameTypeCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDimensionNameTypeCodePropertyType()
 * @model extendedMetaData="name='MD_DimensionNameTypeCode_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface MDDimensionNameTypeCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>MD Dimension Name Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Dimension Name Type Code</em>' containment reference.
	 * @see #setMDDimensionNameTypeCode(CodeListValueType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDimensionNameTypeCodePropertyType_MDDimensionNameTypeCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MD_DimensionNameTypeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeListValueType getMDDimensionNameTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDDimensionNameTypeCodePropertyType#getMDDimensionNameTypeCode <em>MD Dimension Name Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Dimension Name Type Code</em>' containment reference.
	 * @see #getMDDimensionNameTypeCode()
	 * @generated
	 */
	void setMDDimensionNameTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDimensionNameTypeCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDDimensionNameTypeCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDDimensionNameTypeCodePropertyType
