/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.AbstractObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Metadata Extension Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information describing metadata extensions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDMetadataExtensionInformationType#getExtensionOnLineResource <em>Extension On Line Resource</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDMetadataExtensionInformationType#getExtendedElementInformation <em>Extended Element Information</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDMetadataExtensionInformationType()
 * @model extendedMetaData="name='MD_MetadataExtensionInformation_Type' kind='elementOnly'"
 * @generated
 */
public interface MDMetadataExtensionInformationType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Extension On Line Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension On Line Resource</em>' containment reference.
	 * @see #setExtensionOnLineResource(CIOnlineResourcePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDMetadataExtensionInformationType_ExtensionOnLineResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extensionOnLineResource' namespace='##targetNamespace'"
	 * @generated
	 */
	CIOnlineResourcePropertyType getExtensionOnLineResource();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDMetadataExtensionInformationType#getExtensionOnLineResource <em>Extension On Line Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension On Line Resource</em>' containment reference.
	 * @see #getExtensionOnLineResource()
	 * @generated
	 */
	void setExtensionOnLineResource(CIOnlineResourcePropertyType value);

	/**
	 * Returns the value of the '<em><b>Extended Element Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.MDExtendedElementInformationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Element Information</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDMetadataExtensionInformationType_ExtendedElementInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extendedElementInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDExtendedElementInformationPropertyType> getExtendedElementInformation();

} // MDMetadataExtensionInformationType
