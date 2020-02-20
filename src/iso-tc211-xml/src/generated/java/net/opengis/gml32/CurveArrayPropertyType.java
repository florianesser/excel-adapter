/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for an array of curves. The elements are always contained in the array property, referencing geometry elements or arrays of geometry elements via XLinks is not supported.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.CurveArrayPropertyType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml32.CurveArrayPropertyType#getAbstractCurveGroup <em>Abstract Curve Group</em>}</li>
 *   <li>{@link net.opengis.gml32.CurveArrayPropertyType#getAbstractCurve <em>Abstract Curve</em>}</li>
 *   <li>{@link net.opengis.gml32.CurveArrayPropertyType#isOwns <em>Owns</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getCurveArrayPropertyType()
 * @model extendedMetaData="name='CurveArrayPropertyType' kind='elementOnly'"
 * @generated
 */
public interface CurveArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getCurveArrayPropertyType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Curve Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AbstractCurve element is the abstract head of the substitution group for all (continuous) curve elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Curve Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getCurveArrayPropertyType_AbstractCurveGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='AbstractCurve:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractCurveGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Curve</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.AbstractCurveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AbstractCurve element is the abstract head of the substitution group for all (continuous) curve elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Curve</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getCurveArrayPropertyType_AbstractCurve()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractCurve' namespace='##targetNamespace' group='AbstractCurve:group'"
	 * @generated
	 */
	EList<AbstractCurveType> getAbstractCurve();

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #setOwns(boolean)
	 * @see net.opengis.gml32.GMLPackage#getCurveArrayPropertyType_Owns()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='owns'"
	 * @generated
	 */
	boolean isOwns();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.CurveArrayPropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @generated
	 */
	void setOwns(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.CurveArrayPropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	void unsetOwns();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.CurveArrayPropertyType#isOwns <em>Owns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owns</em>' attribute is set.
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	boolean isSetOwns();

} // CurveArrayPropertyType
