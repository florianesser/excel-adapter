/**
 */
package org.isotc211.iso19139.gco;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TypeName is a LocalName that references either a recordType or object type in some form of schema. The stored value "aName" is the returned value for the "aName()" operation. This is the types name.  - For parsing from types (or objects) the parsible name normally uses a "." navigation separator, so that it is of the form  [class].[member].[memberOfMember]. ...)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.TypeNameType#getAName <em>AName</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getTypeNameType()
 * @model extendedMetaData="name='TypeName_Type' kind='elementOnly'"
 * @generated
 */
public interface TypeNameType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>AName</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AName</em>' containment reference.
	 * @see #setAName(CharacterStringPropertyType)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getTypeNameType_AName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aName' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getAName();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.TypeNameType#getAName <em>AName</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AName</em>' containment reference.
	 * @see #getAName()
	 * @generated
	 */
	void setAName(CharacterStringPropertyType value);

} // TypeNameType
