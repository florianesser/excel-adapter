/**
 */
package net.opengis.gml32.impl;

import java.util.Collection;

import net.opengis.gml32.AbstractGeneralParameterValuePropertyType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.OperationParameterGroupPropertyType;
import net.opengis.gml32.ParameterValueGroupType;

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
 * An implementation of the model object '<em><b>Parameter Value Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.ParameterValueGroupTypeImpl#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.ParameterValueGroupTypeImpl#getGroupGroup <em>Group Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.ParameterValueGroupTypeImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterValueGroupTypeImpl extends AbstractGeneralParameterValueTypeImpl implements ParameterValueGroupType {
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
	 * The cached value of the '{@link #getGroupGroup() <em>Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap groupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getParameterValueGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractGeneralParameterValuePropertyType> getParameterValue() {
		if (parameterValue == null) {
			parameterValue = new EObjectContainmentEList<AbstractGeneralParameterValuePropertyType>(AbstractGeneralParameterValuePropertyType.class, this, GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE);
		}
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroupGroup() {
		if (groupGroup == null) {
			groupGroup = new BasicFeatureMap(this, GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP_GROUP);
		}
		return groupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterGroupPropertyType getGroup() {
		return (OperationParameterGroupPropertyType)getGroupGroup().get(GMLPackage.eINSTANCE.getParameterValueGroupType_Group(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(OperationParameterGroupPropertyType newGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getGroupGroup()).basicAdd(GMLPackage.eINSTANCE.getParameterValueGroupType_Group(), newGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(OperationParameterGroupPropertyType newGroup) {
		((FeatureMap.Internal)getGroupGroup()).set(GMLPackage.eINSTANCE.getParameterValueGroupType_Group(), newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE:
				return ((InternalEList<?>)getParameterValue()).basicRemove(otherEnd, msgs);
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP_GROUP:
				return ((InternalEList<?>)getGroupGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP:
				return basicSetGroup(null, msgs);
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
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE:
				return getParameterValue();
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP_GROUP:
				if (coreType) return getGroupGroup();
				return ((FeatureMap.Internal)getGroupGroup()).getWrapper();
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP:
				return getGroup();
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
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE:
				getParameterValue().clear();
				getParameterValue().addAll((Collection<? extends AbstractGeneralParameterValuePropertyType>)newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP_GROUP:
				((FeatureMap.Internal)getGroupGroup()).set(newValue);
				return;
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP:
				setGroup((OperationParameterGroupPropertyType)newValue);
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
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE:
				getParameterValue().clear();
				return;
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP_GROUP:
				getGroupGroup().clear();
				return;
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP:
				setGroup((OperationParameterGroupPropertyType)null);
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
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__PARAMETER_VALUE:
				return parameterValue != null && !parameterValue.isEmpty();
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP_GROUP:
				return groupGroup != null && !groupGroup.isEmpty();
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE__GROUP:
				return getGroup() != null;
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
		result.append(" (groupGroup: ");
		result.append(groupGroup);
		result.append(')');
		return result.toString();
	}

} //ParameterValueGroupTypeImpl
