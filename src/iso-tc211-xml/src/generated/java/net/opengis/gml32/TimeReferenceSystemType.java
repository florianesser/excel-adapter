/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TimeReferenceSystemType#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTimeReferenceSystemType()
 * @model extendedMetaData="name='TimeReferenceSystemType' kind='elementOnly'"
 * @generated
 */
public interface TimeReferenceSystemType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Domain Of Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Of Validity</em>' attribute.
	 * @see #setDomainOfValidity(String)
	 * @see net.opengis.gml32.GMLPackage#getTimeReferenceSystemType_DomainOfValidity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='domainOfValidity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDomainOfValidity();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimeReferenceSystemType#getDomainOfValidity <em>Domain Of Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Of Validity</em>' attribute.
	 * @see #getDomainOfValidity()
	 * @generated
	 */
	void setDomainOfValidity(String value);

} // TimeReferenceSystemType
