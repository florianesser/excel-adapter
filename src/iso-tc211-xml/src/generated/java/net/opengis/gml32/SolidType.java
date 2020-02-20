/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.SolidType#getExterior <em>Exterior</em>}</li>
 *   <li>{@link net.opengis.gml32.SolidType#getInterior <em>Interior</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getSolidType()
 * @model extendedMetaData="name='SolidType' kind='elementOnly'"
 * @generated
 */
public interface SolidType extends AbstractSolidType {
	/**
	 * Returns the value of the '<em><b>Exterior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exterior</em>' containment reference.
	 * @see #setExterior(ShellPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getSolidType_Exterior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exterior' namespace='##targetNamespace'"
	 * @generated
	 */
	ShellPropertyType getExterior();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.SolidType#getExterior <em>Exterior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exterior</em>' containment reference.
	 * @see #getExterior()
	 * @generated
	 */
	void setExterior(ShellPropertyType value);

	/**
	 * Returns the value of the '<em><b>Interior</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.ShellPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interior</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getSolidType_Interior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interior' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ShellPropertyType> getInterior();

} // SolidType
