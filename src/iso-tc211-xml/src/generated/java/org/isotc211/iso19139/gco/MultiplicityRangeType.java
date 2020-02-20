/**
 */
package org.isotc211.iso19139.gco;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A component of a multiplicity, consisting of an non-negative lower bound, and a potentially infinite upper bound.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.MultiplicityRangeType#getLower <em>Lower</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.MultiplicityRangeType#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getMultiplicityRangeType()
 * @model extendedMetaData="name='MultiplicityRange_Type' kind='elementOnly'"
 * @generated
 */
public interface MultiplicityRangeType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' containment reference.
	 * @see #setLower(IntegerPropertyType)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getMultiplicityRangeType_Lower()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lower' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerPropertyType getLower();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.MultiplicityRangeType#getLower <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' containment reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(IntegerPropertyType value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' containment reference.
	 * @see #setUpper(UnlimitedIntegerPropertyType)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getMultiplicityRangeType_Upper()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='upper' namespace='##targetNamespace'"
	 * @generated
	 */
	UnlimitedIntegerPropertyType getUpper();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.MultiplicityRangeType#getUpper <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' containment reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(UnlimitedIntegerPropertyType value);

} // MultiplicityRangeType
