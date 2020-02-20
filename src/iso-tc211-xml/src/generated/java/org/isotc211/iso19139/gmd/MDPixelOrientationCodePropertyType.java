/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Pixel Orientation Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDPixelOrientationCodePropertyType#getMDPixelOrientationCode <em>MD Pixel Orientation Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDPixelOrientationCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDPixelOrientationCodePropertyType()
 * @model extendedMetaData="name='MD_PixelOrientationCode_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface MDPixelOrientationCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>MD Pixel Orientation Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.isotc211.iso19139.gmd.MDPixelOrientationCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Pixel Orientation Code</em>' attribute.
	 * @see org.isotc211.iso19139.gmd.MDPixelOrientationCodeType
	 * @see #isSetMDPixelOrientationCode()
	 * @see #unsetMDPixelOrientationCode()
	 * @see #setMDPixelOrientationCode(MDPixelOrientationCodeType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDPixelOrientationCodePropertyType_MDPixelOrientationCode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MD_PixelOrientationCode' namespace='##targetNamespace'"
	 * @generated
	 */
	MDPixelOrientationCodeType getMDPixelOrientationCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDPixelOrientationCodePropertyType#getMDPixelOrientationCode <em>MD Pixel Orientation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Pixel Orientation Code</em>' attribute.
	 * @see org.isotc211.iso19139.gmd.MDPixelOrientationCodeType
	 * @see #isSetMDPixelOrientationCode()
	 * @see #unsetMDPixelOrientationCode()
	 * @see #getMDPixelOrientationCode()
	 * @generated
	 */
	void setMDPixelOrientationCode(MDPixelOrientationCodeType value);

	/**
	 * Unsets the value of the '{@link org.isotc211.iso19139.gmd.MDPixelOrientationCodePropertyType#getMDPixelOrientationCode <em>MD Pixel Orientation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMDPixelOrientationCode()
	 * @see #getMDPixelOrientationCode()
	 * @see #setMDPixelOrientationCode(MDPixelOrientationCodeType)
	 * @generated
	 */
	void unsetMDPixelOrientationCode();

	/**
	 * Returns whether the value of the '{@link org.isotc211.iso19139.gmd.MDPixelOrientationCodePropertyType#getMDPixelOrientationCode <em>MD Pixel Orientation Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MD Pixel Orientation Code</em>' attribute is set.
	 * @see #unsetMDPixelOrientationCode()
	 * @see #getMDPixelOrientationCode()
	 * @see #setMDPixelOrientationCode(MDPixelOrientationCodeType)
	 * @generated
	 */
	boolean isSetMDPixelOrientationCode();

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDPixelOrientationCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDPixelOrientationCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDPixelOrientationCodePropertyType
