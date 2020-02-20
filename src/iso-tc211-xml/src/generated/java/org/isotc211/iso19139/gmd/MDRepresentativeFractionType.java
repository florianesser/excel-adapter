/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.IntegerPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Representative Fraction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDRepresentativeFractionType#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDRepresentativeFractionType()
 * @model extendedMetaData="name='MD_RepresentativeFraction_Type' kind='elementOnly'"
 * @generated
 */
public interface MDRepresentativeFractionType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' containment reference.
	 * @see #setDenominator(IntegerPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDRepresentativeFractionType_Denominator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='denominator' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerPropertyType getDenominator();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDRepresentativeFractionType#getDenominator <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' containment reference.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(IntegerPropertyType value);

} // MDRepresentativeFractionType
