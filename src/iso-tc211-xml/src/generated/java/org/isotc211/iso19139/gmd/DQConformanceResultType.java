/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.BooleanPropertyType;
import org.isotc211.iso19139.gco.CharacterStringPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DQ Conformance Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * quantitative_result from Quality Procedures -  - renamed to remove implied use limitiation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.DQConformanceResultType#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DQConformanceResultType#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DQConformanceResultType#getPass <em>Pass</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQConformanceResultType()
 * @model extendedMetaData="name='DQ_ConformanceResult_Type' kind='elementOnly'"
 * @generated
 */
public interface DQConformanceResultType extends AbstractDQResultType {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(CICitationPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQConformanceResultType_Specification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='specification' namespace='##targetNamespace'"
	 * @generated
	 */
	CICitationPropertyType getSpecification();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQConformanceResultType#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(CICitationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Explanation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explanation</em>' containment reference.
	 * @see #setExplanation(CharacterStringPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQConformanceResultType_Explanation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='explanation' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getExplanation();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQConformanceResultType#getExplanation <em>Explanation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation</em>' containment reference.
	 * @see #getExplanation()
	 * @generated
	 */
	void setExplanation(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Pass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass</em>' containment reference.
	 * @see #setPass(BooleanPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQConformanceResultType_Pass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pass' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getPass();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQConformanceResultType#getPass <em>Pass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass</em>' containment reference.
	 * @see #getPass()
	 * @generated
	 */
	void setPass(BooleanPropertyType value);

} // DQConformanceResultType
