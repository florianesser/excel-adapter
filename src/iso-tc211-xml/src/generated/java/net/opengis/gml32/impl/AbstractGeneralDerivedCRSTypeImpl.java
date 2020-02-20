/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.AbstractGeneralDerivedCRSType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.GeneralConversionPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract General Derived CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.AbstractGeneralDerivedCRSTypeImpl#getConversion <em>Conversion</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractGeneralDerivedCRSTypeImpl extends AbstractCRSTypeImpl implements AbstractGeneralDerivedCRSType {
	/**
	 * The cached value of the '{@link #getConversion() <em>Conversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversion()
	 * @generated
	 * @ordered
	 */
	protected GeneralConversionPropertyType conversion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGeneralDerivedCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractGeneralDerivedCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralConversionPropertyType getConversion() {
		return conversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversion(GeneralConversionPropertyType newConversion, NotificationChain msgs) {
		GeneralConversionPropertyType oldConversion = conversion;
		conversion = newConversion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION, oldConversion, newConversion);
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
	public void setConversion(GeneralConversionPropertyType newConversion) {
		if (newConversion != conversion) {
			NotificationChain msgs = null;
			if (conversion != null)
				msgs = ((InternalEObject)conversion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION, null, msgs);
			if (newConversion != null)
				msgs = ((InternalEObject)newConversion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION, null, msgs);
			msgs = basicSetConversion(newConversion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION, newConversion, newConversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION:
				return basicSetConversion(null, msgs);
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
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION:
				return getConversion();
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
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION:
				setConversion((GeneralConversionPropertyType)newValue);
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
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION:
				setConversion((GeneralConversionPropertyType)null);
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
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE__CONVERSION:
				return conversion != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractGeneralDerivedCRSTypeImpl
