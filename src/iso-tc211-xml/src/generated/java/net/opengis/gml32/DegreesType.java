/**
 */
package net.opengis.gml32;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degrees Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DegreesType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml32.DegreesType#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDegreesType()
 * @model extendedMetaData="name='DegreesType' kind='simple'"
 * @generated
 */
public interface DegreesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getDegreesType_Value()
	 * @model dataType="net.opengis.gml32.DegreeValueType"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DegreesType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml32.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see net.opengis.gml32.DirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(DirectionType)
	 * @see net.opengis.gml32.GMLPackage#getDegreesType_Direction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='direction'"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DegreesType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see net.opengis.gml32.DirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.DegreesType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.DegreesType#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	boolean isSetDirection();

} // DegreesType
