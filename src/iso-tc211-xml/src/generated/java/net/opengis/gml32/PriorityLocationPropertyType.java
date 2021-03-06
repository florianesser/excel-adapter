/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Priority Location Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.PriorityLocationPropertyType#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getPriorityLocationPropertyType()
 * @model extendedMetaData="name='PriorityLocationPropertyType' kind='elementOnly'"
 * @generated
 */
public interface PriorityLocationPropertyType extends LocationPropertyType
{
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see net.opengis.gml32.GMLPackage#getPriorityLocationPropertyType_Priority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='priority'"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.PriorityLocationPropertyType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

} // PriorityLocationPropertyType
