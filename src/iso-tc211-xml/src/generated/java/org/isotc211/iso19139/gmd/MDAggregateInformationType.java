/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.AbstractObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Aggregate Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Encapsulates the dataset aggregation information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDAggregateInformationType#getAggregateDataSetName <em>Aggregate Data Set Name</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDAggregateInformationType#getAggregateDataSetIdentifier <em>Aggregate Data Set Identifier</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDAggregateInformationType#getAssociationType <em>Association Type</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDAggregateInformationType#getInitiativeType <em>Initiative Type</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDAggregateInformationType()
 * @model extendedMetaData="name='MD_AggregateInformation_Type' kind='elementOnly'"
 * @generated
 */
public interface MDAggregateInformationType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Aggregate Data Set Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Data Set Name</em>' containment reference.
	 * @see #setAggregateDataSetName(CICitationPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDAggregateInformationType_AggregateDataSetName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aggregateDataSetName' namespace='##targetNamespace'"
	 * @generated
	 */
	CICitationPropertyType getAggregateDataSetName();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDAggregateInformationType#getAggregateDataSetName <em>Aggregate Data Set Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Data Set Name</em>' containment reference.
	 * @see #getAggregateDataSetName()
	 * @generated
	 */
	void setAggregateDataSetName(CICitationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Aggregate Data Set Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Data Set Identifier</em>' containment reference.
	 * @see #setAggregateDataSetIdentifier(MDIdentifierPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDAggregateInformationType_AggregateDataSetIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aggregateDataSetIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	MDIdentifierPropertyType getAggregateDataSetIdentifier();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDAggregateInformationType#getAggregateDataSetIdentifier <em>Aggregate Data Set Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Data Set Identifier</em>' containment reference.
	 * @see #getAggregateDataSetIdentifier()
	 * @generated
	 */
	void setAggregateDataSetIdentifier(MDIdentifierPropertyType value);

	/**
	 * Returns the value of the '<em><b>Association Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Type</em>' containment reference.
	 * @see #setAssociationType(DSAssociationTypeCodePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDAggregateInformationType_AssociationType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='associationType' namespace='##targetNamespace'"
	 * @generated
	 */
	DSAssociationTypeCodePropertyType getAssociationType();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDAggregateInformationType#getAssociationType <em>Association Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Type</em>' containment reference.
	 * @see #getAssociationType()
	 * @generated
	 */
	void setAssociationType(DSAssociationTypeCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Initiative Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiative Type</em>' containment reference.
	 * @see #setInitiativeType(DSInitiativeTypeCodePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDAggregateInformationType_InitiativeType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initiativeType' namespace='##targetNamespace'"
	 * @generated
	 */
	DSInitiativeTypeCodePropertyType getInitiativeType();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDAggregateInformationType#getInitiativeType <em>Initiative Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiative Type</em>' containment reference.
	 * @see #getInitiativeType()
	 * @generated
	 */
	void setInitiativeType(DSInitiativeTypeCodePropertyType value);

} // MDAggregateInformationType
