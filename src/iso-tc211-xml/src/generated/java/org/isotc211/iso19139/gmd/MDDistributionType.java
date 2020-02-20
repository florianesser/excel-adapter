/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.AbstractObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about the distributor of and options for obtaining the dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDDistributionType#getDistributionFormat <em>Distribution Format</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDDistributionType#getDistributor <em>Distributor</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDDistributionType#getTransferOptions <em>Transfer Options</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDistributionType()
 * @model extendedMetaData="name='MD_Distribution_Type' kind='elementOnly'"
 * @generated
 */
public interface MDDistributionType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Distribution Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.MDFormatPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Format</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDistributionType_DistributionFormat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distributionFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDFormatPropertyType> getDistributionFormat();

	/**
	 * Returns the value of the '<em><b>Distributor</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.MDDistributorPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distributor</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDistributionType_Distributor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distributor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDDistributorPropertyType> getDistributor();

	/**
	 * Returns the value of the '<em><b>Transfer Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.MDDigitalTransferOptionsPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Options</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDistributionType_TransferOptions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transferOptions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDDigitalTransferOptionsPropertyType> getTransferOptions();

} // MDDistributionType
