/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.AbstractCRSType#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 *   <li>{@link net.opengis.gml32.AbstractCRSType#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getAbstractCRSType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractCRSType' kind='elementOnly'"
 * @generated
 */
public interface AbstractCRSType extends IdentifiedObjectType {
	/**
	 * Returns the value of the '<em><b>Domain Of Validity</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.DomainOfValidityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:domainOfValidity property implements an association role to an EX_Extent object as encoded in ISO/TS 19139, either referencing or containing the definition of that extent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Of Validity</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getAbstractCRSType_DomainOfValidity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainOfValidity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DomainOfValidityType> getDomainOfValidity();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:scope property provides a description of the usage, or limitations of usage, for which this CRS-related object is valid. If unknown, enter "not known".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getAbstractCRSType_Scope()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getScope();

} // AbstractCRSType
