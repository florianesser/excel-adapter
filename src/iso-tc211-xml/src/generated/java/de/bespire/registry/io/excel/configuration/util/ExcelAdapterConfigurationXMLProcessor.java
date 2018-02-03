/**
 */
package de.bespire.registry.io.excel.configuration.util;

import de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcelAdapterConfigurationXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcelAdapterConfigurationXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ExcelAdapterConfigurationPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ExcelAdapterConfigurationResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ExcelAdapterConfigurationResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ExcelAdapterConfigurationResourceFactoryImpl());
		}
		return registrations;
	}

} //ExcelAdapterConfigurationXMLProcessor
