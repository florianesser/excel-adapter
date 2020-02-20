/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle Choice Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AngleChoiceType#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.opengis.gml32.AngleChoiceType#getDmsAngle <em>Dms Angle</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAngleChoiceType()
 * @model extendedMetaData="name='AngleChoiceType' kind='elementOnly'"
 * @generated
 */
public interface AngleChoiceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:angle property element is used to record the value of an angle quantity as a single number, with its units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(AngleType)
	 * @see net.opengis.gml32.GMLPackage#getAngleChoiceType_Angle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angle' namespace='##targetNamespace'"
	 * @generated
	 */
	AngleType getAngle();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AngleChoiceType#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(AngleType value);

	/**
	 * Returns the value of the '<em><b>Dms Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dms Angle</em>' containment reference.
	 * @see #setDmsAngle(DMSAngleType)
	 * @see net.opengis.gml32.GMLPackage#getAngleChoiceType_DmsAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dmsAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DMSAngleType getDmsAngle();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AngleChoiceType#getDmsAngle <em>Dms Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dms Angle</em>' containment reference.
	 * @see #getDmsAngle()
	 * @generated
	 */
	void setDmsAngle(DMSAngleType value);

} // AngleChoiceType
