/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Topic Category Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDTopicCategoryCodePropertyType#getMDTopicCategoryCode <em>MD Topic Category Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDTopicCategoryCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDTopicCategoryCodePropertyType()
 * @model extendedMetaData="name='MD_TopicCategoryCode_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface MDTopicCategoryCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>MD Topic Category Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.isotc211.iso19139.gmd.MDTopicCategoryCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Topic Category Code</em>' attribute.
	 * @see org.isotc211.iso19139.gmd.MDTopicCategoryCodeType
	 * @see #isSetMDTopicCategoryCode()
	 * @see #unsetMDTopicCategoryCode()
	 * @see #setMDTopicCategoryCode(MDTopicCategoryCodeType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDTopicCategoryCodePropertyType_MDTopicCategoryCode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MD_TopicCategoryCode' namespace='##targetNamespace'"
	 * @generated
	 */
	MDTopicCategoryCodeType getMDTopicCategoryCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDTopicCategoryCodePropertyType#getMDTopicCategoryCode <em>MD Topic Category Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Topic Category Code</em>' attribute.
	 * @see org.isotc211.iso19139.gmd.MDTopicCategoryCodeType
	 * @see #isSetMDTopicCategoryCode()
	 * @see #unsetMDTopicCategoryCode()
	 * @see #getMDTopicCategoryCode()
	 * @generated
	 */
	void setMDTopicCategoryCode(MDTopicCategoryCodeType value);

	/**
	 * Unsets the value of the '{@link org.isotc211.iso19139.gmd.MDTopicCategoryCodePropertyType#getMDTopicCategoryCode <em>MD Topic Category Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMDTopicCategoryCode()
	 * @see #getMDTopicCategoryCode()
	 * @see #setMDTopicCategoryCode(MDTopicCategoryCodeType)
	 * @generated
	 */
	void unsetMDTopicCategoryCode();

	/**
	 * Returns whether the value of the '{@link org.isotc211.iso19139.gmd.MDTopicCategoryCodePropertyType#getMDTopicCategoryCode <em>MD Topic Category Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MD Topic Category Code</em>' attribute is set.
	 * @see #unsetMDTopicCategoryCode()
	 * @see #getMDTopicCategoryCode()
	 * @see #setMDTopicCategoryCode(MDTopicCategoryCodeType)
	 * @generated
	 */
	boolean isSetMDTopicCategoryCode();

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDTopicCategoryCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDTopicCategoryCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDTopicCategoryCodePropertyType
