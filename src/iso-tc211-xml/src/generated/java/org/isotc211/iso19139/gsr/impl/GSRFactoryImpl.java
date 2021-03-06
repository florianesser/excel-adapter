/**
 */
package org.isotc211.iso19139.gsr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.isotc211.iso19139.gsr.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GSRFactoryImpl extends EFactoryImpl implements GSRFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GSRFactory init()
	{
		try
		{
			GSRFactory theGSRFactory = (GSRFactory)EPackage.Registry.INSTANCE.getEFactory(GSRPackage.eNS_URI);
			if (theGSRFactory != null)
			{
				return theGSRFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GSRFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSRFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case GSRPackage.SCCRS_PROPERTY_TYPE: return createSCCRSPropertyType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCCRSPropertyType createSCCRSPropertyType()
	{
		SCCRSPropertyTypeImpl sccrsPropertyType = new SCCRSPropertyTypeImpl();
		return sccrsPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSRPackage getGSRPackage()
	{
		return (GSRPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GSRPackage getPackage()
	{
		return GSRPackage.eINSTANCE;
	}

} //GSRFactoryImpl
