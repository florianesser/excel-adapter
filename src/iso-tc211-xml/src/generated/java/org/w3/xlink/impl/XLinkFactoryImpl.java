/**
 */
package org.w3.xlink.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3.xlink.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XLinkFactoryImpl extends EFactoryImpl implements XLinkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XLinkFactory init() {
		try {
			XLinkFactory theXLinkFactory = (XLinkFactory)EPackage.Registry.INSTANCE.getEFactory(XLinkPackage.eNS_URI);
			if (theXLinkFactory != null) {
				return theXLinkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XLinkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XLinkFactoryImpl() {
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
			case XLinkPackage.ARC_TYPE: return createArcType();
			case XLinkPackage.EXTENDED: return createExtended();
			case XLinkPackage.LOCATOR_TYPE: return createLocatorType();
			case XLinkPackage.RESOURCE_TYPE: return createResourceType();
			case XLinkPackage.SIMPLE: return createSimple();
			case XLinkPackage.TITLE_ELT_TYPE: return createTitleEltType();
			case XLinkPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XLinkPackage.ACTUATE_TYPE:
				return createActuateTypeFromString(eDataType, initialValue);
			case XLinkPackage.SHOW_TYPE:
				return createShowTypeFromString(eDataType, initialValue);
			case XLinkPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case XLinkPackage.ACTUATE_TYPE_OBJECT:
				return createActuateTypeObjectFromString(eDataType, initialValue);
			case XLinkPackage.ARCROLE_TYPE:
				return createArcroleTypeFromString(eDataType, initialValue);
			case XLinkPackage.FROM_TYPE:
				return createFromTypeFromString(eDataType, initialValue);
			case XLinkPackage.HREF_TYPE:
				return createHrefTypeFromString(eDataType, initialValue);
			case XLinkPackage.LABEL_TYPE:
				return createLabelTypeFromString(eDataType, initialValue);
			case XLinkPackage.ROLE_TYPE:
				return createRoleTypeFromString(eDataType, initialValue);
			case XLinkPackage.SHOW_TYPE_OBJECT:
				return createShowTypeObjectFromString(eDataType, initialValue);
			case XLinkPackage.TITLE_ATTR_TYPE:
				return createTitleAttrTypeFromString(eDataType, initialValue);
			case XLinkPackage.TO_TYPE:
				return createToTypeFromString(eDataType, initialValue);
			case XLinkPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XLinkPackage.ACTUATE_TYPE:
				return convertActuateTypeToString(eDataType, instanceValue);
			case XLinkPackage.SHOW_TYPE:
				return convertShowTypeToString(eDataType, instanceValue);
			case XLinkPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case XLinkPackage.ACTUATE_TYPE_OBJECT:
				return convertActuateTypeObjectToString(eDataType, instanceValue);
			case XLinkPackage.ARCROLE_TYPE:
				return convertArcroleTypeToString(eDataType, instanceValue);
			case XLinkPackage.FROM_TYPE:
				return convertFromTypeToString(eDataType, instanceValue);
			case XLinkPackage.HREF_TYPE:
				return convertHrefTypeToString(eDataType, instanceValue);
			case XLinkPackage.LABEL_TYPE:
				return convertLabelTypeToString(eDataType, instanceValue);
			case XLinkPackage.ROLE_TYPE:
				return convertRoleTypeToString(eDataType, instanceValue);
			case XLinkPackage.SHOW_TYPE_OBJECT:
				return convertShowTypeObjectToString(eDataType, instanceValue);
			case XLinkPackage.TITLE_ATTR_TYPE:
				return convertTitleAttrTypeToString(eDataType, instanceValue);
			case XLinkPackage.TO_TYPE:
				return convertToTypeToString(eDataType, instanceValue);
			case XLinkPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcType createArcType() {
		ArcTypeImpl arcType = new ArcTypeImpl();
		return arcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extended createExtended() {
		ExtendedImpl extended = new ExtendedImpl();
		return extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocatorType createLocatorType() {
		LocatorTypeImpl locatorType = new LocatorTypeImpl();
		return locatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Simple createSimple() {
		SimpleImpl simple = new SimpleImpl();
		return simple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleEltType createTitleEltType() {
		TitleEltTypeImpl titleEltType = new TitleEltTypeImpl();
		return titleEltType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType createActuateTypeFromString(EDataType eDataType, String initialValue) {
		ActuateType result = ActuateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActuateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType createShowTypeFromString(EDataType eDataType, String initialValue) {
		ShowType result = ShowType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShowTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType createActuateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createActuateTypeFromString(XLinkPackage.Literals.ACTUATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActuateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActuateTypeToString(XLinkPackage.Literals.ACTUATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createArcroleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArcroleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFromTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFromTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHrefTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHrefTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLabelTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRoleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType createShowTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createShowTypeFromString(XLinkPackage.Literals.SHOW_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShowTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShowTypeToString(XLinkPackage.Literals.SHOW_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTitleAttrTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTitleAttrTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createToTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(XLinkPackage.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(XLinkPackage.Literals.TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XLinkPackage getXLinkPackage() {
		return (XLinkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XLinkPackage getPackage() {
		return XLinkPackage.eINSTANCE;
	}

} //XLinkFactoryImpl
