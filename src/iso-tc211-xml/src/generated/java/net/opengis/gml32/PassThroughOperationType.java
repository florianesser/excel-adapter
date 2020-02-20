/**
 */
package net.opengis.gml32;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pass Through Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.PassThroughOperationType#getModifiedCoordinate <em>Modified Coordinate</em>}</li>
 *   <li>{@link net.opengis.gml32.PassThroughOperationType#getCoordOperationGroup <em>Coord Operation Group</em>}</li>
 *   <li>{@link net.opengis.gml32.PassThroughOperationType#getCoordOperation <em>Coord Operation</em>}</li>
 *   <li>{@link net.opengis.gml32.PassThroughOperationType#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getPassThroughOperationType()
 * @model extendedMetaData="name='PassThroughOperationType' kind='elementOnly'"
 * @generated
 */
public interface PassThroughOperationType extends AbstractCoordinateOperationType {
	/**
	 * Returns the value of the '<em><b>Modified Coordinate</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:modifiedCoordinate is a positive integer defining a position in a coordinate tuple.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modified Coordinate</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getPassThroughOperationType_ModifiedCoordinate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='element' name='modifiedCoordinate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getModifiedCoordinate();

	/**
	 * Returns the value of the '<em><b>Coord Operation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:coordOperation is an association role to a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coord Operation Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getPassThroughOperationType_CoordOperationGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='coordOperation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCoordOperationGroup();

	/**
	 * Returns the value of the '<em><b>Coord Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:coordOperation is an association role to a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coord Operation</em>' containment reference.
	 * @see #setCoordOperation(CoordinateOperationPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getPassThroughOperationType_CoordOperation()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordOperation' namespace='##targetNamespace' group='coordOperation:group'"
	 * @generated
	 */
	CoordinateOperationPropertyType getCoordOperation();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.PassThroughOperationType#getCoordOperation <em>Coord Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord Operation</em>' containment reference.
	 * @see #getCoordOperation()
	 * @generated
	 */
	void setCoordOperation(CoordinateOperationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Aggregation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml32.AggregationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml32.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @see net.opengis.gml32.GMLPackage#getPassThroughOperationType_AggregationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregationType'"
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.PassThroughOperationType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml32.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @generated
	 */
	void setAggregationType(AggregationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.PassThroughOperationType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	void unsetAggregationType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.PassThroughOperationType#getAggregationType <em>Aggregation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Type</em>' attribute is set.
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	boolean isSetAggregationType();

} // PassThroughOperationType
