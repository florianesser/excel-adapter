/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indirect Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.IndirectEntryType#getDefinitionProxy <em>Definition Proxy</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getIndirectEntryType()
 * @model extendedMetaData="name='IndirectEntryType' kind='elementOnly'"
 * @generated
 */
public interface IndirectEntryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition Proxy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Proxy</em>' containment reference.
	 * @see #setDefinitionProxy(DefinitionProxyType)
	 * @see net.opengis.gml32.GMLPackage#getIndirectEntryType_DefinitionProxy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DefinitionProxy' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinitionProxyType getDefinitionProxy();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.IndirectEntryType#getDefinitionProxy <em>Definition Proxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Proxy</em>' containment reference.
	 * @see #getDefinitionProxy()
	 * @generated
	 */
	void setDefinitionProxy(DefinitionProxyType value);

} // IndirectEntryType
