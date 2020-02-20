/**
 */
package net.opengis.gml32;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Or Nil Reason List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * gml:MeasureOrNilReasonListType provides for a list of quantities. An instance element may also include embedded values from NilReasonType. It is intended to be used in situations where a value is expected, but the value may be absent for some reason.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.MeasureOrNilReasonListType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml32.MeasureOrNilReasonListType#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getMeasureOrNilReasonListType()
 * @model extendedMetaData="name='MeasureOrNilReasonListType' kind='simple'"
 * @generated
 */
public interface MeasureOrNilReasonListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(List)
	 * @see net.opengis.gml32.GMLPackage#getMeasureOrNilReasonListType_Value()
	 * @model dataType="net.opengis.gml32.DoubleOrNilReasonList" many="false"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	List<Object> getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.MeasureOrNilReasonListType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(List<Object> value);

	/**
	 * Returns the value of the '<em><b>Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom</em>' attribute.
	 * @see #setUom(String)
	 * @see net.opengis.gml32.GMLPackage#getMeasureOrNilReasonListType_Uom()
	 * @model dataType="net.opengis.gml32.UomIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='uom'"
	 * @generated
	 */
	String getUom();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.MeasureOrNilReasonListType#getUom <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' attribute.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(String value);

} // MeasureOrNilReasonListType
