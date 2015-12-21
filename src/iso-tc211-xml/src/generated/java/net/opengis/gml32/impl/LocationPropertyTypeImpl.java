/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.AbstractGeometryType;
import net.opengis.gml32.CodeType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.LocationPropertyType;
import net.opengis.gml32.StringOrRefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.xlink.ActuateType;
import org.w3.xlink.ShowType;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getAbstractGeometry <em>Abstract Geometry</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getLocationKeyWord <em>Location Key Word</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getLocationString <em>Location String</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getNull <em>Null</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getRemoteSchema <em>Remote Schema</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.LocationPropertyTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationPropertyTypeImpl extends MinimalEObjectImpl.Container implements LocationPropertyType
{
	/**
	 * The cached value of the '{@link #getAbstractGeometryGroup() <em>Abstract Geometry Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractGeometryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractGeometryGroup;

	/**
	 * The cached value of the '{@link #getLocationKeyWord() <em>Location Key Word</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationKeyWord()
	 * @generated
	 * @ordered
	 */
	protected CodeType locationKeyWord;

	/**
	 * The cached value of the '{@link #getLocationString() <em>Location String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationString()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType locationString;

	/**
	 * The default value of the '{@link #getNull() <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated
	 * @ordered
	 */
	protected static final Object NULL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNull() <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated
	 * @ordered
	 */
	protected Object null_ = NULL_EDEFAULT;

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
	 * The default value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected static final Object NIL_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected Object nilReason = NIL_REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteSchema() <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteSchema() <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSchema()
	 * @generated
	 * @ordered
	 */
	protected String remoteSchema = REMOTE_SCHEMA_EDEFAULT;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	protected LocationPropertyTypeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return GMLPackage.eINSTANCE.getLocationPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractGeometryGroup()
	{
		if (abstractGeometryGroup == null)
		{
			abstractGeometryGroup = new BasicFeatureMap(this, GMLPackage.LOCATION_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP);
		}
		return abstractGeometryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeometryType getAbstractGeometry()
	{
		return (AbstractGeometryType)getAbstractGeometryGroup().get(GMLPackage.eINSTANCE.getLocationPropertyType_AbstractGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeometry(AbstractGeometryType newAbstractGeometry, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getAbstractGeometryGroup()).basicAdd(GMLPackage.eINSTANCE.getLocationPropertyType_AbstractGeometry(), newAbstractGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getLocationKeyWord()
	{
		return locationKeyWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationKeyWord(CodeType newLocationKeyWord, NotificationChain msgs)
	{
		CodeType oldLocationKeyWord = locationKeyWord;
		locationKeyWord = newLocationKeyWord;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_KEY_WORD, oldLocationKeyWord, newLocationKeyWord);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationKeyWord(CodeType newLocationKeyWord)
	{
		if (newLocationKeyWord != locationKeyWord)
		{
			NotificationChain msgs = null;
			if (locationKeyWord != null)
				msgs = ((InternalEObject)locationKeyWord).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_KEY_WORD, null, msgs);
			if (newLocationKeyWord != null)
				msgs = ((InternalEObject)newLocationKeyWord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_KEY_WORD, null, msgs);
			msgs = basicSetLocationKeyWord(newLocationKeyWord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_KEY_WORD, newLocationKeyWord, newLocationKeyWord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOrRefType getLocationString()
	{
		return locationString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationString(StringOrRefType newLocationString, NotificationChain msgs)
	{
		StringOrRefType oldLocationString = locationString;
		locationString = newLocationString;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_STRING, oldLocationString, newLocationString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationString(StringOrRefType newLocationString)
	{
		if (newLocationString != locationString)
		{
			NotificationChain msgs = null;
			if (locationString != null)
				msgs = ((InternalEObject)locationString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_STRING, null, msgs);
			if (newLocationString != null)
				msgs = ((InternalEObject)newLocationString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_STRING, null, msgs);
			msgs = basicSetLocationString(newLocationString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_STRING, newLocationString, newLocationString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNull()
	{
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNull(Object newNull)
	{
		Object oldNull = null_;
		null_ = newNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__NULL, oldNull, null_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType getActuate()
	{
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuate(ActuateType newActuate)
	{
		ActuateType oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActuate()
	{
		ActuateType oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.LOCATION_PROPERTY_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActuate()
	{
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArcrole()
	{
		return arcrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcrole(String newArcrole)
	{
		String oldArcrole = arcrole;
		arcrole = newArcrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__ARCROLE, oldArcrole, arcrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref()
	{
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref)
	{
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNilReason()
	{
		return nilReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNilReason(Object newNilReason)
	{
		Object oldNilReason = nilReason;
		nilReason = newNilReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteSchema()
	{
		return remoteSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteSchema(String newRemoteSchema)
	{
		String oldRemoteSchema = remoteSchema;
		remoteSchema = newRemoteSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__REMOTE_SCHEMA, oldRemoteSchema, remoteSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole)
	{
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType getShow()
	{
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(ShowType newShow)
	{
		ShowType oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShow()
	{
		ShowType oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.LOCATION_PROPERTY_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShow()
	{
		return showESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle)
	{
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType)
	{
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.LOCATION_PROPERTY_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType()
	{
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.LOCATION_PROPERTY_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType()
	{
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case GMLPackage.LOCATION_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				return ((InternalEList<?>)getAbstractGeometryGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.LOCATION_PROPERTY_TYPE__ABSTRACT_GEOMETRY:
				return basicSetAbstractGeometry(null, msgs);
			case GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_KEY_WORD:
				return basicSetLocationKeyWord(null, msgs);
			case GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_STRING:
				return basicSetLocationString(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case GMLPackage.LOCATION_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				if (coreType) return getAbstractGeometryGroup();
				return ((FeatureMap.Internal)getAbstractGeometryGroup()).getWrapper();
			case GMLPackage.LOCATION_PROPERTY_TYPE__ABSTRACT_GEOMETRY:
				return getAbstractGeometry();
			case GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_KEY_WORD:
				return getLocationKeyWord();
			case GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_STRING:
				return getLocationString();
			case GMLPackage.LOCATION_PROPERTY_TYPE__NULL:
				return getNull();
			case GMLPackage.LOCATION_PROPERTY_TYPE__ACTUATE:
				return getActuate();
			case GMLPackage.LOCATION_PROPERTY_TYPE__ARCROLE:
				return getArcrole();
			case GMLPackage.LOCATION_PROPERTY_TYPE__HREF:
				return getHref();
			case GMLPackage.LOCATION_PROPERTY_TYPE__NIL_REASON:
				return getNilReason();
			case GMLPackage.LOCATION_PROPERTY_TYPE__REMOTE_SCHEMA:
				return getRemoteSchema();
			case GMLPackage.LOCATION_PROPERTY_TYPE__ROLE:
				return getRole();
			case GMLPackage.LOCATION_PROPERTY_TYPE__SHOW:
				return getShow();
			case GMLPackage.LOCATION_PROPERTY_TYPE__TITLE:
				return getTitle();
			case GMLPackage.LOCATION_PROPERTY_TYPE__TYPE:
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case GMLPackage.LOCATION_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				((FeatureMap.Internal)getAbstractGeometryGroup()).set(newValue);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_KEY_WORD:
				setLocationKeyWord((CodeType)newValue);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_STRING:
				setLocationString((StringOrRefType)newValue);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__NULL:
				setNull(newValue);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__ARCROLE:
				setArcrole((String)newValue);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__HREF:
				setHref((String)newValue);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__NIL_REASON:
				setNilReason(newValue);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__REMOTE_SCHEMA:
				setRemoteSchema((String)newValue);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__TYPE:
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case GMLPackage.LOCATION_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				getAbstractGeometryGroup().clear();
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_KEY_WORD:
				setLocationKeyWord((CodeType)null);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_STRING:
				setLocationString((StringOrRefType)null);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__NULL:
				setNull(NULL_EDEFAULT);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__ACTUATE:
				unsetActuate();
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__NIL_REASON:
				setNilReason(NIL_REASON_EDEFAULT);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__REMOTE_SCHEMA:
				setRemoteSchema(REMOTE_SCHEMA_EDEFAULT);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__SHOW:
				unsetShow();
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GMLPackage.LOCATION_PROPERTY_TYPE__TYPE:
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case GMLPackage.LOCATION_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP:
				return abstractGeometryGroup != null && !abstractGeometryGroup.isEmpty();
			case GMLPackage.LOCATION_PROPERTY_TYPE__ABSTRACT_GEOMETRY:
				return getAbstractGeometry() != null;
			case GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_KEY_WORD:
				return locationKeyWord != null;
			case GMLPackage.LOCATION_PROPERTY_TYPE__LOCATION_STRING:
				return locationString != null;
			case GMLPackage.LOCATION_PROPERTY_TYPE__NULL:
				return NULL_EDEFAULT == null ? null_ != null : !NULL_EDEFAULT.equals(null_);
			case GMLPackage.LOCATION_PROPERTY_TYPE__ACTUATE:
				return isSetActuate();
			case GMLPackage.LOCATION_PROPERTY_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case GMLPackage.LOCATION_PROPERTY_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case GMLPackage.LOCATION_PROPERTY_TYPE__NIL_REASON:
				return NIL_REASON_EDEFAULT == null ? nilReason != null : !NIL_REASON_EDEFAULT.equals(nilReason);
			case GMLPackage.LOCATION_PROPERTY_TYPE__REMOTE_SCHEMA:
				return REMOTE_SCHEMA_EDEFAULT == null ? remoteSchema != null : !REMOTE_SCHEMA_EDEFAULT.equals(remoteSchema);
			case GMLPackage.LOCATION_PROPERTY_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case GMLPackage.LOCATION_PROPERTY_TYPE__SHOW:
				return isSetShow();
			case GMLPackage.LOCATION_PROPERTY_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GMLPackage.LOCATION_PROPERTY_TYPE__TYPE:
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
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (abstractGeometryGroup: ");
		result.append(abstractGeometryGroup);
		result.append(", null: ");
		result.append(null_);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", arcrole: ");
		result.append(arcrole);
		result.append(", href: ");
		result.append(href);
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(", remoteSchema: ");
		result.append(remoteSchema);
		result.append(", role: ");
		result.append(role);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LocationPropertyTypeImpl
