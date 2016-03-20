/**
 */
package de.bespire.registry.io.excel.configuration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ExcelAdapterConfigurationPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bespire.de/io/excel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xlio";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExcelAdapterConfigurationPackage eINSTANCE = de.bespire.registry.io.excel.configuration.impl.ExcelAdapterConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.bespire.registry.io.excel.configuration.impl.ColumnConfigurationImpl <em>Column Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bespire.registry.io.excel.configuration.impl.ColumnConfigurationImpl
	 * @see de.bespire.registry.io.excel.configuration.impl.ExcelAdapterConfigurationPackageImpl#getColumnConfiguration()
	 * @generated
	 */
	int COLUMN_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Java Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONFIGURATION__JAVA_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Java Property Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONFIGURATION__JAVA_PROPERTY_EXPORT = 1;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONFIGURATION__MULTIPLE = 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONFIGURATION__REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONFIGURATION__COLUMN_NAME = 4;

	/**
	 * The feature id for the '<em><b>Separator Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONFIGURATION__SEPARATOR_CHAR = 5;

	/**
	 * The number of structural features of the '<em>Column Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Column Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.bespire.registry.io.excel.configuration.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bespire.registry.io.excel.configuration.impl.DocumentRootImpl
	 * @see de.bespire.registry.io.excel.configuration.impl.ExcelAdapterConfigurationPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Column Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMN_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Excel Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCEL_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Sheet Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHEET_CONFIGURATION = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.bespire.registry.io.excel.configuration.impl.ExcelConfigurationImpl <em>Excel Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bespire.registry.io.excel.configuration.impl.ExcelConfigurationImpl
	 * @see de.bespire.registry.io.excel.configuration.impl.ExcelAdapterConfigurationPackageImpl#getExcelConfiguration()
	 * @generated
	 */
	int EXCEL_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_CONFIGURATION__SHEET = 0;

	/**
	 * The number of structural features of the '<em>Excel Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Excel Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl <em>Sheet Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl
	 * @see de.bespire.registry.io.excel.configuration.impl.ExcelAdapterConfigurationPackageImpl#getSheetConfiguration()
	 * @generated
	 */
	int SHEET_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_CONFIGURATION__IMPORT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Export Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_CONFIGURATION__EXPORT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Item Class Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_CONFIGURATION__ITEM_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_CONFIGURATION__COLUMN = 3;

	/**
	 * The feature id for the '<em><b>First Data Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_CONFIGURATION__FIRST_DATA_COLUMN = 4;

	/**
	 * The feature id for the '<em><b>First Data Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_CONFIGURATION__FIRST_DATA_ROW = 5;

	/**
	 * The feature id for the '<em><b>Header Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_CONFIGURATION__HEADER_ROW = 6;

	/**
	 * The feature id for the '<em><b>Id Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_CONFIGURATION__ID_COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_CONFIGURATION__ID_PREFIX = 8;

	/**
	 * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_CONFIGURATION__SHEET_NAME = 9;

	/**
	 * The number of structural features of the '<em>Sheet Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_CONFIGURATION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Sheet Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.bespire.registry.io.excel.configuration.ColumnConfiguration <em>Column Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Configuration</em>'.
	 * @see de.bespire.registry.io.excel.configuration.ColumnConfiguration
	 * @generated
	 */
	EClass getColumnConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.ColumnConfiguration#getJavaProperty <em>Java Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Property</em>'.
	 * @see de.bespire.registry.io.excel.configuration.ColumnConfiguration#getJavaProperty()
	 * @see #getColumnConfiguration()
	 * @generated
	 */
	EAttribute getColumnConfiguration_JavaProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.ColumnConfiguration#getJavaPropertyExport <em>Java Property Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Property Export</em>'.
	 * @see de.bespire.registry.io.excel.configuration.ColumnConfiguration#getJavaPropertyExport()
	 * @see #getColumnConfiguration()
	 * @generated
	 */
	EAttribute getColumnConfiguration_JavaPropertyExport();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.ColumnConfiguration#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see de.bespire.registry.io.excel.configuration.ColumnConfiguration#isMultiple()
	 * @see #getColumnConfiguration()
	 * @generated
	 */
	EAttribute getColumnConfiguration_Multiple();

	/**
	 * Returns the meta object for the attribute list '{@link de.bespire.registry.io.excel.configuration.ColumnConfiguration#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>References</em>'.
	 * @see de.bespire.registry.io.excel.configuration.ColumnConfiguration#getReferences()
	 * @see #getColumnConfiguration()
	 * @generated
	 */
	EAttribute getColumnConfiguration_References();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.ColumnConfiguration#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see de.bespire.registry.io.excel.configuration.ColumnConfiguration#getColumnName()
	 * @see #getColumnConfiguration()
	 * @generated
	 */
	EAttribute getColumnConfiguration_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.ColumnConfiguration#getSeparatorChar <em>Separator Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator Char</em>'.
	 * @see de.bespire.registry.io.excel.configuration.ColumnConfiguration#getSeparatorChar()
	 * @see #getColumnConfiguration()
	 * @generated
	 */
	EAttribute getColumnConfiguration_SeparatorChar();

	/**
	 * Returns the meta object for class '{@link de.bespire.registry.io.excel.configuration.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.bespire.registry.io.excel.configuration.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.bespire.registry.io.excel.configuration.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.bespire.registry.io.excel.configuration.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.bespire.registry.io.excel.configuration.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getColumnConfiguration <em>Column Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column Configuration</em>'.
	 * @see de.bespire.registry.io.excel.configuration.DocumentRoot#getColumnConfiguration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ColumnConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getExcelConfiguration <em>Excel Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Excel Configuration</em>'.
	 * @see de.bespire.registry.io.excel.configuration.DocumentRoot#getExcelConfiguration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExcelConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link de.bespire.registry.io.excel.configuration.DocumentRoot#getSheetConfiguration <em>Sheet Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sheet Configuration</em>'.
	 * @see de.bespire.registry.io.excel.configuration.DocumentRoot#getSheetConfiguration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SheetConfiguration();

	/**
	 * Returns the meta object for class '{@link de.bespire.registry.io.excel.configuration.ExcelConfiguration <em>Excel Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excel Configuration</em>'.
	 * @see de.bespire.registry.io.excel.configuration.ExcelConfiguration
	 * @generated
	 */
	EClass getExcelConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bespire.registry.io.excel.configuration.ExcelConfiguration#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sheet</em>'.
	 * @see de.bespire.registry.io.excel.configuration.ExcelConfiguration#getSheet()
	 * @see #getExcelConfiguration()
	 * @generated
	 */
	EReference getExcelConfiguration_Sheet();

	/**
	 * Returns the meta object for class '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration <em>Sheet Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sheet Configuration</em>'.
	 * @see de.bespire.registry.io.excel.configuration.SheetConfiguration
	 * @generated
	 */
	EClass getSheetConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see de.bespire.registry.io.excel.configuration.SheetConfiguration#getImportType()
	 * @see #getSheetConfiguration()
	 * @generated
	 */
	EAttribute getSheetConfiguration_ImportType();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getExportType <em>Export Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export Type</em>'.
	 * @see de.bespire.registry.io.excel.configuration.SheetConfiguration#getExportType()
	 * @see #getSheetConfiguration()
	 * @generated
	 */
	EAttribute getSheetConfiguration_ExportType();

	/**
	 * Returns the meta object for the attribute list '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getItemClassName <em>Item Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Item Class Name</em>'.
	 * @see de.bespire.registry.io.excel.configuration.SheetConfiguration#getItemClassName()
	 * @see #getSheetConfiguration()
	 * @generated
	 */
	EAttribute getSheetConfiguration_ItemClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see de.bespire.registry.io.excel.configuration.SheetConfiguration#getColumn()
	 * @see #getSheetConfiguration()
	 * @generated
	 */
	EReference getSheetConfiguration_Column();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getFirstDataColumn <em>First Data Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Data Column</em>'.
	 * @see de.bespire.registry.io.excel.configuration.SheetConfiguration#getFirstDataColumn()
	 * @see #getSheetConfiguration()
	 * @generated
	 */
	EAttribute getSheetConfiguration_FirstDataColumn();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getFirstDataRow <em>First Data Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Data Row</em>'.
	 * @see de.bespire.registry.io.excel.configuration.SheetConfiguration#getFirstDataRow()
	 * @see #getSheetConfiguration()
	 * @generated
	 */
	EAttribute getSheetConfiguration_FirstDataRow();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getHeaderRow <em>Header Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Row</em>'.
	 * @see de.bespire.registry.io.excel.configuration.SheetConfiguration#getHeaderRow()
	 * @see #getSheetConfiguration()
	 * @generated
	 */
	EAttribute getSheetConfiguration_HeaderRow();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getIdColumn <em>Id Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Column</em>'.
	 * @see de.bespire.registry.io.excel.configuration.SheetConfiguration#getIdColumn()
	 * @see #getSheetConfiguration()
	 * @generated
	 */
	EAttribute getSheetConfiguration_IdColumn();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getIdPrefix <em>Id Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Prefix</em>'.
	 * @see de.bespire.registry.io.excel.configuration.SheetConfiguration#getIdPrefix()
	 * @see #getSheetConfiguration()
	 * @generated
	 */
	EAttribute getSheetConfiguration_IdPrefix();

	/**
	 * Returns the meta object for the attribute '{@link de.bespire.registry.io.excel.configuration.SheetConfiguration#getSheetName <em>Sheet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet Name</em>'.
	 * @see de.bespire.registry.io.excel.configuration.SheetConfiguration#getSheetName()
	 * @see #getSheetConfiguration()
	 * @generated
	 */
	EAttribute getSheetConfiguration_SheetName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExcelAdapterConfigurationFactory getExcelAdapterConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link de.bespire.registry.io.excel.configuration.impl.ColumnConfigurationImpl <em>Column Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bespire.registry.io.excel.configuration.impl.ColumnConfigurationImpl
		 * @see de.bespire.registry.io.excel.configuration.impl.ExcelAdapterConfigurationPackageImpl#getColumnConfiguration()
		 * @generated
		 */
		EClass COLUMN_CONFIGURATION = eINSTANCE.getColumnConfiguration();

		/**
		 * The meta object literal for the '<em><b>Java Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_CONFIGURATION__JAVA_PROPERTY = eINSTANCE.getColumnConfiguration_JavaProperty();

		/**
		 * The meta object literal for the '<em><b>Java Property Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_CONFIGURATION__JAVA_PROPERTY_EXPORT = eINSTANCE.getColumnConfiguration_JavaPropertyExport();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_CONFIGURATION__MULTIPLE = eINSTANCE.getColumnConfiguration_Multiple();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_CONFIGURATION__REFERENCES = eINSTANCE.getColumnConfiguration_References();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_CONFIGURATION__COLUMN_NAME = eINSTANCE.getColumnConfiguration_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Separator Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_CONFIGURATION__SEPARATOR_CHAR = eINSTANCE.getColumnConfiguration_SeparatorChar();

		/**
		 * The meta object literal for the '{@link de.bespire.registry.io.excel.configuration.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bespire.registry.io.excel.configuration.impl.DocumentRootImpl
		 * @see de.bespire.registry.io.excel.configuration.impl.ExcelAdapterConfigurationPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Column Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLUMN_CONFIGURATION = eINSTANCE.getDocumentRoot_ColumnConfiguration();

		/**
		 * The meta object literal for the '<em><b>Excel Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXCEL_CONFIGURATION = eINSTANCE.getDocumentRoot_ExcelConfiguration();

		/**
		 * The meta object literal for the '<em><b>Sheet Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SHEET_CONFIGURATION = eINSTANCE.getDocumentRoot_SheetConfiguration();

		/**
		 * The meta object literal for the '{@link de.bespire.registry.io.excel.configuration.impl.ExcelConfigurationImpl <em>Excel Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bespire.registry.io.excel.configuration.impl.ExcelConfigurationImpl
		 * @see de.bespire.registry.io.excel.configuration.impl.ExcelAdapterConfigurationPackageImpl#getExcelConfiguration()
		 * @generated
		 */
		EClass EXCEL_CONFIGURATION = eINSTANCE.getExcelConfiguration();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEL_CONFIGURATION__SHEET = eINSTANCE.getExcelConfiguration_Sheet();

		/**
		 * The meta object literal for the '{@link de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl <em>Sheet Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl
		 * @see de.bespire.registry.io.excel.configuration.impl.ExcelAdapterConfigurationPackageImpl#getSheetConfiguration()
		 * @generated
		 */
		EClass SHEET_CONFIGURATION = eINSTANCE.getSheetConfiguration();

		/**
		 * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET_CONFIGURATION__IMPORT_TYPE = eINSTANCE.getSheetConfiguration_ImportType();

		/**
		 * The meta object literal for the '<em><b>Export Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET_CONFIGURATION__EXPORT_TYPE = eINSTANCE.getSheetConfiguration_ExportType();

		/**
		 * The meta object literal for the '<em><b>Item Class Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET_CONFIGURATION__ITEM_CLASS_NAME = eINSTANCE.getSheetConfiguration_ItemClassName();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET_CONFIGURATION__COLUMN = eINSTANCE.getSheetConfiguration_Column();

		/**
		 * The meta object literal for the '<em><b>First Data Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET_CONFIGURATION__FIRST_DATA_COLUMN = eINSTANCE.getSheetConfiguration_FirstDataColumn();

		/**
		 * The meta object literal for the '<em><b>First Data Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET_CONFIGURATION__FIRST_DATA_ROW = eINSTANCE.getSheetConfiguration_FirstDataRow();

		/**
		 * The meta object literal for the '<em><b>Header Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET_CONFIGURATION__HEADER_ROW = eINSTANCE.getSheetConfiguration_HeaderRow();

		/**
		 * The meta object literal for the '<em><b>Id Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET_CONFIGURATION__ID_COLUMN = eINSTANCE.getSheetConfiguration_IdColumn();

		/**
		 * The meta object literal for the '<em><b>Id Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET_CONFIGURATION__ID_PREFIX = eINSTANCE.getSheetConfiguration_IdPrefix();

		/**
		 * The meta object literal for the '<em><b>Sheet Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET_CONFIGURATION__SHEET_NAME = eINSTANCE.getSheetConfiguration_SheetName();

	}

} //ExcelAdapterConfigurationPackage
