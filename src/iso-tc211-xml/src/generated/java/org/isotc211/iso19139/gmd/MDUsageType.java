/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.CharacterStringPropertyType;
import org.isotc211.iso19139.gco.DateTimePropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Usage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Brief description of ways in which the dataset is currently used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDUsageType#getSpecificUsage <em>Specific Usage</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDUsageType#getUsageDateTime <em>Usage Date Time</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDUsageType#getUserDeterminedLimitations <em>User Determined Limitations</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDUsageType#getUserContactInfo <em>User Contact Info</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDUsageType()
 * @model extendedMetaData="name='MD_Usage_Type' kind='elementOnly'"
 * @generated
 */
public interface MDUsageType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Specific Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Usage</em>' containment reference.
	 * @see #setSpecificUsage(CharacterStringPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDUsageType_SpecificUsage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='specificUsage' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getSpecificUsage();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDUsageType#getSpecificUsage <em>Specific Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Usage</em>' containment reference.
	 * @see #getSpecificUsage()
	 * @generated
	 */
	void setSpecificUsage(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Usage Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Date Time</em>' containment reference.
	 * @see #setUsageDateTime(DateTimePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDUsageType_UsageDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usageDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimePropertyType getUsageDateTime();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDUsageType#getUsageDateTime <em>Usage Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Date Time</em>' containment reference.
	 * @see #getUsageDateTime()
	 * @generated
	 */
	void setUsageDateTime(DateTimePropertyType value);

	/**
	 * Returns the value of the '<em><b>User Determined Limitations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Determined Limitations</em>' containment reference.
	 * @see #setUserDeterminedLimitations(CharacterStringPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDUsageType_UserDeterminedLimitations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='userDeterminedLimitations' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getUserDeterminedLimitations();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDUsageType#getUserDeterminedLimitations <em>User Determined Limitations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Determined Limitations</em>' containment reference.
	 * @see #getUserDeterminedLimitations()
	 * @generated
	 */
	void setUserDeterminedLimitations(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>User Contact Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.CIResponsiblePartyPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Contact Info</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDUsageType_UserContactInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='userContactInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CIResponsiblePartyPropertyType> getUserContactInfo();

} // MDUsageType
