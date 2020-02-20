/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211.iso19139.gco.BooleanPropertyType;
import org.isotc211.iso19139.gco.CharacterStringPropertyType;
import org.isotc211.iso19139.gco.RecordPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Georeferenceable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeoreferenceableType#getControlPointAvailability <em>Control Point Availability</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeoreferenceableType#getOrientationParameterAvailability <em>Orientation Parameter Availability</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeoreferenceableType#getOrientationParameterDescription <em>Orientation Parameter Description</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeoreferenceableType#getGeoreferencedParameters <em>Georeferenced Parameters</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDGeoreferenceableType#getParameterCitation <em>Parameter Citation</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeoreferenceableType()
 * @model extendedMetaData="name='MD_Georeferenceable_Type' kind='elementOnly'"
 * @generated
 */
public interface MDGeoreferenceableType extends MDGridSpatialRepresentationType {
	/**
	 * Returns the value of the '<em><b>Control Point Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Point Availability</em>' containment reference.
	 * @see #setControlPointAvailability(BooleanPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeoreferenceableType_ControlPointAvailability()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlPointAvailability' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getControlPointAvailability();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDGeoreferenceableType#getControlPointAvailability <em>Control Point Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Point Availability</em>' containment reference.
	 * @see #getControlPointAvailability()
	 * @generated
	 */
	void setControlPointAvailability(BooleanPropertyType value);

	/**
	 * Returns the value of the '<em><b>Orientation Parameter Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Parameter Availability</em>' containment reference.
	 * @see #setOrientationParameterAvailability(BooleanPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeoreferenceableType_OrientationParameterAvailability()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='orientationParameterAvailability' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getOrientationParameterAvailability();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDGeoreferenceableType#getOrientationParameterAvailability <em>Orientation Parameter Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Parameter Availability</em>' containment reference.
	 * @see #getOrientationParameterAvailability()
	 * @generated
	 */
	void setOrientationParameterAvailability(BooleanPropertyType value);

	/**
	 * Returns the value of the '<em><b>Orientation Parameter Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Parameter Description</em>' containment reference.
	 * @see #setOrientationParameterDescription(CharacterStringPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeoreferenceableType_OrientationParameterDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientationParameterDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getOrientationParameterDescription();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDGeoreferenceableType#getOrientationParameterDescription <em>Orientation Parameter Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Parameter Description</em>' containment reference.
	 * @see #getOrientationParameterDescription()
	 * @generated
	 */
	void setOrientationParameterDescription(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Georeferenced Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Georeferenced Parameters</em>' containment reference.
	 * @see #setGeoreferencedParameters(RecordPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeoreferenceableType_GeoreferencedParameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='georeferencedParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	RecordPropertyType getGeoreferencedParameters();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDGeoreferenceableType#getGeoreferencedParameters <em>Georeferenced Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Georeferenced Parameters</em>' containment reference.
	 * @see #getGeoreferencedParameters()
	 * @generated
	 */
	void setGeoreferencedParameters(RecordPropertyType value);

	/**
	 * Returns the value of the '<em><b>Parameter Citation</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211.iso19139.gmd.CICitationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Citation</em>' containment reference list.
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDGeoreferenceableType_ParameterCitation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterCitation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CICitationPropertyType> getParameterCitation();

} // MDGeoreferenceableType
