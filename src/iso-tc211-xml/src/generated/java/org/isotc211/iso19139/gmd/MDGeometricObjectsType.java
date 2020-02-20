/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.AbstractObjectType;
import org.isotc211.iso19139.gco.IntegerPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Geometric Objects Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeometricObjectsType#getGeometricObjectType <em>Geometric Object Type</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeometricObjectsType#getGeometricObjectCount <em>Geometric Object Count</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeometricObjectsType()
 * @model extendedMetaData="name='MD_GeometricObjects_Type' kind='elementOnly'"
 * @generated
 */
public interface MDGeometricObjectsType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Geometric Object Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometric Object Type</em>' containment reference.
	 * @see #setGeometricObjectType(MDGeometricObjectTypeCodePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeometricObjectsType_GeometricObjectType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geometricObjectType' namespace='##targetNamespace'"
	 * @generated
	 */
	MDGeometricObjectTypeCodePropertyType getGeometricObjectType();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDGeometricObjectsType#getGeometricObjectType <em>Geometric Object Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometric Object Type</em>' containment reference.
	 * @see #getGeometricObjectType()
	 * @generated
	 */
	void setGeometricObjectType(MDGeometricObjectTypeCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Geometric Object Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometric Object Count</em>' containment reference.
	 * @see #setGeometricObjectCount(IntegerPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeometricObjectsType_GeometricObjectCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geometricObjectCount' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerPropertyType getGeometricObjectCount();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDGeometricObjectsType#getGeometricObjectCount <em>Geometric Object Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometric Object Count</em>' containment reference.
	 * @see #getGeometricObjectCount()
	 * @generated
	 */
	void setGeometricObjectCount(IntegerPropertyType value);

} // MDGeometricObjectsType
