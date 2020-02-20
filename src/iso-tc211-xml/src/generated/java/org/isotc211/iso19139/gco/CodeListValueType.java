/**
 */
package org.isotc211.iso19139.gco;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code List Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.CodeListValueType#getValue <em>Value</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.CodeListValueType#getCodeList <em>Code List</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.CodeListValueType#getCodeListValue <em>Code List Value</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.CodeListValueType#getCodeSpace <em>Code Space</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getCodeListValueType()
 * @model extendedMetaData="name='CodeListValue_Type' kind='simple'"
 * @generated
 */
public interface CodeListValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getCodeListValueType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.CodeListValueType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Code List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List</em>' attribute.
	 * @see #setCodeList(String)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getCodeListValueType_CodeList()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='codeList'"
	 * @generated
	 */
	String getCodeList();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.CodeListValueType#getCodeList <em>Code List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List</em>' attribute.
	 * @see #getCodeList()
	 * @generated
	 */
	void setCodeList(String value);

	/**
	 * Returns the value of the '<em><b>Code List Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code List Value</em>' attribute.
	 * @see #setCodeListValue(String)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getCodeListValueType_CodeListValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='codeListValue'"
	 * @generated
	 */
	String getCodeListValue();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.CodeListValueType#getCodeListValue <em>Code List Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code List Value</em>' attribute.
	 * @see #getCodeListValue()
	 * @generated
	 */
	void setCodeListValue(String value);

	/**
	 * Returns the value of the '<em><b>Code Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Space</em>' attribute.
	 * @see #setCodeSpace(String)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getCodeListValueType_CodeSpace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='codeSpace'"
	 * @generated
	 */
	String getCodeSpace();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.CodeListValueType#getCodeSpace <em>Code Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Space</em>' attribute.
	 * @see #getCodeSpace()
	 * @generated
	 */
	void setCodeSpace(String value);

} // CodeListValueType
