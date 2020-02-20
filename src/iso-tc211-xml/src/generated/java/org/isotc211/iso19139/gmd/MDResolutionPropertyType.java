/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Resolution Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDResolutionPropertyType#getMDResolution <em>MD Resolution</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDResolutionPropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDResolutionPropertyType()
 * @model extendedMetaData="name='MD_Resolution_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface MDResolutionPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>MD Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Resolution</em>' containment reference.
	 * @see #setMDResolution(MDResolutionType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDResolutionPropertyType_MDResolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MD_Resolution' namespace='##targetNamespace'"
	 * @generated
	 */
	MDResolutionType getMDResolution();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDResolutionPropertyType#getMDResolution <em>MD Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Resolution</em>' containment reference.
	 * @see #getMDResolution()
	 * @generated
	 */
	void setMDResolution(MDResolutionType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDResolutionPropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDResolutionPropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDResolutionPropertyType
