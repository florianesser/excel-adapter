/**
 */
package net.opengis.gml32;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.GridFunctionType#getSequenceRule <em>Sequence Rule</em>}</li>
 *   <li>{@link net.opengis.gml32.GridFunctionType#getStartPoint <em>Start Point</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getGridFunctionType()
 * @model extendedMetaData="name='GridFunctionType' kind='elementOnly'"
 * @generated
 */
public interface GridFunctionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Rule</em>' containment reference.
	 * @see #setSequenceRule(SequenceRuleType)
	 * @see net.opengis.gml32.GMLPackage#getGridFunctionType_SequenceRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequenceRule' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceRuleType getSequenceRule();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GridFunctionType#getSequenceRule <em>Sequence Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Rule</em>' containment reference.
	 * @see #getSequenceRule()
	 * @generated
	 */
	void setSequenceRule(SequenceRuleType value);

	/**
	 * Returns the value of the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Point</em>' attribute.
	 * @see #setStartPoint(List)
	 * @see net.opengis.gml32.GMLPackage#getGridFunctionType_StartPoint()
	 * @model dataType="net.opengis.gml32.IntegerList" many="false"
	 *        extendedMetaData="kind='element' name='startPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	List<BigInteger> getStartPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.GridFunctionType#getStartPoint <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Point</em>' attribute.
	 * @see #getStartPoint()
	 * @generated
	 */
	void setStartPoint(List<BigInteger> value);

} // GridFunctionType
