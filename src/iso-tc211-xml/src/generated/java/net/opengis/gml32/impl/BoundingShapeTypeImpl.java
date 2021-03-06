/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.BoundingShapeType;
import net.opengis.gml32.EnvelopeType;
import net.opengis.gml32.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounding Shape Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.BoundingShapeTypeImpl#getEnvelopeGroup <em>Envelope Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.BoundingShapeTypeImpl#getEnvelope <em>Envelope</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.BoundingShapeTypeImpl#getNull <em>Null</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.BoundingShapeTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundingShapeTypeImpl extends MinimalEObjectImpl.Container implements BoundingShapeType
{
	/**
	 * The cached value of the '{@link #getEnvelopeGroup() <em>Envelope Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvelopeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap envelopeGroup;

	/**
	 * The default value of the '{@link #getNull() <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated
	 * @ordered
	 */
	protected static final Object NULL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNull() <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated
	 * @ordered
	 */
	protected Object null_ = NULL_EDEFAULT;

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
	protected BoundingShapeTypeImpl()
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
		return GMLPackage.eINSTANCE.getBoundingShapeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getEnvelopeGroup()
	{
		if (envelopeGroup == null)
		{
			envelopeGroup = new BasicFeatureMap(this, GMLPackage.BOUNDING_SHAPE_TYPE__ENVELOPE_GROUP);
		}
		return envelopeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvelopeType getEnvelope()
	{
		return (EnvelopeType)getEnvelopeGroup().get(GMLPackage.eINSTANCE.getBoundingShapeType_Envelope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvelope(EnvelopeType newEnvelope, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getEnvelopeGroup()).basicAdd(GMLPackage.eINSTANCE.getBoundingShapeType_Envelope(), newEnvelope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvelope(EnvelopeType newEnvelope)
	{
		((FeatureMap.Internal)getEnvelopeGroup()).set(GMLPackage.eINSTANCE.getBoundingShapeType_Envelope(), newEnvelope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNull()
	{
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNull(Object newNull)
	{
		Object oldNull = null_;
		null_ = newNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.BOUNDING_SHAPE_TYPE__NULL, oldNull, null_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.BOUNDING_SHAPE_TYPE__NIL_REASON, oldNilReason, nilReason));
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
			case GMLPackage.BOUNDING_SHAPE_TYPE__ENVELOPE_GROUP:
				return ((InternalEList<?>)getEnvelopeGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.BOUNDING_SHAPE_TYPE__ENVELOPE:
				return basicSetEnvelope(null, msgs);
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
			case GMLPackage.BOUNDING_SHAPE_TYPE__ENVELOPE_GROUP:
				if (coreType) return getEnvelopeGroup();
				return ((FeatureMap.Internal)getEnvelopeGroup()).getWrapper();
			case GMLPackage.BOUNDING_SHAPE_TYPE__ENVELOPE:
				return getEnvelope();
			case GMLPackage.BOUNDING_SHAPE_TYPE__NULL:
				return getNull();
			case GMLPackage.BOUNDING_SHAPE_TYPE__NIL_REASON:
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
			case GMLPackage.BOUNDING_SHAPE_TYPE__ENVELOPE_GROUP:
				((FeatureMap.Internal)getEnvelopeGroup()).set(newValue);
				return;
			case GMLPackage.BOUNDING_SHAPE_TYPE__ENVELOPE:
				setEnvelope((EnvelopeType)newValue);
				return;
			case GMLPackage.BOUNDING_SHAPE_TYPE__NULL:
				setNull(newValue);
				return;
			case GMLPackage.BOUNDING_SHAPE_TYPE__NIL_REASON:
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
			case GMLPackage.BOUNDING_SHAPE_TYPE__ENVELOPE_GROUP:
				getEnvelopeGroup().clear();
				return;
			case GMLPackage.BOUNDING_SHAPE_TYPE__ENVELOPE:
				setEnvelope((EnvelopeType)null);
				return;
			case GMLPackage.BOUNDING_SHAPE_TYPE__NULL:
				setNull(NULL_EDEFAULT);
				return;
			case GMLPackage.BOUNDING_SHAPE_TYPE__NIL_REASON:
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
			case GMLPackage.BOUNDING_SHAPE_TYPE__ENVELOPE_GROUP:
				return envelopeGroup != null && !envelopeGroup.isEmpty();
			case GMLPackage.BOUNDING_SHAPE_TYPE__ENVELOPE:
				return getEnvelope() != null;
			case GMLPackage.BOUNDING_SHAPE_TYPE__NULL:
				return NULL_EDEFAULT == null ? null_ != null : !NULL_EDEFAULT.equals(null_);
			case GMLPackage.BOUNDING_SHAPE_TYPE__NIL_REASON:
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
		result.append(" (envelopeGroup: ");
		result.append(envelopeGroup);
		result.append(", null: ");
		result.append(null_);
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //BoundingShapeTypeImpl
