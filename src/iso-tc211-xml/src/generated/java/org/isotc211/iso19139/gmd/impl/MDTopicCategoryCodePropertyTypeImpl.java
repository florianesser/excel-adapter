/**
 */
package org.isotc211.iso19139.gmd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.isotc211.iso19139.gmd.GMDPackage;
import org.isotc211.iso19139.gmd.MDTopicCategoryCodePropertyType;
import org.isotc211.iso19139.gmd.MDTopicCategoryCodeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Topic Category Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDTopicCategoryCodePropertyTypeImpl#getMDTopicCategoryCode <em>MD Topic Category Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDTopicCategoryCodePropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDTopicCategoryCodePropertyTypeImpl extends MinimalEObjectImpl.Container implements MDTopicCategoryCodePropertyType
{
	/**
	 * The default value of the '{@link #getMDTopicCategoryCode() <em>MD Topic Category Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDTopicCategoryCode()
	 * @generated
	 * @ordered
	 */
	protected static final MDTopicCategoryCodeType MD_TOPIC_CATEGORY_CODE_EDEFAULT = MDTopicCategoryCodeType.FARMING;

	/**
	 * The cached value of the '{@link #getMDTopicCategoryCode() <em>MD Topic Category Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDTopicCategoryCode()
	 * @generated
	 * @ordered
	 */
	protected MDTopicCategoryCodeType mDTopicCategoryCode = MD_TOPIC_CATEGORY_CODE_EDEFAULT;

	/**
	 * This is true if the MD Topic Category Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mDTopicCategoryCodeESet;

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
	protected MDTopicCategoryCodePropertyTypeImpl()
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
		return GMDPackage.eINSTANCE.getMDTopicCategoryCodePropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDTopicCategoryCodeType getMDTopicCategoryCode()
	{
		return mDTopicCategoryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMDTopicCategoryCode(MDTopicCategoryCodeType newMDTopicCategoryCode)
	{
		MDTopicCategoryCodeType oldMDTopicCategoryCode = mDTopicCategoryCode;
		mDTopicCategoryCode = newMDTopicCategoryCode == null ? MD_TOPIC_CATEGORY_CODE_EDEFAULT : newMDTopicCategoryCode;
		boolean oldMDTopicCategoryCodeESet = mDTopicCategoryCodeESet;
		mDTopicCategoryCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE__MD_TOPIC_CATEGORY_CODE, oldMDTopicCategoryCode, mDTopicCategoryCode, !oldMDTopicCategoryCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMDTopicCategoryCode()
	{
		MDTopicCategoryCodeType oldMDTopicCategoryCode = mDTopicCategoryCode;
		boolean oldMDTopicCategoryCodeESet = mDTopicCategoryCodeESet;
		mDTopicCategoryCode = MD_TOPIC_CATEGORY_CODE_EDEFAULT;
		mDTopicCategoryCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE__MD_TOPIC_CATEGORY_CODE, oldMDTopicCategoryCode, MD_TOPIC_CATEGORY_CODE_EDEFAULT, oldMDTopicCategoryCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMDTopicCategoryCode()
	{
		return mDTopicCategoryCodeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
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
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE__MD_TOPIC_CATEGORY_CODE:
				return getMDTopicCategoryCode();
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE__MD_TOPIC_CATEGORY_CODE:
				setMDTopicCategoryCode((MDTopicCategoryCodeType)newValue);
				return;
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE__MD_TOPIC_CATEGORY_CODE:
				unsetMDTopicCategoryCode();
				return;
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE__NIL_REASON:
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
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE__MD_TOPIC_CATEGORY_CODE:
				return isSetMDTopicCategoryCode();
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE__NIL_REASON:
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
		result.append(" (mDTopicCategoryCode: ");
		if (mDTopicCategoryCodeESet) result.append(mDTopicCategoryCode); else result.append("<unset>");
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //MDTopicCategoryCodePropertyTypeImpl
