/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Calendar Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TimeCalendarType#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTimeCalendarType()
 * @model extendedMetaData="name='TimeCalendarType' kind='elementOnly'"
 * @generated
 */
public interface TimeCalendarType extends TimeReferenceSystemType {
	/**
	 * Returns the value of the '<em><b>Reference Frame</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.TimeCalendarEraPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Frame</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getTimeCalendarType_ReferenceFrame()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeCalendarEraPropertyType> getReferenceFrame();

} // TimeCalendarType
