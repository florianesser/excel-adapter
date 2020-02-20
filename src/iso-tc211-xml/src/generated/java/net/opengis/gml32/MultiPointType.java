/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.MultiPointType#getPointMember <em>Point Member</em>}</li>
 *   <li>{@link net.opengis.gml32.MultiPointType#getPointMembers <em>Point Members</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getMultiPointType()
 * @model extendedMetaData="name='MultiPointType' kind='elementOnly'"
 * @generated
 */
public interface MultiPointType extends AbstractGeometricAggregateType {
	/**
	 * Returns the value of the '<em><b>Point Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.PointPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a Point via the XLink-attributes or contains the Point element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Member</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getMultiPointType_PointMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PointPropertyType> getPointMember();

	/**
	 * Returns the value of the '<em><b>Point Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of points. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Members</em>' containment reference.
	 * @see #setPointMembers(PointArrayPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getMultiPointType_PointMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	PointArrayPropertyType getPointMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.MultiPointType#getPointMembers <em>Point Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Members</em>' containment reference.
	 * @see #getPointMembers()
	 * @generated
	 */
	void setPointMembers(PointArrayPropertyType value);

} // MultiPointType
