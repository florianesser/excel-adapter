/**
 */
package org.isotc211.iso19139.gco;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character String Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.CharacterStringPropertyType#getCharacterStringGroup <em>Character String Group</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.CharacterStringPropertyType#getCharacterString <em>Character String</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.CharacterStringPropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getCharacterStringPropertyType()
 * @model extendedMetaData="name='CharacterString_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface CharacterStringPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Character String Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character String Group</em>' attribute list.
	 * @see org.isotc211.iso19139.gco.GCOPackage#getCharacterStringPropertyType_CharacterStringGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='CharacterString:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCharacterStringGroup();

	/**
	 * Returns the value of the '<em><b>Character String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character String</em>' attribute.
	 * @see #setCharacterString(String)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getCharacterStringPropertyType_CharacterString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CharacterString' namespace='##targetNamespace' group='CharacterString:group'"
	 * @generated
	 */
	String getCharacterString();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.CharacterStringPropertyType#getCharacterString <em>Character String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character String</em>' attribute.
	 * @see #getCharacterString()
	 * @generated
	 */
	void setCharacterString(String value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getCharacterStringPropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.CharacterStringPropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // CharacterStringPropertyType
