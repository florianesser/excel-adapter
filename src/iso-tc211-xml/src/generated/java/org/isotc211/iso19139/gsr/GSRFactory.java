/**
 */
package org.isotc211.iso19139.gsr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.isotc211.iso19139.gsr.GSRPackage
 * @generated
 */
public interface GSRFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GSRFactory eINSTANCE = org.isotc211.iso19139.gsr.impl.GSRFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SCCRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SCCRS Property Type</em>'.
	 * @generated
	 */
	SCCRSPropertyType createSCCRSPropertyType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GSRPackage getGSRPackage();

} //GSRFactory
