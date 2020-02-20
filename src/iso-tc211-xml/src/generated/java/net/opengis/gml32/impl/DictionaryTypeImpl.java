/**
 */
package net.opengis.gml32.impl;

import java.util.Collection;

import net.opengis.gml32.AggregationType;
import net.opengis.gml32.DictionaryEntryType;
import net.opengis.gml32.DictionaryType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.IndirectEntryType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dictionary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.DictionaryTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.DictionaryTypeImpl#getDictionaryEntryGroup <em>Dictionary Entry Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.DictionaryTypeImpl#getDictionaryEntry <em>Dictionary Entry</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.DictionaryTypeImpl#getIndirectEntry <em>Indirect Entry</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.DictionaryTypeImpl#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DictionaryTypeImpl extends DefinitionTypeImpl implements DictionaryType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getAggregationType() <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationType()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationType AGGREGATION_TYPE_EDEFAULT = AggregationType.SET;

	/**
	 * The cached value of the '{@link #getAggregationType() <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationType()
	 * @generated
	 * @ordered
	 */
	protected AggregationType aggregationType = AGGREGATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Aggregation Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aggregationTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictionaryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getDictionaryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GMLPackage.DICTIONARY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDictionaryEntryGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(GMLPackage.eINSTANCE.getDictionaryType_DictionaryEntryGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DictionaryEntryType> getDictionaryEntry() {
		return getDictionaryEntryGroup().list(GMLPackage.eINSTANCE.getDictionaryType_DictionaryEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IndirectEntryType> getIndirectEntry() {
		return getGroup().list(GMLPackage.eINSTANCE.getDictionaryType_IndirectEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregationType getAggregationType() {
		return aggregationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationType(AggregationType newAggregationType) {
		AggregationType oldAggregationType = aggregationType;
		aggregationType = newAggregationType == null ? AGGREGATION_TYPE_EDEFAULT : newAggregationType;
		boolean oldAggregationTypeESet = aggregationTypeESet;
		aggregationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DICTIONARY_TYPE__AGGREGATION_TYPE, oldAggregationType, aggregationType, !oldAggregationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAggregationType() {
		AggregationType oldAggregationType = aggregationType;
		boolean oldAggregationTypeESet = aggregationTypeESet;
		aggregationType = AGGREGATION_TYPE_EDEFAULT;
		aggregationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.DICTIONARY_TYPE__AGGREGATION_TYPE, oldAggregationType, AGGREGATION_TYPE_EDEFAULT, oldAggregationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAggregationType() {
		return aggregationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.DICTIONARY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY_GROUP:
				return ((InternalEList<?>)getDictionaryEntryGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY:
				return ((InternalEList<?>)getDictionaryEntry()).basicRemove(otherEnd, msgs);
			case GMLPackage.DICTIONARY_TYPE__INDIRECT_ENTRY:
				return ((InternalEList<?>)getIndirectEntry()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.DICTIONARY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY_GROUP:
				if (coreType) return getDictionaryEntryGroup();
				return ((FeatureMap.Internal)getDictionaryEntryGroup()).getWrapper();
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY:
				return getDictionaryEntry();
			case GMLPackage.DICTIONARY_TYPE__INDIRECT_ENTRY:
				return getIndirectEntry();
			case GMLPackage.DICTIONARY_TYPE__AGGREGATION_TYPE:
				return getAggregationType();
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
			case GMLPackage.DICTIONARY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY_GROUP:
				((FeatureMap.Internal)getDictionaryEntryGroup()).set(newValue);
				return;
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY:
				getDictionaryEntry().clear();
				getDictionaryEntry().addAll((Collection<? extends DictionaryEntryType>)newValue);
				return;
			case GMLPackage.DICTIONARY_TYPE__INDIRECT_ENTRY:
				getIndirectEntry().clear();
				getIndirectEntry().addAll((Collection<? extends IndirectEntryType>)newValue);
				return;
			case GMLPackage.DICTIONARY_TYPE__AGGREGATION_TYPE:
				setAggregationType((AggregationType)newValue);
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
			case GMLPackage.DICTIONARY_TYPE__GROUP:
				getGroup().clear();
				return;
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY_GROUP:
				getDictionaryEntryGroup().clear();
				return;
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY:
				getDictionaryEntry().clear();
				return;
			case GMLPackage.DICTIONARY_TYPE__INDIRECT_ENTRY:
				getIndirectEntry().clear();
				return;
			case GMLPackage.DICTIONARY_TYPE__AGGREGATION_TYPE:
				unsetAggregationType();
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
			case GMLPackage.DICTIONARY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY_GROUP:
				return !getDictionaryEntryGroup().isEmpty();
			case GMLPackage.DICTIONARY_TYPE__DICTIONARY_ENTRY:
				return !getDictionaryEntry().isEmpty();
			case GMLPackage.DICTIONARY_TYPE__INDIRECT_ENTRY:
				return !getIndirectEntry().isEmpty();
			case GMLPackage.DICTIONARY_TYPE__AGGREGATION_TYPE:
				return isSetAggregationType();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", aggregationType: ");
		if (aggregationTypeESet) result.append(aggregationType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DictionaryTypeImpl
