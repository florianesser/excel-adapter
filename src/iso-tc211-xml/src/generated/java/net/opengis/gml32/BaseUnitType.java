/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.BaseUnitType#getUnitsSystem <em>Units System</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getBaseUnitType()
 * @model extendedMetaData="name='BaseUnitType' kind='elementOnly'"
 * @generated
 */
public interface BaseUnitType extends UnitDefinitionType {
	/**
	 * Returns the value of the '<em><b>Units System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units System</em>' containment reference.
	 * @see #setUnitsSystem(ReferenceType)
	 * @see net.opengis.gml32.GMLPackage#getBaseUnitType_UnitsSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='unitsSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getUnitsSystem();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.BaseUnitType#getUnitsSystem <em>Units System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units System</em>' containment reference.
	 * @see #getUnitsSystem()
	 * @generated
	 */
	void setUnitsSystem(ReferenceType value);

} // BaseUnitType
