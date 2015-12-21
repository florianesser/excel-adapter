/**
 */
package de.bespire.registry.io.excel.ExcelAdapterConfiguration.impl;

import de.bespire.registry.io.excel.ExcelAdapterConfiguration.ColumnConfiguration;
import de.bespire.registry.io.excel.ExcelAdapterConfiguration.ExcelAdapterConfigurationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.impl.ColumnConfigurationImpl#getJavaProperty <em>Java Property</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.impl.ColumnConfigurationImpl#getJavaPropertyExport <em>Java Property Export</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.impl.ColumnConfigurationImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.impl.ColumnConfigurationImpl#getReferences <em>References</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.impl.ColumnConfigurationImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.ExcelAdapterConfiguration.impl.ColumnConfigurationImpl#getSeparatorChar <em>Separator Char</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnConfigurationImpl extends MinimalEObjectImpl.Container implements ColumnConfiguration
{
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
	 * The default value of the '{@link #getReferences() <em>References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected String references = REFERENCES_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnConfigurationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ExcelAdapterConfigurationPackage.Literals.COLUMN_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaProperty()
	{
		return javaProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaProperty(String newJavaProperty)
	{
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
	public String getJavaPropertyExport()
	{
		return javaPropertyExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaPropertyExport(String newJavaPropertyExport)
	{
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
	public boolean isMultiple()
	{
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiple(boolean newMultiple)
	{
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
	public void unsetMultiple()
	{
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
	public boolean isSetMultiple()
	{
		return multipleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferences()
	{
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(String newReferences)
	{
		String oldReferences = references;
		references = newReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__REFERENCES, oldReferences, references));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName()
	{
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName)
	{
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
	public String getSeparatorChar()
	{
		return separatorChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparatorChar(String newSeparatorChar)
	{
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
	public void unsetSeparatorChar()
	{
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
	public boolean isSetSeparatorChar()
	{
		return separatorCharESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
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
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
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
				setReferences((String)newValue);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__SEPARATOR_CHAR:
				setSeparatorChar((String)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
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
				setReferences(REFERENCES_EDEFAULT);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__SEPARATOR_CHAR:
				unsetSeparatorChar();
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__JAVA_PROPERTY:
				return JAVA_PROPERTY_EDEFAULT == null ? javaProperty != null : !JAVA_PROPERTY_EDEFAULT.equals(javaProperty);
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__JAVA_PROPERTY_EXPORT:
				return JAVA_PROPERTY_EXPORT_EDEFAULT == null ? javaPropertyExport != null : !JAVA_PROPERTY_EXPORT_EDEFAULT.equals(javaPropertyExport);
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__MULTIPLE:
				return isSetMultiple();
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__REFERENCES:
				return REFERENCES_EDEFAULT == null ? references != null : !REFERENCES_EDEFAULT.equals(references);
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case ExcelAdapterConfigurationPackage.COLUMN_CONFIGURATION__SEPARATOR_CHAR:
				return isSetSeparatorChar();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
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
		result.append(')');
		return result.toString();
	}

} //ColumnConfigurationImpl
