/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Proxy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DefinitionProxyType#getDefinitionRef <em>Definition Ref</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDefinitionProxyType()
 * @model extendedMetaData="name='DefinitionProxyType' kind='elementOnly'"
 * @generated
 */
public interface DefinitionProxyType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Definition Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Ref</em>' containment reference.
	 * @see #setDefinitionRef(ReferenceType)
	 * @see net.opengis.gml32.GMLPackage#getDefinitionProxyType_DefinitionRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='definitionRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getDefinitionRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DefinitionProxyType#getDefinitionRef <em>Definition Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Ref</em>' containment reference.
	 * @see #getDefinitionRef()
	 * @generated
	 */
	void setDefinitionRef(ReferenceType value);

} // DefinitionProxyType
