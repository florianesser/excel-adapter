/**
 */
package net.opengis.gml32.impl;

import java.util.Collection;

import net.opengis.gml32.AbstractRingPropertyType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.PolygonType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.PolygonTypeImpl#getExterior <em>Exterior</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.PolygonTypeImpl#getInterior <em>Interior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolygonTypeImpl extends AbstractSurfaceTypeImpl implements PolygonType
{
	/**
	 * The cached value of the '{@link #getExterior() <em>Exterior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterior()
	 * @generated
	 * @ordered
	 */
	protected AbstractRingPropertyType exterior;

	/**
	 * The cached value of the '{@link #getInterior() <em>Interior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterior()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractRingPropertyType> interior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonTypeImpl()
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
		return GMLPackage.eINSTANCE.getPolygonType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRingPropertyType getExterior()
	{
		return exterior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExterior(AbstractRingPropertyType newExterior, NotificationChain msgs)
	{
		AbstractRingPropertyType oldExterior = exterior;
		exterior = newExterior;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.POLYGON_TYPE__EXTERIOR, oldExterior, newExterior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExterior(AbstractRingPropertyType newExterior)
	{
		if (newExterior != exterior)
		{
			NotificationChain msgs = null;
			if (exterior != null)
				msgs = ((InternalEObject)exterior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.POLYGON_TYPE__EXTERIOR, null, msgs);
			if (newExterior != null)
				msgs = ((InternalEObject)newExterior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.POLYGON_TYPE__EXTERIOR, null, msgs);
			msgs = basicSetExterior(newExterior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.POLYGON_TYPE__EXTERIOR, newExterior, newExterior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractRingPropertyType> getInterior()
	{
		if (interior == null)
		{
			interior = new EObjectContainmentEList<AbstractRingPropertyType>(AbstractRingPropertyType.class, this, GMLPackage.POLYGON_TYPE__INTERIOR);
		}
		return interior;
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
			case GMLPackage.POLYGON_TYPE__EXTERIOR:
				return basicSetExterior(null, msgs);
			case GMLPackage.POLYGON_TYPE__INTERIOR:
				return ((InternalEList<?>)getInterior()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.POLYGON_TYPE__EXTERIOR:
				return getExterior();
			case GMLPackage.POLYGON_TYPE__INTERIOR:
				return getInterior();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case GMLPackage.POLYGON_TYPE__EXTERIOR:
				setExterior((AbstractRingPropertyType)newValue);
				return;
			case GMLPackage.POLYGON_TYPE__INTERIOR:
				getInterior().clear();
				getInterior().addAll((Collection<? extends AbstractRingPropertyType>)newValue);
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
			case GMLPackage.POLYGON_TYPE__EXTERIOR:
				setExterior((AbstractRingPropertyType)null);
				return;
			case GMLPackage.POLYGON_TYPE__INTERIOR:
				getInterior().clear();
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
			case GMLPackage.POLYGON_TYPE__EXTERIOR:
				return exterior != null;
			case GMLPackage.POLYGON_TYPE__INTERIOR:
				return interior != null && !interior.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PolygonTypeImpl
