/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.AbstractObjectType;

import org.isotc211.iso19139.gts.TMPrimitivePropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EX Temporal Extent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Time period covered by the content of the dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.EXTemporalExtentType#getExtent <em>Extent</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getEXTemporalExtentType()
 * @model extendedMetaData="name='EX_TemporalExtent_Type' kind='elementOnly'"
 * @generated
 */
public interface EXTemporalExtentType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference.
	 * @see #setExtent(TMPrimitivePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getEXTemporalExtentType_Extent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='extent' namespace='##targetNamespace'"
	 * @generated
	 */
	TMPrimitivePropertyType getExtent();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.EXTemporalExtentType#getExtent <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' containment reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(TMPrimitivePropertyType value);

} // EXTemporalExtentType
