/**
 */
package de.bespire.registry.io.excel.configuration.impl;

import de.bespire.registry.io.excel.configuration.ColumnConfiguration;
import de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage;
import de.bespire.registry.io.excel.configuration.SheetConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheet Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl#getImportType <em>Import Type</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl#getExportType <em>Export Type</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl#getItemClassName <em>Item Class Name</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl#getFirstDataColumn <em>First Data Column</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl#getFirstDataRow <em>First Data Row</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl#getHeaderRow <em>Header Row</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl#getIdColumn <em>Id Column</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl#getIdPrefix <em>Id Prefix</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.SheetConfigurationImpl#getSheetName <em>Sheet Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SheetConfigurationImpl extends MinimalEObjectImpl.Container implements SheetConfiguration {
	/**
	 * The default value of the '{@link #getImportType() <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportType()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportType() <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportType()
	 * @generated
	 * @ordered
	 */
	protected String importType = IMPORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExportType() <em>Export Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExportType() <em>Export Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportType()
	 * @generated
	 * @ordered
	 */
	protected String exportType = EXPORT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItemClassName() <em>Item Class Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemClassName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> itemClassName;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnConfiguration> column;

	/**
	 * The default value of the '{@link #getFirstDataColumn() <em>First Data Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstDataColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_DATA_COLUMN_EDEFAULT = "B";

	/**
	 * The cached value of the '{@link #getFirstDataColumn() <em>First Data Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstDataColumn()
	 * @generated
	 * @ordered
	 */
	protected String firstDataColumn = FIRST_DATA_COLUMN_EDEFAULT;

	/**
	 * This is true if the First Data Column attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstDataColumnESet;

	/**
	 * The default value of the '{@link #getFirstDataRow() <em>First Data Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstDataRow()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_DATA_ROW_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getFirstDataRow() <em>First Data Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstDataRow()
	 * @generated
	 * @ordered
	 */
	protected int firstDataRow = FIRST_DATA_ROW_EDEFAULT;

	/**
	 * This is true if the First Data Row attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstDataRowESet;

	/**
	 * The default value of the '{@link #getHeaderRow() <em>Header Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderRow()
	 * @generated
	 * @ordered
	 */
	protected static final int HEADER_ROW_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getHeaderRow() <em>Header Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderRow()
	 * @generated
	 * @ordered
	 */
	protected int headerRow = HEADER_ROW_EDEFAULT;

	/**
	 * This is true if the Header Row attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean headerRowESet;

	/**
	 * The default value of the '{@link #getIdColumn() <em>Id Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdColumn() <em>Id Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdColumn()
	 * @generated
	 * @ordered
	 */
	protected String idColumn = ID_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdPrefix() <em>Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdPrefix() <em>Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPrefix()
	 * @generated
	 * @ordered
	 */
	protected String idPrefix = ID_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSheetName() <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSheetName() <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetName()
	 * @generated
	 * @ordered
	 */
	protected String sheetName = SHEET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SheetConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExcelAdapterConfigurationPackage.Literals.SHEET_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImportType() {
		return importType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportType(String newImportType) {
		String oldImportType = importType;
		importType = newImportType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__IMPORT_TYPE, oldImportType, importType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExportType() {
		return exportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExportType(String newExportType) {
		String oldExportType = exportType;
		exportType = newExportType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__EXPORT_TYPE, oldExportType, exportType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getItemClassName() {
		if (itemClassName == null) {
			itemClassName = new EDataTypeEList<String>(String.class, this, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ITEM_CLASS_NAME);
		}
		return itemClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ColumnConfiguration> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<ColumnConfiguration>(ColumnConfiguration.class, this, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstDataColumn() {
		return firstDataColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstDataColumn(String newFirstDataColumn) {
		String oldFirstDataColumn = firstDataColumn;
		firstDataColumn = newFirstDataColumn;
		boolean oldFirstDataColumnESet = firstDataColumnESet;
		firstDataColumnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__FIRST_DATA_COLUMN, oldFirstDataColumn, firstDataColumn, !oldFirstDataColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFirstDataColumn() {
		String oldFirstDataColumn = firstDataColumn;
		boolean oldFirstDataColumnESet = firstDataColumnESet;
		firstDataColumn = FIRST_DATA_COLUMN_EDEFAULT;
		firstDataColumnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__FIRST_DATA_COLUMN, oldFirstDataColumn, FIRST_DATA_COLUMN_EDEFAULT, oldFirstDataColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFirstDataColumn() {
		return firstDataColumnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFirstDataRow() {
		return firstDataRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstDataRow(int newFirstDataRow) {
		int oldFirstDataRow = firstDataRow;
		firstDataRow = newFirstDataRow;
		boolean oldFirstDataRowESet = firstDataRowESet;
		firstDataRowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__FIRST_DATA_ROW, oldFirstDataRow, firstDataRow, !oldFirstDataRowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFirstDataRow() {
		int oldFirstDataRow = firstDataRow;
		boolean oldFirstDataRowESet = firstDataRowESet;
		firstDataRow = FIRST_DATA_ROW_EDEFAULT;
		firstDataRowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__FIRST_DATA_ROW, oldFirstDataRow, FIRST_DATA_ROW_EDEFAULT, oldFirstDataRowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFirstDataRow() {
		return firstDataRowESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeaderRow() {
		return headerRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderRow(int newHeaderRow) {
		int oldHeaderRow = headerRow;
		headerRow = newHeaderRow;
		boolean oldHeaderRowESet = headerRowESet;
		headerRowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__HEADER_ROW, oldHeaderRow, headerRow, !oldHeaderRowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHeaderRow() {
		int oldHeaderRow = headerRow;
		boolean oldHeaderRowESet = headerRowESet;
		headerRow = HEADER_ROW_EDEFAULT;
		headerRowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__HEADER_ROW, oldHeaderRow, HEADER_ROW_EDEFAULT, oldHeaderRowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHeaderRow() {
		return headerRowESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdColumn() {
		return idColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdColumn(String newIdColumn) {
		String oldIdColumn = idColumn;
		idColumn = newIdColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ID_COLUMN, oldIdColumn, idColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdPrefix() {
		return idPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdPrefix(String newIdPrefix) {
		String oldIdPrefix = idPrefix;
		idPrefix = newIdPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ID_PREFIX, oldIdPrefix, idPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSheetName(String newSheetName) {
		String oldSheetName = sheetName;
		sheetName = newSheetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__SHEET_NAME, oldSheetName, sheetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__IMPORT_TYPE:
				return getImportType();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__EXPORT_TYPE:
				return getExportType();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ITEM_CLASS_NAME:
				return getItemClassName();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__COLUMN:
				return getColumn();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__FIRST_DATA_COLUMN:
				return getFirstDataColumn();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__FIRST_DATA_ROW:
				return getFirstDataRow();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__HEADER_ROW:
				return getHeaderRow();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ID_COLUMN:
				return getIdColumn();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ID_PREFIX:
				return getIdPrefix();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__SHEET_NAME:
				return getSheetName();
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
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__IMPORT_TYPE:
				setImportType((String)newValue);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__EXPORT_TYPE:
				setExportType((String)newValue);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ITEM_CLASS_NAME:
				getItemClassName().clear();
				getItemClassName().addAll((Collection<? extends String>)newValue);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends ColumnConfiguration>)newValue);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__FIRST_DATA_COLUMN:
				setFirstDataColumn((String)newValue);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__FIRST_DATA_ROW:
				setFirstDataRow((Integer)newValue);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__HEADER_ROW:
				setHeaderRow((Integer)newValue);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ID_COLUMN:
				setIdColumn((String)newValue);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ID_PREFIX:
				setIdPrefix((String)newValue);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__SHEET_NAME:
				setSheetName((String)newValue);
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
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__IMPORT_TYPE:
				setImportType(IMPORT_TYPE_EDEFAULT);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__EXPORT_TYPE:
				setExportType(EXPORT_TYPE_EDEFAULT);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ITEM_CLASS_NAME:
				getItemClassName().clear();
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__COLUMN:
				getColumn().clear();
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__FIRST_DATA_COLUMN:
				unsetFirstDataColumn();
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__FIRST_DATA_ROW:
				unsetFirstDataRow();
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__HEADER_ROW:
				unsetHeaderRow();
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ID_COLUMN:
				setIdColumn(ID_COLUMN_EDEFAULT);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ID_PREFIX:
				setIdPrefix(ID_PREFIX_EDEFAULT);
				return;
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__SHEET_NAME:
				setSheetName(SHEET_NAME_EDEFAULT);
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
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__IMPORT_TYPE:
				return IMPORT_TYPE_EDEFAULT == null ? importType != null : !IMPORT_TYPE_EDEFAULT.equals(importType);
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__EXPORT_TYPE:
				return EXPORT_TYPE_EDEFAULT == null ? exportType != null : !EXPORT_TYPE_EDEFAULT.equals(exportType);
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ITEM_CLASS_NAME:
				return itemClassName != null && !itemClassName.isEmpty();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__COLUMN:
				return column != null && !column.isEmpty();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__FIRST_DATA_COLUMN:
				return isSetFirstDataColumn();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__FIRST_DATA_ROW:
				return isSetFirstDataRow();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__HEADER_ROW:
				return isSetHeaderRow();
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ID_COLUMN:
				return ID_COLUMN_EDEFAULT == null ? idColumn != null : !ID_COLUMN_EDEFAULT.equals(idColumn);
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__ID_PREFIX:
				return ID_PREFIX_EDEFAULT == null ? idPrefix != null : !ID_PREFIX_EDEFAULT.equals(idPrefix);
			case ExcelAdapterConfigurationPackage.SHEET_CONFIGURATION__SHEET_NAME:
				return SHEET_NAME_EDEFAULT == null ? sheetName != null : !SHEET_NAME_EDEFAULT.equals(sheetName);
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
		result.append(" (importType: ");
		result.append(importType);
		result.append(", exportType: ");
		result.append(exportType);
		result.append(", itemClassName: ");
		result.append(itemClassName);
		result.append(", firstDataColumn: ");
		if (firstDataColumnESet) result.append(firstDataColumn); else result.append("<unset>");
		result.append(", firstDataRow: ");
		if (firstDataRowESet) result.append(firstDataRow); else result.append("<unset>");
		result.append(", headerRow: ");
		if (headerRowESet) result.append(headerRow); else result.append("<unset>");
		result.append(", idColumn: ");
		result.append(idColumn);
		result.append(", idPrefix: ");
		result.append(idPrefix);
		result.append(", sheetName: ");
		result.append(sheetName);
		result.append(')');
		return result.toString();
	}

} //SheetConfigurationImpl
