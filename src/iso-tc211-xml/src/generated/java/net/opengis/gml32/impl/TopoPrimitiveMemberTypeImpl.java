/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.AbstractTopoPrimitiveType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.TopoPrimitiveMemberType;

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
 * An implementation of the model object '<em><b>Topo Primitive Member Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.TopoPrimitiveMemberTypeImpl#getAbstractTopoPrimitiveGroup <em>Abstract Topo Primitive Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.TopoPrimitiveMemberTypeImpl#getAbstractTopoPrimitive <em>Abstract Topo Primitive</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.TopoPrimitiveMemberTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.TopoPrimitiveMemberTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.TopoPrimitiveMemberTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.TopoPrimitiveMemberTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.TopoPrimitiveMemberTypeImpl#isOwns <em>Owns</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.TopoPrimitiveMemberTypeImpl#getRemoteSchema <em>Remote Schema</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.TopoPrimitiveMemberTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.TopoPrimitiveMemberTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.TopoPrimitiveMemberTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.TopoPrimitiveMemberTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopoPrimitiveMemberTypeImpl extends MinimalEObjectImpl.Container implements TopoPrimitiveMemberType
{
	/**
	 * The cached value of the '{@link #getAbstractTopoPrimitiveGroup() <em>Abstract Topo Primitive Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTopoPrimitiveGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractTopoPrimitiveGroup;

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
	 * The default value of the '{@link #isOwns() <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwns()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OWNS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOwns() <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwns()
	 * @generated
	 * @ordered
	 */
	protected boolean owns = OWNS_EDEFAULT;

	/**
	 * This is true if the Owns attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ownsESet;

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
	protected TopoPrimitiveMemberTypeImpl()
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
		return GMLPackage.eINSTANCE.getTopoPrimitiveMemberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTopoPrimitiveGroup()
	{
		if (abstractTopoPrimitiveGroup == null)
		{
			abstractTopoPrimitiveGroup = new BasicFeatureMap(this, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ABSTRACT_TOPO_PRIMITIVE_GROUP);
		}
		return abstractTopoPrimitiveGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTopoPrimitiveType getAbstractTopoPrimitive()
	{
		return (AbstractTopoPrimitiveType)getAbstractTopoPrimitiveGroup().get(GMLPackage.eINSTANCE.getTopoPrimitiveMemberType_AbstractTopoPrimitive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTopoPrimitive(AbstractTopoPrimitiveType newAbstractTopoPrimitive, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getAbstractTopoPrimitiveGroup()).basicAdd(GMLPackage.eINSTANCE.getTopoPrimitiveMemberType_AbstractTopoPrimitive(), newAbstractTopoPrimitive, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ARCROLE, oldArcrole, arcrole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOwns()
	{
		return owns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwns(boolean newOwns)
	{
		boolean oldOwns = owns;
		owns = newOwns;
		boolean oldOwnsESet = ownsESet;
		ownsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__OWNS, oldOwns, owns, !oldOwnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOwns()
	{
		boolean oldOwns = owns;
		boolean oldOwnsESet = ownsESet;
		owns = OWNS_EDEFAULT;
		ownsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__OWNS, oldOwns, OWNS_EDEFAULT, oldOwnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwns()
	{
		return ownsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__REMOTE_SCHEMA, oldRemoteSchema, remoteSchema));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ABSTRACT_TOPO_PRIMITIVE_GROUP:
				return ((InternalEList<?>)getAbstractTopoPrimitiveGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ABSTRACT_TOPO_PRIMITIVE:
				return basicSetAbstractTopoPrimitive(null, msgs);
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
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ABSTRACT_TOPO_PRIMITIVE_GROUP:
				if (coreType) return getAbstractTopoPrimitiveGroup();
				return ((FeatureMap.Internal)getAbstractTopoPrimitiveGroup()).getWrapper();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ABSTRACT_TOPO_PRIMITIVE:
				return getAbstractTopoPrimitive();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ACTUATE:
				return getActuate();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ARCROLE:
				return getArcrole();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__HREF:
				return getHref();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__NIL_REASON:
				return getNilReason();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__OWNS:
				return isOwns();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__REMOTE_SCHEMA:
				return getRemoteSchema();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ROLE:
				return getRole();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__SHOW:
				return getShow();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__TITLE:
				return getTitle();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__TYPE:
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
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ABSTRACT_TOPO_PRIMITIVE_GROUP:
				((FeatureMap.Internal)getAbstractTopoPrimitiveGroup()).set(newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ARCROLE:
				setArcrole((String)newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__HREF:
				setHref((String)newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__NIL_REASON:
				setNilReason(newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__OWNS:
				setOwns((Boolean)newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__REMOTE_SCHEMA:
				setRemoteSchema((String)newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__TYPE:
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
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ABSTRACT_TOPO_PRIMITIVE_GROUP:
				getAbstractTopoPrimitiveGroup().clear();
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ACTUATE:
				unsetActuate();
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__NIL_REASON:
				setNilReason(NIL_REASON_EDEFAULT);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__OWNS:
				unsetOwns();
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__REMOTE_SCHEMA:
				setRemoteSchema(REMOTE_SCHEMA_EDEFAULT);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__SHOW:
				unsetShow();
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__TYPE:
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
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ABSTRACT_TOPO_PRIMITIVE_GROUP:
				return abstractTopoPrimitiveGroup != null && !abstractTopoPrimitiveGroup.isEmpty();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ABSTRACT_TOPO_PRIMITIVE:
				return getAbstractTopoPrimitive() != null;
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ACTUATE:
				return isSetActuate();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__NIL_REASON:
				return NIL_REASON_EDEFAULT == null ? nilReason != null : !NIL_REASON_EDEFAULT.equals(nilReason);
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__OWNS:
				return isSetOwns();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__REMOTE_SCHEMA:
				return REMOTE_SCHEMA_EDEFAULT == null ? remoteSchema != null : !REMOTE_SCHEMA_EDEFAULT.equals(remoteSchema);
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__SHOW:
				return isSetShow();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE__TYPE:
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
		result.append(" (abstractTopoPrimitiveGroup: ");
		result.append(abstractTopoPrimitiveGroup);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", arcrole: ");
		result.append(arcrole);
		result.append(", href: ");
		result.append(href);
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(", owns: ");
		if (ownsESet) result.append(owns); else result.append("<unset>");
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

} //TopoPrimitiveMemberTypeImpl
