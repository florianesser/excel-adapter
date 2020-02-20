/**
 */
package org.isotc211.iso19139.gss;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.isotc211.iso19139.gss.GSSPackage
 * @generated
 */
public interface GSSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GSSFactory eINSTANCE = org.isotc211.iso19139.gss.impl.GSSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GM Object Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GM Object Property Type</em>'.
	 * @generated
	 */
	GMObjectPropertyType createGMObjectPropertyType();

	/**
	 * Returns a new object of class '<em>GM Point Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GM Point Property Type</em>'.
	 * @generated
	 */
	GMPointPropertyType createGMPointPropertyType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GSSPackage getGSSPackage();

} //GSSFactory
