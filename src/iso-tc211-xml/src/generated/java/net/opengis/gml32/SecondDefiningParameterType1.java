/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Second Defining Parameter Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.SecondDefiningParameterType1#getSecondDefiningParameter <em>Second Defining Parameter</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getSecondDefiningParameterType1()
 * @model extendedMetaData="name='secondDefiningParameter_._type' kind='elementOnly'"
 * @generated
 */
public interface SecondDefiningParameterType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Second Defining Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Defining Parameter</em>' containment reference.
	 * @see #setSecondDefiningParameter(SecondDefiningParameterType)
	 * @see net.opengis.gml32.GMLPackage#getSecondDefiningParameterType1_SecondDefiningParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SecondDefiningParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondDefiningParameterType getSecondDefiningParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.SecondDefiningParameterType1#getSecondDefiningParameter <em>Second Defining Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Defining Parameter</em>' containment reference.
	 * @see #getSecondDefiningParameter()
	 * @generated
	 */
	void setSecondDefiningParameter(SecondDefiningParameterType value);

} // SecondDefiningParameterType1
