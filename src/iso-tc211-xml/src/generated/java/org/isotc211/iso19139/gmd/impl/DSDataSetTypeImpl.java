/**
 */
package org.isotc211.iso19139.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211.iso19139.gco.impl.AbstractObjectTypeImpl;

import org.isotc211.iso19139.gmd.DSAggregatePropertyType;
import org.isotc211.iso19139.gmd.DSDataSetType;
import org.isotc211.iso19139.gmd.GMDPackage;
import org.isotc211.iso19139.gmd.MDMetadataPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Data Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.DSDataSetTypeImpl#getHas <em>Has</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.DSDataSetTypeImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSDataSetTypeImpl extends AbstractObjectTypeImpl implements DSDataSetType {
	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<MDMetadataPropertyType> has;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected EList<DSAggregatePropertyType> partOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSDataSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getDSDataSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDMetadataPropertyType> getHas() {
		if (has == null) {
			has = new EObjectContainmentEList<MDMetadataPropertyType>(MDMetadataPropertyType.class, this, GMDPackage.DS_DATA_SET_TYPE__HAS);
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DSAggregatePropertyType> getPartOf() {
		if (partOf == null) {
			partOf = new EObjectContainmentEList<DSAggregatePropertyType>(DSAggregatePropertyType.class, this, GMDPackage.DS_DATA_SET_TYPE__PART_OF);
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.DS_DATA_SET_TYPE__HAS:
				return ((InternalEList<?>)getHas()).basicRemove(otherEnd, msgs);
			case GMDPackage.DS_DATA_SET_TYPE__PART_OF:
				return ((InternalEList<?>)getPartOf()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.DS_DATA_SET_TYPE__HAS:
				return getHas();
			case GMDPackage.DS_DATA_SET_TYPE__PART_OF:
				return getPartOf();
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
			case GMDPackage.DS_DATA_SET_TYPE__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends MDMetadataPropertyType>)newValue);
				return;
			case GMDPackage.DS_DATA_SET_TYPE__PART_OF:
				getPartOf().clear();
				getPartOf().addAll((Collection<? extends DSAggregatePropertyType>)newValue);
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
			case GMDPackage.DS_DATA_SET_TYPE__HAS:
				getHas().clear();
				return;
			case GMDPackage.DS_DATA_SET_TYPE__PART_OF:
				getPartOf().clear();
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
			case GMDPackage.DS_DATA_SET_TYPE__HAS:
				return has != null && !has.isEmpty();
			case GMDPackage.DS_DATA_SET_TYPE__PART_OF:
				return partOf != null && !partOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DSDataSetTypeImpl
