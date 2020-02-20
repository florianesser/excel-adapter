/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Topology Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TimeTopologyComplexType#getPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTimeTopologyComplexType()
 * @model abstract="true"
 *        extendedMetaData="name='TimeTopologyComplexType' kind='elementOnly'"
 * @generated
 */
public interface TimeTopologyComplexType extends AbstractTimeComplexType {
	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.TimeTopologyPrimitivePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getTimeTopologyComplexType_Primitive()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='primitive' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeTopologyPrimitivePropertyType> getPrimitive();

} // TimeTopologyComplexType
