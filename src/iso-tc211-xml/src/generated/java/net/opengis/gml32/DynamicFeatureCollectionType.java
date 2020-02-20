/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Feature Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DynamicFeatureCollectionType#getDynamicMembers <em>Dynamic Members</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDynamicFeatureCollectionType()
 * @model extendedMetaData="name='DynamicFeatureCollectionType' kind='elementOnly'"
 * @generated
 */
public interface DynamicFeatureCollectionType extends DynamicFeatureType {
	/**
	 * Returns the value of the '<em><b>Dynamic Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Members</em>' containment reference.
	 * @see #setDynamicMembers(DynamicFeatureMemberType)
	 * @see net.opengis.gml32.GMLPackage#getDynamicFeatureCollectionType_DynamicMembers()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dynamicMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicFeatureMemberType getDynamicMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DynamicFeatureCollectionType#getDynamicMembers <em>Dynamic Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Members</em>' containment reference.
	 * @see #getDynamicMembers()
	 * @generated
	 */
	void setDynamicMembers(DynamicFeatureMemberType value);

} // DynamicFeatureCollectionType
