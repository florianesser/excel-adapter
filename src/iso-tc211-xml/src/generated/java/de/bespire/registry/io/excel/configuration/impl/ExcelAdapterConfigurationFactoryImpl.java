/**
 */
package de.bespire.registry.io.excel.configuration.impl;

import de.bespire.registry.io.excel.configuration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcelAdapterConfigurationFactoryImpl extends EFactoryImpl implements ExcelAdapterConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExcelAdapterConfigurationFactory init() {
		try {
			ExcelAdapterConfigurationFactory theExcelAdapterConfigurationFactory = (ExcelAdapterConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(ExcelAdapterConfigurationPackage.eNS_URI);
			if (theExcelAdapterConfigurationFactory != null) {
				return theExcelAdapterConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExcelAdapterConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcelAdapterConfigurationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION: return createColumnConfiguration();
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ExcelAdapterConfigurationPackage.EXCEL_CONFIGURATION: return createExcelConfiguration();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION: return createSheetConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnConfiguration createColumnConfiguration() {
		ColumnConfigurationImpl columnConfiguration = new ColumnConfigurationImpl();
		return columnConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExcelConfiguration createExcelConfiguration() {
		ExcelConfigurationImpl excelConfiguration = new ExcelConfigurationImpl();
		return excelConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SheetConfiguration createSheetConfiguration() {
		SheetConfigurationImpl sheetConfiguration = new SheetConfigurationImpl();
		return sheetConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExcelAdapterConfigurationPackage getExcelAdapterConfigurationPackage() {
		return (ExcelAdapterConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExcelAdapterConfigurationPackage getPackage() {
		return ExcelAdapterConfigurationPackage.eINSTANCE;
	}

} //ExcelAdapterConfigurationFactoryImpl
