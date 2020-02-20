/**
 */
package net.opengis.gml32;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMS Angle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DMSAngleType#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link net.opengis.gml32.DMSAngleType#getDecimalMinutes <em>Decimal Minutes</em>}</li>
 *   <li>{@link net.opengis.gml32.DMSAngleType#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link net.opengis.gml32.DMSAngleType#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDMSAngleType()
 * @model extendedMetaData="name='DMSAngleType' kind='elementOnly'"
 * @generated
 */
public interface DMSAngleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' containment reference.
	 * @see #setDegrees(DegreesType)
	 * @see net.opengis.gml32.GMLPackage#getDMSAngleType_Degrees()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='degrees' namespace='##targetNamespace'"
	 * @generated
	 */
	DegreesType getDegrees();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DMSAngleType#getDegrees <em>Degrees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' containment reference.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(DegreesType value);

	/**
	 * Returns the value of the '<em><b>Decimal Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Minutes</em>' attribute.
	 * @see #setDecimalMinutes(BigDecimal)
	 * @see net.opengis.gml32.GMLPackage#getDMSAngleType_DecimalMinutes()
	 * @model dataType="net.opengis.gml32.DecimalMinutesType"
	 *        extendedMetaData="kind='element' name='decimalMinutes' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDecimalMinutes();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DMSAngleType#getDecimalMinutes <em>Decimal Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Minutes</em>' attribute.
	 * @see #getDecimalMinutes()
	 * @generated
	 */
	void setDecimalMinutes(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes</em>' attribute.
	 * @see #setMinutes(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getDMSAngleType_Minutes()
	 * @model dataType="net.opengis.gml32.ArcMinutesType"
	 *        extendedMetaData="kind='element' name='minutes' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinutes();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DMSAngleType#getMinutes <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes</em>' attribute.
	 * @see #getMinutes()
	 * @generated
	 */
	void setMinutes(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(BigDecimal)
	 * @see net.opengis.gml32.GMLPackage#getDMSAngleType_Seconds()
	 * @model dataType="net.opengis.gml32.ArcSecondsType"
	 *        extendedMetaData="kind='element' name='seconds' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSeconds();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DMSAngleType#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(BigDecimal value);

} // DMSAngleType
