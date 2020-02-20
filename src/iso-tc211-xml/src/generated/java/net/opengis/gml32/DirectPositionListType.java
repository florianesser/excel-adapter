/**
 */
package net.opengis.gml32;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Position List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * posList instances (and other instances with the content model specified by DirectPositionListType) hold the coordinates for a sequence of direct positions within the same coordinate reference system (CRS).
 * if no srsName attribute is given, the CRS shall be specified as part of the larger context this geometry element is part of, typically a geometric object like a point, curve, etc. 
 * The optional attribute count specifies the number of direct positions in the list. If the attribute count is present then the attribute srsDimension shall be present, too.
 * The number of entries in the list is equal to the product of the dimensionality of the coordinate reference system (i.e. it is a derived value of the coordinate reference system definition) and the number of direct positions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DirectPositionListType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml32.DirectPositionListType#getAxisLabels <em>Axis Labels</em>}</li>
 *   <li>{@link net.opengis.gml32.DirectPositionListType#getCount <em>Count</em>}</li>
 *   <li>{@link net.opengis.gml32.DirectPositionListType#getSrsDimension <em>Srs Dimension</em>}</li>
 *   <li>{@link net.opengis.gml32.DirectPositionListType#getSrsName <em>Srs Name</em>}</li>
 *   <li>{@link net.opengis.gml32.DirectPositionListType#getUomLabels <em>Uom Labels</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDirectPositionListType()
 * @model extendedMetaData="name='DirectPositionListType' kind='simple'"
 * @generated
 */
public interface DirectPositionListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(List)
	 * @see net.opengis.gml32.GMLPackage#getDirectPositionListType_Value()
	 * @model dataType="net.opengis.gml32.DoubleList" many="false"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	List<Double> getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DirectPositionListType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Axis Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Labels</em>' attribute.
	 * @see #setAxisLabels(List)
	 * @see net.opengis.gml32.GMLPackage#getDirectPositionListType_AxisLabels()
	 * @model dataType="net.opengis.gml32.NCNameList" many="false"
	 *        extendedMetaData="kind='attribute' name='axisLabels'"
	 * @generated
	 */
	List<String> getAxisLabels();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DirectPositionListType#getAxisLabels <em>Axis Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Labels</em>' attribute.
	 * @see #getAxisLabels()
	 * @generated
	 */
	void setAxisLabels(List<String> value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getDirectPositionListType_Count()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	BigInteger getCount();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DirectPositionListType#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Srs Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srs Dimension</em>' attribute.
	 * @see #setSrsDimension(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getDirectPositionListType_SrsDimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='srsDimension'"
	 * @generated
	 */
	BigInteger getSrsDimension();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DirectPositionListType#getSrsDimension <em>Srs Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs Dimension</em>' attribute.
	 * @see #getSrsDimension()
	 * @generated
	 */
	void setSrsDimension(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srs Name</em>' attribute.
	 * @see #setSrsName(String)
	 * @see net.opengis.gml32.GMLPackage#getDirectPositionListType_SrsName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='srsName'"
	 * @generated
	 */
	String getSrsName();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DirectPositionListType#getSrsName <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs Name</em>' attribute.
	 * @see #getSrsName()
	 * @generated
	 */
	void setSrsName(String value);

	/**
	 * Returns the value of the '<em><b>Uom Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Labels</em>' attribute.
	 * @see #setUomLabels(List)
	 * @see net.opengis.gml32.GMLPackage#getDirectPositionListType_UomLabels()
	 * @model dataType="net.opengis.gml32.NCNameList" many="false"
	 *        extendedMetaData="kind='attribute' name='uomLabels'"
	 * @generated
	 */
	List<String> getUomLabels();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DirectPositionListType#getUomLabels <em>Uom Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Labels</em>' attribute.
	 * @see #getUomLabels()
	 * @generated
	 */
	void setUomLabels(List<String> value);

} // DirectPositionListType
