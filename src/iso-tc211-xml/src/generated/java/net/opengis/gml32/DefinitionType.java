/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DefinitionType#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDefinitionType()
 * @model extendedMetaData="name='DefinitionType' kind='elementOnly'"
 * @generated
 */
public interface DefinitionType extends DefinitionBaseType {
	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see net.opengis.gml32.GMLPackage#getDefinitionType_Remarks()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DefinitionType#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

} // DefinitionType
