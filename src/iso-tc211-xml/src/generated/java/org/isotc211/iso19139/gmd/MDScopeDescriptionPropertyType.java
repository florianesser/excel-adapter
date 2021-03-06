/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Scope Description Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDScopeDescriptionPropertyType#getMDScopeDescription <em>MD Scope Description</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDScopeDescriptionPropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDScopeDescriptionPropertyType()
 * @model extendedMetaData="name='MD_ScopeDescription_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface MDScopeDescriptionPropertyType extends EObject
{
	/**
	 * Returns the value of the '<em><b>MD Scope Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MD Scope Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Scope Description</em>' containment reference.
	 * @see #setMDScopeDescription(MDScopeDescriptionType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDScopeDescriptionPropertyType_MDScopeDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MD_ScopeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	MDScopeDescriptionType getMDScopeDescription();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDScopeDescriptionPropertyType#getMDScopeDescription <em>MD Scope Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Scope Description</em>' containment reference.
	 * @see #getMDScopeDescription()
	 * @generated
	 */
	void setMDScopeDescription(MDScopeDescriptionType value);

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
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDScopeDescriptionPropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDScopeDescriptionPropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDScopeDescriptionPropertyType
