/**
 */
package org.isotc211.iso19139.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211.iso19139.gmd.AbstractMDContentInformationType;
import org.isotc211.iso19139.gmd.GMDPackage;
import org.isotc211.iso19139.gmd.MDContentInformationPropertyType;

import org.w3.xlink.ActuateType;
import org.w3.xlink.ShowType;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Content Information Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDContentInformationPropertyTypeImpl#getAbstractMDContentInformationGroup <em>Abstract MD Content Information Group</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDContentInformationPropertyTypeImpl#getAbstractMDContentInformation <em>Abstract MD Content Information</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDContentInformationPropertyTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDContentInformationPropertyTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDContentInformationPropertyTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDContentInformationPropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDContentInformationPropertyTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDContentInformationPropertyTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDContentInformationPropertyTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDContentInformationPropertyTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDContentInformationPropertyTypeImpl#getUuidref <em>Uuidref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDContentInformationPropertyTypeImpl extends MinimalEObjectImpl.Container implements MDContentInformationPropertyType
{
	/**
	 * The cached value of the '{@link #getAbstractMDContentInformationGroup() <em>Abstract MD Content Information Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractMDContentInformationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractMDContentInformationGroup;

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
	 * The default value of the '{@link #getUuidref() <em>Uuidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuidref()
	 * @generated
	 * @ordered
	 */
	protected static final String UUIDREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuidref() <em>Uuidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuidref()
	 * @generated
	 * @ordered
	 */
	protected String uuidref = UUIDREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDContentInformationPropertyTypeImpl()
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
		return GMDPackage.eINSTANCE.getMDContentInformationPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractMDContentInformationGroup()
	{
		if (abstractMDContentInformationGroup == null)
		{
			abstractMDContentInformationGroup = new BasicFeatureMap(this, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ABSTRACT_MD_CONTENT_INFORMATION_GROUP);
		}
		return abstractMDContentInformationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMDContentInformationType getAbstractMDContentInformation()
	{
		return (AbstractMDContentInformationType)getAbstractMDContentInformationGroup().get(GMDPackage.eINSTANCE.getMDContentInformationPropertyType_AbstractMDContentInformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractMDContentInformation(AbstractMDContentInformationType newAbstractMDContentInformation, NotificationChain msgs)
	{
		return ((FeatureMap.Internal)getAbstractMDContentInformationGroup()).basicAdd(GMDPackage.eINSTANCE.getMDContentInformationPropertyType_AbstractMDContentInformation(), newAbstractMDContentInformation, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ARCROLE, oldArcrole, arcrole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public String getUuidref()
	{
		return uuidref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuidref(String newUuidref)
	{
		String oldUuidref = uuidref;
		uuidref = newUuidref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__UUIDREF, oldUuidref, uuidref));
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
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ABSTRACT_MD_CONTENT_INFORMATION_GROUP:
				return ((InternalEList<?>)getAbstractMDContentInformationGroup()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ABSTRACT_MD_CONTENT_INFORMATION:
				return basicSetAbstractMDContentInformation(null, msgs);
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
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ABSTRACT_MD_CONTENT_INFORMATION_GROUP:
				if (coreType) return getAbstractMDContentInformationGroup();
				return ((FeatureMap.Internal)getAbstractMDContentInformationGroup()).getWrapper();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ABSTRACT_MD_CONTENT_INFORMATION:
				return getAbstractMDContentInformation();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ACTUATE:
				return getActuate();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ARCROLE:
				return getArcrole();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__HREF:
				return getHref();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__NIL_REASON:
				return getNilReason();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ROLE:
				return getRole();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__SHOW:
				return getShow();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__TITLE:
				return getTitle();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__TYPE:
				return getType();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__UUIDREF:
				return getUuidref();
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
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ABSTRACT_MD_CONTENT_INFORMATION_GROUP:
				((FeatureMap.Internal)getAbstractMDContentInformationGroup()).set(newValue);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ARCROLE:
				setArcrole((String)newValue);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__HREF:
				setHref((String)newValue);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__NIL_REASON:
				setNilReason(newValue);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__TYPE:
				setType((TypeType)newValue);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__UUIDREF:
				setUuidref((String)newValue);
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
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ABSTRACT_MD_CONTENT_INFORMATION_GROUP:
				getAbstractMDContentInformationGroup().clear();
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ACTUATE:
				unsetActuate();
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__NIL_REASON:
				setNilReason(NIL_REASON_EDEFAULT);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__SHOW:
				unsetShow();
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__TYPE:
				unsetType();
				return;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__UUIDREF:
				setUuidref(UUIDREF_EDEFAULT);
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
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ABSTRACT_MD_CONTENT_INFORMATION_GROUP:
				return abstractMDContentInformationGroup != null && !abstractMDContentInformationGroup.isEmpty();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ABSTRACT_MD_CONTENT_INFORMATION:
				return getAbstractMDContentInformation() != null;
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ACTUATE:
				return isSetActuate();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__NIL_REASON:
				return NIL_REASON_EDEFAULT == null ? nilReason != null : !NIL_REASON_EDEFAULT.equals(nilReason);
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__SHOW:
				return isSetShow();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__TYPE:
				return isSetType();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE__UUIDREF:
				return UUIDREF_EDEFAULT == null ? uuidref != null : !UUIDREF_EDEFAULT.equals(uuidref);
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
		result.append(" (abstractMDContentInformationGroup: ");
		result.append(abstractMDContentInformationGroup);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", arcrole: ");
		result.append(arcrole);
		result.append(", href: ");
		result.append(href);
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(", role: ");
		result.append(role);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", uuidref: ");
		result.append(uuidref);
		result.append(')');
		return result.toString();
	}

} //MDContentInformationPropertyTypeImpl
