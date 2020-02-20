/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Time Slice Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AbstractTimeSliceType#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link net.opengis.gml32.AbstractTimeSliceType#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAbstractTimeSliceType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractTimeSliceType' kind='elementOnly'"
 * @generated
 */
public interface AbstractTimeSliceType extends AbstractGMLType {
	/**
	 * Returns the value of the '<em><b>Valid Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:validTime is a convenience property element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid Time</em>' containment reference.
	 * @see #setValidTime(TimePrimitivePropertyType)
	 * @see net.opengis.gml32.GMLPackage#getAbstractTimeSliceType_ValidTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='validTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePrimitivePropertyType getValidTime();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractTimeSliceType#getValidTime <em>Valid Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Time</em>' containment reference.
	 * @see #getValidTime()
	 * @generated
	 */
	void setValidTime(TimePrimitivePropertyType value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence is represented by a simple gml:dataSource or gml:dataSourceReference property that indicates the source of the temporal data. The remote link attributes of the gml:dataSource element have been deprecated along with its current type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(StringOrRefType)
	 * @see net.opengis.gml32.GMLPackage#getAbstractTimeSliceType_DataSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataSource' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getDataSource();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractTimeSliceType#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(StringOrRefType value);

} // AbstractTimeSliceType
