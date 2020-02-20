/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

import org.w3.xlink.ActuateType;
import org.w3.xlink.ShowType;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DQ Completeness Omission Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getDQCompletenessOmission <em>DQ Completeness Omission</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getHref <em>Href</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getNilReason <em>Nil Reason</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getRole <em>Role</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getShow <em>Show</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getType <em>Type</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getUuidref <em>Uuidref</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQCompletenessOmissionPropertyType()
 * @model extendedMetaData="name='DQ_CompletenessOmission_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface DQCompletenessOmissionPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>DQ Completeness Omission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Completeness Omission</em>' containment reference.
	 * @see #setDQCompletenessOmission(DQCompletenessOmissionType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQCompletenessOmissionPropertyType_DQCompletenessOmission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DQ_CompletenessOmission' namespace='##targetNamespace'"
	 * @generated
	 */
	DQCompletenessOmissionType getDQCompletenessOmission();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getDQCompletenessOmission <em>DQ Completeness Omission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Completeness Omission</em>' containment reference.
	 * @see #getDQCompletenessOmission()
	 * @generated
	 */
	void setDQCompletenessOmission(DQCompletenessOmissionType value);

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQCompletenessOmissionPropertyType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(String)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQCompletenessOmissionPropertyType_Arcrole()
	 * @model dataType="org.w3.xlink.ArcroleType"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getArcrole();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
	void setArcrole(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQCompletenessOmissionPropertyType_Href()
	 * @model dataType="org.w3.xlink.HrefType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQCompletenessOmissionPropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQCompletenessOmissionPropertyType_Role()
	 * @model dataType="org.w3.xlink.RoleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.xlink.ShowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQCompletenessOmissionPropertyType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Unsets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQCompletenessOmissionPropertyType_Title()
	 * @model dataType="org.w3.xlink.TitleAttrType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * The literals are from the enumeration {@link org.w3.xlink.TypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.w3.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQCompletenessOmissionPropertyType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.w3.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuidref</em>' attribute.
	 * @see #setUuidref(String)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getDQCompletenessOmissionPropertyType_Uuidref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='uuidref'"
	 * @generated
	 */
	String getUuidref();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.DQCompletenessOmissionPropertyType#getUuidref <em>Uuidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuidref</em>' attribute.
	 * @see #getUuidref()
	 * @generated
	 */
	void setUuidref(String value);

} // DQCompletenessOmissionPropertyType
