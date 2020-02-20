/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DerivedUnitType#getDerivationUnitTerm <em>Derivation Unit Term</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDerivedUnitType()
 * @model extendedMetaData="name='DerivedUnitType' kind='elementOnly'"
 * @generated
 */
public interface DerivedUnitType extends UnitDefinitionType {
	/**
	 * Returns the value of the '<em><b>Derivation Unit Term</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.DerivationUnitTermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of gml:derivationUnitTerm elements describes a derived unit of measure.  Each element carries an integer exponent.  The terms are combined by raising each referenced unit to the power of its exponent and forming the product.
	 * This unit term references another unit of measure (uom) and provides an integer exponent applied to that unit in defining the compound unit. The exponent may be positive or negative, but not zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Unit Term</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getDerivedUnitType_DerivationUnitTerm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='derivationUnitTerm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DerivationUnitTermType> getDerivationUnitTerm();

} // DerivedUnitType
