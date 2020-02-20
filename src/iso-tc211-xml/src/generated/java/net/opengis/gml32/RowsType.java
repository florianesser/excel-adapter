/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rows Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.RowsType#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getRowsType()
 * @model extendedMetaData="name='rows_._type' kind='elementOnly'"
 * @generated
 */
public interface RowsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.RowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getRowsType_Row()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Row' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RowType> getRow();

} // RowsType
