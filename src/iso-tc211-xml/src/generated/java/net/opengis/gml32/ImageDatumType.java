/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Datum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.ImageDatumType#getPixelInCell <em>Pixel In Cell</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getImageDatumType()
 * @model extendedMetaData="name='ImageDatumType' kind='elementOnly'"
 * @generated
 */
public interface ImageDatumType extends AbstractDatumType {
	/**
	 * Returns the value of the '<em><b>Pixel In Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:pixelInCell is a specification of the way an image grid is associated with the image data attributes. The required codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pixel In Cell</em>' containment reference.
	 * @see #setPixelInCell(CodeWithAuthorityType)
	 * @see net.opengis.gml32.GMLPackage#getImageDatumType_PixelInCell()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pixelInCell' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeWithAuthorityType getPixelInCell();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ImageDatumType#getPixelInCell <em>Pixel In Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixel In Cell</em>' containment reference.
	 * @see #getPixelInCell()
	 * @generated
	 */
	void setPixelInCell(CodeWithAuthorityType value);

} // ImageDatumType
