/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * gml:SurfaceArrayPropertyType is a container for an array of surfaces. The elements are always contained in the array property, referencing geometry elements or arrays of geometry elements via XLinks is not supported.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.SurfaceArrayPropertyType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml32.SurfaceArrayPropertyType#getAbstractSurfaceGroup <em>Abstract Surface Group</em>}</li>
 *   <li>{@link net.opengis.gml32.SurfaceArrayPropertyType#getAbstractSurface <em>Abstract Surface</em>}</li>
 *   <li>{@link net.opengis.gml32.SurfaceArrayPropertyType#isOwns <em>Owns</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getSurfaceArrayPropertyType()
 * @model extendedMetaData="name='SurfaceArrayPropertyType' kind='elementOnly'"
 * @generated
 */
public interface SurfaceArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getSurfaceArrayPropertyType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AbstractSurface element is the abstract head of the substitution group for all (continuous) surface elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Surface Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getSurfaceArrayPropertyType_AbstractSurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='AbstractSurface:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Surface</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.AbstractSurfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AbstractSurface element is the abstract head of the substitution group for all (continuous) surface elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Surface</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getSurfaceArrayPropertyType_AbstractSurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSurface' namespace='##targetNamespace' group='AbstractSurface:group'"
	 * @generated
	 */
	EList<AbstractSurfaceType> getAbstractSurface();

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #setOwns(boolean)
	 * @see net.opengis.gml32.GMLPackage#getSurfaceArrayPropertyType_Owns()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='owns'"
	 * @generated
	 */
	boolean isOwns();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.SurfaceArrayPropertyType#isOwns <em>Owns</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml32.SurfaceArrayPropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	void unsetOwns();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.SurfaceArrayPropertyType#isOwns <em>Owns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owns</em>' attribute is set.
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	boolean isSetOwns();

} // SurfaceArrayPropertyType
