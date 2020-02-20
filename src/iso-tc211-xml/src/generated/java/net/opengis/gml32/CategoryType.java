/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.CategoryType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getCategoryType()
 * @model extendedMetaData="name='Category_._type' kind='simple'"
 * @generated
 */
public interface CategoryType extends CodeType {
	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see net.opengis.gml32.GMLPackage#getCategoryType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.CategoryType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // CategoryType
