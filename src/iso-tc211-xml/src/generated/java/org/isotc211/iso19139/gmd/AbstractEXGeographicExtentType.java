/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.BooleanPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract EX Geographic Extent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Geographic area of the dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.AbstractEXGeographicExtentType#getExtentTypeCode <em>Extent Type Code</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getAbstractEXGeographicExtentType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractEX_GeographicExtent_Type' kind='elementOnly'"
 * @generated
 */
public interface AbstractEXGeographicExtentType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Extent Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent Type Code</em>' containment reference.
	 * @see #setExtentTypeCode(BooleanPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getAbstractEXGeographicExtentType_ExtentTypeCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extentTypeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getExtentTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.AbstractEXGeographicExtentType#getExtentTypeCode <em>Extent Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent Type Code</em>' containment reference.
	 * @see #getExtentTypeCode()
	 * @generated
	 */
	void setExtentTypeCode(BooleanPropertyType value);

} // AbstractEXGeographicExtentType
