/**
 */
package net.opengis.gml32.impl;

import java.util.List;

import net.opengis.gml32.CodeListType;
import net.opengis.gml32.GMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.CodeListTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.CodeListTypeImpl#getCodeSpace <em>Code Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeListTypeImpl extends MinimalEObjectImpl.Container implements CodeListType
{
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected List<String> value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSpace() <em>Code Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSpace() <em>Code Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSpace()
	 * @generated
	 * @ordered
	 */
	protected String codeSpace = CODE_SPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeListTypeImpl()
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
		return GMLPackage.eINSTANCE.getCodeListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(List<String> newValue)
	{
		List<String> oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.CODE_LIST_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeSpace()
	{
		return codeSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSpace(String newCodeSpace)
	{
		String oldCodeSpace = codeSpace;
		codeSpace = newCodeSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.CODE_LIST_TYPE__CODE_SPACE, oldCodeSpace, codeSpace));
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
			case GMLPackage.CODE_LIST_TYPE__VALUE:
				return getValue();
			case GMLPackage.CODE_LIST_TYPE__CODE_SPACE:
				return getCodeSpace();
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
			case GMLPackage.CODE_LIST_TYPE__VALUE:
				setValue((List<String>)newValue);
				return;
			case GMLPackage.CODE_LIST_TYPE__CODE_SPACE:
				setCodeSpace((String)newValue);
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
			case GMLPackage.CODE_LIST_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GMLPackage.CODE_LIST_TYPE__CODE_SPACE:
				setCodeSpace(CODE_SPACE_EDEFAULT);
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
			case GMLPackage.CODE_LIST_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GMLPackage.CODE_LIST_TYPE__CODE_SPACE:
				return CODE_SPACE_EDEFAULT == null ? codeSpace != null : !CODE_SPACE_EDEFAULT.equals(codeSpace);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", codeSpace: ");
		result.append(codeSpace);
		result.append(')');
		return result.toString();
	}

} //CodeListTypeImpl
