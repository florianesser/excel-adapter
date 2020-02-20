/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TransformationType#getMethodGroup <em>Method Group</em>}</li>
 *   <li>{@link net.opengis.gml32.TransformationType#getMethod <em>Method</em>}</li>
 *   <li>{@link net.opengis.gml32.TransformationType#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTransformationType()
 * @model extendedMetaData="name='TransformationType' kind='elementOnly'"
 * @generated
 */
public interface TransformationType extends AbstractGeneralTransformationType {
	/**
	 * Returns the value of the '<em><b>Method Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:method is an association role to the operation method used by a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getTransformationType_MethodGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='method:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMethodGroup();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:method is an association role to the operation method used by a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(OperationMethodPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getTransformationType_Method()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace' group='method:group'"
	 * @generated
	 */
	OperationMethodPropertyType getMethod();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TransformationType#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(OperationMethodPropertyType value);

	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.AbstractGeneralParameterValuePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:parameterValue is a composition association to a parameter value or group of parameter values used by a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getTransformationType_ParameterValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AbstractGeneralParameterValuePropertyType> getParameterValue();

} // TransformationType
