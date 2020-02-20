/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.RecordTypePropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Coverage Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about the domain of the raster cell
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDCoverageDescriptionType#getAttributeDescription <em>Attribute Description</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDCoverageDescriptionType#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDCoverageDescriptionType#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDCoverageDescriptionType()
 * @model extendedMetaData="name='MD_CoverageDescription_Type' kind='elementOnly'"
 * @generated
 */
public interface MDCoverageDescriptionType extends AbstractMDContentInformationType {
	/**
	 * Returns the value of the '<em><b>Attribute Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Description</em>' containment reference.
	 * @see #setAttributeDescription(RecordTypePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDCoverageDescriptionType_AttributeDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='attributeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	RecordTypePropertyType getAttributeDescription();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDCoverageDescriptionType#getAttributeDescription <em>Attribute Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Description</em>' containment reference.
	 * @see #getAttributeDescription()
	 * @generated
	 */
	void setAttributeDescription(RecordTypePropertyType value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(MDCoverageContentTypeCodePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDCoverageDescriptionType_ContentType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
	 * @generated
	 */
	MDCoverageContentTypeCodePropertyType getContentType();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDCoverageDescriptionType#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(MDCoverageContentTypeCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.MDRangeDimensionPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDCoverageDescriptionType_Dimension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dimension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDRangeDimensionPropertyType> getDimension();

} // MDCoverageDescriptionType
