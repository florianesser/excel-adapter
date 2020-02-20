/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DiscreteCoverageType#getCoverageFunction <em>Coverage Function</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDiscreteCoverageType()
 * @model extendedMetaData="name='DiscreteCoverageType' kind='elementOnly'"
 * @generated
 */
public interface DiscreteCoverageType extends AbstractCoverageType {
	/**
	 * Returns the value of the '<em><b>Coverage Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:coverageFunction property describes the mapping function from the domain to the range of the coverage.
	 * The value of the CoverageFunction is one of gml:CoverageMappingRule and gml:GridFunction.
	 * If the gml:coverageFunction property is omitted for a gridded coverage (including rectified gridded coverages) the gml:startPoint is assumed to be the value of the gml:low property in the gml:Grid geometry, and the gml:sequenceRule is assumed to be linear and the gml:axisOrder property is assumed to be "+1 +2".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Function</em>' containment reference.
	 * @see #setCoverageFunction(CoverageFunctionType)
	 * @see net.opengis.gml32.GMLPackage#getDiscreteCoverageType_CoverageFunction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	CoverageFunctionType getCoverageFunction();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DiscreteCoverageType#getCoverageFunction <em>Coverage Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Function</em>' containment reference.
	 * @see #getCoverageFunction()
	 * @generated
	 */
	void setCoverageFunction(CoverageFunctionType value);

} // DiscreteCoverageType
