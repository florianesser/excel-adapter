/**
 */
package net.opengis.gml32;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Curve Segment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AbstractCurveSegmentType#getNumDerivativeInterior <em>Num Derivative Interior</em>}</li>
 *   <li>{@link net.opengis.gml32.AbstractCurveSegmentType#getNumDerivativesAtEnd <em>Num Derivatives At End</em>}</li>
 *   <li>{@link net.opengis.gml32.AbstractCurveSegmentType#getNumDerivativesAtStart <em>Num Derivatives At Start</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAbstractCurveSegmentType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractCurveSegmentType' kind='empty'"
 * @generated
 */
public interface AbstractCurveSegmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Derivative Interior</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Derivative Interior</em>' attribute.
	 * @see #isSetNumDerivativeInterior()
	 * @see #unsetNumDerivativeInterior()
	 * @see #setNumDerivativeInterior(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getAbstractCurveSegmentType_NumDerivativeInterior()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='numDerivativeInterior'"
	 * @generated
	 */
	BigInteger getNumDerivativeInterior();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractCurveSegmentType#getNumDerivativeInterior <em>Num Derivative Interior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Derivative Interior</em>' attribute.
	 * @see #isSetNumDerivativeInterior()
	 * @see #unsetNumDerivativeInterior()
	 * @see #getNumDerivativeInterior()
	 * @generated
	 */
	void setNumDerivativeInterior(BigInteger value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.AbstractCurveSegmentType#getNumDerivativeInterior <em>Num Derivative Interior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumDerivativeInterior()
	 * @see #getNumDerivativeInterior()
	 * @see #setNumDerivativeInterior(BigInteger)
	 * @generated
	 */
	void unsetNumDerivativeInterior();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.AbstractCurveSegmentType#getNumDerivativeInterior <em>Num Derivative Interior</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Derivative Interior</em>' attribute is set.
	 * @see #unsetNumDerivativeInterior()
	 * @see #getNumDerivativeInterior()
	 * @see #setNumDerivativeInterior(BigInteger)
	 * @generated
	 */
	boolean isSetNumDerivativeInterior();

	/**
	 * Returns the value of the '<em><b>Num Derivatives At End</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Derivatives At End</em>' attribute.
	 * @see #isSetNumDerivativesAtEnd()
	 * @see #unsetNumDerivativesAtEnd()
	 * @see #setNumDerivativesAtEnd(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getAbstractCurveSegmentType_NumDerivativesAtEnd()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='numDerivativesAtEnd'"
	 * @generated
	 */
	BigInteger getNumDerivativesAtEnd();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractCurveSegmentType#getNumDerivativesAtEnd <em>Num Derivatives At End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Derivatives At End</em>' attribute.
	 * @see #isSetNumDerivativesAtEnd()
	 * @see #unsetNumDerivativesAtEnd()
	 * @see #getNumDerivativesAtEnd()
	 * @generated
	 */
	void setNumDerivativesAtEnd(BigInteger value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.AbstractCurveSegmentType#getNumDerivativesAtEnd <em>Num Derivatives At End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumDerivativesAtEnd()
	 * @see #getNumDerivativesAtEnd()
	 * @see #setNumDerivativesAtEnd(BigInteger)
	 * @generated
	 */
	void unsetNumDerivativesAtEnd();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.AbstractCurveSegmentType#getNumDerivativesAtEnd <em>Num Derivatives At End</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Derivatives At End</em>' attribute is set.
	 * @see #unsetNumDerivativesAtEnd()
	 * @see #getNumDerivativesAtEnd()
	 * @see #setNumDerivativesAtEnd(BigInteger)
	 * @generated
	 */
	boolean isSetNumDerivativesAtEnd();

	/**
	 * Returns the value of the '<em><b>Num Derivatives At Start</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Derivatives At Start</em>' attribute.
	 * @see #isSetNumDerivativesAtStart()
	 * @see #unsetNumDerivativesAtStart()
	 * @see #setNumDerivativesAtStart(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getAbstractCurveSegmentType_NumDerivativesAtStart()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='numDerivativesAtStart'"
	 * @generated
	 */
	BigInteger getNumDerivativesAtStart();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractCurveSegmentType#getNumDerivativesAtStart <em>Num Derivatives At Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Derivatives At Start</em>' attribute.
	 * @see #isSetNumDerivativesAtStart()
	 * @see #unsetNumDerivativesAtStart()
	 * @see #getNumDerivativesAtStart()
	 * @generated
	 */
	void setNumDerivativesAtStart(BigInteger value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.AbstractCurveSegmentType#getNumDerivativesAtStart <em>Num Derivatives At Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumDerivativesAtStart()
	 * @see #getNumDerivativesAtStart()
	 * @see #setNumDerivativesAtStart(BigInteger)
	 * @generated
	 */
	void unsetNumDerivativesAtStart();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.AbstractCurveSegmentType#getNumDerivativesAtStart <em>Num Derivatives At Start</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Derivatives At Start</em>' attribute is set.
	 * @see #unsetNumDerivativesAtStart()
	 * @see #getNumDerivativesAtStart()
	 * @see #setNumDerivativesAtStart(BigInteger)
	 * @generated
	 */
	boolean isSetNumDerivativesAtStart();

} // AbstractCurveSegmentType
