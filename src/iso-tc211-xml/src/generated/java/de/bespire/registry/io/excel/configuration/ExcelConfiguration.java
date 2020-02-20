/**
 */
package de.bespire.registry.io.excel.configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Excel Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bespire.registry.io.excel.configuration.ExcelConfiguration#getSheet <em>Sheet</em>}</li>
 * </ul>
 *
 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getExcelConfiguration()
 * @model extendedMetaData="name='ExcelConfiguration' kind='elementOnly'"
 * @generated
 */
public interface ExcelConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' containment reference list.
	 * The list contents are of type {@link de.bespire.registry.io.excel.configuration.SheetConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' containment reference list.
	 * @see de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage#getExcelConfiguration_Sheet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SheetConfiguration> getSheet();

} // ExcelConfiguration
