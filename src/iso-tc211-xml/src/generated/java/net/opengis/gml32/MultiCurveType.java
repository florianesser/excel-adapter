/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.MultiCurveType#getCurveMember <em>Curve Member</em>}</li>
 *   <li>{@link net.opengis.gml32.MultiCurveType#getCurveMembers <em>Curve Members</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getMultiCurveType()
 * @model extendedMetaData="name='MultiCurveType' kind='elementOnly'"
 * @generated
 */
public interface MultiCurveType extends AbstractGeometricAggregateType {
	/**
	 * Returns the value of the '<em><b>Curve Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.CurvePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Member</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getMultiCurveType_CurveMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='curveMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CurvePropertyType> getCurveMember();

	/**
	 * Returns the value of the '<em><b>Curve Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of curves. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve Members</em>' containment reference.
	 * @see #setCurveMembers(CurveArrayPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getMultiCurveType_CurveMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='curveMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveArrayPropertyType getCurveMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.MultiCurveType#getCurveMembers <em>Curve Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Members</em>' containment reference.
	 * @see #getCurveMembers()
	 * @generated
	 */
	void setCurveMembers(CurveArrayPropertyType value);

} // MultiCurveType
