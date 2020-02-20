/**
 */
package net.opengis.gml32;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivation Unit Term Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DerivationUnitTermType#getExponent <em>Exponent</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDerivationUnitTermType()
 * @model extendedMetaData="name='DerivationUnitTermType' kind='empty'"
 * @generated
 */
public interface DerivationUnitTermType extends UnitOfMeasureType {
	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #setExponent(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getDerivationUnitTermType_Exponent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='exponent'"
	 * @generated
	 */
	BigInteger getExponent();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DerivationUnitTermType#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(BigInteger value);

} // DerivationUnitTermType
