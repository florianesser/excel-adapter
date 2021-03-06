/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.CharacterStringPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LI Lineage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.LILineageType#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.LILineageType#getProcessStep <em>Process Step</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.LILineageType#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getLILineageType()
 * @model extendedMetaData="name='LI_Lineage_Type' kind='elementOnly'"
 * @generated
 */
public interface LILineageType extends AbstractObjectType
{
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(CharacterStringPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getLILineageType_Statement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statement' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getStatement();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.LILineageType#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Process Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.LIProcessStepPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Step</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getLILineageType_ProcessStep()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processStep' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LIProcessStepPropertyType> getProcessStep();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.LISourcePropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getLILineageType_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LISourcePropertyType> getSource();

} // LILineageType
