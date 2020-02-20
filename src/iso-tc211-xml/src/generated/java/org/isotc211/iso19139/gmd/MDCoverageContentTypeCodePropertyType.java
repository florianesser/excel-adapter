/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

import org.isotc211.iso19139.gco.CodeListValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Coverage Content Type Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDCoverageContentTypeCodePropertyType#getMDCoverageContentTypeCode <em>MD Coverage Content Type Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDCoverageContentTypeCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDCoverageContentTypeCodePropertyType()
 * @model extendedMetaData="name='MD_CoverageContentTypeCode_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface MDCoverageContentTypeCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>MD Coverage Content Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Coverage Content Type Code</em>' containment reference.
	 * @see #setMDCoverageContentTypeCode(CodeListValueType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDCoverageContentTypeCodePropertyType_MDCoverageContentTypeCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MD_CoverageContentTypeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeListValueType getMDCoverageContentTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDCoverageContentTypeCodePropertyType#getMDCoverageContentTypeCode <em>MD Coverage Content Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Coverage Content Type Code</em>' containment reference.
	 * @see #getMDCoverageContentTypeCode()
	 * @generated
	 */
	void setMDCoverageContentTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDCoverageContentTypeCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDCoverageContentTypeCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDCoverageContentTypeCodePropertyType
