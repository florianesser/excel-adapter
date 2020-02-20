/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.AbstractObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract RS Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Description of the spatial and temporal reference systems used in the dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.AbstractRSReferenceSystemType#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.AbstractRSReferenceSystemType#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getAbstractRSReferenceSystemType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractRS_ReferenceSystem_Type' kind='elementOnly'"
 * @generated
 */
public interface AbstractRSReferenceSystemType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(RSIdentifierPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getAbstractRSReferenceSystemType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	RSIdentifierPropertyType getName();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.AbstractRSReferenceSystemType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(RSIdentifierPropertyType value);

	/**
	 * Returns the value of the '<em><b>Domain Of Validity</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.EXExtentPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Of Validity</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getAbstractRSReferenceSystemType_DomainOfValidity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainOfValidity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EXExtentPropertyType> getDomainOfValidity();

} // AbstractRSReferenceSystemType
