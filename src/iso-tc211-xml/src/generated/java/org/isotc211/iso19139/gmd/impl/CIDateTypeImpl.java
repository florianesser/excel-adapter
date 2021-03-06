/**
 */
package org.isotc211.iso19139.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211.iso19139.gco.DatePropertyType;

import org.isotc211.iso19139.gco.impl.AbstractObjectTypeImpl;

import org.isotc211.iso19139.gmd.CIDateType;
import org.isotc211.iso19139.gmd.CIDateTypeCodePropertyType;
import org.isotc211.iso19139.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CI Date Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.CIDateTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.CIDateTypeImpl#getDateType <em>Date Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIDateTypeImpl extends AbstractObjectTypeImpl implements CIDateType
{
	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DatePropertyType date;

	/**
	 * The cached value of the '{@link #getDateType() <em>Date Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateType()
	 * @generated
	 * @ordered
	 */
	protected CIDateTypeCodePropertyType dateType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIDateTypeImpl()
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
		return GMDPackage.eINSTANCE.getCIDateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePropertyType getDate()
	{
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DatePropertyType newDate, NotificationChain msgs)
	{
		DatePropertyType oldDate = date;
		date = newDate;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_DATE_TYPE__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DatePropertyType newDate)
	{
		if (newDate != date)
		{
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_DATE_TYPE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_DATE_TYPE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_DATE_TYPE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIDateTypeCodePropertyType getDateType()
	{
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateType(CIDateTypeCodePropertyType newDateType, NotificationChain msgs)
	{
		CIDateTypeCodePropertyType oldDateType = dateType;
		dateType = newDateType;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_DATE_TYPE__DATE_TYPE, oldDateType, newDateType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateType(CIDateTypeCodePropertyType newDateType)
	{
		if (newDateType != dateType)
		{
			NotificationChain msgs = null;
			if (dateType != null)
				msgs = ((InternalEObject)dateType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_DATE_TYPE__DATE_TYPE, null, msgs);
			if (newDateType != null)
				msgs = ((InternalEObject)newDateType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_DATE_TYPE__DATE_TYPE, null, msgs);
			msgs = basicSetDateType(newDateType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_DATE_TYPE__DATE_TYPE, newDateType, newDateType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case GMDPackage.CI_DATE_TYPE__DATE:
				return basicSetDate(null, msgs);
			case GMDPackage.CI_DATE_TYPE__DATE_TYPE:
				return basicSetDateType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case GMDPackage.CI_DATE_TYPE__DATE:
				return getDate();
			case GMDPackage.CI_DATE_TYPE__DATE_TYPE:
				return getDateType();
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
			case GMDPackage.CI_DATE_TYPE__DATE:
				setDate((DatePropertyType)newValue);
				return;
			case GMDPackage.CI_DATE_TYPE__DATE_TYPE:
				setDateType((CIDateTypeCodePropertyType)newValue);
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
			case GMDPackage.CI_DATE_TYPE__DATE:
				setDate((DatePropertyType)null);
				return;
			case GMDPackage.CI_DATE_TYPE__DATE_TYPE:
				setDateType((CIDateTypeCodePropertyType)null);
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
			case GMDPackage.CI_DATE_TYPE__DATE:
				return date != null;
			case GMDPackage.CI_DATE_TYPE__DATE_TYPE:
				return dateType != null;
		}
		return super.eIsSet(featureID);
	}

} //CIDateTypeImpl
