/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.RowType#getPosList <em>Pos List</em>}</li>
 *   <li>{@link net.opengis.gml32.RowType#getGeometricPositionGroup <em>Geometric Position Group</em>}</li>
 *   <li>{@link net.opengis.gml32.RowType#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml32.RowType#getPointProperty <em>Point Property</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getRowType()
 * @model extendedMetaData="name='Row_._type' kind='elementOnly'"
 * @generated
 */
public interface RowType extends EObject
{
	/**
	 * Returns the value of the '<em><b>Pos List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos List</em>' containment reference.
	 * @see #setPosList(DirectPositionListType)
	 * @see net.opengis.gml32.GMLPackage#getRowType_PosList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='posList' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionListType getPosList();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.RowType#getPosList <em>Pos List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos List</em>' containment reference.
	 * @see #getPosList()
	 * @generated
	 */
	void setPosList(DirectPositionListType value);

	/**
	 * Returns the value of the '<em><b>Geometric Position Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometric Position Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometric Position Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getRowType_GeometricPositionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='GeometricPositionGroup:1'"
	 * @generated
	 */
	FeatureMap getGeometricPositionGroup();

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.DirectPositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getRowType_Pos()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pos' namespace='##targetNamespace' group='#GeometricPositionGroup:1'"
	 * @generated
	 */
	EList<DirectPositionType> getPos();

	/**
	 * Returns the value of the '<em><b>Point Property</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.PointPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a point via the XLink-attributes or contains the point element. pointProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for Point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Property</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getRowType_PointProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pointProperty' namespace='##targetNamespace' group='#GeometricPositionGroup:1'"
	 * @generated
	 */
	EList<PointPropertyType> getPointProperty();

} // RowType
