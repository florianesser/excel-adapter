/**
 */
package net.opengis.gml32;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Gridded Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AbstractGriddedSurfaceType#getRows <em>Rows</em>}</li>
 *   <li>{@link net.opengis.gml32.AbstractGriddedSurfaceType#getColumns <em>Columns</em>}</li>
 *   <li>{@link net.opengis.gml32.AbstractGriddedSurfaceType#getRows1 <em>Rows1</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAbstractGriddedSurfaceType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractGriddedSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface AbstractGriddedSurfaceType extends AbstractParametricCurveSurfaceType {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference.
	 * @see #setRows(RowsType)
	 * @see net.opengis.gml32.GMLPackage#getAbstractGriddedSurfaceType_Rows()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rows' namespace='##targetNamespace'"
	 * @generated
	 */
	RowsType getRows();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractGriddedSurfaceType#getRows <em>Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' containment reference.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(RowsType value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getAbstractGriddedSurfaceType_Columns()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='columns'"
	 * @generated
	 */
	BigInteger getColumns();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractGriddedSurfaceType#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Rows1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows1</em>' attribute.
	 * @see #setRows1(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getAbstractGriddedSurfaceType_Rows1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='rows'"
	 * @generated
	 */
	BigInteger getRows1();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AbstractGriddedSurfaceType#getRows1 <em>Rows1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows1</em>' attribute.
	 * @see #getRows1()
	 * @generated
	 */
	void setRows1(BigInteger value);

} // AbstractGriddedSurfaceType
