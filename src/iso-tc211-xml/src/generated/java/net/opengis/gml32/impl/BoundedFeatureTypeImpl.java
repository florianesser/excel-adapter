/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.BoundedFeatureType;
import net.opengis.gml32.GMLPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounded Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BoundedFeatureTypeImpl extends AbstractFeatureTypeImpl implements BoundedFeatureType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundedFeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getBoundedFeatureType();
	}

} //BoundedFeatureTypeImpl
