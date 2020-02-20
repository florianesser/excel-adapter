/**
 */
package org.isotc211.iso19139.gco;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.BinaryType#getValue <em>Value</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.BinaryType#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getBinaryType()
 * @model extendedMetaData="name='Binary_Type' kind='simple'"
 * @generated
 */
public interface BinaryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getBinaryType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.BinaryType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getBinaryType_Src()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='src'"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.BinaryType#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

} // BinaryType
