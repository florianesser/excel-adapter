/**
 */
package org.isotc211.iso19139.gss.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.isotc211.iso19139.gss.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GSSFactoryImpl extends EFactoryImpl implements GSSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GSSFactory init() {
		try {
			GSSFactory theGSSFactory = (GSSFactory)EPackage.Registry.INSTANCE.getEFactory(GSSPackage.eNS_URI);
			if (theGSSFactory != null) {
				return theGSSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GSSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GSSPackage.GM_OBJECT_PROPERTY_TYPE: return createGMObjectPropertyType();
			case GSSPackage.GM_POINT_PROPERTY_TYPE: return createGMPointPropertyType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GMObjectPropertyType createGMObjectPropertyType() {
		GMObjectPropertyTypeImpl gmObjectPropertyType = new GMObjectPropertyTypeImpl();
		return gmObjectPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GMPointPropertyType createGMPointPropertyType() {
		GMPointPropertyTypeImpl gmPointPropertyType = new GMPointPropertyTypeImpl();
		return gmPointPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GSSPackage getGSSPackage() {
		return (GSSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GSSPackage getPackage() {
		return GSSPackage.eINSTANCE;
	}

} //GSSFactoryImpl
