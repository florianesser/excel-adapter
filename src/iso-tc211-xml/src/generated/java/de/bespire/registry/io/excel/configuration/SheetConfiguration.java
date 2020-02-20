/**
 */
package de.bespire.registry.io.excel.configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getImportType <em>Import Type</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getExportType <em>Export Type</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getItemClassName <em>Item Class Name</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getColumn <em>Column</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getFirstDataColumn <em>First Data Column</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getFirstDataRow <em>First Data Row</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getHeaderRow <em>Header Row</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getIdColumn <em>Id Column</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getIdPrefix <em>Id Prefix</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getSheetName <em>Sheet Name</em>}</li>
 * </ul>
 *
 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getSheetConfiguration()
 * @model extendedMetaData="name='SheetConfiguration' kind='elementOnly'"
 * @generated
 */
public interface SheetConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Type</em>' attribute.
	 * @see #setImportType(String)
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getSheetConfiguration_ImportType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='importType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImportType();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getImportType <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Type</em>' attribute.
	 * @see #getImportType()
	 * @generated
	 */
	void setImportType(String value);

	/**
	 * Returns the value of the '<em><b>Export Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Type</em>' attribute.
	 * @see #setExportType(String)
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getSheetConfiguration_ExportType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='exportType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExportType();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getExportType <em>Export Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export Type</em>' attribute.
	 * @see #getExportType()
	 * @generated
	 */
	void setExportType(String value);

	/**
	 * Returns the value of the '<em><b>Item Class Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Class Name</em>' attribute list.
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getSheetConfiguration_ItemClassName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='itemClassName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getItemClassName();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link de.bespire.registry.io.excel.configuration.ColumnConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getSheetConfiguration_Column()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColumnConfiguration> getColumn();

	/**
	 * Returns the value of the '<em><b>First Data Column</b></em>' attribute.
	 * The default value is <code>"B"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Data Column</em>' attribute.
	 * @see #isSetFirstDataColumn()
	 * @see #unsetFirstDataColumn()
	 * @see #setFirstDataColumn(String)
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getSheetConfiguration_FirstDataColumn()
	 * @model default="B" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='firstDataColumn'"
	 * @generated
	 */
	String getFirstDataColumn();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getFirstDataColumn <em>First Data Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Data Column</em>' attribute.
	 * @see #isSetFirstDataColumn()
	 * @see #unsetFirstDataColumn()
	 * @see #getFirstDataColumn()
	 * @generated
	 */
	void setFirstDataColumn(String value);

	/**
	 * Unsets the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getFirstDataColumn <em>First Data Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstDataColumn()
	 * @see #getFirstDataColumn()
	 * @see #setFirstDataColumn(String)
	 * @generated
	 */
	void unsetFirstDataColumn();

	/**
	 * Returns whether the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getFirstDataColumn <em>First Data Column</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Data Column</em>' attribute is set.
	 * @see #unsetFirstDataColumn()
	 * @see #getFirstDataColumn()
	 * @see #setFirstDataColumn(String)
	 * @generated
	 */
	boolean isSetFirstDataColumn();

	/**
	 * Returns the value of the '<em><b>First Data Row</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Data Row</em>' attribute.
	 * @see #isSetFirstDataRow()
	 * @see #unsetFirstDataRow()
	 * @see #setFirstDataRow(int)
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getSheetConfiguration_FirstDataRow()
	 * @model default="2" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='firstDataRow'"
	 * @generated
	 */
	int getFirstDataRow();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getFirstDataRow <em>First Data Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Data Row</em>' attribute.
	 * @see #isSetFirstDataRow()
	 * @see #unsetFirstDataRow()
	 * @see #getFirstDataRow()
	 * @generated
	 */
	void setFirstDataRow(int value);

	/**
	 * Unsets the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getFirstDataRow <em>First Data Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstDataRow()
	 * @see #getFirstDataRow()
	 * @see #setFirstDataRow(int)
	 * @generated
	 */
	void unsetFirstDataRow();

	/**
	 * Returns whether the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getFirstDataRow <em>First Data Row</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Data Row</em>' attribute is set.
	 * @see #unsetFirstDataRow()
	 * @see #getFirstDataRow()
	 * @see #setFirstDataRow(int)
	 * @generated
	 */
	boolean isSetFirstDataRow();

	/**
	 * Returns the value of the '<em><b>Header Row</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Row</em>' attribute.
	 * @see #isSetHeaderRow()
	 * @see #unsetHeaderRow()
	 * @see #setHeaderRow(int)
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getSheetConfiguration_HeaderRow()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='headerRow'"
	 * @generated
	 */
	int getHeaderRow();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getHeaderRow <em>Header Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Row</em>' attribute.
	 * @see #isSetHeaderRow()
	 * @see #unsetHeaderRow()
	 * @see #getHeaderRow()
	 * @generated
	 */
	void setHeaderRow(int value);

	/**
	 * Unsets the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getHeaderRow <em>Header Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeaderRow()
	 * @see #getHeaderRow()
	 * @see #setHeaderRow(int)
	 * @generated
	 */
	void unsetHeaderRow();

	/**
	 * Returns whether the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getHeaderRow <em>Header Row</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Header Row</em>' attribute is set.
	 * @see #unsetHeaderRow()
	 * @see #getHeaderRow()
	 * @see #setHeaderRow(int)
	 * @generated
	 */
	boolean isSetHeaderRow();

	/**
	 * Returns the value of the '<em><b>Id Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Column</em>' attribute.
	 * @see #setIdColumn(String)
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getSheetConfiguration_IdColumn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='idColumn'"
	 * @generated
	 */
	String getIdColumn();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getIdColumn <em>Id Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Column</em>' attribute.
	 * @see #getIdColumn()
	 * @generated
	 */
	void setIdColumn(String value);

	/**
	 * Returns the value of the '<em><b>Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Prefix</em>' attribute.
	 * @see #setIdPrefix(String)
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getSheetConfiguration_IdPrefix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='idPrefix'"
	 * @generated
	 */
	String getIdPrefix();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getIdPrefix <em>Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Prefix</em>' attribute.
	 * @see #getIdPrefix()
	 * @generated
	 */
	void setIdPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Name</em>' attribute.
	 * @see #setSheetName(String)
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getSheetConfiguration_SheetName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='sheetName'"
	 * @generated
	 */
	String getSheetName();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getSheetName <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Name</em>' attribute.
	 * @see #getSheetName()
	 * @generated
	 */
	void setSheetName(String value);

} // SheetConfiguration
