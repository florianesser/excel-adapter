/**
 */
package org.isotc211.iso19139.gts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.isotc211.iso19139.gts.GTSPackage
 * @generated
 */
public interface GTSFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GTSFactory eINSTANCE = org.isotc211.iso19139.gts.impl.GTSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TM Period Duration Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TM Period Duration Property Type</em>'.
	 * @generated
	 */
	TMPeriodDurationPropertyType createTMPeriodDurationPropertyType();

	/**
	 * Returns a new object of class '<em>TM Primitive Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TM Primitive Property Type</em>'.
	 * @generated
	 */
	TMPrimitivePropertyType createTMPrimitivePropertyType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GTSPackage getGTSPackage();

} //GTSFactory
