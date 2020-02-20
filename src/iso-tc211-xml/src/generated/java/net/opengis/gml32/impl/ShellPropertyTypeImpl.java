/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.ShellPropertyType;
import net.opengis.gml32.ShellType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shell Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.ShellPropertyTypeImpl#getShell <em>Shell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShellPropertyTypeImpl extends MinimalEObjectImpl.Container implements ShellPropertyType {
	/**
	 * The cached value of the '{@link #getShell() <em>Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected ShellType shell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShellPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getShellPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellType getShell() {
		return shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShell(ShellType newShell, NotificationChain msgs) {
		ShellType oldShell = shell;
		shell = newShell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.SHELL_PROPERTY_TYPE__SHELL, oldShell, newShell);
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
	public void setShell(ShellType newShell) {
		if (newShell != shell) {
			NotificationChain msgs = null;
			if (shell != null)
				msgs = ((InternalEObject)shell).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.SHELL_PROPERTY_TYPE__SHELL, null, msgs);
			if (newShell != null)
				msgs = ((InternalEObject)newShell).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.SHELL_PROPERTY_TYPE__SHELL, null, msgs);
			msgs = basicSetShell(newShell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.SHELL_PROPERTY_TYPE__SHELL, newShell, newShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.SHELL_PROPERTY_TYPE__SHELL:
				return basicSetShell(null, msgs);
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
			case GMLPackage.SHELL_PROPERTY_TYPE__SHELL:
				return getShell();
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
			case GMLPackage.SHELL_PROPERTY_TYPE__SHELL:
				setShell((ShellType)newValue);
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
			case GMLPackage.SHELL_PROPERTY_TYPE__SHELL:
				setShell((ShellType)null);
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
			case GMLPackage.SHELL_PROPERTY_TYPE__SHELL:
				return shell != null;
		}
		return super.eIsSet(featureID);
	}

} //ShellPropertyTypeImpl
