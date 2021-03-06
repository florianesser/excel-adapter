/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tin Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TinType#getStopLines <em>Stop Lines</em>}</li>
 *   <li>{@link net.opengis.gml32.TinType#getBreakLines <em>Break Lines</em>}</li>
 *   <li>{@link net.opengis.gml32.TinType#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link net.opengis.gml32.TinType#getControlPoint <em>Control Point</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTinType()
 * @model extendedMetaData="name='TinType' kind='elementOnly'"
 * @generated
 */
public interface TinType extends SurfaceType
{
	/**
	 * Returns the value of the '<em><b>Stop Lines</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.LineStringSegmentArrayPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Lines</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getTinType_StopLines()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stopLines' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LineStringSegmentArrayPropertyType> getStopLines();

	/**
	 * Returns the value of the '<em><b>Break Lines</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.LineStringSegmentArrayPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Lines</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getTinType_BreakLines()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='breakLines' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LineStringSegmentArrayPropertyType> getBreakLines();

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' containment reference.
	 * @see #setMaxLength(LengthType)
	 * @see net.opengis.gml32.GMLPackage#getTinType_MaxLength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='maxLength' namespace='##targetNamespace'"
	 * @generated
	 */
	LengthType getMaxLength();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TinType#getMaxLength <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' containment reference.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(LengthType value);

	/**
	 * Returns the value of the '<em><b>Control Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Point</em>' containment reference.
	 * @see #setControlPoint(ControlPointType)
	 * @see net.opengis.gml32.GMLPackage#getTinType_ControlPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlPointType getControlPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TinType#getControlPoint <em>Control Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Point</em>' containment reference.
	 * @see #getControlPoint()
	 * @generated
	 */
	void setControlPoint(ControlPointType value);

} // TinType
