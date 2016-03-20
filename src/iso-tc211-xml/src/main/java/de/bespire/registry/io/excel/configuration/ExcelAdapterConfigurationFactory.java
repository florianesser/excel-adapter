/**
 */
package de.bespire.registry.io.excel.configuration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage
 * @generated
 */
public interface ExcelAdapterConfigurationFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExcelAdapterConfigurationFactory eINSTANCE = de.bespire.registry.io.excel.configuration.impl.ExcelAdapterConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Column Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Configuration</em>'.
	 * @generated
	 */
	ColumnConfiguration createColumnConfiguration();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Excel Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excel Configuration</em>'.
	 * @generated
	 */
	ExcelConfiguration createExcelConfiguration();

	/**
	 * Returns a new object of class '<em>Sheet Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sheet Configuration</em>'.
	 * @generated
	 */
	SheetConfiguration createSheetConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExcelAdapterConfigurationPackage getExcelAdapterConfigurationPackage();

} //ExcelAdapterConfigurationFactory
