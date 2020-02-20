/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

import org.isotc211.iso19139.gco.CodeListValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Cell Geometry Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDCellGeometryCodePropertyType#getMDCellGeometryCode <em>MD Cell Geometry Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDCellGeometryCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDCellGeometryCodePropertyType()
 * @model extendedMetaData="name='MD_CellGeometryCode_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface MDCellGeometryCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>MD Cell Geometry Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Cell Geometry Code</em>' containment reference.
	 * @see #setMDCellGeometryCode(CodeListValueType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDCellGeometryCodePropertyType_MDCellGeometryCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MD_CellGeometryCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeListValueType getMDCellGeometryCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDCellGeometryCodePropertyType#getMDCellGeometryCode <em>MD Cell Geometry Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Cell Geometry Code</em>' containment reference.
	 * @see #getMDCellGeometryCode()
	 * @generated
	 */
	void setMDCellGeometryCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDCellGeometryCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDCellGeometryCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDCellGeometryCodePropertyType
