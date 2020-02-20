/**
 */
package de.bespire.registry.io.excel.configuration.impl;

import de.bespire.registry.io.excel.configuration.ColumnConfiguration;
import de.bespire.registry.io.excel.configuration.DocumentRoot;
import de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationFactory;
import de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage;
import de.bespire.registry.io.excel.configuration.ExcelConfiguration;
import de.bespire.registry.io.excel.configuration.SheetConfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcelAdapterConfigurationPackageImpl extends EPackageImpl implements ExcelAdapterConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excelConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sheetConfigurationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExcelAdapterConfigurationPackageImpl() {
		super(eNS_URI, ExcelAdapterConfigurationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ExcelAdapterConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExcelAdapterConfigurationPackage init() {
		if (isInited) return (ExcelAdapterConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ExcelAdapterConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExcelAdapterConfigurationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExcelAdapterConfigurationPackageImpl theExcelAdapterConfigurationPackage = registeredExcelAdapterConfigurationPackage instanceof ExcelAdapterConfigurationPackageImpl ? (ExcelAdapterConfigurationPackageImpl)registeredExcelAdapterConfigurationPackage : new ExcelAdapterConfigurationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExcelAdapterConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theExcelAdapterConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExcelAdapterConfigurationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExcelAdapterConfigurationPackage.eNS_URI, theExcelAdapterConfigurationPackage);
		return theExcelAdapterConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumnConfiguration() {
		return columnConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnConfiguration_JavaProperty() {
		return (EAttribute)columnConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnConfiguration_JavaPropertyExport() {
		return (EAttribute)columnConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnConfiguration_Multiple() {
		return (EAttribute)columnConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnConfiguration_References() {
		return (EAttribute)columnConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnConfiguration_ColumnName() {
		return (EAttribute)columnConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnConfiguration_SeparatorChar() {
		return (EAttribute)columnConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnConfiguration_ValueMapper() {
		return (EAttribute)columnConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ColumnConfiguration() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ExcelConfiguration() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SheetConfiguration() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExcelConfiguration() {
		return excelConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExcelConfiguration_Sheet() {
		return (EReference)excelConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSheetConfiguration() {
		return sheetConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheetConfiguration_ImportType() {
		return (EAttribute)sheetConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheetConfiguration_ExportType() {
		return (EAttribute)sheetConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheetConfiguration_ItemClassName() {
		return (EAttribute)sheetConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSheetConfiguration_Column() {
		return (EReference)sheetConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheetConfiguration_FirstDataColumn() {
		return (EAttribute)sheetConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheetConfiguration_FirstDataRow() {
		return (EAttribute)sheetConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheetConfiguration_HeaderRow() {
		return (EAttribute)sheetConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheetConfiguration_IdColumn() {
		return (EAttribute)sheetConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheetConfiguration_IdPrefix() {
		return (EAttribute)sheetConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheetConfiguration_SheetName() {
		return (EAttribute)sheetConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExcelAdapterConfigurationFactory getExcelAdapterConfigurationFactory() {
		return (ExcelAdapterConfigurationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		columnConfigurationEClass = createEClass(COLUMN_CONFIGURATION);
		createEAttribute(columnConfigurationEClass, COLUMN_CONFIGURATION__JAVA_PROPERTY);
		createEAttribute(columnConfigurationEClass, COLUMN_CONFIGURATION__JAVA_PROPERTY_EXPORT);
		createEAttribute(columnConfigurationEClass, COLUMN_CONFIGURATION__MULTIPLE);
		createEAttribute(columnConfigurationEClass, COLUMN_CONFIGURATION__REFERENCES);
		createEAttribute(columnConfigurationEClass, COLUMN_CONFIGURATION__COLUMN_NAME);
		createEAttribute(columnConfigurationEClass, COLUMN_CONFIGURATION__SEPARATOR_CHAR);
		createEAttribute(columnConfigurationEClass, COLUMN_CONFIGURATION__VALUE_MAPPER);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLUMN_CONFIGURATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXCEL_CONFIGURATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SHEET_CONFIGURATION);

		excelConfigurationEClass = createEClass(EXCEL_CONFIGURATION);
		createEReference(excelConfigurationEClass, EXCEL_CONFIGURATION__SHEET);

		sheetConfigurationEClass = createEClass(SHEET_CONFIGURATION);
		createEAttribute(sheetConfigurationEClass, SHEET_CONFIGURATION__IMPORT_TYPE);
		createEAttribute(sheetConfigurationEClass, SHEET_CONFIGURATION__EXPORT_TYPE);
		createEAttribute(sheetConfigurationEClass, SHEET_CONFIGURATION__ITEM_CLASS_NAME);
		createEReference(sheetConfigurationEClass, SHEET_CONFIGURATION__COLUMN);
		createEAttribute(sheetConfigurationEClass, SHEET_CONFIGURATION__FIRST_DATA_COLUMN);
		createEAttribute(sheetConfigurationEClass, SHEET_CONFIGURATION__FIRST_DATA_ROW);
		createEAttribute(sheetConfigurationEClass, SHEET_CONFIGURATION__HEADER_ROW);
		createEAttribute(sheetConfigurationEClass, SHEET_CONFIGURATION__ID_COLUMN);
		createEAttribute(sheetConfigurationEClass, SHEET_CONFIGURATION__ID_PREFIX);
		createEAttribute(sheetConfigurationEClass, SHEET_CONFIGURATION__SHEET_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(columnConfigurationEClass, ColumnConfiguration.class, "ColumnConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnConfiguration_JavaProperty(), theXMLTypePackage.getString(), "javaProperty", null, 1, 1, ColumnConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnConfiguration_JavaPropertyExport(), theXMLTypePackage.getString(), "javaPropertyExport", null, 0, 1, ColumnConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnConfiguration_Multiple(), theXMLTypePackage.getBoolean(), "multiple", "false", 1, 1, ColumnConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnConfiguration_References(), theXMLTypePackage.getString(), "references", null, 0, -1, ColumnConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnConfiguration_ColumnName(), theXMLTypePackage.getString(), "columnName", null, 1, 1, ColumnConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnConfiguration_SeparatorChar(), theXMLTypePackage.getString(), "separatorChar", ";", 0, 1, ColumnConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnConfiguration_ValueMapper(), theXMLTypePackage.getString(), "valueMapper", null, 0, 1, ColumnConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ColumnConfiguration(), this.getColumnConfiguration(), null, "columnConfiguration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExcelConfiguration(), this.getExcelConfiguration(), null, "excelConfiguration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SheetConfiguration(), this.getSheetConfiguration(), null, "sheetConfiguration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(excelConfigurationEClass, ExcelConfiguration.class, "ExcelConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExcelConfiguration_Sheet(), this.getSheetConfiguration(), null, "sheet", null, 1, -1, ExcelConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sheetConfigurationEClass, SheetConfiguration.class, "SheetConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSheetConfiguration_ImportType(), theXMLTypePackage.getString(), "importType", null, 1, 1, SheetConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheetConfiguration_ExportType(), theXMLTypePackage.getString(), "exportType", null, 1, 1, SheetConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheetConfiguration_ItemClassName(), theXMLTypePackage.getString(), "itemClassName", null, 0, -1, SheetConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSheetConfiguration_Column(), this.getColumnConfiguration(), null, "column", null, 1, -1, SheetConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheetConfiguration_FirstDataColumn(), theXMLTypePackage.getString(), "firstDataColumn", "B", 0, 1, SheetConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheetConfiguration_FirstDataRow(), theXMLTypePackage.getInt(), "firstDataRow", "2", 0, 1, SheetConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheetConfiguration_HeaderRow(), theXMLTypePackage.getInt(), "headerRow", "1", 0, 1, SheetConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheetConfiguration_IdColumn(), theXMLTypePackage.getString(), "idColumn", null, 1, 1, SheetConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheetConfiguration_IdPrefix(), theXMLTypePackage.getString(), "idPrefix", null, 1, 1, SheetConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSheetConfiguration_SheetName(), theXMLTypePackage.getString(), "sheetName", null, 1, 1, SheetConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (columnConfigurationEClass,
		   source,
		   new String[] {
			   "name", "ColumnConfiguration",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getColumnConfiguration_JavaProperty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "javaProperty",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getColumnConfiguration_JavaPropertyExport(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "javaPropertyExport",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getColumnConfiguration_Multiple(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "multiple",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getColumnConfiguration_References(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "references",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getColumnConfiguration_ColumnName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "columnName"
		   });
		addAnnotation
		  (getColumnConfiguration_SeparatorChar(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "separatorChar"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_ColumnConfiguration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ColumnConfiguration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ExcelConfiguration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExcelConfiguration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SheetConfiguration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SheetConfiguration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (excelConfigurationEClass,
		   source,
		   new String[] {
			   "name", "ExcelConfiguration",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExcelConfiguration_Sheet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sheet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sheetConfigurationEClass,
		   source,
		   new String[] {
			   "name", "SheetConfiguration",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSheetConfiguration_ImportType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "importType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSheetConfiguration_ExportType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "exportType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSheetConfiguration_ItemClassName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "itemClassName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSheetConfiguration_Column(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "column",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSheetConfiguration_FirstDataColumn(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "firstDataColumn"
		   });
		addAnnotation
		  (getSheetConfiguration_FirstDataRow(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "firstDataRow"
		   });
		addAnnotation
		  (getSheetConfiguration_HeaderRow(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "headerRow"
		   });
		addAnnotation
		  (getSheetConfiguration_IdColumn(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "idColumn"
		   });
		addAnnotation
		  (getSheetConfiguration_IdPrefix(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "idPrefix"
		   });
		addAnnotation
		  (getSheetConfiguration_SheetName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sheetName"
		   });
	}

} //ExcelAdapterConfigurationPackageImpl
