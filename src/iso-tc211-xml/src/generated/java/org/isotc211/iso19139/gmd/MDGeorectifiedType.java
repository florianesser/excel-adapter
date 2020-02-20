/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.BooleanPropertyType;
import org.isotc211.iso19139.gco.CharacterStringPropertyType;

import org.isotc211.iso19139.gss.GMPointPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Georectified Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeorectifiedType#getCheckPointAvailability <em>Check Point Availability</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeorectifiedType#getCheckPointDescription <em>Check Point Description</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeorectifiedType#getCornerPoints <em>Corner Points</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeorectifiedType#getCenterPoint <em>Center Point</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeorectifiedType#getPointInPixel <em>Point In Pixel</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeorectifiedType#getTransformationDimensionDescription <em>Transformation Dimension Description</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeorectifiedType#getTransformationDimensionMapping <em>Transformation Dimension Mapping</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeorectifiedType()
 * @model extendedMetaData="name='MD_Georectified_Type' kind='elementOnly'"
 * @generated
 */
public interface MDGeorectifiedType extends MDGridSpatialRepresentationType {
	/**
	 * Returns the value of the '<em><b>Check Point Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Point Availability</em>' containment reference.
	 * @see #setCheckPointAvailability(BooleanPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeorectifiedType_CheckPointAvailability()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='checkPointAvailability' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getCheckPointAvailability();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDGeorectifiedType#getCheckPointAvailability <em>Check Point Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Point Availability</em>' containment reference.
	 * @see #getCheckPointAvailability()
	 * @generated
	 */
	void setCheckPointAvailability(BooleanPropertyType value);

	/**
	 * Returns the value of the '<em><b>Check Point Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Point Description</em>' containment reference.
	 * @see #setCheckPointDescription(CharacterStringPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeorectifiedType_CheckPointDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='checkPointDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getCheckPointDescription();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDGeorectifiedType#getCheckPointDescription <em>Check Point Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Point Description</em>' containment reference.
	 * @see #getCheckPointDescription()
	 * @generated
	 */
	void setCheckPointDescription(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Corner Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gss.GMPointPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner Points</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeorectifiedType_CornerPoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cornerPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GMPointPropertyType> getCornerPoints();

	/**
	 * Returns the value of the '<em><b>Center Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Point</em>' containment reference.
	 * @see #setCenterPoint(GMPointPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeorectifiedType_CenterPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='centerPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	GMPointPropertyType getCenterPoint();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDGeorectifiedType#getCenterPoint <em>Center Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Point</em>' containment reference.
	 * @see #getCenterPoint()
	 * @generated
	 */
	void setCenterPoint(GMPointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Point In Pixel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point In Pixel</em>' containment reference.
	 * @see #setPointInPixel(MDPixelOrientationCodePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeorectifiedType_PointInPixel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointInPixel' namespace='##targetNamespace'"
	 * @generated
	 */
	MDPixelOrientationCodePropertyType getPointInPixel();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDGeorectifiedType#getPointInPixel <em>Point In Pixel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point In Pixel</em>' containment reference.
	 * @see #getPointInPixel()
	 * @generated
	 */
	void setPointInPixel(MDPixelOrientationCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Transformation Dimension Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Dimension Description</em>' containment reference.
	 * @see #setTransformationDimensionDescription(CharacterStringPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeorectifiedType_TransformationDimensionDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transformationDimensionDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getTransformationDimensionDescription();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDGeorectifiedType#getTransformationDimensionDescription <em>Transformation Dimension Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Dimension Description</em>' containment reference.
	 * @see #getTransformationDimensionDescription()
	 * @generated
	 */
	void setTransformationDimensionDescription(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Transformation Dimension Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Dimension Mapping</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeorectifiedType_TransformationDimensionMapping()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='transformationDimensionMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getTransformationDimensionMapping();

} // MDGeorectifiedType
