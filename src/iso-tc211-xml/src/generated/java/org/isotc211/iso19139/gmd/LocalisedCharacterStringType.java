/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localised Character String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.LocalisedCharacterStringType#getValue <em>Value</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.LocalisedCharacterStringType#getId <em>Id</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.LocalisedCharacterStringType#getLocale <em>Locale</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getLocalisedCharacterStringType()
 * @model extendedMetaData="name='LocalisedCharacterString_Type' kind='simple'"
 * @generated
 */
public interface LocalisedCharacterStringType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getLocalisedCharacterStringType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.LocalisedCharacterStringType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getLocalisedCharacterStringType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.LocalisedCharacterStringType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #setLocale(String)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getLocalisedCharacterStringType_Locale()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='locale'"
	 * @generated
	 */
	String getLocale();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.LocalisedCharacterStringType#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(String value);

} // LocalisedCharacterStringType
