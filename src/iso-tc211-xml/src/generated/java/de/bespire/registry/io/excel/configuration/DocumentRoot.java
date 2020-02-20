/**
 */
package de.bespire.registry.io.excel.configuration;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getColumnConfiguration <em>Column Configuration</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getExcelConfiguration <em>Excel Configuration</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getSheetConfiguration <em>Sheet Configuration</em>}</li>
 * </ul>
 *
 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Column Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Configuration</em>' containment reference.
	 * @see #setColumnConfiguration(ColumnConfiguration)
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getDocumentRoot_ColumnConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ColumnConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	ColumnConfiguration getColumnConfiguration();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getColumnConfiguration <em>Column Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Configuration</em>' containment reference.
	 * @see #getColumnConfiguration()
	 * @generated
	 */
	void setColumnConfiguration(ColumnConfiguration value);

	/**
	 * Returns the value of the '<em><b>Excel Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excel Configuration</em>' containment reference.
	 * @see #setExcelConfiguration(ExcelConfiguration)
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getDocumentRoot_ExcelConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExcelConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	ExcelConfiguration getExcelConfiguration();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getExcelConfiguration <em>Excel Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excel Configuration</em>' containment reference.
	 * @see #getExcelConfiguration()
	 * @generated
	 */
	void setExcelConfiguration(ExcelConfiguration value);

	/**
	 * Returns the value of the '<em><b>Sheet Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Configuration</em>' containment reference.
	 * @see #setSheetConfiguration(SheetConfiguration)
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getDocumentRoot_SheetConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SheetConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	SheetConfiguration getSheetConfiguration();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getSheetConfiguration <em>Sheet Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Configuration</em>' containment reference.
	 * @see #getSheetConfiguration()
	 * @generated
	 */
	void setSheetConfiguration(SheetConfiguration value);

} // DocumentRoot
