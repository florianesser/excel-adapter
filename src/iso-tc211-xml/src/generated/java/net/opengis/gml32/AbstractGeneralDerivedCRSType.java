/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract General Derived CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AbstractGeneralDerivedCRSType#getConversion <em>Conversion</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAbstractGeneralDerivedCRSType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractGeneralDerivedCRSType' kind='elementOnly'"
 * @generated
 */
public interface AbstractGeneralDerivedCRSType extends AbstractCRSType {
	/**
	 * Returns the value of the '<em><b>Conversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:conversion is an association role to the coordinate conversion used to define the derived CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion</em>' containment reference.
	 * @see #setConversion(GeneralConversionPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getAbstractGeneralDerivedCRSType_Conversion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='conversion' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralConversionPropertyType getConversion();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractGeneralDerivedCRSType#getConversion <em>Conversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion</em>' containment reference.
	 * @see #getConversion()
	 * @generated
	 */
	void setConversion(GeneralConversionPropertyType value);

} // AbstractGeneralDerivedCRSType
