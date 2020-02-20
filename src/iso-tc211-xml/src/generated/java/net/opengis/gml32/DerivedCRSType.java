/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DerivedCRSType#getBaseCRS <em>Base CRS</em>}</li>
 *   <li>{@link net.opengis.gml32.DerivedCRSType#getDerivedCRSType <em>Derived CRS Type</em>}</li>
 *   <li>{@link net.opengis.gml32.DerivedCRSType#getCoordinateSystemGroup <em>Coordinate System Group</em>}</li>
 *   <li>{@link net.opengis.gml32.DerivedCRSType#getCoordinateSystem <em>Coordinate System</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDerivedCRSType()
 * @model extendedMetaData="name='DerivedCRSType' kind='elementOnly'"
 * @generated
 */
public interface DerivedCRSType extends AbstractGeneralDerivedCRSType {
	/**
	 * Returns the value of the '<em><b>Base CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:baseCRS is an association role to the coordinate reference system used by this derived CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base CRS</em>' containment reference.
	 * @see #setBaseCRS(SingleCRSPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getDerivedCRSType_BaseCRS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='baseCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleCRSPropertyType getBaseCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DerivedCRSType#getBaseCRS <em>Base CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base CRS</em>' containment reference.
	 * @see #getBaseCRS()
	 * @generated
	 */
	void setBaseCRS(SingleCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Derived CRS Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:derivedCRSType property describes the type of a derived coordinate reference system. The required codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived CRS Type</em>' containment reference.
	 * @see #setDerivedCRSType(CodeWithAuthorityType)
	 * @see net.opengis.gml32.GMLPackage#getDerivedCRSType_DerivedCRSType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='derivedCRSType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeWithAuthorityType getDerivedCRSType();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DerivedCRSType#getDerivedCRSType <em>Derived CRS Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived CRS Type</em>' containment reference.
	 * @see #getDerivedCRSType()
	 * @generated
	 */
	void setDerivedCRSType(CodeWithAuthorityType value);

	/**
	 * Returns the value of the '<em><b>Coordinate System Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An association role to the coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate System Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getDerivedCRSType_CoordinateSystemGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='coordinateSystem:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCoordinateSystemGroup();

	/**
	 * Returns the value of the '<em><b>Coordinate System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An association role to the coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate System</em>' containment reference.
	 * @see #setCoordinateSystem(CoordinateSystemPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getDerivedCRSType_CoordinateSystem()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordinateSystem' namespace='##targetNamespace' group='coordinateSystem:group'"
	 * @generated
	 */
	CoordinateSystemPropertyType getCoordinateSystem();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DerivedCRSType#getCoordinateSystem <em>Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System</em>' containment reference.
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	void setCoordinateSystem(CoordinateSystemPropertyType value);

} // DerivedCRSType
