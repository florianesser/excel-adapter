/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Time Geometric Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AbstractTimeGeometricPrimitiveType#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAbstractTimeGeometricPrimitiveType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractTimeGeometricPrimitiveType' kind='elementOnly'"
 * @generated
 */
public interface AbstractTimeGeometricPrimitiveType extends AbstractTimePrimitiveType
{
	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * The default value is <code>"#ISO-8601"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #setFrame(String)
	 * @see net.opengis.gml32.GMLPackage#getAbstractTimeGeometricPrimitiveType_Frame()
	 * @model default="#ISO-8601" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='frame'"
	 * @generated
	 */
	String getFrame();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractTimeGeometricPrimitiveType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(String value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.AbstractTimeGeometricPrimitiveType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrame()
	 * @see #getFrame()
	 * @see #setFrame(String)
	 * @generated
	 */
	void unsetFrame();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.AbstractTimeGeometricPrimitiveType#getFrame <em>Frame</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame</em>' attribute is set.
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @see #setFrame(String)
	 * @generated
	 */
	boolean isSetFrame();

} // AbstractTimeGeometricPrimitiveType
