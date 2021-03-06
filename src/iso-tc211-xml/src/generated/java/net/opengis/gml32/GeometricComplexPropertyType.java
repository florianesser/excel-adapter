/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

import org.w3.xlink.ActuateType;
import org.w3.xlink.ShowType;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometric Complex Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A property that has a geometric complex as its value domain may either be an appropriate geometry element encapsulated in an element of this type or an XLink reference to a remote geometry element (where remote includes geometry elements located elsewhere in the same document). Either the reference or the contained element shall be given, but neither both nor none.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getGeometricComplex <em>Geometric Complex</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getCompositeCurve <em>Composite Curve</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getCompositeSurface <em>Composite Surface</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getCompositeSolid <em>Composite Solid</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getNilReason <em>Nil Reason</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#isOwns <em>Owns</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getRemoteSchema <em>Remote Schema</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getRole <em>Role</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getShow <em>Show</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.gml32.GeometricComplexPropertyType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType()
 * @model extendedMetaData="name='GeometricComplexPropertyType' kind='elementOnly'"
 * @generated
 */
public interface GeometricComplexPropertyType extends EObject
{
	/**
	 * Returns the value of the '<em><b>Geometric Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometric Complex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometric Complex</em>' containment reference.
	 * @see #setGeometricComplex(GeometricComplexType)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_GeometricComplex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GeometricComplex' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometricComplexType getGeometricComplex();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getGeometricComplex <em>Geometric Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometric Complex</em>' containment reference.
	 * @see #getGeometricComplex()
	 * @generated
	 */
	void setGeometricComplex(GeometricComplexType value);

	/**
	 * Returns the value of the '<em><b>Composite Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:CompositeCurve is represented by a sequence of (orientable) curves such that each curve in the sequence terminates at the start point of the subsequent curve in the list. 
	 * curveMember references or contains inline one curve in the composite curve. 
	 * The curves are contiguous, the collection of curves is ordered. Therefore, if provided, the aggregationType attribute shall have the value "sequence".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Curve</em>' containment reference.
	 * @see #setCompositeCurve(CompositeCurveType)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_CompositeCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CompositeCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	CompositeCurveType getCompositeCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getCompositeCurve <em>Composite Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Curve</em>' containment reference.
	 * @see #getCompositeCurve()
	 * @generated
	 */
	void setCompositeCurve(CompositeCurveType value);

	/**
	 * Returns the value of the '<em><b>Composite Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:CompositeSurface is represented by a set of orientable surfaces. It is geometry type with all the geometric properties of a (primitive) surface. Essentially, a composite surface is a collection of surfaces that join in pairs on common boundary curves and which, when considered as a whole, form a single surface.
	 * surfaceMember references or contains inline one surface in the composite surface. 
	 * The surfaces are contiguous.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Surface</em>' containment reference.
	 * @see #setCompositeSurface(CompositeSurfaceType)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_CompositeSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CompositeSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	CompositeSurfaceType getCompositeSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getCompositeSurface <em>Composite Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Surface</em>' containment reference.
	 * @see #getCompositeSurface()
	 * @generated
	 */
	void setCompositeSurface(CompositeSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Composite Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CompositeSolid implements ISO 19107 GM_CompositeSolid (see ISO 19107:2003, 6.6.7) as specified in D.2.3.6. 
	 * A gml:CompositeSolid is represented by a set of orientable surfaces. It is a geometry type with all the geometric properties of a (primitive) solid. Essentially, a composite solid is a collection of solids that join in pairs on common boundary surfaces and which, when considered as a whole, form a single solid. 
	 * solidMember references or contains one solid in the composite solid. The solids are contiguous.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Solid</em>' containment reference.
	 * @see #setCompositeSolid(CompositeSolidType)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_CompositeSolid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CompositeSolid' namespace='##targetNamespace'"
	 * @generated
	 */
	CompositeSolidType getCompositeSolid();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getCompositeSolid <em>Composite Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Solid</em>' containment reference.
	 * @see #getCompositeSolid()
	 * @generated
	 */
	void setCompositeSolid(CompositeSolidType value);

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getActuate <em>Actuate</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getActuate <em>Actuate</em>}' attribute is set.
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
	 * <p>
	 * If the meaning of the '<em>Arcrole</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(String)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_Arcrole()
	 * @model dataType="org.w3.xlink.ArcroleType"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getArcrole();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getArcrole <em>Arcrole</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_Href()
	 * @model dataType="org.w3.xlink.HrefType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getHref <em>Href</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Nil Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #setOwns(boolean)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_Owns()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='owns'"
	 * @generated
	 */
	boolean isOwns();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @generated
	 */
	void setOwns(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	void unsetOwns();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#isOwns <em>Owns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owns</em>' attribute is set.
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	boolean isSetOwns();

	/**
	 * Returns the value of the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Schema</em>' attribute.
	 * @see #setRemoteSchema(String)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_RemoteSchema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='remoteSchema' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemoteSchema();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getRemoteSchema <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Schema</em>' attribute.
	 * @see #getRemoteSchema()
	 * @generated
	 */
	void setRemoteSchema(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_Role()
	 * @model dataType="org.w3.xlink.RoleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getRole <em>Role</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Show</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getShow <em>Show</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getShow <em>Show</em>}' attribute is set.
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
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_Title()
	 * @model dataType="org.w3.xlink.TitleAttrType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getTitle <em>Title</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.w3.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see net.opengis.gml32.GMLPackage#getGeometricComplexPropertyType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.GeometricComplexPropertyType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // GeometricComplexPropertyType
