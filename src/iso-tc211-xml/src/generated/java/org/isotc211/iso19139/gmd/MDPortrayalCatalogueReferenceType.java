/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.AbstractObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Portrayal Catalogue Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information identifing the portrayal catalogue used
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDPortrayalCatalogueReferenceType#getPortrayalCatalogueCitation <em>Portrayal Catalogue Citation</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDPortrayalCatalogueReferenceType()
 * @model extendedMetaData="name='MD_PortrayalCatalogueReference_Type' kind='elementOnly'"
 * @generated
 */
public interface MDPortrayalCatalogueReferenceType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Portrayal Catalogue Citation</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.CICitationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrayal Catalogue Citation</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDPortrayalCatalogueReferenceType_PortrayalCatalogueCitation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='portrayalCatalogueCitation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CICitationPropertyType> getPortrayalCatalogueCitation();

} // MDPortrayalCatalogueReferenceType
