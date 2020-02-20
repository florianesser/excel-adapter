/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Ring Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A property with the content model of gml:AbstractRingPropertyType encapsulates a ring to represent the surface boundary property of a surface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AbstractRingPropertyType#getAbstractRingGroup <em>Abstract Ring Group</em>}</li>
 *   <li>{@link net.opengis.gml32.AbstractRingPropertyType#getAbstractRing <em>Abstract Ring</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAbstractRingPropertyType()
 * @model extendedMetaData="name='AbstractRingPropertyType' kind='elementOnly'"
 * @generated
 */
public interface AbstractRingPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Ring Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An abstraction of a ring to support surface boundaries of different complexity.
	 * The AbstractRing element is the abstract head of the substituition group for all closed boundaries of a surface patch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Ring Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getAbstractRingPropertyType_AbstractRingGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='AbstractRing:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractRingGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An abstraction of a ring to support surface boundaries of different complexity.
	 * The AbstractRing element is the abstract head of the substituition group for all closed boundaries of a surface patch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Ring</em>' containment reference.
	 * @see net.opengis.gml32.GMLPackage#getAbstractRingPropertyType_AbstractRing()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractRing' namespace='##targetNamespace' group='AbstractRing:group'"
	 * @generated
	 */
	AbstractRingType getAbstractRing();

} // AbstractRingPropertyType
