/**
 */
package net.opengis.gml32;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Parameter Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.OperationParameterGroupType#getMaximumOccurs <em>Maximum Occurs</em>}</li>
 *   <li>{@link net.opengis.gml32.OperationParameterGroupType#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getOperationParameterGroupType()
 * @model extendedMetaData="name='OperationParameterGroupType' kind='elementOnly'"
 * @generated
 */
public interface OperationParameterGroupType extends AbstractGeneralOperationParameterType {
	/**
	 * Returns the value of the '<em><b>Maximum Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:maximumOccurs is the maximum number of times that values for this parameter group may be included. If this attribute is omitted, the maximum number shall be one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Occurs</em>' attribute.
	 * @see #setMaximumOccurs(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getOperationParameterGroupType_MaximumOccurs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='maximumOccurs' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaximumOccurs();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.OperationParameterGroupType#getMaximumOccurs <em>Maximum Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Occurs</em>' attribute.
	 * @see #getMaximumOccurs()
	 * @generated
	 */
	void setMaximumOccurs(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.AbstractGeneralOperationParameterPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:parameter is an association to an operation parameter or parameter group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getOperationParameterGroupType_Parameter()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AbstractGeneralOperationParameterPropertyType> getParameter();

} // OperationParameterGroupType
