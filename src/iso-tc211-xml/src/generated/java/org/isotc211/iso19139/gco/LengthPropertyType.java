/**
 */
package org.isotc211.iso19139.gco;

import net.opengis.gml32.LengthType;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.LengthPropertyType#getLengthGroup <em>Length Group</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.LengthPropertyType#getLength <em>Length</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.LengthPropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getLengthPropertyType()
 * @model extendedMetaData="name='Length_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface LengthPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Length Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Group</em>' attribute list.
	 * @see org.isotc211.iso19139.gco.GCOPackage#getLengthPropertyType_LengthGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='Length:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLengthGroup();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(LengthType)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getLengthPropertyType_Length()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Length' namespace='##targetNamespace' group='Length:group'"
	 * @generated
	 */
	LengthType getLength();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.LengthPropertyType#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(LengthType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getLengthPropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.LengthPropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // LengthPropertyType
