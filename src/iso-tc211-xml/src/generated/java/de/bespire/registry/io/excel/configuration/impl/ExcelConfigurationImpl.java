/**
 */
package de.bespire.registry.io.excel.configuration.impl;

import de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage;
import de.bespire.registry.io.excel.configuration.ExcelConfiguration;
import de.bespire.registry.io.excel.configuration.SheetConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Excel Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.bespire.registry.io.excel.configuration.impl.ExcelConfigurationImpl#getSheet <em>Sheet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcelConfigurationImpl extends MinimalEObjectImpl.Container implements ExcelConfiguration {
	/**
	 * The cached value of the '{@link #getSheet() <em>Sheet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet()
	 * @generated
	 * @ordered
	 */
	protected EList<SheetConfiguration> sheet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcelConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExcelAdapterConfigurationPackage.Literals.EXCEL_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SheetConfiguration> getSheet() {
		if (sheet == null) {
			sheet = new EObjectContainmentEList<SheetConfiguration>(SheetConfiguration.class, this, ExcelAdapterConfigurationPackage.EXCEL_CONFIGURATION__SHEET);
		}
		return sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExcelAdapterConfigurationPackage.EXCEL_CONFIGURATION__SHEET:
				return ((InternalEList<?>)getSheet()).basicRemove(otherEnd, msgs);
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
			case ExcelAdapterConfigurationPackage.EXCEL_CONFIGURATION__SHEET:
				return getSheet();
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
			case ExcelAdapterConfigurationPackage.EXCEL_CONFIGURATION__SHEET:
				getSheet().clear();
				getSheet().addAll((Collection<? extends SheetConfiguration>)newValue);
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
			case ExcelAdapterConfigurationPackage.EXCEL_CONFIGURATION__SHEET:
				getSheet().clear();
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
			case ExcelAdapterConfigurationPackage.EXCEL_CONFIGURATION__SHEET:
				return sheet != null && !sheet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExcelConfigurationImpl
