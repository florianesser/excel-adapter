/**
 */
package org.isotc211.iso19139.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.isotc211.iso19139.gco.CodeListValueType;

import org.isotc211.iso19139.gmd.GMDPackage;
import org.isotc211.iso19139.gmd.MDProgressCodePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Progress Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDProgressCodePropertyTypeImpl#getMDProgressCode <em>MD Progress Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDProgressCodePropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDProgressCodePropertyTypeImpl extends MinimalEObjectImpl.Container implements MDProgressCodePropertyType
{
	/**
	 * The cached value of the '{@link #getMDProgressCode() <em>MD Progress Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDProgressCode()
	 * @generated
	 * @ordered
	 */
	protected CodeListValueType mDProgressCode;

	/**
	 * The default value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected static final Object NIL_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected Object nilReason = NIL_REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDProgressCodePropertyTypeImpl()
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
		return GMDPackage.eINSTANCE.getMDProgressCodePropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeListValueType getMDProgressCode()
	{
		return mDProgressCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDProgressCode(CodeListValueType newMDProgressCode, NotificationChain msgs)
	{
		CodeListValueType oldMDProgressCode = mDProgressCode;
		mDProgressCode = newMDProgressCode;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__MD_PROGRESS_CODE, oldMDProgressCode, newMDProgressCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMDProgressCode(CodeListValueType newMDProgressCode)
	{
		if (newMDProgressCode != mDProgressCode)
		{
			NotificationChain msgs = null;
			if (mDProgressCode != null)
				msgs = ((InternalEObject)mDProgressCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__MD_PROGRESS_CODE, null, msgs);
			if (newMDProgressCode != null)
				msgs = ((InternalEObject)newMDProgressCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__MD_PROGRESS_CODE, null, msgs);
			msgs = basicSetMDProgressCode(newMDProgressCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__MD_PROGRESS_CODE, newMDProgressCode, newMDProgressCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNilReason()
	{
		return nilReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNilReason(Object newNilReason)
	{
		Object oldNilReason = nilReason;
		nilReason = newNilReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
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
			case GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__MD_PROGRESS_CODE:
				return basicSetMDProgressCode(null, msgs);
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
			case GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__MD_PROGRESS_CODE:
				return getMDProgressCode();
			case GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__NIL_REASON:
				return getNilReason();
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
			case GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__MD_PROGRESS_CODE:
				setMDProgressCode((CodeListValueType)newValue);
				return;
			case GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__NIL_REASON:
				setNilReason(newValue);
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
			case GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__MD_PROGRESS_CODE:
				setMDProgressCode((CodeListValueType)null);
				return;
			case GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__NIL_REASON:
				setNilReason(NIL_REASON_EDEFAULT);
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
			case GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__MD_PROGRESS_CODE:
				return mDProgressCode != null;
			case GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE__NIL_REASON:
				return NIL_REASON_EDEFAULT == null ? nilReason != null : !NIL_REASON_EDEFAULT.equals(nilReason);
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
		result.append(" (nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //MDProgressCodePropertyTypeImpl
