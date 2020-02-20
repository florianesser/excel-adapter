/**
 */
package net.opengis.gml32;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.GridType#getLimits <em>Limits</em>}</li>
 *   <li>{@link net.opengis.gml32.GridType#getAxisLabels1 <em>Axis Labels1</em>}</li>
 *   <li>{@link net.opengis.gml32.GridType#getAxisName <em>Axis Name</em>}</li>
 *   <li>{@link net.opengis.gml32.GridType#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getGridType()
 * @model extendedMetaData="name='GridType' kind='elementOnly'"
 * @generated
 */
public interface GridType extends AbstractGeometryType {
	/**
	 * Returns the value of the '<em><b>Limits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limits</em>' containment reference.
	 * @see #setLimits(GridLimitsType)
	 * @see net.opengis.gml32.GMLPackage#getGridType_Limits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='limits' namespace='##targetNamespace'"
	 * @generated
	 */
	GridLimitsType getLimits();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GridType#getLimits <em>Limits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limits</em>' containment reference.
	 * @see #getLimits()
	 * @generated
	 */
	void setLimits(GridLimitsType value);

	/**
	 * Returns the value of the '<em><b>Axis Labels1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Labels1</em>' attribute.
	 * @see #setAxisLabels1(List)
	 * @see net.opengis.gml32.GMLPackage#getGridType_AxisLabels1()
	 * @model dataType="net.opengis.gml32.NCNameList" many="false"
	 *        extendedMetaData="kind='element' name='axisLabels' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getAxisLabels1();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GridType#getAxisLabels1 <em>Axis Labels1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Labels1</em>' attribute.
	 * @see #getAxisLabels1()
	 * @generated
	 */
	void setAxisLabels1(List<String> value);

	/**
	 * Returns the value of the '<em><b>Axis Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Name</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getGridType_AxisName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='axisName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAxisName();

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see #setDimension(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getGridType_Dimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='dimension'"
	 * @generated
	 */
	BigInteger getDimension();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GridType#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' attribute.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(BigInteger value);

} // GridType
