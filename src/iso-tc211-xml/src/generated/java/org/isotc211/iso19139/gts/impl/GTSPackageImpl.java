/**
 */
package org.isotc211.iso19139.gts.impl;

import net.opengis.gml32.GMLPackage;

import net.opengis.gml32.impl.GMLPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.isotc211.iso19139.gco.GCOPackage;

import org.isotc211.iso19139.gco.impl.GCOPackageImpl;

import org.isotc211.iso19139.gmd.GMDPackage;

import org.isotc211.iso19139.gmd.impl.GMDPackageImpl;

import org.isotc211.iso19139.gsr.GSRPackage;

import org.isotc211.iso19139.gsr.impl.GSRPackageImpl;

import org.isotc211.iso19139.gss.GSSPackage;

import org.isotc211.iso19139.gss.impl.GSSPackageImpl;

import org.isotc211.iso19139.gts.DocumentRoot;
import org.isotc211.iso19139.gts.GTSFactory;
import org.isotc211.iso19139.gts.GTSPackage;
import org.isotc211.iso19139.gts.TMPeriodDurationPropertyType;
import org.isotc211.iso19139.gts.TMPrimitivePropertyType;

import org.w3.xlink.XLinkPackage;

import org.w3.xlink.impl.XLinkPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GTSPackageImpl extends EPackageImpl implements GTSPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmPeriodDurationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmPrimitivePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.isotc211.iso19139.gts.GTSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GTSPackageImpl()
	{
		super(eNS_URI, GTSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GTSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GTSPackage init()
	{
		if (isInited) return (GTSPackage)EPackage.Registry.INSTANCE.getEPackage(GTSPackage.eNS_URI);

		// Obtain or create and register package
		GTSPackageImpl theGTSPackage = (GTSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GTSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GTSPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GMLPackageImpl theGMLPackage = (GMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI) instanceof GMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI) : GMLPackage.eINSTANCE);
		XLinkPackageImpl theXLinkPackage = (XLinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI) instanceof XLinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI) : XLinkPackage.eINSTANCE);
		GMDPackageImpl theGMDPackage = (GMDPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI) instanceof GMDPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI) : GMDPackage.eINSTANCE);
		GCOPackageImpl theGCOPackage = (GCOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GCOPackage.eNS_URI) instanceof GCOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GCOPackage.eNS_URI) : GCOPackage.eINSTANCE);
		GSSPackageImpl theGSSPackage = (GSSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) instanceof GSSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) : GSSPackage.eINSTANCE);
		GSRPackageImpl theGSRPackage = (GSRPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GSRPackage.eNS_URI) instanceof GSRPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GSRPackage.eNS_URI) : GSRPackage.eINSTANCE);

		// Load packages
		theGMLPackage.loadPackage();
		theGMDPackage.loadPackage();

		// Create package meta-data objects
		theGTSPackage.createPackageContents();
		theXLinkPackage.createPackageContents();
		theGCOPackage.createPackageContents();
		theGSSPackage.createPackageContents();
		theGSRPackage.createPackageContents();

		// Initialize created meta-data
		theGTSPackage.initializePackageContents();
		theXLinkPackage.initializePackageContents();
		theGCOPackage.initializePackageContents();
		theGSSPackage.initializePackageContents();
		theGSRPackage.initializePackageContents();

		// Fix loaded packages
		theGMLPackage.fixPackageContents();
		theGMDPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theGTSPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GTSPackage.eNS_URI, theGTSPackage);
		return theGTSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMPeriodDurationPropertyType()
	{
		return tmPeriodDurationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMPeriodDurationPropertyType_TMPeriodDuration()
	{
		return (EAttribute)tmPeriodDurationPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMPeriodDurationPropertyType_NilReason()
	{
		return (EAttribute)tmPeriodDurationPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMPrimitivePropertyType()
	{
		return tmPrimitivePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMPrimitivePropertyType_AbstractTimePrimitiveGroup()
	{
		return (EAttribute)tmPrimitivePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMPrimitivePropertyType_AbstractTimePrimitive()
	{
		return (EReference)tmPrimitivePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMPrimitivePropertyType_Actuate()
	{
		return (EAttribute)tmPrimitivePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMPrimitivePropertyType_Arcrole()
	{
		return (EAttribute)tmPrimitivePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMPrimitivePropertyType_Href()
	{
		return (EAttribute)tmPrimitivePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMPrimitivePropertyType_NilReason()
	{
		return (EAttribute)tmPrimitivePropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMPrimitivePropertyType_Role()
	{
		return (EAttribute)tmPrimitivePropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMPrimitivePropertyType_Show()
	{
		return (EAttribute)tmPrimitivePropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMPrimitivePropertyType_Title()
	{
		return (EAttribute)tmPrimitivePropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMPrimitivePropertyType_Type()
	{
		return (EAttribute)tmPrimitivePropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMPrimitivePropertyType_Uuidref()
	{
		return (EAttribute)tmPrimitivePropertyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot()
	{
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed()
	{
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation()
	{
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TMPeriodDuration()
	{
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTSFactory getGTSFactory()
	{
		return (GTSFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tmPeriodDurationPropertyTypeEClass = createEClass(TM_PERIOD_DURATION_PROPERTY_TYPE);
		createEAttribute(tmPeriodDurationPropertyTypeEClass, TM_PERIOD_DURATION_PROPERTY_TYPE__TM_PERIOD_DURATION);
		createEAttribute(tmPeriodDurationPropertyTypeEClass, TM_PERIOD_DURATION_PROPERTY_TYPE__NIL_REASON);

		tmPrimitivePropertyTypeEClass = createEClass(TM_PRIMITIVE_PROPERTY_TYPE);
		createEAttribute(tmPrimitivePropertyTypeEClass, TM_PRIMITIVE_PROPERTY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP);
		createEReference(tmPrimitivePropertyTypeEClass, TM_PRIMITIVE_PROPERTY_TYPE__ABSTRACT_TIME_PRIMITIVE);
		createEAttribute(tmPrimitivePropertyTypeEClass, TM_PRIMITIVE_PROPERTY_TYPE__ACTUATE);
		createEAttribute(tmPrimitivePropertyTypeEClass, TM_PRIMITIVE_PROPERTY_TYPE__ARCROLE);
		createEAttribute(tmPrimitivePropertyTypeEClass, TM_PRIMITIVE_PROPERTY_TYPE__HREF);
		createEAttribute(tmPrimitivePropertyTypeEClass, TM_PRIMITIVE_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(tmPrimitivePropertyTypeEClass, TM_PRIMITIVE_PROPERTY_TYPE__ROLE);
		createEAttribute(tmPrimitivePropertyTypeEClass, TM_PRIMITIVE_PROPERTY_TYPE__SHOW);
		createEAttribute(tmPrimitivePropertyTypeEClass, TM_PRIMITIVE_PROPERTY_TYPE__TITLE);
		createEAttribute(tmPrimitivePropertyTypeEClass, TM_PRIMITIVE_PROPERTY_TYPE__TYPE);
		createEAttribute(tmPrimitivePropertyTypeEClass, TM_PRIMITIVE_PROPERTY_TYPE__UUIDREF);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TM_PERIOD_DURATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		GMLPackage theGMLPackage = (GMLPackage)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI);
		XLinkPackage theXLinkPackage = (XLinkPackage)EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tmPeriodDurationPropertyTypeEClass, TMPeriodDurationPropertyType.class, "TMPeriodDurationPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMPeriodDurationPropertyType_TMPeriodDuration(), theXMLTypePackage.getDuration(), "tMPeriodDuration", null, 0, 1, TMPeriodDurationPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMPeriodDurationPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, TMPeriodDurationPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmPrimitivePropertyTypeEClass, TMPrimitivePropertyType.class, "TMPrimitivePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMPrimitivePropertyType_AbstractTimePrimitiveGroup(), ecorePackage.getEFeatureMapEntry(), "abstractTimePrimitiveGroup", null, 0, 1, TMPrimitivePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMPrimitivePropertyType_AbstractTimePrimitive(), theGMLPackage.getAbstractTimePrimitiveType(), null, "abstractTimePrimitive", null, 0, 1, TMPrimitivePropertyType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMPrimitivePropertyType_Actuate(), theXLinkPackage.getActuateType(), "actuate", null, 0, 1, TMPrimitivePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMPrimitivePropertyType_Arcrole(), theXLinkPackage.getArcroleType(), "arcrole", null, 0, 1, TMPrimitivePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMPrimitivePropertyType_Href(), theXLinkPackage.getHrefType(), "href", null, 0, 1, TMPrimitivePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMPrimitivePropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, TMPrimitivePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMPrimitivePropertyType_Role(), theXLinkPackage.getRoleType(), "role", null, 0, 1, TMPrimitivePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMPrimitivePropertyType_Show(), theXLinkPackage.getShowType(), "show", null, 0, 1, TMPrimitivePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMPrimitivePropertyType_Title(), theXLinkPackage.getTitleAttrType(), "title", null, 0, 1, TMPrimitivePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMPrimitivePropertyType_Type(), theXLinkPackage.getTypeType(), "type", "simple", 0, 1, TMPrimitivePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMPrimitivePropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, TMPrimitivePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TMPeriodDuration(), theXMLTypePackage.getDuration(), "tMPeriodDuration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:x-ogc:specification:gml:schema-xsd:basicTypes:3.2.1
		createUrnxogcspecificationgmlschemaxsdbasicTypes3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:gml:3.2.1
		createUrnxogcspecificationgmlschemaxsdgml3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:dynamicFeature:3.2.1
		createUrnxogcspecificationgmlschemaxsddynamicFeature3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:topology:3.2.1
		createUrnxogcspecificationgmlschemaxsdtopology3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:coverage:3.2.1
		createUrnxogcspecificationgmlschemaxsdcoverage3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:coordinateReferenceSystems:3.2.1
		createUrnxogcspecificationgmlschemaxsdcoordinateReferenceSystems3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:observation:3.2.1
		createUrnxogcspecificationgmlschemaxsdobservation3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:temporalReferenceSystems:3.2.1
		createUrnxogcspecificationgmlschemaxsdtemporalReferenceSystems3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:deprecatedTypes:3.2.1
		createUrnxogcspecificationgmlschemaxsddeprecatedTypes3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:temporalTopology:3.2.1
		createUrnxogcspecificationgmlschemaxsdtemporalTopology3Annotations();
		// urn:opengis:specification:gml:schema-xsd:dictionary:v3.2.1
		createUrnopengisspecificationgmlschemaxsddictionaryv3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:gmlBase:3.2.1
		createUrnxogcspecificationgmlschemaxsdgmlBase3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:temporal:3.2.1
		createUrnxogcspecificationgmlschemaxsdtemporal3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:feature:3.2.1
		createUrnxogcspecificationgmlschemaxsdfeature3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:direction:3.2.1
		createUrnxogcspecificationgmlschemaxsddirection3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:valueObjects:3.2.1
		createUrnxogcspecificationgmlschemaxsdvalueObjects3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryBasic0d1d:3.2.1
		createUrnxogcspecificationgmlschemaxsdgeometryBasic0d1d3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:coordinateSystems:3.2.1
		createUrnxogcspecificationgmlschemaxsdcoordinateSystems3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:datums:3.2.1
		createUrnxogcspecificationgmlschemaxsddatums3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:coordinateOperations:3.2.1
		createUrnxogcspecificationgmlschemaxsdcoordinateOperations3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:referenceSystems:3.2.1
		createUrnxogcspecificationgmlschemaxsdreferenceSystems3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:measures:3.2.1
		createUrnxogcspecificationgmlschemaxsdmeasures3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:units:3.2.1
		createUrnxogcspecificationgmlschemaxsdunits3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:grids:3.2.1
		createUrnxogcspecificationgmlschemaxsdgrids3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryAggregates:3.2.1
		createUrnxogcspecificationgmlschemaxsdgeometryAggregates3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryPrimitives:3.2.1
		createUrnxogcspecificationgmlschemaxsdgeometryPrimitives3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryComplexes:3.2.1
		createUrnxogcspecificationgmlschemaxsdgeometryComplexes3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryBasic2d:3.2.1
		createUrnxogcspecificationgmlschemaxsdgeometryBasic2d3Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:basicTypes:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdbasicTypes3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:basicTypes:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "basicTypes.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:gml:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgml3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:gml:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "gml.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:dynamicFeature:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsddynamicFeature3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:dynamicFeature:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "dynamicFeature.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:topology:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdtopology3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:topology:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "topology.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:coverage:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdcoverage3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:coverage:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "coverage.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:coordinateReferenceSystems:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdcoordinateReferenceSystems3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:coordinateReferenceSystems:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "coordinateReferenceSystems.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:observation:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdobservation3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:observation:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "observation.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:temporalReferenceSystems:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdtemporalReferenceSystems3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:temporalReferenceSystems:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "temporalReferenceSystems.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:deprecatedTypes:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsddeprecatedTypes3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:deprecatedTypes:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "deprecatedTypes.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:temporalTopology:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdtemporalTopology3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:temporalTopology:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "temporalTopology.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:dictionary:v3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddictionaryv3Annotations()
	{
		String source = "urn:opengis:specification:gml:schema-xsd:dictionary:v3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "dictionary.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:gmlBase:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgmlBase3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:gmlBase:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "gmlBase.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:temporal:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdtemporal3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:temporal:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "temporal.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:feature:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdfeature3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:feature:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "feature.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:direction:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsddirection3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:direction:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "direction.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:valueObjects:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdvalueObjects3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:valueObjects:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "valueObjects.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryBasic0d1d:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryBasic0d1d3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryBasic0d1d:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "geometryBasic0d1d.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:coordinateSystems:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdcoordinateSystems3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:coordinateSystems:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "coordinateSystems.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:datums:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsddatums3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:datums:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "datums.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:coordinateOperations:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdcoordinateOperations3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:coordinateOperations:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "coordinateOperations.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:referenceSystems:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdreferenceSystems3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:referenceSystems:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "referenceSystems.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:measures:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdmeasures3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:measures:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "measures.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:units:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdunits3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:units:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "units.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:grids:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgrids3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:grids:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "grids.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryAggregates:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryAggregates3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryAggregates:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "geometryAggregates.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryPrimitives:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryPrimitives3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryPrimitives:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "geometryPrimitives.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryComplexes:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryComplexes3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryComplexes:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "geometryComplexes.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryBasic2d:3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryBasic2d3Annotations()
	{
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryBasic2d:3.2.1";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "appinfo", "geometryBasic2d.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations()
	{
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (tmPeriodDurationPropertyTypeEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "TM_PeriodDuration_PropertyType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTMPeriodDurationPropertyType_TMPeriodDuration(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "TM_PeriodDuration",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTMPeriodDurationPropertyType_NilReason(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "nilReason",
			 "namespace", "http://www.isotc211.org/2005/gco"
		   });	
		addAnnotation
		  (tmPrimitivePropertyTypeEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "TM_Primitive_PropertyType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTMPrimitivePropertyType_AbstractTimePrimitiveGroup(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group",
			 "name", "AbstractTimePrimitive:group",
			 "namespace", "http://www.opengis.net/gml/3.2"
		   });	
		addAnnotation
		  (getTMPrimitivePropertyType_AbstractTimePrimitive(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "AbstractTimePrimitive",
			 "namespace", "http://www.opengis.net/gml/3.2",
			 "group", "http://www.opengis.net/gml/3.2#AbstractTimePrimitive:group"
		   });	
		addAnnotation
		  (getTMPrimitivePropertyType_Actuate(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "actuate",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });	
		addAnnotation
		  (getTMPrimitivePropertyType_Arcrole(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "arcrole",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });	
		addAnnotation
		  (getTMPrimitivePropertyType_Href(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });	
		addAnnotation
		  (getTMPrimitivePropertyType_NilReason(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "nilReason",
			 "namespace", "http://www.isotc211.org/2005/gco"
		   });	
		addAnnotation
		  (getTMPrimitivePropertyType_Role(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "role",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });	
		addAnnotation
		  (getTMPrimitivePropertyType_Show(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "show",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });	
		addAnnotation
		  (getTMPrimitivePropertyType_Title(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });	
		addAnnotation
		  (getTMPrimitivePropertyType_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });	
		addAnnotation
		  (getTMPrimitivePropertyType_Uuidref(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "uuidref"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] 
		   {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_TMPeriodDuration(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "TM_PeriodDuration",
			 "namespace", "##targetNamespace"
		   });
	}

} //GTSPackageImpl
