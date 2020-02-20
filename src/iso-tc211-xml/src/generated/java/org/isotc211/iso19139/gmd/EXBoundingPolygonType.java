/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gss.GMObjectPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EX Bounding Polygon Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Boundary enclosing the dataset expressed as the closed set of (x,y) coordinates of the polygon (last point replicates first point)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.EXBoundingPolygonType#getPolygon <em>Polygon</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getEXBoundingPolygonType()
 * @model extendedMetaData="name='EX_BoundingPolygon_Type' kind='elementOnly'"
 * @generated
 */
public interface EXBoundingPolygonType extends AbstractEXGeographicExtentType {
	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gss.GMObjectPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getEXBoundingPolygonType_Polygon()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='polygon' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GMObjectPropertyType> getPolygon();

} // EXBoundingPolygonType
