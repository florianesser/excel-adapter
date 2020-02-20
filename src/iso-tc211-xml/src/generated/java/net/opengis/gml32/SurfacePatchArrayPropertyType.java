/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Patch Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * gml:SurfacePatchArrayPropertyType is a container for a sequence of surface patches.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.SurfacePatchArrayPropertyType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml32.SurfacePatchArrayPropertyType#getAbstractSurfacePatchGroup <em>Abstract Surface Patch Group</em>}</li>
 *   <li>{@link net.opengis.gml32.SurfacePatchArrayPropertyType#getAbstractSurfacePatch <em>Abstract Surface Patch</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getSurfacePatchArrayPropertyType()
 * @model extendedMetaData="name='SurfacePatchArrayPropertyType' kind='elementOnly'"
 * @generated
 */
public interface SurfacePatchArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getSurfacePatchArrayPropertyType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Surface Patch Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A surface patch defines a homogenuous portion of a surface. 
	 * The AbstractSurfacePatch element is the abstract head of the substituition group for all surface patch elements describing a continuous portion of a surface.
	 * All surface patches shall have an attribute interpolation (declared in the types derived from gml:AbstractSurfacePatchType) specifying the interpolation mechanism used for the patch using gml:SurfaceInterpolationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Surface Patch Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getSurfacePatchArrayPropertyType_AbstractSurfacePatchGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='AbstractSurfacePatch:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractSurfacePatchGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Surface Patch</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.AbstractSurfacePatchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A surface patch defines a homogenuous portion of a surface. 
	 * The AbstractSurfacePatch element is the abstract head of the substituition group for all surface patch elements describing a continuous portion of a surface.
	 * All surface patches shall have an attribute interpolation (declared in the types derived from gml:AbstractSurfacePatchType) specifying the interpolation mechanism used for the patch using gml:SurfaceInterpolationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Surface Patch</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getSurfacePatchArrayPropertyType_AbstractSurfacePatch()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSurfacePatch' namespace='##targetNamespace' group='AbstractSurfacePatch:group'"
	 * @generated
	 */
	EList<AbstractSurfacePatchType> getAbstractSurfacePatch();

} // SurfacePatchArrayPropertyType
