/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.SurfaceType#getPatchesGroup <em>Patches Group</em>}</li>
 *   <li>{@link net.opengis.gml32.SurfaceType#getPatches <em>Patches</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getSurfaceType()
 * @model extendedMetaData="name='SurfaceType' kind='elementOnly'"
 * @generated
 */
public interface SurfaceType extends AbstractSurfaceType {
	/**
	 * Returns the value of the '<em><b>Patches Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patches property element contains the sequence of surface patches. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patches Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getSurfaceType_PatchesGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='patches:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPatchesGroup();

	/**
	 * Returns the value of the '<em><b>Patches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patches property element contains the sequence of surface patches. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patches</em>' containment reference.
	 * @see #setPatches(SurfacePatchArrayPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getSurfaceType_Patches()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='patches' namespace='##targetNamespace' group='patches:group'"
	 * @generated
	 */
	SurfacePatchArrayPropertyType getPatches();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.SurfaceType#getPatches <em>Patches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patches</em>' containment reference.
	 * @see #getPatches()
	 * @generated
	 */
	void setPatches(SurfacePatchArrayPropertyType value);

} // SurfaceType
