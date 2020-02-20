/**
 */
package org.w3.xlink.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.xlink.ActuateType;
import org.w3.xlink.ArcType;
import org.w3.xlink.DocumentRoot;
import org.w3.xlink.LocatorType;
import org.w3.xlink.ResourceType;
import org.w3.xlink.ShowType;
import org.w3.xlink.TitleEltType;
import org.w3.xlink.TypeType;
import org.w3.xlink.XLinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getLocator <em>Locator</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.w3.xlink.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected String arcrole = ARCROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType SHOW_EDEFAULT = ShowType.NEW;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

	/**
	 * The default value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle1() <em>Title1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle1()
	 * @generated
	 * @ordered
	 */
	protected String title1 = TITLE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.SIMPLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XLinkPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XLinkPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XLinkPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XLinkPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcType getArc() {
		return (ArcType)getMixed().get(XLinkPackage.Literals.DOCUMENT_ROOT__ARC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArc(ArcType newArc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XLinkPackage.Literals.DOCUMENT_ROOT__ARC, newArc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocatorType getLocator() {
		return (LocatorType)getMixed().get(XLinkPackage.Literals.DOCUMENT_ROOT__LOCATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocator(LocatorType newLocator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XLinkPackage.Literals.DOCUMENT_ROOT__LOCATOR, newLocator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType getResource() {
		return (ResourceType)getMixed().get(XLinkPackage.Literals.DOCUMENT_ROOT__RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(ResourceType newResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XLinkPackage.Literals.DOCUMENT_ROOT__RESOURCE, newResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleEltType getTitle() {
		return (TitleEltType)getMixed().get(XLinkPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleEltType newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XLinkPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuateType getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActuate(ActuateType newActuate) {
		ActuateType oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XLinkPackage.DOCUMENT_ROOT__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActuate() {
		ActuateType oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XLinkPackage.DOCUMENT_ROOT__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArcrole() {
		return arcrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcrole(String newArcrole) {
		String oldArcrole = arcrole;
		arcrole = newArcrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XLinkPackage.DOCUMENT_ROOT__ARCROLE, oldArcrole, arcrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XLinkPackage.DOCUMENT_ROOT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XLinkPackage.DOCUMENT_ROOT__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XLinkPackage.DOCUMENT_ROOT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XLinkPackage.DOCUMENT_ROOT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShowType getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShow(ShowType newShow) {
		ShowType oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XLinkPackage.DOCUMENT_ROOT__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShow() {
		ShowType oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XLinkPackage.DOCUMENT_ROOT__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShow() {
		return showESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle1() {
		return title1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle1(String newTitle1) {
		String oldTitle1 = title1;
		title1 = newTitle1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XLinkPackage.DOCUMENT_ROOT__TITLE1, oldTitle1, title1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XLinkPackage.DOCUMENT_ROOT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XLinkPackage.DOCUMENT_ROOT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XLinkPackage.DOCUMENT_ROOT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XLinkPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XLinkPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case XLinkPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case XLinkPackage.DOCUMENT_ROOT__ARC:
				return basicSetArc(null, msgs);
			case XLinkPackage.DOCUMENT_ROOT__LOCATOR:
				return basicSetLocator(null, msgs);
			case XLinkPackage.DOCUMENT_ROOT__RESOURCE:
				return basicSetResource(null, msgs);
			case XLinkPackage.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
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
			case XLinkPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XLinkPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case XLinkPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case XLinkPackage.DOCUMENT_ROOT__ARC:
				return getArc();
			case XLinkPackage.DOCUMENT_ROOT__LOCATOR:
				return getLocator();
			case XLinkPackage.DOCUMENT_ROOT__RESOURCE:
				return getResource();
			case XLinkPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case XLinkPackage.DOCUMENT_ROOT__ACTUATE:
				return getActuate();
			case XLinkPackage.DOCUMENT_ROOT__ARCROLE:
				return getArcrole();
			case XLinkPackage.DOCUMENT_ROOT__FROM:
				return getFrom();
			case XLinkPackage.DOCUMENT_ROOT__HREF:
				return getHref();
			case XLinkPackage.DOCUMENT_ROOT__LABEL:
				return getLabel();
			case XLinkPackage.DOCUMENT_ROOT__ROLE:
				return getRole();
			case XLinkPackage.DOCUMENT_ROOT__SHOW:
				return getShow();
			case XLinkPackage.DOCUMENT_ROOT__TITLE1:
				return getTitle1();
			case XLinkPackage.DOCUMENT_ROOT__TO:
				return getTo();
			case XLinkPackage.DOCUMENT_ROOT__TYPE:
				return getType();
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
			case XLinkPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XLinkPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case XLinkPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case XLinkPackage.DOCUMENT_ROOT__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case XLinkPackage.DOCUMENT_ROOT__ARCROLE:
				setArcrole((String)newValue);
				return;
			case XLinkPackage.DOCUMENT_ROOT__FROM:
				setFrom((String)newValue);
				return;
			case XLinkPackage.DOCUMENT_ROOT__HREF:
				setHref((String)newValue);
				return;
			case XLinkPackage.DOCUMENT_ROOT__LABEL:
				setLabel((String)newValue);
				return;
			case XLinkPackage.DOCUMENT_ROOT__ROLE:
				setRole((String)newValue);
				return;
			case XLinkPackage.DOCUMENT_ROOT__SHOW:
				setShow((ShowType)newValue);
				return;
			case XLinkPackage.DOCUMENT_ROOT__TITLE1:
				setTitle1((String)newValue);
				return;
			case XLinkPackage.DOCUMENT_ROOT__TO:
				setTo((String)newValue);
				return;
			case XLinkPackage.DOCUMENT_ROOT__TYPE:
				setType((TypeType)newValue);
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
			case XLinkPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case XLinkPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case XLinkPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case XLinkPackage.DOCUMENT_ROOT__ACTUATE:
				unsetActuate();
				return;
			case XLinkPackage.DOCUMENT_ROOT__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case XLinkPackage.DOCUMENT_ROOT__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case XLinkPackage.DOCUMENT_ROOT__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case XLinkPackage.DOCUMENT_ROOT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case XLinkPackage.DOCUMENT_ROOT__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case XLinkPackage.DOCUMENT_ROOT__SHOW:
				unsetShow();
				return;
			case XLinkPackage.DOCUMENT_ROOT__TITLE1:
				setTitle1(TITLE1_EDEFAULT);
				return;
			case XLinkPackage.DOCUMENT_ROOT__TO:
				setTo(TO_EDEFAULT);
				return;
			case XLinkPackage.DOCUMENT_ROOT__TYPE:
				unsetType();
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
			case XLinkPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XLinkPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case XLinkPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case XLinkPackage.DOCUMENT_ROOT__ARC:
				return getArc() != null;
			case XLinkPackage.DOCUMENT_ROOT__LOCATOR:
				return getLocator() != null;
			case XLinkPackage.DOCUMENT_ROOT__RESOURCE:
				return getResource() != null;
			case XLinkPackage.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
			case XLinkPackage.DOCUMENT_ROOT__ACTUATE:
				return isSetActuate();
			case XLinkPackage.DOCUMENT_ROOT__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case XLinkPackage.DOCUMENT_ROOT__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case XLinkPackage.DOCUMENT_ROOT__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case XLinkPackage.DOCUMENT_ROOT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case XLinkPackage.DOCUMENT_ROOT__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case XLinkPackage.DOCUMENT_ROOT__SHOW:
				return isSetShow();
			case XLinkPackage.DOCUMENT_ROOT__TITLE1:
				return TITLE1_EDEFAULT == null ? title1 != null : !TITLE1_EDEFAULT.equals(title1);
			case XLinkPackage.DOCUMENT_ROOT__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case XLinkPackage.DOCUMENT_ROOT__TYPE:
				return isSetType();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", arcrole: ");
		result.append(arcrole);
		result.append(", from: ");
		result.append(from);
		result.append(", href: ");
		result.append(href);
		result.append(", label: ");
		result.append(label);
		result.append(", role: ");
		result.append(role);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", title1: ");
		result.append(title1);
		result.append(", to: ");
		result.append(to);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
