/**
 */
package net.opengis.gml32;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc By Center Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.ArcByCenterPointType#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml32.ArcByCenterPointType#getPointProperty <em>Point Property</em>}</li>
 *   <li>{@link net.opengis.gml32.ArcByCenterPointType#getPointRep <em>Point Rep</em>}</li>
 *   <li>{@link net.opengis.gml32.ArcByCenterPointType#getPosList <em>Pos List</em>}</li>
 *   <li>{@link net.opengis.gml32.ArcByCenterPointType#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.gml32.ArcByCenterPointType#getRadius <em>Radius</em>}</li>
 *   <li>{@link net.opengis.gml32.ArcByCenterPointType#getStartAngle <em>Start Angle</em>}</li>
 *   <li>{@link net.opengis.gml32.ArcByCenterPointType#getEndAngle <em>End Angle</em>}</li>
 *   <li>{@link net.opengis.gml32.ArcByCenterPointType#getInterpolation <em>Interpolation</em>}</li>
 *   <li>{@link net.opengis.gml32.ArcByCenterPointType#getNumArc <em>Num Arc</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getArcByCenterPointType()
 * @model extendedMetaData="name='ArcByCenterPointType' kind='elementOnly'"
 * @generated
 */
public interface ArcByCenterPointType extends AbstractCurveSegmentType
{
	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference.
	 * @see #setPos(DirectPositionType)
	 * @see net.opengis.gml32.GMLPackage#getArcByCenterPointType_Pos()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pos' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionType getPos();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getPos <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' containment reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(DirectPositionType value);

	/**
	 * Returns the value of the '<em><b>Point Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a point via the XLink-attributes or contains the point element. pointProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for Point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Property</em>' containment reference.
	 * @see #setPointProperty(PointPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getArcByCenterPointType_PointProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPropertyType getPointProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getPointProperty <em>Point Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Property</em>' containment reference.
	 * @see #getPointProperty()
	 * @generated
	 */
	void setPointProperty(PointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Point Rep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Rep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Rep</em>' containment reference.
	 * @see #setPointRep(PointPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getArcByCenterPointType_PointRep()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointRep' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPropertyType getPointRep();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getPointRep <em>Point Rep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Rep</em>' containment reference.
	 * @see #getPointRep()
	 * @generated
	 */
	void setPointRep(PointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Pos List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos List</em>' containment reference.
	 * @see #setPosList(DirectPositionListType)
	 * @see net.opengis.gml32.GMLPackage#getArcByCenterPointType_PosList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='posList' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionListType getPosList();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getPosList <em>Pos List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos List</em>' containment reference.
	 * @see #getPosList()
	 * @generated
	 */
	void setPosList(DirectPositionListType value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(CoordinatesType)
	 * @see net.opengis.gml32.GMLPackage#getArcByCenterPointType_Coordinates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinatesType getCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(CoordinatesType value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' containment reference.
	 * @see #setRadius(LengthType)
	 * @see net.opengis.gml32.GMLPackage#getArcByCenterPointType_Radius()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='radius' namespace='##targetNamespace'"
	 * @generated
	 */
	LengthType getRadius();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getRadius <em>Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' containment reference.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(LengthType value);

	/**
	 * Returns the value of the '<em><b>Start Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Angle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Angle</em>' containment reference.
	 * @see #setStartAngle(AngleType)
	 * @see net.opengis.gml32.GMLPackage#getArcByCenterPointType_StartAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	AngleType getStartAngle();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getStartAngle <em>Start Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Angle</em>' containment reference.
	 * @see #getStartAngle()
	 * @generated
	 */
	void setStartAngle(AngleType value);

	/**
	 * Returns the value of the '<em><b>End Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Angle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Angle</em>' containment reference.
	 * @see #setEndAngle(AngleType)
	 * @see net.opengis.gml32.GMLPackage#getArcByCenterPointType_EndAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	AngleType getEndAngle();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getEndAngle <em>End Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Angle</em>' containment reference.
	 * @see #getEndAngle()
	 * @generated
	 */
	void setEndAngle(AngleType value);

	/**
	 * Returns the value of the '<em><b>Interpolation</b></em>' attribute.
	 * The default value is <code>"circularArcCenterPointWithRadius"</code>.
	 * The literals are from the enumeration {@link net.opengis.gml32.CurveInterpolationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpolation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpolation</em>' attribute.
	 * @see net.opengis.gml32.CurveInterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @see net.opengis.gml32.GMLPackage#getArcByCenterPointType_Interpolation()
	 * @model default="circularArcCenterPointWithRadius" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='interpolation'"
	 * @generated
	 */
	CurveInterpolationType getInterpolation();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation</em>' attribute.
	 * @see net.opengis.gml32.CurveInterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @generated
	 */
	void setInterpolation(CurveInterpolationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @generated
	 */
	void unsetInterpolation();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getInterpolation <em>Interpolation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interpolation</em>' attribute is set.
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @generated
	 */
	boolean isSetInterpolation();

	/**
	 * Returns the value of the '<em><b>Num Arc</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Arc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Arc</em>' attribute.
	 * @see #isSetNumArc()
	 * @see #unsetNumArc()
	 * @see #setNumArc(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getArcByCenterPointType_NumArc()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='numArc'"
	 * @generated
	 */
	BigInteger getNumArc();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getNumArc <em>Num Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Arc</em>' attribute.
	 * @see #isSetNumArc()
	 * @see #unsetNumArc()
	 * @see #getNumArc()
	 * @generated
	 */
	void setNumArc(BigInteger value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getNumArc <em>Num Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumArc()
	 * @see #getNumArc()
	 * @see #setNumArc(BigInteger)
	 * @generated
	 */
	void unsetNumArc();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.ArcByCenterPointType#getNumArc <em>Num Arc</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Arc</em>' attribute is set.
	 * @see #unsetNumArc()
	 * @see #getNumArc()
	 * @see #setNumArc(BigInteger)
	 * @generated
	 */
	boolean isSetNumArc();

} // ArcByCenterPointType
