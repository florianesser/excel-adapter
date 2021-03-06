/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Segment Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * gml:CurveSegmentArrayPropertyType is a container for an array of curve segments.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.CurveSegmentArrayPropertyType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml32.CurveSegmentArrayPropertyType#getAbstractCurveSegmentGroup <em>Abstract Curve Segment Group</em>}</li>
 *   <li>{@link net.opengis.gml32.CurveSegmentArrayPropertyType#getAbstractCurveSegment <em>Abstract Curve Segment</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getCurveSegmentArrayPropertyType()
 * @model extendedMetaData="name='CurveSegmentArrayPropertyType' kind='elementOnly'"
 * @generated
 */
public interface CurveSegmentArrayPropertyType extends EObject
{
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getCurveSegmentArrayPropertyType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Curve Segment Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A curve segment defines a homogeneous segment of a curve.
	 * The attributes numDerivativesAtStart, numDerivativesAtEnd and numDerivativesInterior specify the type of continuity as specified in ISO 19107:2003, 6.4.9.3.
	 * The AbstractCurveSegment element is the abstract head of the substituition group for all curve segment elements, i.e. continuous segments of the same interpolation mechanism.
	 * All curve segments shall have an attribute interpolation with type gml:CurveInterpolationType specifying the curve interpolation mechanism used for this segment. This mechanism uses the control points and control parameters to determine the position of this curve segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Curve Segment Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getCurveSegmentArrayPropertyType_AbstractCurveSegmentGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='AbstractCurveSegment:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractCurveSegmentGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Curve Segment</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.AbstractCurveSegmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A curve segment defines a homogeneous segment of a curve.
	 * The attributes numDerivativesAtStart, numDerivativesAtEnd and numDerivativesInterior specify the type of continuity as specified in ISO 19107:2003, 6.4.9.3.
	 * The AbstractCurveSegment element is the abstract head of the substituition group for all curve segment elements, i.e. continuous segments of the same interpolation mechanism.
	 * All curve segments shall have an attribute interpolation with type gml:CurveInterpolationType specifying the curve interpolation mechanism used for this segment. This mechanism uses the control points and control parameters to determine the position of this curve segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Curve Segment</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getCurveSegmentArrayPropertyType_AbstractCurveSegment()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractCurveSegment' namespace='##targetNamespace' group='AbstractCurveSegment:group'"
	 * @generated
	 */
	EList<AbstractCurveSegmentType> getAbstractCurveSegment();

} // CurveSegmentArrayPropertyType
