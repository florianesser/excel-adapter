/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.AbstractObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS Data Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifiable collection of data
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.DSDataSetType#getHas <em>Has</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DSDataSetType#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getDSDataSetType()
 * @model extendedMetaData="name='DS_DataSet_Type' kind='elementOnly'"
 * @generated
 */
public interface DSDataSetType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.MDMetadataPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDSDataSetType_Has()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='has' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDMetadataPropertyType> getHas();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.DSAggregatePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDSDataSetType_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DSAggregatePropertyType> getPartOf();

} // DSDataSetType
