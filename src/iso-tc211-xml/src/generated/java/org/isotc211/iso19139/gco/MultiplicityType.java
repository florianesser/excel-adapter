/**
 */
package org.isotc211.iso19139.gco;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Use to represent the possible cardinality of a relation. Represented by a set of simple multiplicity ranges.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.MultiplicityType#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getMultiplicityType()
 * @model extendedMetaData="name='Multiplicity_Type' kind='elementOnly'"
 * @generated
 */
public interface MultiplicityType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gco.MultiplicityRangePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference list.
	 * @see org.isotc211.iso19139.gco.GCOPackage#getMultiplicityType_Range()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MultiplicityRangePropertyType> getRange();

} // MultiplicityType
