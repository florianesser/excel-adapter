/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.ImageCRSType#getCartesianCSGroup <em>Cartesian CS Group</em>}</li>
 *   <li>{@link net.opengis.gml32.ImageCRSType#getCartesianCS <em>Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml32.ImageCRSType#getAffineCSGroup <em>Affine CS Group</em>}</li>
 *   <li>{@link net.opengis.gml32.ImageCRSType#getAffineCS <em>Affine CS</em>}</li>
 *   <li>{@link net.opengis.gml32.ImageCRSType#getUsesObliqueCartesianCS <em>Uses Oblique Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml32.ImageCRSType#getImageDatumGroup <em>Image Datum Group</em>}</li>
 *   <li>{@link net.opengis.gml32.ImageCRSType#getImageDatum <em>Image Datum</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getImageCRSType()
 * @model extendedMetaData="name='ImageCRSType' kind='elementOnly'"
 * @generated
 */
public interface ImageCRSType extends AbstractCRSType {
	/**
	 * Returns the value of the '<em><b>Cartesian CS Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cartesian CS Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getImageCRSType_CartesianCSGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='cartesianCS:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCartesianCSGroup();

	/**
	 * Returns the value of the '<em><b>Cartesian CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cartesian CS</em>' containment reference.
	 * @see #setCartesianCS(CartesianCSPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getImageCRSType_CartesianCS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cartesianCS' namespace='##targetNamespace' group='cartesianCS:group'"
	 * @generated
	 */
	CartesianCSPropertyType getCartesianCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ImageCRSType#getCartesianCS <em>Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian CS</em>' containment reference.
	 * @see #getCartesianCS()
	 * @generated
	 */
	void setCartesianCS(CartesianCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Affine CS Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:affineCS is an association role to the affine coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affine CS Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getImageCRSType_AffineCSGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='affineCS:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAffineCSGroup();

	/**
	 * Returns the value of the '<em><b>Affine CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:affineCS is an association role to the affine coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affine CS</em>' containment reference.
	 * @see #setAffineCS(AffineCSPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getImageCRSType_AffineCS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='affineCS' namespace='##targetNamespace' group='affineCS:group'"
	 * @generated
	 */
	AffineCSPropertyType getAffineCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ImageCRSType#getAffineCS <em>Affine CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affine CS</em>' containment reference.
	 * @see #getAffineCS()
	 * @generated
	 */
	void setAffineCS(AffineCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Uses Oblique Cartesian CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Oblique Cartesian CS</em>' containment reference.
	 * @see #setUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getImageCRSType_UsesObliqueCartesianCS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usesObliqueCartesianCS' namespace='##targetNamespace'"
	 * @generated
	 */
	ObliqueCartesianCSPropertyType getUsesObliqueCartesianCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ImageCRSType#getUsesObliqueCartesianCS <em>Uses Oblique Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Oblique Cartesian CS</em>' containment reference.
	 * @see #getUsesObliqueCartesianCS()
	 * @generated
	 */
	void setUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Image Datum Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:imageDatum is an association role to the image datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Datum Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getImageCRSType_ImageDatumGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='imageDatum:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getImageDatumGroup();

	/**
	 * Returns the value of the '<em><b>Image Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:imageDatum is an association role to the image datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Datum</em>' containment reference.
	 * @see #setImageDatum(ImageDatumPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getImageCRSType_ImageDatum()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='imageDatum' namespace='##targetNamespace' group='imageDatum:group'"
	 * @generated
	 */
	ImageDatumPropertyType getImageDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ImageCRSType#getImageDatum <em>Image Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Datum</em>' containment reference.
	 * @see #getImageDatum()
	 * @generated
	 */
	void setImageDatum(ImageDatumPropertyType value);

} // ImageCRSType
