/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.IntegerPropertyType;
import org.isotc211.iso19139.gco.MeasurePropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDDimensionType#getDimensionName <em>Dimension Name</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDDimensionType#getDimensionSize <em>Dimension Size</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDDimensionType#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDimensionType()
 * @model extendedMetaData="name='MD_Dimension_Type' kind='elementOnly'"
 * @generated
 */
public interface MDDimensionType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Dimension Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Name</em>' containment reference.
	 * @see #setDimensionName(MDDimensionNameTypeCodePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDimensionType_DimensionName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dimensionName' namespace='##targetNamespace'"
	 * @generated
	 */
	MDDimensionNameTypeCodePropertyType getDimensionName();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDDimensionType#getDimensionName <em>Dimension Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Name</em>' containment reference.
	 * @see #getDimensionName()
	 * @generated
	 */
	void setDimensionName(MDDimensionNameTypeCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Dimension Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Size</em>' containment reference.
	 * @see #setDimensionSize(IntegerPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDimensionType_DimensionSize()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dimensionSize' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerPropertyType getDimensionSize();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDDimensionType#getDimensionSize <em>Dimension Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Size</em>' containment reference.
	 * @see #getDimensionSize()
	 * @generated
	 */
	void setDimensionSize(IntegerPropertyType value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' containment reference.
	 * @see #setResolution(MeasurePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDDimensionType_Resolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resolution' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurePropertyType getResolution();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDDimensionType#getResolution <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' containment reference.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(MeasurePropertyType value);

} // MDDimensionType
