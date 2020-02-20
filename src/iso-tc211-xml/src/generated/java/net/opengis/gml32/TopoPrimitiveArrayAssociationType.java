/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Primitive Array Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TopoPrimitiveArrayAssociationType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml32.TopoPrimitiveArrayAssociationType#getAbstractTopoPrimitiveGroup <em>Abstract Topo Primitive Group</em>}</li>
 *   <li>{@link net.opengis.gml32.TopoPrimitiveArrayAssociationType#getAbstractTopoPrimitive <em>Abstract Topo Primitive</em>}</li>
 *   <li>{@link net.opengis.gml32.TopoPrimitiveArrayAssociationType#isOwns <em>Owns</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTopoPrimitiveArrayAssociationType()
 * @model extendedMetaData="name='TopoPrimitiveArrayAssociationType' kind='elementOnly'"
 * @generated
 */
public interface TopoPrimitiveArrayAssociationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getTopoPrimitiveArrayAssociationType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Topo Primitive Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractTopoPrimitive acts as the base type for all topological primitives. Topology primitives are the atomic (smallest possible) units of a topology complex. 
	 * Each topology primitive may contain references to other topology primitives of codimension 2 or more (gml:isolated). Conversely, nodes may have faces as containers and nodes and edges may have solids as containers (gml:container).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Topo Primitive Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getTopoPrimitiveArrayAssociationType_AbstractTopoPrimitiveGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='AbstractTopoPrimitive:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractTopoPrimitiveGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Topo Primitive</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.AbstractTopoPrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractTopoPrimitive acts as the base type for all topological primitives. Topology primitives are the atomic (smallest possible) units of a topology complex. 
	 * Each topology primitive may contain references to other topology primitives of codimension 2 or more (gml:isolated). Conversely, nodes may have faces as containers and nodes and edges may have solids as containers (gml:container).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Topo Primitive</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getTopoPrimitiveArrayAssociationType_AbstractTopoPrimitive()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTopoPrimitive' namespace='##targetNamespace' group='AbstractTopoPrimitive:group'"
	 * @generated
	 */
	EList<AbstractTopoPrimitiveType> getAbstractTopoPrimitive();

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #setOwns(boolean)
	 * @see net.opengis.gml32.GMLPackage#getTopoPrimitiveArrayAssociationType_Owns()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='owns'"
	 * @generated
	 */
	boolean isOwns();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TopoPrimitiveArrayAssociationType#isOwns <em>Owns</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml32.TopoPrimitiveArrayAssociationType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	void unsetOwns();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.TopoPrimitiveArrayAssociationType#isOwns <em>Owns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owns</em>' attribute is set.
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	boolean isSetOwns();

} // TopoPrimitiveArrayAssociationType
