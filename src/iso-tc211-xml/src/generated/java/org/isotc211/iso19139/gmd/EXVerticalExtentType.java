/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.RealPropertyType;

import org.isotc211.iso19139.gsr.SCCRSPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EX Vertical Extent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Vertical domain of dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.EXVerticalExtentType#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.EXVerticalExtentType#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.EXVerticalExtentType#getVerticalCRS <em>Vertical CRS</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getEXVerticalExtentType()
 * @model extendedMetaData="name='EX_VerticalExtent_Type' kind='elementOnly'"
 * @generated
 */
public interface EXVerticalExtentType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Minimum Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Value</em>' containment reference.
	 * @see #setMinimumValue(RealPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getEXVerticalExtentType_MinimumValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='minimumValue' namespace='##targetNamespace'"
	 * @generated
	 */
	RealPropertyType getMinimumValue();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.EXVerticalExtentType#getMinimumValue <em>Minimum Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Value</em>' containment reference.
	 * @see #getMinimumValue()
	 * @generated
	 */
	void setMinimumValue(RealPropertyType value);

	/**
	 * Returns the value of the '<em><b>Maximum Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Value</em>' containment reference.
	 * @see #setMaximumValue(RealPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getEXVerticalExtentType_MaximumValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='maximumValue' namespace='##targetNamespace'"
	 * @generated
	 */
	RealPropertyType getMaximumValue();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.EXVerticalExtentType#getMaximumValue <em>Maximum Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Value</em>' containment reference.
	 * @see #getMaximumValue()
	 * @generated
	 */
	void setMaximumValue(RealPropertyType value);

	/**
	 * Returns the value of the '<em><b>Vertical CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical CRS</em>' containment reference.
	 * @see #setVerticalCRS(SCCRSPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getEXVerticalExtentType_VerticalCRS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='verticalCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	SCCRSPropertyType getVerticalCRS();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.EXVerticalExtentType#getVerticalCRS <em>Vertical CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical CRS</em>' containment reference.
	 * @see #getVerticalCRS()
	 * @generated
	 */
	void setVerticalCRS(SCCRSPropertyType value);

} // EXVerticalExtentType
