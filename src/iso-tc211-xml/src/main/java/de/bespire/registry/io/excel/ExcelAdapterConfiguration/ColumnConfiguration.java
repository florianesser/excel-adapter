/**
 */
package de.bespire.registry.io.excel.ExcelAdapterConfiguration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#getJavaProperty <em>Java Property</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#getJavaPropertyExport <em>Java Property Export</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#getReferences <em>References</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#getSeparatorChar <em>Separator Char</em>}</li>
 * </ul>
 *
 * @see de.bespire.registry.io.excel.ExcelAdapterConfiguration.ExcelAdapterConfigurationPackage#getColumnConfiguration()
 * @model extendedMetaData="name='ColumnConfiguration' kind='elementOnly'"
 * @generated
 */
public interface ColumnConfiguration extends EObject
{
	/**
	 * Returns the value of the '<em><b>Java Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Property</em>' attribute.
	 * @see #setJavaProperty(String)
	 * @see de.bespire.registry.io.excel.ExcelAdapterConfiguration.ExcelAdapterConfigurationPackage#getColumnConfiguration_JavaProperty()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='javaProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJavaProperty();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#getJavaProperty <em>Java Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Property</em>' attribute.
	 * @see #getJavaProperty()
	 * @generated
	 */
	void setJavaProperty(String value);

	/**
	 * Returns the value of the '<em><b>Java Property Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Property Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Property Export</em>' attribute.
	 * @see #setJavaPropertyExport(String)
	 * @see de.bespire.registry.io.excel.ExcelAdapterConfiguration.ExcelAdapterConfigurationPackage#getColumnConfiguration_JavaPropertyExport()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='javaPropertyExport' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJavaPropertyExport();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#getJavaPropertyExport <em>Java Property Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Property Export</em>' attribute.
	 * @see #getJavaPropertyExport()
	 * @generated
	 */
	void setJavaPropertyExport(String value);

	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #isSetMultiple()
	 * @see #unsetMultiple()
	 * @see #setMultiple(boolean)
	 * @see de.bespire.registry.io.excel.ExcelAdapterConfiguration.ExcelAdapterConfigurationPackage#getColumnConfiguration_Multiple()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='multiple' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isSetMultiple()
	 * @see #unsetMultiple()
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);

	/**
	 * Unsets the value of the '{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiple()
	 * @see #isMultiple()
	 * @see #setMultiple(boolean)
	 * @generated
	 */
	void unsetMultiple();

	/**
	 * Returns whether the value of the '{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#isMultiple <em>Multiple</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiple</em>' attribute is set.
	 * @see #unsetMultiple()
	 * @see #isMultiple()
	 * @see #setMultiple(boolean)
	 * @generated
	 */
	boolean isSetMultiple();

	/**
	 * Returns the value of the '<em><b>References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' attribute.
	 * @see #setReferences(String)
	 * @see de.bespire.registry.io.excel.ExcelAdapterConfiguration.ExcelAdapterConfigurationPackage#getColumnConfiguration_References()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='references' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReferences();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#getReferences <em>References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' attribute.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(String value);

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see de.bespire.registry.io.excel.ExcelAdapterConfiguration.ExcelAdapterConfigurationPackage#getColumnConfiguration_ColumnName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='columnName'"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Separator Char</b></em>' attribute.
	 * The default value is <code>";"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator Char</em>' attribute.
	 * @see #isSetSeparatorChar()
	 * @see #unsetSeparatorChar()
	 * @see #setSeparatorChar(String)
	 * @see de.bespire.registry.io.excel.ExcelAdapterConfiguration.ExcelAdapterConfigurationPackage#getColumnConfiguration_SeparatorChar()
	 * @model default=";" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='separatorChar'"
	 * @generated
	 */
	String getSeparatorChar();

	/**
	 * Sets the value of the '{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#getSeparatorChar <em>Separator Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator Char</em>' attribute.
	 * @see #isSetSeparatorChar()
	 * @see #unsetSeparatorChar()
	 * @see #getSeparatorChar()
	 * @generated
	 */
	void setSeparatorChar(String value);

	/**
	 * Unsets the value of the '{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#getSeparatorChar <em>Separator Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeparatorChar()
	 * @see #getSeparatorChar()
	 * @see #setSeparatorChar(String)
	 * @generated
	 */
	void unsetSeparatorChar();

	/**
	 * Returns whether the value of the '{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration#getSeparatorChar <em>Separator Char</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Separator Char</em>' attribute is set.
	 * @see #unsetSeparatorChar()
	 * @see #getSeparatorChar()
	 * @see #setSeparatorChar(String)
	 * @generated
	 */
	boolean isSetSeparatorChar();

} // ColumnConfiguration
