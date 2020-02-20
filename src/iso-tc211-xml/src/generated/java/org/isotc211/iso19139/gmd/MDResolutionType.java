/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

import org.isotc211.iso19139.gco.DistancePropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Resolution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDResolutionType#getEquivalentScale <em>Equivalent Scale</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDResolutionType#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDResolutionType()
 * @model extendedMetaData="name='MD_Resolution_Type' kind='elementOnly'"
 * @generated
 */
public interface MDResolutionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Equivalent Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Scale</em>' containment reference.
	 * @see #setEquivalentScale(MDRepresentativeFractionPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDResolutionType_EquivalentScale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='equivalentScale' namespace='##targetNamespace'"
	 * @generated
	 */
	MDRepresentativeFractionPropertyType getEquivalentScale();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDResolutionType#getEquivalentScale <em>Equivalent Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equivalent Scale</em>' containment reference.
	 * @see #getEquivalentScale()
	 * @generated
	 */
	void setEquivalentScale(MDRepresentativeFractionPropertyType value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(DistancePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDResolutionType_Distance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distance' namespace='##targetNamespace'"
	 * @generated
	 */
	DistancePropertyType getDistance();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDResolutionType#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(DistancePropertyType value);

} // MDResolutionType
