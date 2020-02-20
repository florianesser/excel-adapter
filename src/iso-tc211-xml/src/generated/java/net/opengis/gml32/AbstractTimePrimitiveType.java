/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Time Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AbstractTimePrimitiveType#getRelatedTime <em>Related Time</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAbstractTimePrimitiveType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractTimePrimitiveType' kind='elementOnly'"
 * @generated
 */
public interface AbstractTimePrimitiveType extends AbstractTimeObjectType {
	/**
	 * Returns the value of the '<em><b>Related Time</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.RelatedTimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Time</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getAbstractTimePrimitiveType_RelatedTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedTimeType> getRelatedTime();

} // AbstractTimePrimitiveType
