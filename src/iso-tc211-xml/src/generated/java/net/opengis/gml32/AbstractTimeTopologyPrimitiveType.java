/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Time Topology Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AbstractTimeTopologyPrimitiveType#getComplex <em>Complex</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAbstractTimeTopologyPrimitiveType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractTimeTopologyPrimitiveType' kind='elementOnly'"
 * @generated
 */
public interface AbstractTimeTopologyPrimitiveType extends AbstractTimePrimitiveType {
	/**
	 * Returns the value of the '<em><b>Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex</em>' containment reference.
	 * @see #setComplex(ReferenceType)
	 * @see net.opengis.gml32.GMLPackage#getAbstractTimeTopologyPrimitiveType_Complex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complex' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getComplex();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractTimeTopologyPrimitiveType#getComplex <em>Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex</em>' containment reference.
	 * @see #getComplex()
	 * @generated
	 */
	void setComplex(ReferenceType value);

} // AbstractTimeTopologyPrimitiveType
