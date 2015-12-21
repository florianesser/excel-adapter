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

import org.isotc211.iso19139.gmd.DSAssociationTypeCodePropertyType;
import org.isotc211.iso19139.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS Association Type Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.DSAssociationTypeCodePropertyTypeImpl#getDSAssociationTypeCode <em>DS Association Type Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.DSAssociationTypeCodePropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSAssociationTypeCodePropertyTypeImpl extends MinimalEObjectImpl.Container implements DSAssociationTypeCodePropertyType
{
	/**
	 * The cached value of the '{@link #getDSAssociationTypeCode() <em>DS Association Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSAssociationTypeCode()
	 * @generated
	 * @ordered
	 */
	protected CodeListValueType dSAssociationTypeCode;

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
	protected DSAssociationTypeCodePropertyTypeImpl()
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
		return GMDPackage.eINSTANCE.getDSAssociationTypeCodePropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeListValueType getDSAssociationTypeCode()
	{
		return dSAssociationTypeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSAssociationTypeCode(CodeListValueType newDSAssociationTypeCode, NotificationChain msgs)
	{
		CodeListValueType oldDSAssociationTypeCode = dSAssociationTypeCode;
		dSAssociationTypeCode = newDSAssociationTypeCode;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__DS_ASSOCIATION_TYPE_CODE, oldDSAssociationTypeCode, newDSAssociationTypeCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSAssociationTypeCode(CodeListValueType newDSAssociationTypeCode)
	{
		if (newDSAssociationTypeCode != dSAssociationTypeCode)
		{
			NotificationChain msgs = null;
			if (dSAssociationTypeCode != null)
				msgs = ((InternalEObject)dSAssociationTypeCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__DS_ASSOCIATION_TYPE_CODE, null, msgs);
			if (newDSAssociationTypeCode != null)
				msgs = ((InternalEObject)newDSAssociationTypeCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__DS_ASSOCIATION_TYPE_CODE, null, msgs);
			msgs = basicSetDSAssociationTypeCode(newDSAssociationTypeCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__DS_ASSOCIATION_TYPE_CODE, newDSAssociationTypeCode, newDSAssociationTypeCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
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
			case GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__DS_ASSOCIATION_TYPE_CODE:
				return basicSetDSAssociationTypeCode(null, msgs);
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
			case GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__DS_ASSOCIATION_TYPE_CODE:
				return getDSAssociationTypeCode();
			case GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__DS_ASSOCIATION_TYPE_CODE:
				setDSAssociationTypeCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__DS_ASSOCIATION_TYPE_CODE:
				setDSAssociationTypeCode((CodeListValueType)null);
				return;
			case GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__DS_ASSOCIATION_TYPE_CODE:
				return dSAssociationTypeCode != null;
			case GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE__NIL_REASON:
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

} //DSAssociationTypeCodePropertyTypeImpl
