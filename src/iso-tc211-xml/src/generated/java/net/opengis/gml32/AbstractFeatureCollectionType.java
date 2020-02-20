/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AbstractFeatureCollectionType#getFeatureMember <em>Feature Member</em>}</li>
 *   <li>{@link net.opengis.gml32.AbstractFeatureCollectionType#getFeatureMembers <em>Feature Members</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAbstractFeatureCollectionType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractFeatureCollectionType' kind='elementOnly'"
 * @generated
 */
public interface AbstractFeatureCollectionType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Feature Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.FeaturePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Member</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getAbstractFeatureCollectionType_FeatureMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='featureMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeaturePropertyType> getFeatureMember();

	/**
	 * Returns the value of the '<em><b>Feature Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Members</em>' containment reference.
	 * @see #setFeatureMembers(FeatureArrayPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getAbstractFeatureCollectionType_FeatureMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='featureMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureArrayPropertyType getFeatureMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractFeatureCollectionType#getFeatureMembers <em>Feature Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Members</em>' containment reference.
	 * @see #getFeatureMembers()
	 * @generated
	 */
	void setFeatureMembers(FeatureArrayPropertyType value);

} // AbstractFeatureCollectionType
