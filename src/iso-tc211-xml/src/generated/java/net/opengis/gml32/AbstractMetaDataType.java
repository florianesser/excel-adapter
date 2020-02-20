/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Meta Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AbstractMetaDataType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.gml32.AbstractMetaDataType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAbstractMetaDataType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractMetaDataType' kind='mixed'"
 * @generated
 */
public interface AbstractMetaDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getAbstractMetaDataType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribute gml:id supports provision of a handle for the XML element representing a GML Object. Its use is mandatory for all GML objects. It is of XML type ID, so is constrained to be unique in the XML document within which it occurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.opengis.gml32.GMLPackage#getAbstractMetaDataType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractMetaDataType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // AbstractMetaDataType
