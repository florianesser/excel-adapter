/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.SecondDefiningParameterType;
import net.opengis.gml32.SecondDefiningParameterType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Second Defining Parameter Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.SecondDefiningParameterType1Impl#getSecondDefiningParameter <em>Second Defining Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecondDefiningParameterType1Impl extends MinimalEObjectImpl.Container implements SecondDefiningParameterType1 {
	/**
	 * The cached value of the '{@link #getSecondDefiningParameter() <em>Second Defining Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondDefiningParameter()
	 * @generated
	 * @ordered
	 */
	protected SecondDefiningParameterType secondDefiningParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecondDefiningParameterType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getSecondDefiningParameterType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondDefiningParameterType getSecondDefiningParameter() {
		return secondDefiningParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondDefiningParameter(SecondDefiningParameterType newSecondDefiningParameter, NotificationChain msgs) {
		SecondDefiningParameterType oldSecondDefiningParameter = secondDefiningParameter;
		secondDefiningParameter = newSecondDefiningParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SECOND_DEFINING_PARAMETER, oldSecondDefiningParameter, newSecondDefiningParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondDefiningParameter(SecondDefiningParameterType newSecondDefiningParameter) {
		if (newSecondDefiningParameter != secondDefiningParameter) {
			NotificationChain msgs = null;
			if (secondDefiningParameter != null)
				msgs = ((InternalEObject)secondDefiningParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SECOND_DEFINING_PARAMETER, null, msgs);
			if (newSecondDefiningParameter != null)
				msgs = ((InternalEObject)newSecondDefiningParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SECOND_DEFINING_PARAMETER, null, msgs);
			msgs = basicSetSecondDefiningParameter(newSecondDefiningParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SECOND_DEFINING_PARAMETER, newSecondDefiningParameter, newSecondDefiningParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SECOND_DEFINING_PARAMETER:
				return basicSetSecondDefiningParameter(null, msgs);
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
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SECOND_DEFINING_PARAMETER:
				return getSecondDefiningParameter();
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
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SECOND_DEFINING_PARAMETER:
				setSecondDefiningParameter((SecondDefiningParameterType)newValue);
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
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SECOND_DEFINING_PARAMETER:
				setSecondDefiningParameter((SecondDefiningParameterType)null);
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
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1__SECOND_DEFINING_PARAMETER:
				return secondDefiningParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //SecondDefiningParameterType1Impl
