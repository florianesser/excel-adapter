/**
 */
package net.opengis.gml32;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Datum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TemporalDatumType#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTemporalDatumType()
 * @model extendedMetaData="name='TemporalDatumType' kind='elementOnly'"
 * @generated
 */
public interface TemporalDatumType extends TemporalDatumBaseType {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:origin is the date and time origin of this temporal datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(XMLGregorianCalendar)
	 * @see net.opengis.gml32.GMLPackage#getTemporalDatumType_Origin()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getOrigin();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TemporalDatumType#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(XMLGregorianCalendar value);

} // TemporalDatumType
