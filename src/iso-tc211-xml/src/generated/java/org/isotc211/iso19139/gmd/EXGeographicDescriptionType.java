/**
 */
package org.isotc211.iso19139.gmd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EX Geographic Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.EXGeographicDescriptionType#getGeographicIdentifier <em>Geographic Identifier</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getEXGeographicDescriptionType()
 * @model extendedMetaData="name='EX_GeographicDescription_Type' kind='elementOnly'"
 * @generated
 */
public interface EXGeographicDescriptionType extends AbstractEXGeographicExtentType {
	/**
	 * Returns the value of the '<em><b>Geographic Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographic Identifier</em>' containment reference.
	 * @see #setGeographicIdentifier(MDIdentifierPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getEXGeographicDescriptionType_GeographicIdentifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geographicIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	MDIdentifierPropertyType getGeographicIdentifier();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.EXGeographicDescriptionType#getGeographicIdentifier <em>Geographic Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographic Identifier</em>' containment reference.
	 * @see #getGeographicIdentifier()
	 * @generated
	 */
	void setGeographicIdentifier(MDIdentifierPropertyType value);

} // EXGeographicDescriptionType
