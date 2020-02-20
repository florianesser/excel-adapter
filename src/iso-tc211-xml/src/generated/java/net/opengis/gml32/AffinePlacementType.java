/**
 */
package net.opengis.gml32;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affine Placement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AffinePlacementType#getLocation <em>Location</em>}</li>
 *   <li>{@link net.opengis.gml32.AffinePlacementType#getRefDirection <em>Ref Direction</em>}</li>
 *   <li>{@link net.opengis.gml32.AffinePlacementType#getInDimension <em>In Dimension</em>}</li>
 *   <li>{@link net.opengis.gml32.AffinePlacementType#getOutDimension <em>Out Dimension</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAffinePlacementType()
 * @model extendedMetaData="name='AffinePlacementType' kind='elementOnly'"
 * @generated
 */
public interface AffinePlacementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(DirectPositionType)
	 * @see net.opengis.gml32.GMLPackage#getAffinePlacementType_Location()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionType getLocation();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AffinePlacementType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(DirectPositionType value);

	/**
	 * Returns the value of the '<em><b>Ref Direction</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.VectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Direction</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getAffinePlacementType_RefDirection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='refDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VectorType> getRefDirection();

	/**
	 * Returns the value of the '<em><b>In Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Dimension</em>' attribute.
	 * @see #setInDimension(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getAffinePlacementType_InDimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='element' name='inDimension' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getInDimension();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AffinePlacementType#getInDimension <em>In Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Dimension</em>' attribute.
	 * @see #getInDimension()
	 * @generated
	 */
	void setInDimension(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Out Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Dimension</em>' attribute.
	 * @see #setOutDimension(BigInteger)
	 * @see net.opengis.gml32.GMLPackage#getAffinePlacementType_OutDimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='element' name='outDimension' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOutDimension();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.AffinePlacementType#getOutDimension <em>Out Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Dimension</em>' attribute.
	 * @see #getOutDimension()
	 * @generated
	 */
	void setOutDimension(BigInteger value);

} // AffinePlacementType
