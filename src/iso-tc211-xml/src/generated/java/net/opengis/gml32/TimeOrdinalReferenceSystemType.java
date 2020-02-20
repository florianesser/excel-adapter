/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Ordinal Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TimeOrdinalReferenceSystemType#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTimeOrdinalReferenceSystemType()
 * @model extendedMetaData="name='TimeOrdinalReferenceSystemType' kind='elementOnly'"
 * @generated
 */
public interface TimeOrdinalReferenceSystemType extends TimeReferenceSystemType {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.TimeOrdinalEraPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getTimeOrdinalReferenceSystemType_Component()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeOrdinalEraPropertyType> getComponent();

} // TimeOrdinalReferenceSystemType
