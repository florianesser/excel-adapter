/**
 */
package de.bespire.registry.io.excel.configuration.impl;

import de.bespire.registry.io.excel.configuration.ColumnConfiguration;
import de.bespire.registry.io.excel.configuration.DocumentRoot;
import de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage;
import de.bespire.registry.io.excel.configuration.ExcelConfiguration;
import de.bespire.registry.io.excel.configuration.SheetConfiguration;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.DocumentRootImpl#getColumnConfiguration <em>Column Configuration</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.DocumentRootImpl#getExcelConfiguration <em>Excel Configuration</em>}</li>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.DocumentRootImpl#getSheetConfiguration <em>Sheet Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExcelAdapterConfigurationPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnConfiguration getColumnConfiguration() {
		return (ColumnConfiguration)getMixed().get(ExcelAdapterConfigurationPackage.Literals.DOCUMENT_ROOT__COLUMN_CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnConfiguration(ColumnConfiguration newColumnConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExcelAdapterConfigurationPackage.Literals.DOCUMENT_ROOT__COLUMN_CONFIGURATION, newColumnConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnConfiguration(ColumnConfiguration newColumnConfiguration) {
		((FeatureMap.Internal)getMixed()).set(ExcelAdapterConfigurationPackage.Literals.DOCUMENT_ROOT__COLUMN_CONFIGURATION, newColumnConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExcelConfiguration getExcelConfiguration() {
		return (ExcelConfiguration)getMixed().get(ExcelAdapterConfigurationPackage.Literals.DOCUMENT_ROOT__EXCEL_CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcelConfiguration(ExcelConfiguration newExcelConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExcelAdapterConfigurationPackage.Literals.DOCUMENT_ROOT__EXCEL_CONFIGURATION, newExcelConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcelConfiguration(ExcelConfiguration newExcelConfiguration) {
		((FeatureMap.Internal)getMixed()).set(ExcelAdapterConfigurationPackage.Literals.DOCUMENT_ROOT__EXCEL_CONFIGURATION, newExcelConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SheetConfiguration getSheetConfiguration() {
		return (SheetConfiguration)getMixed().get(ExcelAdapterConfigurationPackage.Literals.DOCUMENT_ROOT__SHEET_CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheetConfiguration(SheetConfiguration newSheetConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ExcelAdapterConfigurationPackage.Literals.DOCUMENT_ROOT__SHEET_CONFIGURATION, newSheetConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSheetConfiguration(SheetConfiguration newSheetConfiguration) {
		((FeatureMap.Internal)getMixed()).set(ExcelAdapterConfigurationPackage.Literals.DOCUMENT_ROOT__SHEET_CONFIGURATION, newSheetConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__COLUMN_CONFIGURATION:
				return basicSetColumnConfiguration(null, msgs);
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__EXCEL_CONFIGURATION:
				return basicSetExcelConfiguration(null, msgs);
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__SHEET_CONFIGURATION:
				return basicSetSheetConfiguration(null, msgs);
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
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__COLUMN_CONFIGURATION:
				return getColumnConfiguration();
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__EXCEL_CONFIGURATION:
				return getExcelConfiguration();
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__SHEET_CONFIGURATION:
				return getSheetConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__COLUMN_CONFIGURATION:
				setColumnConfiguration((ColumnConfiguration)newValue);
				return;
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__EXCEL_CONFIGURATION:
				setExcelConfiguration((ExcelConfiguration)newValue);
				return;
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__SHEET_CONFIGURATION:
				setSheetConfiguration((SheetConfiguration)newValue);
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
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__COLUMN_CONFIGURATION:
				setColumnConfiguration((ColumnConfiguration)null);
				return;
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__EXCEL_CONFIGURATION:
				setExcelConfiguration((ExcelConfiguration)null);
				return;
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__SHEET_CONFIGURATION:
				setSheetConfiguration((SheetConfiguration)null);
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
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__COLUMN_CONFIGURATION:
				return getColumnConfiguration() != null;
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__EXCEL_CONFIGURATION:
				return getExcelConfiguration() != null;
			case ExcelAdapterConfigurationPackage.DOCUMENT_ROOT__SHEET_CONFIGURATION:
				return getSheetConfiguration() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
