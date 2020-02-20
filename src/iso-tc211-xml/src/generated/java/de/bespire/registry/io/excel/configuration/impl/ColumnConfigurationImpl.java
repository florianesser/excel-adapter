/**
 */
package de.bespire.registry.io.excel.configuration.impl;

import de.bespire.registry.io.excel.configuration.ColumnConfiguration;
import de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.ColumnConfigurationImpl#getJavaProperty <em>Java Property</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.ColumnConfigurationImpl#getJavaPropertyExport <em>Java Property Export</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.ColumnConfigurationImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.ColumnConfigurationImpl#getReferences <em>References</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.ColumnConfigurationImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.ColumnConfigurationImpl#getSeparatorChar <em>Separator Char</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.ColumnConfigurationImpl#getValueMapper <em>Value Mapper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnConfigurationImpl extends MinimalEObjectImpl.Container implements ColumnConfiguration {
	/**
	 * The default value of the '{@link #getJavaProperty() <em>Java Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaProperty() <em>Java Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaProperty()
	 * @generated
	 * @ordered
	 */
	protected String javaProperty = JAVA_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaPropertyExport() <em>Java Property Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaPropertyExport()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_PROPERTY_EXPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaPropertyExport() <em>Java Property Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaPropertyExport()
	 * @generated
	 * @ordered
	 */
	protected String javaPropertyExport = JAVA_PROPERTY_EXPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean multiple = MULTIPLE_EDEFAULT;

	/**
	 * This is true if the Multiple attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multipleESet;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> references;

	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeparatorChar() <em>Separator Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparatorChar()
	 * @generated
	 * @ordered
	 */
	protected static final String SEPARATOR_CHAR_EDEFAULT = ";";

	/**
	 * The cached value of the '{@link #getSeparatorChar() <em>Separator Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparatorChar()
	 * @generated
	 * @ordered
	 */
	protected String separatorChar = SEPARATOR_CHAR_EDEFAULT;

	/**
	 * This is true if the Separator Char attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean separatorCharESet;

	/**
	 * The default value of the '{@link #getValueMapper() <em>Value Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMapper()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_MAPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueMapper() <em>Value Mapper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMapper()
	 * @generated
	 * @ordered
	 */
	protected String valueMapper = VALUE_MAPPER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExcelAdapterConfigurationPackage.Literals.COLUMN_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJavaProperty() {
		return javaProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJavaProperty(String newJavaProperty) {
		String oldJavaProperty = javaProperty;
		javaProperty = newJavaProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__JAVA_PROPERTY, oldJavaProperty, javaProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJavaPropertyExport() {
		return javaPropertyExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJavaPropertyExport(String newJavaPropertyExport) {
		String oldJavaPropertyExport = javaPropertyExport;
		javaPropertyExport = newJavaPropertyExport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__JAVA_PROPERTY_EXPORT, oldJavaPropertyExport, javaPropertyExport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultiple() {
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiple(boolean newMultiple) {
		boolean oldMultiple = multiple;
		multiple = newMultiple;
		boolean oldMultipleESet = multipleESet;
		multipleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__MULTIPLE, oldMultiple, multiple, !oldMultipleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMultiple() {
		boolean oldMultiple = multiple;
		boolean oldMultipleESet = multipleESet;
		multiple = MULTIPLE_EDEFAULT;
		multipleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__MULTIPLE, oldMultiple, MULTIPLE_EDEFAULT, oldMultipleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMultiple() {
		return multipleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getReferences() {
		if (references == null) {
			references = new EDataTypeUniqueEList<String>(String.class, this, ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeparatorChar() {
		return separatorChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeparatorChar(String newSeparatorChar) {
		String oldSeparatorChar = separatorChar;
		separatorChar = newSeparatorChar;
		boolean oldSeparatorCharESet = separatorCharESet;
		separatorCharESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__SEPARATOR_CHAR, oldSeparatorChar, separatorChar, !oldSeparatorCharESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSeparatorChar() {
		String oldSeparatorChar = separatorChar;
		boolean oldSeparatorCharESet = separatorCharESet;
		separatorChar = SEPARATOR_CHAR_EDEFAULT;
		separatorCharESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__SEPARATOR_CHAR, oldSeparatorChar, SEPARATOR_CHAR_EDEFAULT, oldSeparatorCharESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSeparatorChar() {
		return separatorCharESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueMapper() {
		return valueMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueMapper(String newValueMapper) {
		String oldValueMapper = valueMapper;
		valueMapper = newValueMapper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__VALUE_MAPPER, oldValueMapper, valueMapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__JAVA_PROPERTY:
				return getJavaProperty();
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__JAVA_PROPERTY_EXPORT:
				return getJavaPropertyExport();
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__MULTIPLE:
				return isMultiple();
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__REFERENCES:
				return getReferences();
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__COLUMN_NAME:
				return getColumnName();
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__SEPARATOR_CHAR:
				return getSeparatorChar();
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__VALUE_MAPPER:
				return getValueMapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__JAVA_PROPERTY:
				setJavaProperty((String)newValue);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__JAVA_PROPERTY_EXPORT:
				setJavaPropertyExport((String)newValue);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__MULTIPLE:
				setMultiple((Boolean)newValue);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends String>)newValue);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__SEPARATOR_CHAR:
				setSeparatorChar((String)newValue);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__VALUE_MAPPER:
				setValueMapper((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__JAVA_PROPERTY:
				setJavaProperty(JAVA_PROPERTY_EDEFAULT);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__JAVA_PROPERTY_EXPORT:
				setJavaPropertyExport(JAVA_PROPERTY_EXPORT_EDEFAULT);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__MULTIPLE:
				unsetMultiple();
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__REFERENCES:
				getReferences().clear();
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__SEPARATOR_CHAR:
				unsetSeparatorChar();
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__VALUE_MAPPER:
				setValueMapper(VALUE_MAPPER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__JAVA_PROPERTY:
				return JAVA_PROPERTY_EDEFAULT == null ? javaProperty != null : !JAVA_PROPERTY_EDEFAULT.equals(javaProperty);
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__JAVA_PROPERTY_EXPORT:
				return JAVA_PROPERTY_EXPORT_EDEFAULT == null ? javaPropertyExport != null : !JAVA_PROPERTY_EXPORT_EDEFAULT.equals(javaPropertyExport);
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__MULTIPLE:
				return isSetMultiple();
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__REFERENCES:
				return references != null && !references.isEmpty();
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__SEPARATOR_CHAR:
				return isSetSeparatorChar();
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__VALUE_MAPPER:
				return VALUE_MAPPER_EDEFAULT == null ? valueMapper != null : !VALUE_MAPPER_EDEFAULT.equals(valueMapper);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (javaProperty: ");
		result.append(javaProperty);
		result.append(", javaPropertyExport: ");
		result.append(javaPropertyExport);
		result.append(", multiple: ");
		if (multipleESet) result.append(multiple); else result.append("<unset>");
		result.append(", references: ");
		result.append(references);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(", separatorChar: ");
		if (separatorCharESet) result.append(separatorChar); else result.append("<unset>");
		result.append(", valueMapper: ");
		result.append(valueMapper);
		result.append(')');
		return result.toString();
	}

} //ColumnConfigurationImpl
