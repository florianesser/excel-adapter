/**
 */
package net.opengis.gml32;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * gml:MeasureListType provides for a list of quantities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.MeasureListType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml32.MeasureListType#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getMeasureListType()
 * @model extendedMetaData="name='MeasureListType' kind='simple'"
 * @generated
 */
public interface MeasureListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(List)
	 * @see net.opengis.gml32.GMLPackage#getMeasureListType_Value()
	 * @model dataType="net.opengis.gml32.DoubleList" many="false"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	List<Double> getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.MeasureListType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom</em>' attribute.
	 * @see #setUom(String)
	 * @see net.opengis.gml32.GMLPackage#getMeasureListType_Uom()
	 * @model dataType="net.opengis.gml32.UomIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='uom'"
	 * @generated
	 */
	String getUom();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.MeasureListType#getUom <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' attribute.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(String value);

} // MeasureListType
