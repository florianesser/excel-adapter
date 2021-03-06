/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.TimeReferenceSystemType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.TimeReferenceSystemTypeImpl#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeReferenceSystemTypeImpl extends DefinitionTypeImpl implements TimeReferenceSystemType
{
	/**
	 * The default value of the '{@link #getDomainOfValidity() <em>Domain Of Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainOfValidity()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_OF_VALIDITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainOfValidity() <em>Domain Of Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainOfValidity()
	 * @generated
	 * @ordered
	 */
	protected String domainOfValidity = DOMAIN_OF_VALIDITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeReferenceSystemTypeImpl()
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
		return GMLPackage.eINSTANCE.getTimeReferenceSystemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainOfValidity()
	{
		return domainOfValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainOfValidity(String newDomainOfValidity)
	{
		String oldDomainOfValidity = domainOfValidity;
		domainOfValidity = newDomainOfValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY, oldDomainOfValidity, domainOfValidity));
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
			case GMLPackage.TIME_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				return getDomainOfValidity();
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
			case GMLPackage.TIME_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				setDomainOfValidity((String)newValue);
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
			case GMLPackage.TIME_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				setDomainOfValidity(DOMAIN_OF_VALIDITY_EDEFAULT);
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
			case GMLPackage.TIME_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				return DOMAIN_OF_VALIDITY_EDEFAULT == null ? domainOfValidity != null : !DOMAIN_OF_VALIDITY_EDEFAULT.equals(domainOfValidity);
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
		result.append(" (domainOfValidity: ");
		result.append(domainOfValidity);
		result.append(')');
		return result.toString();
	}

} //TimeReferenceSystemTypeImpl
