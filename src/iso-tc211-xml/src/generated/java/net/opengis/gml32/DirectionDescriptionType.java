/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * direction descriptions are specified by a compass point code, a keyword, a textual description or a reference to a description.
 * A gml:compassPoint is specified by a simple enumeration.  	
 * In addition, thre elements to contain text-based descriptions of direction are provided.  
 * If the direction is specified using a term from a list, gml:keyword should be used, and the list indicated using the value of the codeSpace attribute. 
 * if the direction is decribed in prose, gml:direction or gml:reference should be used, allowing the value to be included inline or by reference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DirectionDescriptionType#getCompassPoint <em>Compass Point</em>}</li>
 *   <li>{@link net.opengis.gml32.DirectionDescriptionType#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link net.opengis.gml32.DirectionDescriptionType#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.gml32.DirectionDescriptionType#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDirectionDescriptionType()
 * @model extendedMetaData="name='DirectionDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface DirectionDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Compass Point</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml32.CompassPointEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compass Point</em>' attribute.
	 * @see net.opengis.gml32.CompassPointEnumeration
	 * @see #isSetCompassPoint()
	 * @see #unsetCompassPoint()
	 * @see #setCompassPoint(CompassPointEnumeration)
	 * @see net.opengis.gml32.GMLPackage#getDirectionDescriptionType_CompassPoint()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='compassPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	CompassPointEnumeration getCompassPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DirectionDescriptionType#getCompassPoint <em>Compass Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compass Point</em>' attribute.
	 * @see net.opengis.gml32.CompassPointEnumeration
	 * @see #isSetCompassPoint()
	 * @see #unsetCompassPoint()
	 * @see #getCompassPoint()
	 * @generated
	 */
	void setCompassPoint(CompassPointEnumeration value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.DirectionDescriptionType#getCompassPoint <em>Compass Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompassPoint()
	 * @see #getCompassPoint()
	 * @see #setCompassPoint(CompassPointEnumeration)
	 * @generated
	 */
	void unsetCompassPoint();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.DirectionDescriptionType#getCompassPoint <em>Compass Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compass Point</em>' attribute is set.
	 * @see #unsetCompassPoint()
	 * @see #getCompassPoint()
	 * @see #setCompassPoint(CompassPointEnumeration)
	 * @generated
	 */
	boolean isSetCompassPoint();

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference.
	 * @see #setKeyword(CodeType)
	 * @see net.opengis.gml32.GMLPackage#getDirectionDescriptionType_Keyword()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='keyword' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getKeyword();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DirectionDescriptionType#getKeyword <em>Keyword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' containment reference.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(CodeType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see net.opengis.gml32.GMLPackage#getDirectionDescriptionType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DirectionDescriptionType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceType)
	 * @see net.opengis.gml32.GMLPackage#getDirectionDescriptionType_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DirectionDescriptionType#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceType value);

} // DirectionDescriptionType
