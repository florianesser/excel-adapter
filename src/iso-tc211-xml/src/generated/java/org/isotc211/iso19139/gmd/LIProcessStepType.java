/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.CharacterStringPropertyType;
import org.isotc211.iso19139.gco.DateTimePropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LI Process Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.LIProcessStepType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.LIProcessStepType#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.LIProcessStepType#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.LIProcessStepType#getProcessor <em>Processor</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.LIProcessStepType#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getLIProcessStepType()
 * @model extendedMetaData="name='LI_ProcessStep_Type' kind='elementOnly'"
 * @generated
 */
public interface LIProcessStepType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(CharacterStringPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getLIProcessStepType_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getDescription();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.LIProcessStepType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' containment reference.
	 * @see #setRationale(CharacterStringPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getLIProcessStepType_Rationale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rationale' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getRationale();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.LIProcessStepType#getRationale <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' containment reference.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTimePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getLIProcessStepType_DateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimePropertyType getDateTime();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.LIProcessStepType#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTimePropertyType value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.CIResponsiblePartyPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getLIProcessStepType_Processor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CIResponsiblePartyPropertyType> getProcessor();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.LISourcePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getLIProcessStepType_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LISourcePropertyType> getSource();

} // LIProcessStepType
