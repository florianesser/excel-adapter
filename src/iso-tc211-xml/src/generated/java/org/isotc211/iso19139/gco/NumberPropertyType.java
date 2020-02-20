/**
 */
package org.isotc211.iso19139.gco;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.NumberPropertyType#getReal <em>Real</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.NumberPropertyType#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.NumberPropertyType#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.NumberPropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getNumberPropertyType()
 * @model extendedMetaData="name='Number_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface NumberPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' attribute.
	 * @see #isSetReal()
	 * @see #unsetReal()
	 * @see #setReal(double)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getNumberPropertyType_Real()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='Real' namespace='##targetNamespace'"
	 * @generated
	 */
	double getReal();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.NumberPropertyType#getReal <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real</em>' attribute.
	 * @see #isSetReal()
	 * @see #unsetReal()
	 * @see #getReal()
	 * @generated
	 */
	void setReal(double value);

	/**
	 * Unsets the value of the '{@link org.isotc211.iso19139.gco.NumberPropertyType#getReal <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReal()
	 * @see #getReal()
	 * @see #setReal(double)
	 * @generated
	 */
	void unsetReal();

	/**
	 * Returns whether the value of the '{@link org.isotc211.iso19139.gco.NumberPropertyType#getReal <em>Real</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Real</em>' attribute is set.
	 * @see #unsetReal()
	 * @see #getReal()
	 * @see #setReal(double)
	 * @generated
	 */
	boolean isSetReal();

	/**
	 * Returns the value of the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal</em>' attribute.
	 * @see #setDecimal(BigDecimal)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getNumberPropertyType_Decimal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='Decimal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDecimal();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.NumberPropertyType#getDecimal <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal</em>' attribute.
	 * @see #getDecimal()
	 * @generated
	 */
	void setDecimal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' attribute.
	 * @see #setInteger(BigInteger)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getNumberPropertyType_Integer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Integer' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getInteger();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.NumberPropertyType#getInteger <em>Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' attribute.
	 * @see #getInteger()
	 * @generated
	 */
	void setInteger(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getNumberPropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.NumberPropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // NumberPropertyType
