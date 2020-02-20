/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Vector Spatial Representation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about the vector spatial objects in the dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDVectorSpatialRepresentationType#getTopologyLevel <em>Topology Level</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDVectorSpatialRepresentationType#getGeometricObjects <em>Geometric Objects</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDVectorSpatialRepresentationType()
 * @model extendedMetaData="name='MD_VectorSpatialRepresentation_Type' kind='elementOnly'"
 * @generated
 */
public interface MDVectorSpatialRepresentationType extends AbstractMDSpatialRepresentationType {
	/**
	 * Returns the value of the '<em><b>Topology Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Level</em>' containment reference.
	 * @see #setTopologyLevel(MDTopologyLevelCodePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDVectorSpatialRepresentationType_TopologyLevel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topologyLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	MDTopologyLevelCodePropertyType getTopologyLevel();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDVectorSpatialRepresentationType#getTopologyLevel <em>Topology Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Level</em>' containment reference.
	 * @see #getTopologyLevel()
	 * @generated
	 */
	void setTopologyLevel(MDTopologyLevelCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Geometric Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.MDGeometricObjectsPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometric Objects</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDVectorSpatialRepresentationType_GeometricObjects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geometricObjects' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDGeometricObjectsPropertyType> getGeometricObjects();

} // MDVectorSpatialRepresentationType
