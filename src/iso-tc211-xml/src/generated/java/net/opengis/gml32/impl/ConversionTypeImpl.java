/**
 */
package net.opengis.gml32.impl;

import java.util.Collection;

import net.opengis.gml32.AbstractGeneralParameterValuePropertyType;
import net.opengis.gml32.ConversionType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.OperationMethodPropertyType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.ConversionTypeImpl#getMethodGroup <em>Method Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.ConversionTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.ConversionTypeImpl#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversionTypeImpl extends AbstractGeneralConversionTypeImpl implements ConversionType {
	/**
	 * The cached value of the '{@link #getMethodGroup() <em>Method Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap methodGroup;

	/**
	 * The cached value of the '{@link #getParameterValue() <em>Parameter Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValue()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractGeneralParameterValuePropertyType> parameterValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getConversionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMethodGroup() {
		if (methodGroup == null) {
			methodGroup = new BasicFeatureMap(this, GMLPackage.CONVERSION_TYPE__METHOD_GROUP);
		}
		return methodGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationMethodPropertyType getMethod() {
		return (OperationMethodPropertyType)getMethodGroup().get(GMLPackage.eINSTANCE.getConversionType_Method(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(OperationMethodPropertyType newMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMethodGroup()).basicAdd(GMLPackage.eINSTANCE.getConversionType_Method(), newMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(OperationMethodPropertyType newMethod) {
		((FeatureMap.Internal)getMethodGroup()).set(GMLPackage.eINSTANCE.getConversionType_Method(), newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractGeneralParameterValuePropertyType> getParameterValue() {
		if (parameterValue == null) {
			parameterValue = new EObjectContainmentEList<AbstractGeneralParameterValuePropertyType>(AbstractGeneralParameterValuePropertyType.class, this, GMLPackage.CONVERSION_TYPE__PARAMETER_VALUE);
		}
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.CONVERSION_TYPE__METHOD_GROUP:
				return ((InternalEList<?>)getMethodGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.CONVERSION_TYPE__METHOD:
				return basicSetMethod(null, msgs);
			case GMLPackage.CONVERSION_TYPE__PARAMETER_VALUE:
				return ((InternalEList<?>)getParameterValue()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.CONVERSION_TYPE__METHOD_GROUP:
				if (coreType) return getMethodGroup();
				return ((FeatureMap.Internal)getMethodGroup()).getWrapper();
			case GMLPackage.CONVERSION_TYPE__METHOD:
				return getMethod();
			case GMLPackage.CONVERSION_TYPE__PARAMETER_VALUE:
				return getParameterValue();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMLPackage.CONVERSION_TYPE__METHOD_GROUP:
				((FeatureMap.Internal)getMethodGroup()).set(newValue);
				return;
			case GMLPackage.CONVERSION_TYPE__METHOD:
				setMethod((OperationMethodPropertyType)newValue);
				return;
			case GMLPackage.CONVERSION_TYPE__PARAMETER_VALUE:
				getParameterValue().clear();
				getParameterValue().addAll((Collection<? extends AbstractGeneralParameterValuePropertyType>)newValue);
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
			case GMLPackage.CONVERSION_TYPE__METHOD_GROUP:
				getMethodGroup().clear();
				return;
			case GMLPackage.CONVERSION_TYPE__METHOD:
				setMethod((OperationMethodPropertyType)null);
				return;
			case GMLPackage.CONVERSION_TYPE__PARAMETER_VALUE:
				getParameterValue().clear();
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
			case GMLPackage.CONVERSION_TYPE__METHOD_GROUP:
				return methodGroup != null && !methodGroup.isEmpty();
			case GMLPackage.CONVERSION_TYPE__METHOD:
				return getMethod() != null;
			case GMLPackage.CONVERSION_TYPE__PARAMETER_VALUE:
				return parameterValue != null && !parameterValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (methodGroup: ");
		result.append(methodGroup);
		result.append(')');
		return result.toString();
	}

} //ConversionTypeImpl
