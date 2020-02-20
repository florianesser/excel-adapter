/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Meta Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.GenericMetaDataType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getGenericMetaDataType()
 * @model extendedMetaData="name='GenericMetaDataType' kind='mixed'"
 * @generated
 */
public interface GenericMetaDataType extends AbstractMetaDataType {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getGenericMetaDataType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // GenericMetaDataType
