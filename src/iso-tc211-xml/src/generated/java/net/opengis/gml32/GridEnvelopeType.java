/**
 */
package net.opengis.gml32;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.GridEnvelopeType#getLow <em>Low</em>}</li>
 *   <li>{@link net.opengis.gml32.GridEnvelopeType#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getGridEnvelopeType()
 * @model extendedMetaData="name='GridEnvelopeType' kind='elementOnly'"
 * @generated
 */
public interface GridEnvelopeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' attribute.
	 * @see #setLow(List)
	 * @see net.opengis.gml32.GMLPackage#getGridEnvelopeType_Low()
	 * @model dataType="net.opengis.gml32.IntegerList" required="true" many="false"
	 *        extendedMetaData="kind='element' name='low' namespace='##targetNamespace'"
	 * @generated
	 */
	List<BigInteger> getLow();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GridEnvelopeType#getLow <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' attribute.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(List<BigInteger> value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' attribute.
	 * @see #setHigh(List)
	 * @see net.opengis.gml32.GMLPackage#getGridEnvelopeType_High()
	 * @model dataType="net.opengis.gml32.IntegerList" required="true" many="false"
	 *        extendedMetaData="kind='element' name='high' namespace='##targetNamespace'"
	 * @generated
	 */
	List<BigInteger> getHigh();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GridEnvelopeType#getHigh <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' attribute.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(List<BigInteger> value);

} // GridEnvelopeType
