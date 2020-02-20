/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.EllipsoidPropertyType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.GeodeticDatumType;
import net.opengis.gml32.PrimeMeridianPropertyType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geodetic Datum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.GeodeticDatumTypeImpl#getPrimeMeridianGroup <em>Prime Meridian Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.GeodeticDatumTypeImpl#getPrimeMeridian <em>Prime Meridian</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.GeodeticDatumTypeImpl#getEllipsoidGroup <em>Ellipsoid Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.GeodeticDatumTypeImpl#getEllipsoid <em>Ellipsoid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeodeticDatumTypeImpl extends AbstractDatumTypeImpl implements GeodeticDatumType {
	/**
	 * The cached value of the '{@link #getPrimeMeridianGroup() <em>Prime Meridian Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimeMeridianGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap primeMeridianGroup;

	/**
	 * The cached value of the '{@link #getEllipsoidGroup() <em>Ellipsoid Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipsoidGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ellipsoidGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeodeticDatumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getGeodeticDatumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getPrimeMeridianGroup() {
		if (primeMeridianGroup == null) {
			primeMeridianGroup = new BasicFeatureMap(this, GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN_GROUP);
		}
		return primeMeridianGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimeMeridianPropertyType getPrimeMeridian() {
		return (PrimeMeridianPropertyType)getPrimeMeridianGroup().get(GMLPackage.eINSTANCE.getGeodeticDatumType_PrimeMeridian(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimeMeridian(PrimeMeridianPropertyType newPrimeMeridian, NotificationChain msgs) {
		return ((FeatureMap.Internal)getPrimeMeridianGroup()).basicAdd(GMLPackage.eINSTANCE.getGeodeticDatumType_PrimeMeridian(), newPrimeMeridian, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimeMeridian(PrimeMeridianPropertyType newPrimeMeridian) {
		((FeatureMap.Internal)getPrimeMeridianGroup()).set(GMLPackage.eINSTANCE.getGeodeticDatumType_PrimeMeridian(), newPrimeMeridian);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getEllipsoidGroup() {
		if (ellipsoidGroup == null) {
			ellipsoidGroup = new BasicFeatureMap(this, GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID_GROUP);
		}
		return ellipsoidGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidPropertyType getEllipsoid() {
		return (EllipsoidPropertyType)getEllipsoidGroup().get(GMLPackage.eINSTANCE.getGeodeticDatumType_Ellipsoid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoid(EllipsoidPropertyType newEllipsoid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getEllipsoidGroup()).basicAdd(GMLPackage.eINSTANCE.getGeodeticDatumType_Ellipsoid(), newEllipsoid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoid(EllipsoidPropertyType newEllipsoid) {
		((FeatureMap.Internal)getEllipsoidGroup()).set(GMLPackage.eINSTANCE.getGeodeticDatumType_Ellipsoid(), newEllipsoid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN_GROUP:
				return ((InternalEList<?>)getPrimeMeridianGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN:
				return basicSetPrimeMeridian(null, msgs);
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID_GROUP:
				return ((InternalEList<?>)getEllipsoidGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID:
				return basicSetEllipsoid(null, msgs);
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
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN_GROUP:
				if (coreType) return getPrimeMeridianGroup();
				return ((FeatureMap.Internal)getPrimeMeridianGroup()).getWrapper();
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN:
				return getPrimeMeridian();
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID_GROUP:
				if (coreType) return getEllipsoidGroup();
				return ((FeatureMap.Internal)getEllipsoidGroup()).getWrapper();
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID:
				return getEllipsoid();
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
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN_GROUP:
				((FeatureMap.Internal)getPrimeMeridianGroup()).set(newValue);
				return;
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN:
				setPrimeMeridian((PrimeMeridianPropertyType)newValue);
				return;
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID_GROUP:
				((FeatureMap.Internal)getEllipsoidGroup()).set(newValue);
				return;
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID:
				setEllipsoid((EllipsoidPropertyType)newValue);
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
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN_GROUP:
				getPrimeMeridianGroup().clear();
				return;
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN:
				setPrimeMeridian((PrimeMeridianPropertyType)null);
				return;
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID_GROUP:
				getEllipsoidGroup().clear();
				return;
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID:
				setEllipsoid((EllipsoidPropertyType)null);
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
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN_GROUP:
				return primeMeridianGroup != null && !primeMeridianGroup.isEmpty();
			case GMLPackage.GEODETIC_DATUM_TYPE__PRIME_MERIDIAN:
				return getPrimeMeridian() != null;
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID_GROUP:
				return ellipsoidGroup != null && !ellipsoidGroup.isEmpty();
			case GMLPackage.GEODETIC_DATUM_TYPE__ELLIPSOID:
				return getEllipsoid() != null;
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
		result.append(" (primeMeridianGroup: ");
		result.append(primeMeridianGroup);
		result.append(", ellipsoidGroup: ");
		result.append(ellipsoidGroup);
		result.append(')');
		return result.toString();
	}

} //GeodeticDatumTypeImpl
