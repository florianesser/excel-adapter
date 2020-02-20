/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.CharacterStringPropertyType;
import org.isotc211.iso19139.gco.RealPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Digital Transfer Options Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Technical means and media by which a dataset is obtained from the distributor
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDDigitalTransferOptionsType#getUnitsOfDistribution <em>Units Of Distribution</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDDigitalTransferOptionsType#getTransferSize <em>Transfer Size</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDDigitalTransferOptionsType#getOnLine <em>On Line</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDDigitalTransferOptionsType#getOffLine <em>Off Line</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDigitalTransferOptionsType()
 * @model extendedMetaData="name='MD_DigitalTransferOptions_Type' kind='elementOnly'"
 * @generated
 */
public interface MDDigitalTransferOptionsType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Units Of Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units Of Distribution</em>' containment reference.
	 * @see #setUnitsOfDistribution(CharacterStringPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDigitalTransferOptionsType_UnitsOfDistribution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitsOfDistribution' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getUnitsOfDistribution();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDDigitalTransferOptionsType#getUnitsOfDistribution <em>Units Of Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Of Distribution</em>' containment reference.
	 * @see #getUnitsOfDistribution()
	 * @generated
	 */
	void setUnitsOfDistribution(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Transfer Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Size</em>' containment reference.
	 * @see #setTransferSize(RealPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDigitalTransferOptionsType_TransferSize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transferSize' namespace='##targetNamespace'"
	 * @generated
	 */
	RealPropertyType getTransferSize();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDDigitalTransferOptionsType#getTransferSize <em>Transfer Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Size</em>' containment reference.
	 * @see #getTransferSize()
	 * @generated
	 */
	void setTransferSize(RealPropertyType value);

	/**
	 * Returns the value of the '<em><b>On Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.CIOnlineResourcePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Line</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDigitalTransferOptionsType_OnLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CIOnlineResourcePropertyType> getOnLine();

	/**
	 * Returns the value of the '<em><b>Off Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Off Line</em>' containment reference.
	 * @see #setOffLine(MDMediumPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDigitalTransferOptionsType_OffLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offLine' namespace='##targetNamespace'"
	 * @generated
	 */
	MDMediumPropertyType getOffLine();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDDigitalTransferOptionsType#getOffLine <em>Off Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Off Line</em>' containment reference.
	 * @see #getOffLine()
	 * @generated
	 */
	void setOffLine(MDMediumPropertyType value);

} // MDDigitalTransferOptionsType
