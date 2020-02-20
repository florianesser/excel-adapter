/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.CharacterStringPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Keywords Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Keywords, their type and reference source
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDKeywordsType#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDKeywordsType#getType <em>Type</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDKeywordsType#getThesaurusName <em>Thesaurus Name</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDKeywordsType()
 * @model extendedMetaData="name='MD_Keywords_Type' kind='elementOnly'"
 * @generated
 */
public interface MDKeywordsType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDKeywordsType_Keyword()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='keyword' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getKeyword();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(MDKeywordTypeCodePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDKeywordsType_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	MDKeywordTypeCodePropertyType getType();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDKeywordsType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MDKeywordTypeCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Thesaurus Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thesaurus Name</em>' containment reference.
	 * @see #setThesaurusName(CICitationPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDKeywordsType_ThesaurusName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thesaurusName' namespace='##targetNamespace'"
	 * @generated
	 */
	CICitationPropertyType getThesaurusName();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDKeywordsType#getThesaurusName <em>Thesaurus Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thesaurus Name</em>' containment reference.
	 * @see #getThesaurusName()
	 * @generated
	 */
	void setThesaurusName(CICitationPropertyType value);

} // MDKeywordsType
