/**
 */
package net.opengis.gml32.impl;

import java.io.IOException;

import java.net.URL;

import net.opengis.gml32.GMLFactory;
import net.opengis.gml32.GMLPackage;

import net.opengis.gml32.util.GMLValidator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.isotc211.iso19139.gco.GCOPackage;

import org.isotc211.iso19139.gco.impl.GCOPackageImpl;

import org.isotc211.iso19139.gmd.GMDPackage;

import org.isotc211.iso19139.gmd.impl.GMDPackageImpl;

import org.isotc211.iso19139.gsr.GSRPackage;

import org.isotc211.iso19139.gsr.impl.GSRPackageImpl;

import org.isotc211.iso19139.gss.GSSPackage;

import org.isotc211.iso19139.gss.impl.GSSPackageImpl;

import org.isotc211.iso19139.gts.GTSPackage;

import org.isotc211.iso19139.gts.impl.GTSPackageImpl;

import org.w3.xlink.XLinkPackage;

import org.w3.xlink.impl.XLinkPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMLPackageImpl extends EPackageImpl implements GMLPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "gml32.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractContinuousCoverageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCoordinateOperationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCoordinateSystemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCoverageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCurveSegmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCurveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDatumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFeatureCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFeatureMemberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFeatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGeneralConversionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGeneralDerivedCRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGeneralOperationParameterPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGeneralOperationParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGeneralParameterValuePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGeneralParameterValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGeneralTransformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGeometricAggregateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGeometricPrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGeometryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGMLTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGriddedSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMemberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMetadataPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMetaDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractParametricCurveSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRingPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSolidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSurfacePatchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTimeComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTimeGeometricPrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTimeObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTimePrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTimeSliceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTimeTopologyPrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTopologyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTopoPrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affineCSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affineCSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affinePlacementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleChoiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcByBulgeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcByCenterPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcStringByBulgeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationRoleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedFeatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundingShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bSplineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryExtentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleByCenterPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clothoidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeOrNilReasonListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeWithAuthorityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeCurveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeSolidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundCRSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundCRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concatenatedOperationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concatenatedOperationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conventionalUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionToPreferredUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateOperationAccuracyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateOperationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateSystemAxisPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateSystemAxisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateSystemPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageFunctionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crsPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubicSplineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curveArrayPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curvePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curveSegmentArrayPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylinderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylindricalCSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylindricalCSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBlockTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datumPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionProxyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degreesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationUnitTermTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedCRSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedCRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedEdgePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedFacePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedNodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedObservationAtDistanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedObservationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedTopoSolidPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionVectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directPositionListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directPositionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteCoverageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmsAngleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainOfValidityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicFeatureCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicFeatureMemberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicFeatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipsoidalCSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipsoidalCSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipsoidPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipsoidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeringCRSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeringCRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeringDatumPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeringDatumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envelopeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envelopeWithTimePeriodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faceOrTopoSolidPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureArrayPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaCitationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalConversionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalTransformationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericMetaDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geocentricCRSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geocentricCRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geodesicStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geodesicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geodeticCRSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geodeticCRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geodeticDatumPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geodeticDatumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geographicCRSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geographicCRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometricComplexPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometricComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometricPrimitivePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryArrayPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridEnvelopeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridFunctionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridLengthTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridLimitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageCRSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageCRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageDatumPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageDatumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indirectEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlinePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knotPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knotTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearCSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearCSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearRingPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearRingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStringSegmentArrayPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStringSegmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureOrNilReasonListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaDataPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movingObjectStatusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiCurvePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiCurveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiGeometryPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiGeometryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPointPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiSolidPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiSolidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiSurfacePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeOrEdgePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obliqueCartesianCSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obliqueCartesianCSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetCurveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationMethodPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationParameterGroupPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationParameterGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationParameterPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orientableCurveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orientableSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passThroughOperationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passThroughOperationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointArrayPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polarCSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polarCSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonPatchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primeMeridianPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primeMeridianTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityLocationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedurePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectedCRSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectedCRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityExtentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectifiedGridTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refLocationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ringPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secondDefiningParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secondDefiningParameterType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleCRSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleOperationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidArrayPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphereTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalCSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalCSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringOrRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceArrayPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfacePatchArrayPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfacePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalCRSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalCRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalCSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalCSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalDatumBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalDatumPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalDatumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeCalendarEraPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeCalendarEraTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeCalendarPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeCalendarTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeClockPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeClockTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeCoordinateSystemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeCSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeCSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEdgePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEdgeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeInstantPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeInstantTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalLengthTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeNodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeOrdinalEraPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeOrdinalEraTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeOrdinalReferenceSystemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePeriodPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePeriodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePositionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePrimitivePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeReferenceSystemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTopologyComplexPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTopologyComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTopologyPrimitivePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoComplexPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoCurvePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoCurveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoPointPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoPrimitiveArrayAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoPrimitiveMemberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoSolidPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoSolidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoSurfacePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoVolumePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topoVolumeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitOfMeasureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedCSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedCSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueArrayPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueArrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalCRSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalCRSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalCSPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalCSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalDatumPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalDatumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compassPointEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum curveInterpolationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum incrementOrderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum knotTypesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nilReasonEnumerationMember0EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relativePositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sequenceRuleEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum successionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum surfaceInterpolationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeIndeterminateValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitTypeMember0EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aggregationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arcMinutesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arcSecondsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType axisDirectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType axisDirectionListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanOrNilReasonEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanOrNilReasonListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calDateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compassPointEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countExtentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType curveInterpolationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decimalMinutesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType degreeValueTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType directionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleOrNilReasonEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleOrNilReasonListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType incrementOrderObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerOrNilReasonEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerOrNilReasonListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType knotTypesTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameOrNilReasonEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameOrNilReasonListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ncNameListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nilReasonEnumerationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nilReasonEnumerationMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nilReasonEnumerationMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nilReasonTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qNameListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relativePositionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sequenceRuleEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringOrNilReasonEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType successionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType surfaceInterpolationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeIndeterminateValueTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timePositionUnionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeUnitTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeUnitTypeMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeUnitTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uomIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uomSymbolEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uomURIEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.opengis.gml32.GMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GMLPackageImpl()
	{
		super(eNS_URI, GMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static GMLPackage init()
	{
		if (isInited) return (GMLPackage)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI);

		// Obtain or create and register package
		GMLPackageImpl theGMLPackage = (GMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GMLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XLinkPackageImpl theXLinkPackage = (XLinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI) instanceof XLinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI) : XLinkPackage.eINSTANCE);
		GMDPackageImpl theGMDPackage = (GMDPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI) instanceof GMDPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI) : GMDPackage.eINSTANCE);
		GCOPackageImpl theGCOPackage = (GCOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GCOPackage.eNS_URI) instanceof GCOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GCOPackage.eNS_URI) : GCOPackage.eINSTANCE);
		GSSPackageImpl theGSSPackage = (GSSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) instanceof GSSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) : GSSPackage.eINSTANCE);
		GTSPackageImpl theGTSPackage = (GTSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GTSPackage.eNS_URI) instanceof GTSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GTSPackage.eNS_URI) : GTSPackage.eINSTANCE);
		GSRPackageImpl theGSRPackage = (GSRPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GSRPackage.eNS_URI) instanceof GSRPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GSRPackage.eNS_URI) : GSRPackage.eINSTANCE);

		// Load packages
		theGMLPackage.loadPackage();
		theGMDPackage.loadPackage();

		// Create package meta-data objects
		theXLinkPackage.createPackageContents();
		theGCOPackage.createPackageContents();
		theGSSPackage.createPackageContents();
		theGTSPackage.createPackageContents();
		theGSRPackage.createPackageContents();

		// Initialize created meta-data
		theXLinkPackage.initializePackageContents();
		theGCOPackage.initializePackageContents();
		theGSSPackage.initializePackageContents();
		theGTSPackage.initializePackageContents();
		theGSRPackage.initializePackageContents();

		// Fix loaded packages
		theGMLPackage.fixPackageContents();
		theGMDPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGMLPackage, 
			 new EValidator.Descriptor()
			 {
				 public EValidator getEValidator()
				 {
					 return GMLValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGMLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GMLPackage.eNS_URI, theGMLPackage);
		return theGMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractContinuousCoverageType()
	{
		if (abstractContinuousCoverageTypeEClass == null)
		{
			abstractContinuousCoverageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(0);
		}
		return abstractContinuousCoverageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContinuousCoverageType_CoverageFunction()
	{
        return (EReference)getAbstractContinuousCoverageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCoordinateOperationType()
	{
		if (abstractCoordinateOperationTypeEClass == null)
		{
			abstractCoordinateOperationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(1);
		}
		return abstractCoordinateOperationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinateOperationType_DomainOfValidity()
	{
        return (EReference)getAbstractCoordinateOperationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCoordinateOperationType_Scope()
	{
        return (EAttribute)getAbstractCoordinateOperationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCoordinateOperationType_OperationVersion()
	{
        return (EAttribute)getAbstractCoordinateOperationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinateOperationType_CoordinateOperationAccuracy()
	{
        return (EReference)getAbstractCoordinateOperationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinateOperationType_SourceCRS()
	{
        return (EReference)getAbstractCoordinateOperationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinateOperationType_TargetCRS()
	{
        return (EReference)getAbstractCoordinateOperationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCoordinateSystemType()
	{
		if (abstractCoordinateSystemTypeEClass == null)
		{
			abstractCoordinateSystemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(2);
		}
		return abstractCoordinateSystemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCoordinateSystemType_AxisGroup()
	{
        return (EAttribute)getAbstractCoordinateSystemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoordinateSystemType_Axis()
	{
        return (EReference)getAbstractCoordinateSystemType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCoordinateSystemType_AggregationType()
	{
        return (EAttribute)getAbstractCoordinateSystemType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCoverageType()
	{
		if (abstractCoverageTypeEClass == null)
		{
			abstractCoverageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(3);
		}
		return abstractCoverageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCoverageType_DomainSetGroup()
	{
        return (EAttribute)getAbstractCoverageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoverageType_DomainSet()
	{
        return (EReference)getAbstractCoverageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCoverageType_RangeSet()
	{
        return (EReference)getAbstractCoverageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCRSType()
	{
		if (abstractCRSTypeEClass == null)
		{
			abstractCRSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(4);
		}
		return abstractCRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCRSType_DomainOfValidity()
	{
        return (EReference)getAbstractCRSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCRSType_Scope()
	{
        return (EAttribute)getAbstractCRSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCurveSegmentType()
	{
		if (abstractCurveSegmentTypeEClass == null)
		{
			abstractCurveSegmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(5);
		}
		return abstractCurveSegmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCurveSegmentType_NumDerivativeInterior()
	{
        return (EAttribute)getAbstractCurveSegmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCurveSegmentType_NumDerivativesAtEnd()
	{
        return (EAttribute)getAbstractCurveSegmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCurveSegmentType_NumDerivativesAtStart()
	{
        return (EAttribute)getAbstractCurveSegmentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCurveType()
	{
		if (abstractCurveTypeEClass == null)
		{
			abstractCurveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(6);
		}
		return abstractCurveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDatumType()
	{
		if (abstractDatumTypeEClass == null)
		{
			abstractDatumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(7);
		}
		return abstractDatumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDatumType_DomainOfValidity()
	{
        return (EReference)getAbstractDatumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDatumType_Scope()
	{
        return (EAttribute)getAbstractDatumType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDatumType_AnchorDefinitionGroup()
	{
        return (EAttribute)getAbstractDatumType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDatumType_AnchorDefinition()
	{
        return (EReference)getAbstractDatumType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDatumType_RealizationEpoch()
	{
        return (EAttribute)getAbstractDatumType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeatureCollectionType()
	{
		if (abstractFeatureCollectionTypeEClass == null)
		{
			abstractFeatureCollectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(8);
		}
		return abstractFeatureCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFeatureCollectionType_FeatureMember()
	{
        return (EReference)getAbstractFeatureCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFeatureCollectionType_FeatureMembers()
	{
        return (EReference)getAbstractFeatureCollectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeatureMemberType()
	{
		if (abstractFeatureMemberTypeEClass == null)
		{
			abstractFeatureMemberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(9);
		}
		return abstractFeatureMemberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeatureMemberType_Owns()
	{
        return (EAttribute)getAbstractFeatureMemberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeatureType()
	{
		if (abstractFeatureTypeEClass == null)
		{
			abstractFeatureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(10);
		}
		return abstractFeatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFeatureType_BoundedBy()
	{
        return (EReference)getAbstractFeatureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeatureType_LocationGroup()
	{
        return (EAttribute)getAbstractFeatureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFeatureType_Location()
	{
        return (EReference)getAbstractFeatureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGeneralConversionType()
	{
		if (abstractGeneralConversionTypeEClass == null)
		{
			abstractGeneralConversionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(11);
		}
		return abstractGeneralConversionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGeneralDerivedCRSType()
	{
		if (abstractGeneralDerivedCRSTypeEClass == null)
		{
			abstractGeneralDerivedCRSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(12);
		}
		return abstractGeneralDerivedCRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGeneralDerivedCRSType_Conversion()
	{
        return (EReference)getAbstractGeneralDerivedCRSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGeneralOperationParameterPropertyType()
	{
		if (abstractGeneralOperationParameterPropertyTypeEClass == null)
		{
			abstractGeneralOperationParameterPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(13);
		}
		return abstractGeneralOperationParameterPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeneralOperationParameterPropertyType_AbstractGeneralOperationParameterGroup()
	{
        return (EAttribute)getAbstractGeneralOperationParameterPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGeneralOperationParameterPropertyType_AbstractGeneralOperationParameter()
	{
        return (EReference)getAbstractGeneralOperationParameterPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeneralOperationParameterPropertyType_Actuate()
	{
        return (EAttribute)getAbstractGeneralOperationParameterPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeneralOperationParameterPropertyType_Arcrole()
	{
        return (EAttribute)getAbstractGeneralOperationParameterPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeneralOperationParameterPropertyType_Href()
	{
        return (EAttribute)getAbstractGeneralOperationParameterPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeneralOperationParameterPropertyType_NilReason()
	{
        return (EAttribute)getAbstractGeneralOperationParameterPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeneralOperationParameterPropertyType_RemoteSchema()
	{
        return (EAttribute)getAbstractGeneralOperationParameterPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeneralOperationParameterPropertyType_Role()
	{
        return (EAttribute)getAbstractGeneralOperationParameterPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeneralOperationParameterPropertyType_Show()
	{
        return (EAttribute)getAbstractGeneralOperationParameterPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeneralOperationParameterPropertyType_Title()
	{
        return (EAttribute)getAbstractGeneralOperationParameterPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeneralOperationParameterPropertyType_Type()
	{
        return (EAttribute)getAbstractGeneralOperationParameterPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGeneralOperationParameterType()
	{
		if (abstractGeneralOperationParameterTypeEClass == null)
		{
			abstractGeneralOperationParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(14);
		}
		return abstractGeneralOperationParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeneralOperationParameterType_MinimumOccurs()
	{
        return (EAttribute)getAbstractGeneralOperationParameterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGeneralParameterValuePropertyType()
	{
		if (abstractGeneralParameterValuePropertyTypeEClass == null)
		{
			abstractGeneralParameterValuePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(15);
		}
		return abstractGeneralParameterValuePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeneralParameterValuePropertyType_AbstractGeneralParameterValueGroup()
	{
        return (EAttribute)getAbstractGeneralParameterValuePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGeneralParameterValuePropertyType_AbstractGeneralParameterValue()
	{
        return (EReference)getAbstractGeneralParameterValuePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGeneralParameterValueType()
	{
		if (abstractGeneralParameterValueTypeEClass == null)
		{
			abstractGeneralParameterValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(16);
		}
		return abstractGeneralParameterValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGeneralTransformationType()
	{
		if (abstractGeneralTransformationTypeEClass == null)
		{
			abstractGeneralTransformationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(17);
		}
		return abstractGeneralTransformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGeometricAggregateType()
	{
		if (abstractGeometricAggregateTypeEClass == null)
		{
			abstractGeometricAggregateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(18);
		}
		return abstractGeometricAggregateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeometricAggregateType_AggregationType()
	{
        return (EAttribute)getAbstractGeometricAggregateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGeometricPrimitiveType()
	{
		if (abstractGeometricPrimitiveTypeEClass == null)
		{
			abstractGeometricPrimitiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(19);
		}
		return abstractGeometricPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGeometryType()
	{
		if (abstractGeometryTypeEClass == null)
		{
			abstractGeometryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(20);
		}
		return abstractGeometryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeometryType_AxisLabels()
	{
        return (EAttribute)getAbstractGeometryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeometryType_SrsDimension()
	{
        return (EAttribute)getAbstractGeometryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeometryType_SrsName()
	{
        return (EAttribute)getAbstractGeometryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGeometryType_UomLabels()
	{
        return (EAttribute)getAbstractGeometryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGMLType()
	{
		if (abstractGMLTypeEClass == null)
		{
			abstractGMLTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(21);
		}
		return abstractGMLTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGMLType_MetaDataProperty()
	{
        return (EReference)getAbstractGMLType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGMLType_Description()
	{
        return (EReference)getAbstractGMLType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGMLType_DescriptionReference()
	{
        return (EReference)getAbstractGMLType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGMLType_Identifier()
	{
        return (EReference)getAbstractGMLType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGMLType_Name()
	{
        return (EReference)getAbstractGMLType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGMLType_Id()
	{
        return (EAttribute)getAbstractGMLType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGriddedSurfaceType()
	{
		if (abstractGriddedSurfaceTypeEClass == null)
		{
			abstractGriddedSurfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(22);
		}
		return abstractGriddedSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGriddedSurfaceType_Rows()
	{
        return (EReference)getAbstractGriddedSurfaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGriddedSurfaceType_Columns()
	{
        return (EAttribute)getAbstractGriddedSurfaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGriddedSurfaceType_Rows1()
	{
        return (EAttribute)getAbstractGriddedSurfaceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMemberType()
	{
		if (abstractMemberTypeEClass == null)
		{
			abstractMemberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(23);
		}
		return abstractMemberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMemberType_Owns()
	{
        return (EAttribute)getAbstractMemberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMetadataPropertyType()
	{
		if (abstractMetadataPropertyTypeEClass == null)
		{
			abstractMetadataPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(24);
		}
		return abstractMetadataPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMetadataPropertyType_Owns()
	{
        return (EAttribute)getAbstractMetadataPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMetaDataType()
	{
		if (abstractMetaDataTypeEClass == null)
		{
			abstractMetaDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(25);
		}
		return abstractMetaDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMetaDataType_Mixed()
	{
        return (EAttribute)getAbstractMetaDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMetaDataType_Id()
	{
        return (EAttribute)getAbstractMetaDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractParametricCurveSurfaceType()
	{
		if (abstractParametricCurveSurfaceTypeEClass == null)
		{
			abstractParametricCurveSurfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(26);
		}
		return abstractParametricCurveSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractParametricCurveSurfaceType_AggregationType()
	{
        return (EAttribute)getAbstractParametricCurveSurfaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRingPropertyType()
	{
		if (abstractRingPropertyTypeEClass == null)
		{
			abstractRingPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(27);
		}
		return abstractRingPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractRingPropertyType_AbstractRingGroup()
	{
        return (EAttribute)getAbstractRingPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRingPropertyType_AbstractRing()
	{
        return (EReference)getAbstractRingPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRingType()
	{
		if (abstractRingTypeEClass == null)
		{
			abstractRingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(28);
		}
		return abstractRingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSolidType()
	{
		if (abstractSolidTypeEClass == null)
		{
			abstractSolidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(29);
		}
		return abstractSolidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSurfacePatchType()
	{
		if (abstractSurfacePatchTypeEClass == null)
		{
			abstractSurfacePatchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(30);
		}
		return abstractSurfacePatchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSurfaceType()
	{
		if (abstractSurfaceTypeEClass == null)
		{
			abstractSurfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(31);
		}
		return abstractSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTimeComplexType()
	{
		if (abstractTimeComplexTypeEClass == null)
		{
			abstractTimeComplexTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(32);
		}
		return abstractTimeComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTimeGeometricPrimitiveType()
	{
		if (abstractTimeGeometricPrimitiveTypeEClass == null)
		{
			abstractTimeGeometricPrimitiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(33);
		}
		return abstractTimeGeometricPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTimeGeometricPrimitiveType_Frame()
	{
        return (EAttribute)getAbstractTimeGeometricPrimitiveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTimeObjectType()
	{
		if (abstractTimeObjectTypeEClass == null)
		{
			abstractTimeObjectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(34);
		}
		return abstractTimeObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTimePrimitiveType()
	{
		if (abstractTimePrimitiveTypeEClass == null)
		{
			abstractTimePrimitiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(35);
		}
		return abstractTimePrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTimePrimitiveType_RelatedTime()
	{
        return (EReference)getAbstractTimePrimitiveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTimeSliceType()
	{
		if (abstractTimeSliceTypeEClass == null)
		{
			abstractTimeSliceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(36);
		}
		return abstractTimeSliceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTimeSliceType_ValidTime()
	{
        return (EReference)getAbstractTimeSliceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTimeSliceType_DataSource()
	{
        return (EReference)getAbstractTimeSliceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTimeTopologyPrimitiveType()
	{
		if (abstractTimeTopologyPrimitiveTypeEClass == null)
		{
			abstractTimeTopologyPrimitiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(37);
		}
		return abstractTimeTopologyPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTimeTopologyPrimitiveType_Complex()
	{
        return (EReference)getAbstractTimeTopologyPrimitiveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTopologyType()
	{
		if (abstractTopologyTypeEClass == null)
		{
			abstractTopologyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(38);
		}
		return abstractTopologyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTopoPrimitiveType()
	{
		if (abstractTopoPrimitiveTypeEClass == null)
		{
			abstractTopoPrimitiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(39);
		}
		return abstractTopoPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffineCSPropertyType()
	{
		if (affineCSPropertyTypeEClass == null)
		{
			affineCSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(40);
		}
		return affineCSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffineCSPropertyType_AffineCS()
	{
        return (EReference)getAffineCSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffineCSPropertyType_Actuate()
	{
        return (EAttribute)getAffineCSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffineCSPropertyType_Arcrole()
	{
        return (EAttribute)getAffineCSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffineCSPropertyType_Href()
	{
        return (EAttribute)getAffineCSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffineCSPropertyType_NilReason()
	{
        return (EAttribute)getAffineCSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffineCSPropertyType_RemoteSchema()
	{
        return (EAttribute)getAffineCSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffineCSPropertyType_Role()
	{
        return (EAttribute)getAffineCSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffineCSPropertyType_Show()
	{
        return (EAttribute)getAffineCSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffineCSPropertyType_Title()
	{
        return (EAttribute)getAffineCSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffineCSPropertyType_Type()
	{
        return (EAttribute)getAffineCSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffineCSType()
	{
		if (affineCSTypeEClass == null)
		{
			affineCSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(41);
		}
		return affineCSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffinePlacementType()
	{
		if (affinePlacementTypeEClass == null)
		{
			affinePlacementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(42);
		}
		return affinePlacementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffinePlacementType_Location()
	{
        return (EReference)getAffinePlacementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffinePlacementType_RefDirection()
	{
        return (EReference)getAffinePlacementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffinePlacementType_InDimension()
	{
        return (EAttribute)getAffinePlacementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffinePlacementType_OutDimension()
	{
        return (EAttribute)getAffinePlacementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleChoiceType()
	{
		if (angleChoiceTypeEClass == null)
		{
			angleChoiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(45);
		}
		return angleChoiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAngleChoiceType_Angle()
	{
        return (EReference)getAngleChoiceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAngleChoiceType_DmsAngle()
	{
        return (EReference)getAngleChoiceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleType()
	{
		if (angleTypeEClass == null)
		{
			angleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(46);
		}
		return angleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcByBulgeType()
	{
		if (arcByBulgeTypeEClass == null)
		{
			arcByBulgeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(47);
		}
		return arcByBulgeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcByCenterPointType()
	{
		if (arcByCenterPointTypeEClass == null)
		{
			arcByCenterPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(48);
		}
		return arcByCenterPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcByCenterPointType_Pos()
	{
        return (EReference)getArcByCenterPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcByCenterPointType_PointProperty()
	{
        return (EReference)getArcByCenterPointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcByCenterPointType_PointRep()
	{
        return (EReference)getArcByCenterPointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcByCenterPointType_PosList()
	{
        return (EReference)getArcByCenterPointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcByCenterPointType_Coordinates()
	{
        return (EReference)getArcByCenterPointType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcByCenterPointType_Radius()
	{
        return (EReference)getArcByCenterPointType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcByCenterPointType_StartAngle()
	{
        return (EReference)getArcByCenterPointType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcByCenterPointType_EndAngle()
	{
        return (EReference)getArcByCenterPointType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcByCenterPointType_Interpolation()
	{
        return (EAttribute)getArcByCenterPointType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcByCenterPointType_NumArc()
	{
        return (EAttribute)getArcByCenterPointType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcStringByBulgeType()
	{
		if (arcStringByBulgeTypeEClass == null)
		{
			arcStringByBulgeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(51);
		}
		return arcStringByBulgeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcStringByBulgeType_Group()
	{
        return (EAttribute)getArcStringByBulgeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcStringByBulgeType_Pos()
	{
        return (EReference)getArcStringByBulgeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcStringByBulgeType_PointProperty()
	{
        return (EReference)getArcStringByBulgeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcStringByBulgeType_PointRep()
	{
        return (EReference)getArcStringByBulgeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcStringByBulgeType_PosList()
	{
        return (EReference)getArcStringByBulgeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcStringByBulgeType_Coordinates()
	{
        return (EReference)getArcStringByBulgeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcStringByBulgeType_Bulge()
	{
        return (EAttribute)getArcStringByBulgeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcStringByBulgeType_Normal()
	{
        return (EReference)getArcStringByBulgeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcStringByBulgeType_Interpolation()
	{
        return (EAttribute)getArcStringByBulgeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcStringByBulgeType_NumArc()
	{
        return (EAttribute)getArcStringByBulgeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcStringType()
	{
		if (arcStringTypeEClass == null)
		{
			arcStringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(52);
		}
		return arcStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcStringType_Group()
	{
        return (EAttribute)getArcStringType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcStringType_Pos()
	{
        return (EReference)getArcStringType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcStringType_PointProperty()
	{
        return (EReference)getArcStringType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcStringType_PointRep()
	{
        return (EReference)getArcStringType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcStringType_PosList()
	{
        return (EReference)getArcStringType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcStringType_Coordinates()
	{
        return (EReference)getArcStringType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcStringType_Interpolation()
	{
        return (EAttribute)getArcStringType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcStringType_NumArc()
	{
        return (EAttribute)getArcStringType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcType()
	{
		if (arcTypeEClass == null)
		{
			arcTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(53);
		}
		return arcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaType()
	{
		if (areaTypeEClass == null)
		{
			areaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(54);
		}
		return areaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayAssociationType()
	{
		if (arrayAssociationTypeEClass == null)
		{
			arrayAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(55);
		}
		return arrayAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayAssociationType_AbstractObjectGroup()
	{
        return (EAttribute)getArrayAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayAssociationType_AbstractObject()
	{
        return (EReference)getArrayAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayAssociationType_Owns()
	{
        return (EAttribute)getArrayAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayType()
	{
		if (arrayTypeEClass == null)
		{
			arrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(56);
		}
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayType_Members()
	{
        return (EReference)getArrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationRoleType()
	{
		if (associationRoleTypeEClass == null)
		{
			associationRoleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(57);
		}
		return associationRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRoleType_Any()
	{
        return (EAttribute)getAssociationRoleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRoleType_Actuate()
	{
        return (EAttribute)getAssociationRoleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRoleType_Arcrole()
	{
        return (EAttribute)getAssociationRoleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRoleType_Href()
	{
        return (EAttribute)getAssociationRoleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRoleType_NilReason()
	{
        return (EAttribute)getAssociationRoleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRoleType_Owns()
	{
        return (EAttribute)getAssociationRoleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRoleType_RemoteSchema()
	{
        return (EAttribute)getAssociationRoleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRoleType_Role()
	{
        return (EAttribute)getAssociationRoleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRoleType_Show()
	{
        return (EAttribute)getAssociationRoleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRoleType_Title()
	{
        return (EAttribute)getAssociationRoleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRoleType_Type()
	{
        return (EAttribute)getAssociationRoleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagType()
	{
		if (bagTypeEClass == null)
		{
			bagTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(60);
		}
		return bagTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagType_Member()
	{
        return (EReference)getBagType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagType_Members()
	{
        return (EReference)getBagType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseUnitType()
	{
		if (baseUnitTypeEClass == null)
		{
			baseUnitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(61);
		}
		return baseUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseUnitType_UnitsSystem()
	{
        return (EReference)getBaseUnitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBezierType()
	{
		if (bezierTypeEClass == null)
		{
			bezierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(62);
		}
		return bezierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanPropertyType()
	{
		if (booleanPropertyTypeEClass == null)
		{
			booleanPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(66);
		}
		return booleanPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanPropertyType_Boolean()
	{
        return (EReference)getBooleanPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanPropertyType_Actuate()
	{
        return (EAttribute)getBooleanPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanPropertyType_Arcrole()
	{
        return (EAttribute)getBooleanPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanPropertyType_Href()
	{
        return (EAttribute)getBooleanPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanPropertyType_NilReason()
	{
        return (EAttribute)getBooleanPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanPropertyType_RemoteSchema()
	{
        return (EAttribute)getBooleanPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanPropertyType_Role()
	{
        return (EAttribute)getBooleanPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanPropertyType_Show()
	{
        return (EAttribute)getBooleanPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanPropertyType_Title()
	{
        return (EAttribute)getBooleanPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanPropertyType_Type()
	{
        return (EAttribute)getBooleanPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType()
	{
		if (booleanTypeEClass == null)
		{
			booleanTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(67);
		}
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanType_Value()
	{
        return (EAttribute)getBooleanType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanType_NilReason()
	{
        return (EAttribute)getBooleanType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedFeatureType()
	{
		if (boundedFeatureTypeEClass == null)
		{
			boundedFeatureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(68);
		}
		return boundedFeatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundingShapeType()
	{
		if (boundingShapeTypeEClass == null)
		{
			boundingShapeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(69);
		}
		return boundingShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundingShapeType_EnvelopeGroup()
	{
        return (EAttribute)getBoundingShapeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundingShapeType_Envelope()
	{
        return (EReference)getBoundingShapeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundingShapeType_Null()
	{
        return (EAttribute)getBoundingShapeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundingShapeType_NilReason()
	{
        return (EAttribute)getBoundingShapeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBSplineType()
	{
		if (bSplineTypeEClass == null)
		{
			bSplineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(70);
		}
		return bSplineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBSplineType_Group()
	{
        return (EAttribute)getBSplineType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBSplineType_Pos()
	{
        return (EReference)getBSplineType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBSplineType_PointProperty()
	{
        return (EReference)getBSplineType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBSplineType_PointRep()
	{
        return (EReference)getBSplineType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBSplineType_PosList()
	{
        return (EReference)getBSplineType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBSplineType_Coordinates()
	{
        return (EReference)getBSplineType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBSplineType_Degree()
	{
        return (EAttribute)getBSplineType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBSplineType_Knot()
	{
        return (EReference)getBSplineType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBSplineType_Interpolation()
	{
        return (EAttribute)getBSplineType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBSplineType_IsPolynomial()
	{
        return (EAttribute)getBSplineType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBSplineType_KnotType()
	{
        return (EAttribute)getBSplineType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCSPropertyType()
	{
		if (cartesianCSPropertyTypeEClass == null)
		{
			cartesianCSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(72);
		}
		return cartesianCSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianCSPropertyType_CartesianCS()
	{
        return (EReference)getCartesianCSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCSPropertyType_Actuate()
	{
        return (EAttribute)getCartesianCSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCSPropertyType_Arcrole()
	{
        return (EAttribute)getCartesianCSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCSPropertyType_Href()
	{
        return (EAttribute)getCartesianCSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCSPropertyType_NilReason()
	{
        return (EAttribute)getCartesianCSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCSPropertyType_RemoteSchema()
	{
        return (EAttribute)getCartesianCSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCSPropertyType_Role()
	{
        return (EAttribute)getCartesianCSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCSPropertyType_Show()
	{
        return (EAttribute)getCartesianCSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCSPropertyType_Title()
	{
        return (EAttribute)getCartesianCSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCSPropertyType_Type()
	{
        return (EAttribute)getCartesianCSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCSType()
	{
		if (cartesianCSTypeEClass == null)
		{
			cartesianCSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(73);
		}
		return cartesianCSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryExtentType()
	{
		if (categoryExtentTypeEClass == null)
		{
			categoryExtentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(74);
		}
		return categoryExtentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryPropertyType()
	{
		if (categoryPropertyTypeEClass == null)
		{
			categoryPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(75);
		}
		return categoryPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryPropertyType_Category()
	{
        return (EReference)getCategoryPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryPropertyType_Actuate()
	{
        return (EAttribute)getCategoryPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryPropertyType_Arcrole()
	{
        return (EAttribute)getCategoryPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryPropertyType_Href()
	{
        return (EAttribute)getCategoryPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryPropertyType_NilReason()
	{
        return (EAttribute)getCategoryPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryPropertyType_RemoteSchema()
	{
        return (EAttribute)getCategoryPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryPropertyType_Role()
	{
        return (EAttribute)getCategoryPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryPropertyType_Show()
	{
        return (EAttribute)getCategoryPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryPropertyType_Title()
	{
        return (EAttribute)getCategoryPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryPropertyType_Type()
	{
        return (EAttribute)getCategoryPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryType()
	{
		if (categoryTypeEClass == null)
		{
			categoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(76);
		}
		return categoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryType_NilReason()
	{
        return (EAttribute)getCategoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircleByCenterPointType()
	{
		if (circleByCenterPointTypeEClass == null)
		{
			circleByCenterPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(77);
		}
		return circleByCenterPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircleType()
	{
		if (circleTypeEClass == null)
		{
			circleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(78);
		}
		return circleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClothoidType()
	{
		if (clothoidTypeEClass == null)
		{
			clothoidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(79);
		}
		return clothoidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClothoidType_RefLocation()
	{
        return (EReference)getClothoidType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClothoidType_ScaleFactor()
	{
        return (EAttribute)getClothoidType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClothoidType_StartParameter()
	{
        return (EAttribute)getClothoidType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClothoidType_EndParameter()
	{
        return (EAttribute)getClothoidType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClothoidType_Interpolation()
	{
        return (EAttribute)getClothoidType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeListType()
	{
		if (codeListTypeEClass == null)
		{
			codeListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(80);
		}
		return codeListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeListType_Value()
	{
        return (EAttribute)getCodeListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeListType_CodeSpace()
	{
        return (EAttribute)getCodeListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeOrNilReasonListType()
	{
		if (codeOrNilReasonListTypeEClass == null)
		{
			codeOrNilReasonListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(81);
		}
		return codeOrNilReasonListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeOrNilReasonListType_Value()
	{
        return (EAttribute)getCodeOrNilReasonListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeOrNilReasonListType_CodeSpace()
	{
        return (EAttribute)getCodeOrNilReasonListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeType()
	{
		if (codeTypeEClass == null)
		{
			codeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(82);
		}
		return codeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeType_Value()
	{
        return (EAttribute)getCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeType_CodeSpace()
	{
        return (EAttribute)getCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeWithAuthorityType()
	{
		if (codeWithAuthorityTypeEClass == null)
		{
			codeWithAuthorityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(83);
		}
		return codeWithAuthorityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCurveType()
	{
		if (compositeCurveTypeEClass == null)
		{
			compositeCurveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(86);
		}
		return compositeCurveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCurveType_CurveMember()
	{
        return (EReference)getCompositeCurveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeCurveType_AggregationType()
	{
        return (EAttribute)getCompositeCurveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeSolidType()
	{
		if (compositeSolidTypeEClass == null)
		{
			compositeSolidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(87);
		}
		return compositeSolidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeSolidType_SolidMember()
	{
        return (EReference)getCompositeSolidType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeSolidType_AggregationType()
	{
        return (EAttribute)getCompositeSolidType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeSurfaceType()
	{
		if (compositeSurfaceTypeEClass == null)
		{
			compositeSurfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(88);
		}
		return compositeSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeSurfaceType_SurfaceMember()
	{
        return (EReference)getCompositeSurfaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeSurfaceType_AggregationType()
	{
        return (EAttribute)getCompositeSurfaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeValueType()
	{
		if (compositeValueTypeEClass == null)
		{
			compositeValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(89);
		}
		return compositeValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeValueType_ValueComponent()
	{
        return (EReference)getCompositeValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeValueType_ValueComponents()
	{
        return (EReference)getCompositeValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeValueType_AggregationType()
	{
        return (EAttribute)getCompositeValueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundCRSPropertyType()
	{
		if (compoundCRSPropertyTypeEClass == null)
		{
			compoundCRSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(90);
		}
		return compoundCRSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundCRSPropertyType_CompoundCRS()
	{
        return (EReference)getCompoundCRSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundCRSPropertyType_Actuate()
	{
        return (EAttribute)getCompoundCRSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundCRSPropertyType_Arcrole()
	{
        return (EAttribute)getCompoundCRSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundCRSPropertyType_Href()
	{
        return (EAttribute)getCompoundCRSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundCRSPropertyType_NilReason()
	{
        return (EAttribute)getCompoundCRSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundCRSPropertyType_RemoteSchema()
	{
        return (EAttribute)getCompoundCRSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundCRSPropertyType_Role()
	{
        return (EAttribute)getCompoundCRSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundCRSPropertyType_Show()
	{
        return (EAttribute)getCompoundCRSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundCRSPropertyType_Title()
	{
        return (EAttribute)getCompoundCRSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundCRSPropertyType_Type()
	{
        return (EAttribute)getCompoundCRSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundCRSType()
	{
		if (compoundCRSTypeEClass == null)
		{
			compoundCRSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(91);
		}
		return compoundCRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundCRSType_ComponentReferenceSystemGroup()
	{
        return (EAttribute)getCompoundCRSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundCRSType_ComponentReferenceSystem()
	{
        return (EReference)getCompoundCRSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundCRSType_AggregationType()
	{
        return (EAttribute)getCompoundCRSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcatenatedOperationPropertyType()
	{
		if (concatenatedOperationPropertyTypeEClass == null)
		{
			concatenatedOperationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(92);
		}
		return concatenatedOperationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcatenatedOperationPropertyType_ConcatenatedOperation()
	{
        return (EReference)getConcatenatedOperationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcatenatedOperationPropertyType_Actuate()
	{
        return (EAttribute)getConcatenatedOperationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcatenatedOperationPropertyType_Arcrole()
	{
        return (EAttribute)getConcatenatedOperationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcatenatedOperationPropertyType_Href()
	{
        return (EAttribute)getConcatenatedOperationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcatenatedOperationPropertyType_NilReason()
	{
        return (EAttribute)getConcatenatedOperationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcatenatedOperationPropertyType_RemoteSchema()
	{
        return (EAttribute)getConcatenatedOperationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcatenatedOperationPropertyType_Role()
	{
        return (EAttribute)getConcatenatedOperationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcatenatedOperationPropertyType_Show()
	{
        return (EAttribute)getConcatenatedOperationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcatenatedOperationPropertyType_Title()
	{
        return (EAttribute)getConcatenatedOperationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcatenatedOperationPropertyType_Type()
	{
        return (EAttribute)getConcatenatedOperationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcatenatedOperationType()
	{
		if (concatenatedOperationTypeEClass == null)
		{
			concatenatedOperationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(93);
		}
		return concatenatedOperationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcatenatedOperationType_CoordOperationGroup()
	{
        return (EAttribute)getConcatenatedOperationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcatenatedOperationType_CoordOperation()
	{
        return (EReference)getConcatenatedOperationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcatenatedOperationType_AggregationType()
	{
        return (EAttribute)getConcatenatedOperationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConeType()
	{
		if (coneTypeEClass == null)
		{
			coneTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(94);
		}
		return coneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConeType_HorizontalCurveType()
	{
        return (EAttribute)getConeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConeType_VerticalCurveType()
	{
        return (EAttribute)getConeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlPointType()
	{
		if (controlPointTypeEClass == null)
		{
			controlPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(95);
		}
		return controlPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlPointType_PosList()
	{
        return (EReference)getControlPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlPointType_GeometricPositionGroup()
	{
        return (EAttribute)getControlPointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlPointType_Pos()
	{
        return (EReference)getControlPointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlPointType_PointProperty()
	{
        return (EReference)getControlPointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConventionalUnitType()
	{
		if (conventionalUnitTypeEClass == null)
		{
			conventionalUnitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(96);
		}
		return conventionalUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConventionalUnitType_ConversionToPreferredUnit()
	{
        return (EReference)getConventionalUnitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConventionalUnitType_RoughConversionToPreferredUnit()
	{
        return (EReference)getConventionalUnitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConventionalUnitType_DerivationUnitTerm()
	{
        return (EReference)getConventionalUnitType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversionPropertyType()
	{
		if (conversionPropertyTypeEClass == null)
		{
			conversionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(97);
		}
		return conversionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionPropertyType_Conversion()
	{
        return (EReference)getConversionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionPropertyType_Actuate()
	{
        return (EAttribute)getConversionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionPropertyType_Arcrole()
	{
        return (EAttribute)getConversionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionPropertyType_Href()
	{
        return (EAttribute)getConversionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionPropertyType_NilReason()
	{
        return (EAttribute)getConversionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionPropertyType_RemoteSchema()
	{
        return (EAttribute)getConversionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionPropertyType_Role()
	{
        return (EAttribute)getConversionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionPropertyType_Show()
	{
        return (EAttribute)getConversionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionPropertyType_Title()
	{
        return (EAttribute)getConversionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionPropertyType_Type()
	{
        return (EAttribute)getConversionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversionToPreferredUnitType()
	{
		if (conversionToPreferredUnitTypeEClass == null)
		{
			conversionToPreferredUnitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(98);
		}
		return conversionToPreferredUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionToPreferredUnitType_Factor()
	{
        return (EAttribute)getConversionToPreferredUnitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionToPreferredUnitType_Formula()
	{
        return (EReference)getConversionToPreferredUnitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversionType()
	{
		if (conversionTypeEClass == null)
		{
			conversionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(99);
		}
		return conversionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionType_MethodGroup()
	{
        return (EAttribute)getConversionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionType_Method()
	{
        return (EReference)getConversionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionType_ParameterValue()
	{
        return (EReference)getConversionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinateOperationAccuracyType()
	{
		if (coordinateOperationAccuracyTypeEClass == null)
		{
			coordinateOperationAccuracyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(100);
		}
		return coordinateOperationAccuracyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationAccuracyType_AbstractDQPositionalAccuracyGroup()
	{
        return (EAttribute)getCoordinateOperationAccuracyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinateOperationAccuracyType_AbstractDQPositionalAccuracy()
	{
        return (EReference)getCoordinateOperationAccuracyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationAccuracyType_Actuate()
	{
        return (EAttribute)getCoordinateOperationAccuracyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationAccuracyType_Arcrole()
	{
        return (EAttribute)getCoordinateOperationAccuracyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationAccuracyType_Href()
	{
        return (EAttribute)getCoordinateOperationAccuracyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationAccuracyType_NilReason()
	{
        return (EAttribute)getCoordinateOperationAccuracyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationAccuracyType_RemoteSchema()
	{
        return (EAttribute)getCoordinateOperationAccuracyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationAccuracyType_Role()
	{
        return (EAttribute)getCoordinateOperationAccuracyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationAccuracyType_Show()
	{
        return (EAttribute)getCoordinateOperationAccuracyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationAccuracyType_Title()
	{
        return (EAttribute)getCoordinateOperationAccuracyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationAccuracyType_Type()
	{
        return (EAttribute)getCoordinateOperationAccuracyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinateOperationPropertyType()
	{
		if (coordinateOperationPropertyTypeEClass == null)
		{
			coordinateOperationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(101);
		}
		return coordinateOperationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationPropertyType_AbstractCoordinateOperationGroup()
	{
        return (EAttribute)getCoordinateOperationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinateOperationPropertyType_AbstractCoordinateOperation()
	{
        return (EReference)getCoordinateOperationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationPropertyType_Actuate()
	{
        return (EAttribute)getCoordinateOperationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationPropertyType_Arcrole()
	{
        return (EAttribute)getCoordinateOperationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationPropertyType_Href()
	{
        return (EAttribute)getCoordinateOperationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationPropertyType_NilReason()
	{
        return (EAttribute)getCoordinateOperationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationPropertyType_RemoteSchema()
	{
        return (EAttribute)getCoordinateOperationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationPropertyType_Role()
	{
        return (EAttribute)getCoordinateOperationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationPropertyType_Show()
	{
        return (EAttribute)getCoordinateOperationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationPropertyType_Title()
	{
        return (EAttribute)getCoordinateOperationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateOperationPropertyType_Type()
	{
        return (EAttribute)getCoordinateOperationPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinatesType()
	{
		if (coordinatesTypeEClass == null)
		{
			coordinatesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(102);
		}
		return coordinatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinatesType_Value()
	{
        return (EAttribute)getCoordinatesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinatesType_Cs()
	{
        return (EAttribute)getCoordinatesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinatesType_Decimal()
	{
        return (EAttribute)getCoordinatesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinatesType_Ts()
	{
        return (EAttribute)getCoordinatesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinateSystemAxisPropertyType()
	{
		if (coordinateSystemAxisPropertyTypeEClass == null)
		{
			coordinateSystemAxisPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(103);
		}
		return coordinateSystemAxisPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinateSystemAxisPropertyType_CoordinateSystemAxis()
	{
        return (EReference)getCoordinateSystemAxisPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemAxisPropertyType_Actuate()
	{
        return (EAttribute)getCoordinateSystemAxisPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemAxisPropertyType_Arcrole()
	{
        return (EAttribute)getCoordinateSystemAxisPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemAxisPropertyType_Href()
	{
        return (EAttribute)getCoordinateSystemAxisPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemAxisPropertyType_NilReason()
	{
        return (EAttribute)getCoordinateSystemAxisPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemAxisPropertyType_RemoteSchema()
	{
        return (EAttribute)getCoordinateSystemAxisPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemAxisPropertyType_Role()
	{
        return (EAttribute)getCoordinateSystemAxisPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemAxisPropertyType_Show()
	{
        return (EAttribute)getCoordinateSystemAxisPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemAxisPropertyType_Title()
	{
        return (EAttribute)getCoordinateSystemAxisPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemAxisPropertyType_Type()
	{
        return (EAttribute)getCoordinateSystemAxisPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinateSystemAxisType()
	{
		if (coordinateSystemAxisTypeEClass == null)
		{
			coordinateSystemAxisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(104);
		}
		return coordinateSystemAxisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinateSystemAxisType_AxisAbbrev()
	{
        return (EReference)getCoordinateSystemAxisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinateSystemAxisType_AxisDirection()
	{
        return (EReference)getCoordinateSystemAxisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemAxisType_MinimumValue()
	{
        return (EAttribute)getCoordinateSystemAxisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemAxisType_MaximumValue()
	{
        return (EAttribute)getCoordinateSystemAxisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinateSystemAxisType_RangeMeaning()
	{
        return (EReference)getCoordinateSystemAxisType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemAxisType_Uom()
	{
        return (EAttribute)getCoordinateSystemAxisType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinateSystemPropertyType()
	{
		if (coordinateSystemPropertyTypeEClass == null)
		{
			coordinateSystemPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(105);
		}
		return coordinateSystemPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemPropertyType_AbstractCoordinateSystemGroup()
	{
        return (EAttribute)getCoordinateSystemPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinateSystemPropertyType_AbstractCoordinateSystem()
	{
        return (EReference)getCoordinateSystemPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemPropertyType_Actuate()
	{
        return (EAttribute)getCoordinateSystemPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemPropertyType_Arcrole()
	{
        return (EAttribute)getCoordinateSystemPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemPropertyType_Href()
	{
        return (EAttribute)getCoordinateSystemPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemPropertyType_NilReason()
	{
        return (EAttribute)getCoordinateSystemPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemPropertyType_RemoteSchema()
	{
        return (EAttribute)getCoordinateSystemPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemPropertyType_Role()
	{
        return (EAttribute)getCoordinateSystemPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemPropertyType_Show()
	{
        return (EAttribute)getCoordinateSystemPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemPropertyType_Title()
	{
        return (EAttribute)getCoordinateSystemPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinateSystemPropertyType_Type()
	{
        return (EAttribute)getCoordinateSystemPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountPropertyType()
	{
		if (countPropertyTypeEClass == null)
		{
			countPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(107);
		}
		return countPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountPropertyType_Count()
	{
        return (EReference)getCountPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountPropertyType_Actuate()
	{
        return (EAttribute)getCountPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountPropertyType_Arcrole()
	{
        return (EAttribute)getCountPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountPropertyType_Href()
	{
        return (EAttribute)getCountPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountPropertyType_NilReason()
	{
        return (EAttribute)getCountPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountPropertyType_RemoteSchema()
	{
        return (EAttribute)getCountPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountPropertyType_Role()
	{
        return (EAttribute)getCountPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountPropertyType_Show()
	{
        return (EAttribute)getCountPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountPropertyType_Title()
	{
        return (EAttribute)getCountPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountPropertyType_Type()
	{
        return (EAttribute)getCountPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountType()
	{
		if (countTypeEClass == null)
		{
			countTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(108);
		}
		return countTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountType_Value()
	{
        return (EAttribute)getCountType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountType_NilReason()
	{
        return (EAttribute)getCountType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverageFunctionType()
	{
		if (coverageFunctionTypeEClass == null)
		{
			coverageFunctionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(109);
		}
		return coverageFunctionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageFunctionType_MappingRule()
	{
        return (EReference)getCoverageFunctionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageFunctionType_CoverageMappingRule()
	{
        return (EReference)getCoverageFunctionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageFunctionType_GridFunction()
	{
        return (EReference)getCoverageFunctionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRSPropertyType()
	{
		if (crsPropertyTypeEClass == null)
		{
			crsPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(110);
		}
		return crsPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRSPropertyType_AbstractCRSGroup()
	{
        return (EAttribute)getCRSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRSPropertyType_AbstractCRS()
	{
        return (EReference)getCRSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRSPropertyType_Actuate()
	{
        return (EAttribute)getCRSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRSPropertyType_Arcrole()
	{
        return (EAttribute)getCRSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRSPropertyType_Href()
	{
        return (EAttribute)getCRSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRSPropertyType_NilReason()
	{
        return (EAttribute)getCRSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRSPropertyType_RemoteSchema()
	{
        return (EAttribute)getCRSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRSPropertyType_Role()
	{
        return (EAttribute)getCRSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRSPropertyType_Show()
	{
        return (EAttribute)getCRSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRSPropertyType_Title()
	{
        return (EAttribute)getCRSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRSPropertyType_Type()
	{
        return (EAttribute)getCRSPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCubicSplineType()
	{
		if (cubicSplineTypeEClass == null)
		{
			cubicSplineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(111);
		}
		return cubicSplineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubicSplineType_Group()
	{
        return (EAttribute)getCubicSplineType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubicSplineType_Pos()
	{
        return (EReference)getCubicSplineType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubicSplineType_PointProperty()
	{
        return (EReference)getCubicSplineType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubicSplineType_PointRep()
	{
        return (EReference)getCubicSplineType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubicSplineType_PosList()
	{
        return (EReference)getCubicSplineType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubicSplineType_Coordinates()
	{
        return (EReference)getCubicSplineType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubicSplineType_VectorAtStart()
	{
        return (EReference)getCubicSplineType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubicSplineType_VectorAtEnd()
	{
        return (EReference)getCubicSplineType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubicSplineType_Degree()
	{
        return (EAttribute)getCubicSplineType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubicSplineType_Interpolation()
	{
        return (EAttribute)getCubicSplineType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurveArrayPropertyType()
	{
		if (curveArrayPropertyTypeEClass == null)
		{
			curveArrayPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(112);
		}
		return curveArrayPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurveArrayPropertyType_Group()
	{
        return (EAttribute)getCurveArrayPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurveArrayPropertyType_AbstractCurveGroup()
	{
        return (EAttribute)getCurveArrayPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurveArrayPropertyType_AbstractCurve()
	{
        return (EReference)getCurveArrayPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurveArrayPropertyType_Owns()
	{
        return (EAttribute)getCurveArrayPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurvePropertyType()
	{
		if (curvePropertyTypeEClass == null)
		{
			curvePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(115);
		}
		return curvePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurvePropertyType_AbstractCurveGroup()
	{
        return (EAttribute)getCurvePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurvePropertyType_AbstractCurve()
	{
        return (EReference)getCurvePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurvePropertyType_Actuate()
	{
        return (EAttribute)getCurvePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurvePropertyType_Arcrole()
	{
        return (EAttribute)getCurvePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurvePropertyType_Href()
	{
        return (EAttribute)getCurvePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurvePropertyType_NilReason()
	{
        return (EAttribute)getCurvePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurvePropertyType_Owns()
	{
        return (EAttribute)getCurvePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurvePropertyType_RemoteSchema()
	{
        return (EAttribute)getCurvePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurvePropertyType_Role()
	{
        return (EAttribute)getCurvePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurvePropertyType_Show()
	{
        return (EAttribute)getCurvePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurvePropertyType_Title()
	{
        return (EAttribute)getCurvePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurvePropertyType_Type()
	{
        return (EAttribute)getCurvePropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurveSegmentArrayPropertyType()
	{
		if (curveSegmentArrayPropertyTypeEClass == null)
		{
			curveSegmentArrayPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(116);
		}
		return curveSegmentArrayPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurveSegmentArrayPropertyType_Group()
	{
        return (EAttribute)getCurveSegmentArrayPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurveSegmentArrayPropertyType_AbstractCurveSegmentGroup()
	{
        return (EAttribute)getCurveSegmentArrayPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurveSegmentArrayPropertyType_AbstractCurveSegment()
	{
        return (EReference)getCurveSegmentArrayPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurveType()
	{
		if (curveTypeEClass == null)
		{
			curveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(117);
		}
		return curveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurveType_Segments()
	{
        return (EReference)getCurveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylinderType()
	{
		if (cylinderTypeEClass == null)
		{
			cylinderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(118);
		}
		return cylinderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinderType_HorizontalCurveType()
	{
        return (EAttribute)getCylinderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinderType_VerticalCurveType()
	{
        return (EAttribute)getCylinderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylindricalCSPropertyType()
	{
		if (cylindricalCSPropertyTypeEClass == null)
		{
			cylindricalCSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(119);
		}
		return cylindricalCSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCylindricalCSPropertyType_CylindricalCS()
	{
        return (EReference)getCylindricalCSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylindricalCSPropertyType_Actuate()
	{
        return (EAttribute)getCylindricalCSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylindricalCSPropertyType_Arcrole()
	{
        return (EAttribute)getCylindricalCSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylindricalCSPropertyType_Href()
	{
        return (EAttribute)getCylindricalCSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylindricalCSPropertyType_NilReason()
	{
        return (EAttribute)getCylindricalCSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylindricalCSPropertyType_RemoteSchema()
	{
        return (EAttribute)getCylindricalCSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylindricalCSPropertyType_Role()
	{
        return (EAttribute)getCylindricalCSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylindricalCSPropertyType_Show()
	{
        return (EAttribute)getCylindricalCSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylindricalCSPropertyType_Title()
	{
        return (EAttribute)getCylindricalCSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylindricalCSPropertyType_Type()
	{
        return (EAttribute)getCylindricalCSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylindricalCSType()
	{
		if (cylindricalCSTypeEClass == null)
		{
			cylindricalCSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(120);
		}
		return cylindricalCSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBlockType()
	{
		if (dataBlockTypeEClass == null)
		{
			dataBlockTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(121);
		}
		return dataBlockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBlockType_RangeParameters()
	{
        return (EReference)getDataBlockType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBlockType_TupleList()
	{
        return (EReference)getDataBlockType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBlockType_DoubleOrNilReasonTupleList()
	{
        return (EAttribute)getDataBlockType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatumPropertyType()
	{
		if (datumPropertyTypeEClass == null)
		{
			datumPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(122);
		}
		return datumPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatumPropertyType_AbstractDatumGroup()
	{
        return (EAttribute)getDatumPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatumPropertyType_AbstractDatum()
	{
        return (EReference)getDatumPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatumPropertyType_Actuate()
	{
        return (EAttribute)getDatumPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatumPropertyType_Arcrole()
	{
        return (EAttribute)getDatumPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatumPropertyType_Href()
	{
        return (EAttribute)getDatumPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatumPropertyType_NilReason()
	{
        return (EAttribute)getDatumPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatumPropertyType_RemoteSchema()
	{
        return (EAttribute)getDatumPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatumPropertyType_Role()
	{
        return (EAttribute)getDatumPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatumPropertyType_Show()
	{
        return (EAttribute)getDatumPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatumPropertyType_Title()
	{
        return (EAttribute)getDatumPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatumPropertyType_Type()
	{
        return (EAttribute)getDatumPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionBaseType()
	{
		if (definitionBaseTypeEClass == null)
		{
			definitionBaseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(124);
		}
		return definitionBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionProxyType()
	{
		if (definitionProxyTypeEClass == null)
		{
			definitionProxyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(125);
		}
		return definitionProxyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionProxyType_DefinitionRef()
	{
        return (EReference)getDefinitionProxyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionType()
	{
		if (definitionTypeEClass == null)
		{
			definitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(126);
		}
		return definitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitionType_Remarks()
	{
        return (EAttribute)getDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDegreesType()
	{
		if (degreesTypeEClass == null)
		{
			degreesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(127);
		}
		return degreesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegreesType_Value()
	{
        return (EAttribute)getDegreesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDegreesType_Direction()
	{
        return (EAttribute)getDegreesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivationUnitTermType()
	{
		if (derivationUnitTermTypeEClass == null)
		{
			derivationUnitTermTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(129);
		}
		return derivationUnitTermTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivationUnitTermType_Exponent()
	{
        return (EAttribute)getDerivationUnitTermType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedCRSPropertyType()
	{
		if (derivedCRSPropertyTypeEClass == null)
		{
			derivedCRSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(130);
		}
		return derivedCRSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedCRSPropertyType_DerivedCRS()
	{
        return (EReference)getDerivedCRSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedCRSPropertyType_Actuate()
	{
        return (EAttribute)getDerivedCRSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedCRSPropertyType_Arcrole()
	{
        return (EAttribute)getDerivedCRSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedCRSPropertyType_Href()
	{
        return (EAttribute)getDerivedCRSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedCRSPropertyType_NilReason()
	{
        return (EAttribute)getDerivedCRSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedCRSPropertyType_RemoteSchema()
	{
        return (EAttribute)getDerivedCRSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedCRSPropertyType_Role()
	{
        return (EAttribute)getDerivedCRSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedCRSPropertyType_Show()
	{
        return (EAttribute)getDerivedCRSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedCRSPropertyType_Title()
	{
        return (EAttribute)getDerivedCRSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedCRSPropertyType_Type()
	{
        return (EAttribute)getDerivedCRSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedCRSType()
	{
		if (derivedCRSTypeEClass == null)
		{
			derivedCRSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(131);
		}
		return derivedCRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedCRSType_BaseCRS()
	{
        return (EReference)getDerivedCRSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedCRSType_DerivedCRSType()
	{
        return (EReference)getDerivedCRSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedCRSType_CoordinateSystemGroup()
	{
        return (EAttribute)getDerivedCRSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedCRSType_CoordinateSystem()
	{
        return (EReference)getDerivedCRSType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedUnitType()
	{
		if (derivedUnitTypeEClass == null)
		{
			derivedUnitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(132);
		}
		return derivedUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedUnitType_DerivationUnitTerm()
	{
        return (EReference)getDerivedUnitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictionaryEntryType()
	{
		if (dictionaryEntryTypeEClass == null)
		{
			dictionaryEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(133);
		}
		return dictionaryEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryEntryType_DefinitionGroup()
	{
        return (EAttribute)getDictionaryEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictionaryEntryType_Definition()
	{
        return (EReference)getDictionaryEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryEntryType_Actuate()
	{
        return (EAttribute)getDictionaryEntryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryEntryType_Arcrole()
	{
        return (EAttribute)getDictionaryEntryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryEntryType_Href()
	{
        return (EAttribute)getDictionaryEntryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryEntryType_NilReason()
	{
        return (EAttribute)getDictionaryEntryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryEntryType_RemoteSchema()
	{
        return (EAttribute)getDictionaryEntryType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryEntryType_Role()
	{
        return (EAttribute)getDictionaryEntryType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryEntryType_Show()
	{
        return (EAttribute)getDictionaryEntryType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryEntryType_Title()
	{
        return (EAttribute)getDictionaryEntryType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryEntryType_Type()
	{
        return (EAttribute)getDictionaryEntryType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictionaryType()
	{
		if (dictionaryTypeEClass == null)
		{
			dictionaryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(134);
		}
		return dictionaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryType_Group()
	{
        return (EAttribute)getDictionaryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryType_DictionaryEntryGroup()
	{
        return (EAttribute)getDictionaryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictionaryType_DictionaryEntry()
	{
        return (EReference)getDictionaryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictionaryType_IndirectEntry()
	{
        return (EReference)getDictionaryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionaryType_AggregationType()
	{
        return (EAttribute)getDictionaryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedEdgePropertyType()
	{
		if (directedEdgePropertyTypeEClass == null)
		{
			directedEdgePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(135);
		}
		return directedEdgePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedEdgePropertyType_Edge()
	{
        return (EReference)getDirectedEdgePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedEdgePropertyType_Actuate()
	{
        return (EAttribute)getDirectedEdgePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedEdgePropertyType_Arcrole()
	{
        return (EAttribute)getDirectedEdgePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedEdgePropertyType_Href()
	{
        return (EAttribute)getDirectedEdgePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedEdgePropertyType_NilReason()
	{
        return (EAttribute)getDirectedEdgePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedEdgePropertyType_Orientation()
	{
        return (EAttribute)getDirectedEdgePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedEdgePropertyType_Owns()
	{
        return (EAttribute)getDirectedEdgePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedEdgePropertyType_RemoteSchema()
	{
        return (EAttribute)getDirectedEdgePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedEdgePropertyType_Role()
	{
        return (EAttribute)getDirectedEdgePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedEdgePropertyType_Show()
	{
        return (EAttribute)getDirectedEdgePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedEdgePropertyType_Title()
	{
        return (EAttribute)getDirectedEdgePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedEdgePropertyType_Type()
	{
        return (EAttribute)getDirectedEdgePropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedFacePropertyType()
	{
		if (directedFacePropertyTypeEClass == null)
		{
			directedFacePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(136);
		}
		return directedFacePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedFacePropertyType_Face()
	{
        return (EReference)getDirectedFacePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFacePropertyType_Actuate()
	{
        return (EAttribute)getDirectedFacePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFacePropertyType_Arcrole()
	{
        return (EAttribute)getDirectedFacePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFacePropertyType_Href()
	{
        return (EAttribute)getDirectedFacePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFacePropertyType_NilReason()
	{
        return (EAttribute)getDirectedFacePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFacePropertyType_Orientation()
	{
        return (EAttribute)getDirectedFacePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFacePropertyType_Owns()
	{
        return (EAttribute)getDirectedFacePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFacePropertyType_RemoteSchema()
	{
        return (EAttribute)getDirectedFacePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFacePropertyType_Role()
	{
        return (EAttribute)getDirectedFacePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFacePropertyType_Show()
	{
        return (EAttribute)getDirectedFacePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFacePropertyType_Title()
	{
        return (EAttribute)getDirectedFacePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFacePropertyType_Type()
	{
        return (EAttribute)getDirectedFacePropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedNodePropertyType()
	{
		if (directedNodePropertyTypeEClass == null)
		{
			directedNodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(137);
		}
		return directedNodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedNodePropertyType_Node()
	{
        return (EReference)getDirectedNodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedNodePropertyType_Actuate()
	{
        return (EAttribute)getDirectedNodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedNodePropertyType_Arcrole()
	{
        return (EAttribute)getDirectedNodePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedNodePropertyType_Href()
	{
        return (EAttribute)getDirectedNodePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedNodePropertyType_NilReason()
	{
        return (EAttribute)getDirectedNodePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedNodePropertyType_Orientation()
	{
        return (EAttribute)getDirectedNodePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedNodePropertyType_Owns()
	{
        return (EAttribute)getDirectedNodePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedNodePropertyType_RemoteSchema()
	{
        return (EAttribute)getDirectedNodePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedNodePropertyType_Role()
	{
        return (EAttribute)getDirectedNodePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedNodePropertyType_Show()
	{
        return (EAttribute)getDirectedNodePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedNodePropertyType_Title()
	{
        return (EAttribute)getDirectedNodePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedNodePropertyType_Type()
	{
        return (EAttribute)getDirectedNodePropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedObservationAtDistanceType()
	{
		if (directedObservationAtDistanceTypeEClass == null)
		{
			directedObservationAtDistanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(138);
		}
		return directedObservationAtDistanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedObservationAtDistanceType_Distance()
	{
        return (EReference)getDirectedObservationAtDistanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedObservationType()
	{
		if (directedObservationTypeEClass == null)
		{
			directedObservationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(139);
		}
		return directedObservationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedObservationType_Direction()
	{
        return (EReference)getDirectedObservationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedTopoSolidPropertyType()
	{
		if (directedTopoSolidPropertyTypeEClass == null)
		{
			directedTopoSolidPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(140);
		}
		return directedTopoSolidPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedTopoSolidPropertyType_TopoSolid()
	{
        return (EReference)getDirectedTopoSolidPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTopoSolidPropertyType_Actuate()
	{
        return (EAttribute)getDirectedTopoSolidPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTopoSolidPropertyType_Arcrole()
	{
        return (EAttribute)getDirectedTopoSolidPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTopoSolidPropertyType_Href()
	{
        return (EAttribute)getDirectedTopoSolidPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTopoSolidPropertyType_NilReason()
	{
        return (EAttribute)getDirectedTopoSolidPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTopoSolidPropertyType_Orientation()
	{
        return (EAttribute)getDirectedTopoSolidPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTopoSolidPropertyType_Owns()
	{
        return (EAttribute)getDirectedTopoSolidPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTopoSolidPropertyType_RemoteSchema()
	{
        return (EAttribute)getDirectedTopoSolidPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTopoSolidPropertyType_Role()
	{
        return (EAttribute)getDirectedTopoSolidPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTopoSolidPropertyType_Show()
	{
        return (EAttribute)getDirectedTopoSolidPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTopoSolidPropertyType_Title()
	{
        return (EAttribute)getDirectedTopoSolidPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedTopoSolidPropertyType_Type()
	{
        return (EAttribute)getDirectedTopoSolidPropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectionDescriptionType()
	{
		if (directionDescriptionTypeEClass == null)
		{
			directionDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(141);
		}
		return directionDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionDescriptionType_CompassPoint()
	{
        return (EAttribute)getDirectionDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectionDescriptionType_Keyword()
	{
        return (EReference)getDirectionDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionDescriptionType_Description()
	{
        return (EAttribute)getDirectionDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectionDescriptionType_Reference()
	{
        return (EReference)getDirectionDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectionPropertyType()
	{
		if (directionPropertyTypeEClass == null)
		{
			directionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(142);
		}
		return directionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectionPropertyType_DirectionVector()
	{
        return (EReference)getDirectionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectionPropertyType_DirectionDescription()
	{
        return (EReference)getDirectionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionPropertyType_CompassPoint()
	{
        return (EAttribute)getDirectionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectionPropertyType_DirectionKeyword()
	{
        return (EReference)getDirectionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectionPropertyType_DirectionString()
	{
        return (EReference)getDirectionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionPropertyType_Actuate()
	{
        return (EAttribute)getDirectionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionPropertyType_Arcrole()
	{
        return (EAttribute)getDirectionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionPropertyType_Href()
	{
        return (EAttribute)getDirectionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionPropertyType_NilReason()
	{
        return (EAttribute)getDirectionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionPropertyType_Owns()
	{
        return (EAttribute)getDirectionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionPropertyType_RemoteSchema()
	{
        return (EAttribute)getDirectionPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionPropertyType_Role()
	{
        return (EAttribute)getDirectionPropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionPropertyType_Show()
	{
        return (EAttribute)getDirectionPropertyType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionPropertyType_Title()
	{
        return (EAttribute)getDirectionPropertyType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionPropertyType_Type()
	{
        return (EAttribute)getDirectionPropertyType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectionVectorType()
	{
		if (directionVectorTypeEClass == null)
		{
			directionVectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(145);
		}
		return directionVectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectionVectorType_Vector()
	{
        return (EReference)getDirectionVectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectionVectorType_HorizontalAngle()
	{
        return (EReference)getDirectionVectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectionVectorType_VerticalAngle()
	{
        return (EReference)getDirectionVectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectPositionListType()
	{
		if (directPositionListTypeEClass == null)
		{
			directPositionListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(146);
		}
		return directPositionListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectPositionListType_Value()
	{
        return (EAttribute)getDirectPositionListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectPositionListType_AxisLabels()
	{
        return (EAttribute)getDirectPositionListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectPositionListType_Count()
	{
        return (EAttribute)getDirectPositionListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectPositionListType_SrsDimension()
	{
        return (EAttribute)getDirectPositionListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectPositionListType_SrsName()
	{
        return (EAttribute)getDirectPositionListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectPositionListType_UomLabels()
	{
        return (EAttribute)getDirectPositionListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectPositionType()
	{
		if (directPositionTypeEClass == null)
		{
			directPositionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(147);
		}
		return directPositionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectPositionType_Value()
	{
        return (EAttribute)getDirectPositionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectPositionType_AxisLabels()
	{
        return (EAttribute)getDirectPositionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectPositionType_SrsDimension()
	{
        return (EAttribute)getDirectPositionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectPositionType_SrsName()
	{
        return (EAttribute)getDirectPositionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectPositionType_UomLabels()
	{
        return (EAttribute)getDirectPositionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteCoverageType()
	{
		if (discreteCoverageTypeEClass == null)
		{
			discreteCoverageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(148);
		}
		return discreteCoverageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteCoverageType_CoverageFunction()
	{
        return (EReference)getDiscreteCoverageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMSAngleType()
	{
		if (dmsAngleTypeEClass == null)
		{
			dmsAngleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(149);
		}
		return dmsAngleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMSAngleType_Degrees()
	{
        return (EReference)getDMSAngleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMSAngleType_DecimalMinutes()
	{
        return (EAttribute)getDMSAngleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMSAngleType_Minutes()
	{
        return (EAttribute)getDMSAngleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMSAngleType_Seconds()
	{
        return (EAttribute)getDMSAngleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot()
	{
		if (documentRootEClass == null)
		{
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(150);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractAssociationRole()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractContinuousCoverage()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractFeature()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGML()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractObject()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractCoordinateOperation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Definition()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractCoordinateSystem()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractCoverage()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractCurve()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGeometricPrimitive()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGeometry()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractCurveSegment()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractDatum()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractDiscreteCoverage()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractFeatureCollection()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGeneralConversion()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractOperation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractSingleOperation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGeneralDerivedCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractSingleCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGeneralOperationParameter()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGeneralOperationParameterRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGeneralParameterValue()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGeneralTransformation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGeometricAggregate()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGriddedSurface()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractParametricCurveSurface()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractSurfacePatch()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractImplicitGeometry()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractInlineProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractMetaData()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractReference()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractRing()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractScalarValue()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractValue()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractScalarValueList()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractSolid()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractStrictAssociationRole()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractSurface()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTimeComplex()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTimeObject()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTimeGeometricPrimitive()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTimePrimitive()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTimeSlice()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTimeTopologyPrimitive()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTopology()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTopoPrimitive()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AffineCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AffineCS1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AffinePlacement()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AnchorDefinition()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AnchorPoint()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Angle()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Arc()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ArcString()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ArcByBulge()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ArcStringByBulge()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ArcByCenterPoint()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Array()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AssociationName()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Axis()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AxisAbbrev()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AxisDirection()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bag()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BaseCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BaseCurve()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BaseGeodeticCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BaseGeographicCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BaseSurface()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BaseUnit()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UnitDefinition()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bezier()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BSpline()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Boolean()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BooleanList()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BooleanValue()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BoundedBy()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CartesianCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CartesianCS1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CartesianCSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CatalogSymbol()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Category()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CategoryExtent()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CategoryList()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CenterLineOf()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CenterOf()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Circle()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CircleByCenterPoint()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Clothoid()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ComponentReferenceSystem()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CompositeCurve()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CompositeSolid()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CompositeSurface()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CompositeValue()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CompoundCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CompoundCRSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConcatenatedOperation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConcatenatedOperationRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Cone()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConventionalUnit()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Conversion()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Conversion1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConversionRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConversionToPreferredUnit()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CoordinateOperationAccuracy()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CoordinateOperationRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Coordinates()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CoordinateSystem()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CoordinateSystemAxis()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CoordinateSystemAxisRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CoordinateSystemRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CoordOperation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Count()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CountExtent()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CountList()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CoverageFunction()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CoverageMappingRule()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CrsRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CubicSpline()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Curve()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CurveArrayProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CurveMember()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CurveMembers()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CurveProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Cylinder()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CylindricalCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CylindricalCS1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CylindricalCSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataBlock()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataSource()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataSourceReference()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DatumRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DecimalMinutes()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DefaultCodeSpace()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DefinitionCollection()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DefinitionMember()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DictionaryEntry()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DefinitionProxy()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DefinitionRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Degrees()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DerivationUnitTerm()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DerivedCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DerivedCRSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DerivedCRSType()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DerivedUnit()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Description()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DescriptionReference()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Dictionary()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DirectedEdge()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DirectedFace()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DirectedNode()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DirectedObservation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Observation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DirectedObservationAtDistance()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DirectedTopoSolid()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Direction()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DmsAngle()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DmsAngleValue()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DomainOfValidity()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DomainSet()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DoubleOrNilReasonTupleList()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Duration()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DynamicFeature()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DynamicFeatureCollection()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DynamicMembers()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Edge()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EdgeOf()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ellipsoid()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ellipsoid1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EllipsoidalCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EllipsoidalCS1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EllipsoidalCSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EllipsoidRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EngineeringCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EngineeringCRSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EngineeringDatum()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EngineeringDatum1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EngineeringDatumRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Envelope()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EnvelopeWithTimePeriod()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExtentOf()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Exterior()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Face()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FeatureCollection()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FeatureMember()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FeatureMembers()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FeatureProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_File()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Formula()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FormulaCitation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeneralConversionRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeneralTransformationRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericMetaData()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeocentricCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(198);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeocentricCRSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(199);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Geodesic()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(200);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeodesicString()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeodeticCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeodeticDatum()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeodeticDatum1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeodeticDatumRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeographicCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeographicCRSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(207);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeometricComplex()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(208);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeometryMember()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(209);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeometryMembers()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(210);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GmlProfileSchema()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(211);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GreenwichLongitude()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(212);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Grid()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(213);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GridCoverage()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(214);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GridDomain()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(215);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GridFunction()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(216);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Group()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(217);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_History()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(218);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Identifier()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(219);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImageCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(220);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImageCRSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(221);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImageDatum()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(222);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImageDatum1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(223);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImageDatumRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(224);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IncludesSingleCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(225);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndirectEntry()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(226);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IntegerValue()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(227);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IntegerValueList()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(228);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Interior()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(229);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LinearCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(230);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LinearCS1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(231);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LinearCSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(232);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LinearRing()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(233);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LineString()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(234);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LineStringSegment()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(235);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Location()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(236);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationKeyWord()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(237);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationName()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(238);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationReference()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(239);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocationString()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(240);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MappingRule()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(241);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MaximalComplex()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(242);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MaximumOccurs()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(243);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MaximumValue()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(244);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Measure()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(245);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Member()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(246);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Members()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(247);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MetaDataProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(248);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Method()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(249);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MethodFormula()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(250);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MinimumOccurs()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(251);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MinimumValue()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(252);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Minutes()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(253);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ModifiedCoordinate()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(254);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MovingObjectStatus()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(255);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiCenterLineOf()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiCenterOf()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(257);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiCoverage()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(258);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiCurve()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(259);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiCurveCoverage()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(260);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiCurveDomain()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(261);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiCurveProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(262);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiEdgeOf()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(263);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiExtentOf()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(264);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiGeometry()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(265);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiGeometryProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(266);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiLocation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(267);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiPoint()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(268);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiPointCoverage()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(269);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiPointDomain()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(270);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiPointProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(271);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiPosition()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(272);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiSolid()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(273);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiSolidCoverage()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(274);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiSolidDomain()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(275);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiSolidProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(276);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiSurface()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(277);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiSurfaceCoverage()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(278);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiSurfaceDomain()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(279);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiSurfaceProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(280);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Name()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(281);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Node()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(282);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Null()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(283);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObliqueCartesianCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(284);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObliqueCartesianCSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(285);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OffsetCurve()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(286);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OperationMethod()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(287);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OperationMethodRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(288);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OperationParameter()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(289);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OperationParameter1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(290);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OperationParameterGroup()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(291);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OperationParameterGroupRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(292);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OperationParameterRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(293);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OperationRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(294);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OperationVersion()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(295);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrientableCurve()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(296);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrientableSurface()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(297);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Origin()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(298);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Parameter()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(299);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ParameterValue()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(300);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ParameterValue1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(301);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ParameterValueGroup()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(302);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassThroughOperation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(303);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassThroughOperationRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(304);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Patches()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(305);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PixelInCell()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(306);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Point()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(307);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PointArrayProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(308);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PointMember()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(309);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PointMembers()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(310);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PointProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(311);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PointRep()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(312);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolarCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(313);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolarCS1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(314);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolarCSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(315);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Polygon()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(316);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolygonPatch()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(317);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolygonPatches()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(318);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolyhedralSurface()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(319);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Surface()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(320);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Pos()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(321);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Position()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(322);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PosList()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(323);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PrimeMeridian()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(324);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PrimeMeridian1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(325);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PrimeMeridianRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(326);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PriorityLocation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(327);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProjectedCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(328);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProjectedCRSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(329);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Quantity()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(330);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QuantityExtent()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(331);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QuantityList()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(332);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QuantityType()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(333);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QuantityTypeReference()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(334);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RangeMeaning()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(335);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RangeParameters()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(336);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RangeSet()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(337);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RealizationEpoch()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(338);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rectangle()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(339);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RectifiedGrid()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(340);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RectifiedGridCoverage()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(341);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RectifiedGridDomain()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(342);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceSystemRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(343);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Remarks()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(344);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ResultOf()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(345);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ReversePropertyName()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(346);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ring()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(347);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RoughConversionToPreferredUnit()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(348);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Scope()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(349);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecondDefiningParameter()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(350);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecondDefiningParameter1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(351);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Seconds()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(352);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Segments()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(353);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SemiMajorAxis()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(354);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Shell()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(355);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SingleCRSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(356);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SingleOperationRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(357);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Solid()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(358);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SolidArrayProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(359);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SolidMember()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(360);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SolidMembers()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(361);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SolidProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(362);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SourceCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(363);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SourceDimensions()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(364);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sphere()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(365);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SphericalCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(366);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SphericalCS1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(367);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SphericalCSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(368);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Status()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(369);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusReference()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(370);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StringValue()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(371);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubComplex()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(372);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Subject()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(373);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Target()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(374);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SuperComplex()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(375);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SurfaceArrayProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(376);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SurfaceMember()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(377);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SurfaceMembers()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(378);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SurfaceProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(379);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TargetCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(380);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TargetDimensions()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(381);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TargetElement()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(382);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TemporalCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(383);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TemporalCRSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(384);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TemporalCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(385);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TemporalCSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(386);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TemporalDatum()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(387);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TemporalDatum1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(388);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TemporalDatumRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(389);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeCalendar()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(390);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeReferenceSystem()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(391);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeCalendarEra()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(392);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeClock()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(393);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeCoordinateSystem()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(394);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(395);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeCS1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(396);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeEdge()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(397);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeInstant()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(398);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeInterval()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(399);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeNode()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(400);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeOrdinalEra()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(401);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeOrdinalReferenceSystem()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(402);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimePeriod()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(403);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimePosition()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(404);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeTopologyComplex()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(405);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tin()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(406);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TriangulatedSurface()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(407);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoComplex()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(408);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoComplexProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(409);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoCurve()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(410);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoCurveProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(411);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoPoint()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(412);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoPointProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(413);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoPrimitiveMember()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(414);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoPrimitiveMembers()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(415);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoSolid()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(416);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoSurface()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(417);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoSurfaceProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(418);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoVolume()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(419);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TopoVolumeProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(420);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Track()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(421);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transformation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(422);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformationRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(423);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Triangle()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(424);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TrianglePatches()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(425);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TupleList()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(426);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UnitOfMeasure()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(427);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserDefinedCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(428);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserDefinedCS1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(429);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserDefinedCSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(430);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesAffineCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(431);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesAxis()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(432);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesCartesianCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(433);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(434);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesEllipsoid()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(435);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesEllipsoidalCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(436);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesEngineeringDatum()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(437);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesGeodeticDatum()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(438);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesImageDatum()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(439);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesMethod()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(440);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesObliqueCartesianCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(441);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesOperation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(442);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesPrimeMeridian()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(443);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesSingleOperation()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(444);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesSphericalCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(445);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesTemporalCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(446);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesTemporalDatum()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(447);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesTimeCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(448);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesVerticalCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(449);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VerticalCS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(450);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UsesVerticalDatum()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(451);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VerticalDatum()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(452);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Using()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(453);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValidTime()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(454);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Value()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(455);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueArray()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(456);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueComponent()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(457);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueComponents()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(458);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ValueFile()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(459);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueList()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(460);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueOfParameter()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(461);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueProperty()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(462);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValuesOfGroup()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(463);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Vector()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(464);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VerticalCRS()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(465);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VerticalCRSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(466);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VerticalCS1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(467);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VerticalCSRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(468);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VerticalDatum1()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(469);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VerticalDatumRef()
	{
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(470);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Id()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(471);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RemoteSchema()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(472);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Uom()
	{
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(473);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainOfValidityType()
	{
		if (domainOfValidityTypeEClass == null)
		{
			domainOfValidityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(151);
		}
		return domainOfValidityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainOfValidityType_EXExtent()
	{
        return (EReference)getDomainOfValidityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainOfValidityType_Actuate()
	{
        return (EAttribute)getDomainOfValidityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainOfValidityType_Arcrole()
	{
        return (EAttribute)getDomainOfValidityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainOfValidityType_Href()
	{
        return (EAttribute)getDomainOfValidityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainOfValidityType_NilReason()
	{
        return (EAttribute)getDomainOfValidityType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainOfValidityType_RemoteSchema()
	{
        return (EAttribute)getDomainOfValidityType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainOfValidityType_Role()
	{
        return (EAttribute)getDomainOfValidityType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainOfValidityType_Show()
	{
        return (EAttribute)getDomainOfValidityType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainOfValidityType_Title()
	{
        return (EAttribute)getDomainOfValidityType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainOfValidityType_Type()
	{
        return (EAttribute)getDomainOfValidityType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSetType()
	{
		if (domainSetTypeEClass == null)
		{
			domainSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(152);
		}
		return domainSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSetType_AbstractGeometryGroup()
	{
        return (EAttribute)getDomainSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSetType_AbstractGeometry()
	{
        return (EReference)getDomainSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSetType_AbstractTimeObjectGroup()
	{
        return (EAttribute)getDomainSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSetType_AbstractTimeObject()
	{
        return (EReference)getDomainSetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSetType_Actuate()
	{
        return (EAttribute)getDomainSetType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSetType_Arcrole()
	{
        return (EAttribute)getDomainSetType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSetType_Href()
	{
        return (EAttribute)getDomainSetType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSetType_NilReason()
	{
        return (EAttribute)getDomainSetType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSetType_Owns()
	{
        return (EAttribute)getDomainSetType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSetType_RemoteSchema()
	{
        return (EAttribute)getDomainSetType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSetType_Role()
	{
        return (EAttribute)getDomainSetType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSetType_Show()
	{
        return (EAttribute)getDomainSetType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSetType_Title()
	{
        return (EAttribute)getDomainSetType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSetType_Type()
	{
        return (EAttribute)getDomainSetType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicFeatureCollectionType()
	{
		if (dynamicFeatureCollectionTypeEClass == null)
		{
			dynamicFeatureCollectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(156);
		}
		return dynamicFeatureCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicFeatureCollectionType_DynamicMembers()
	{
        return (EReference)getDynamicFeatureCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicFeatureMemberType()
	{
		if (dynamicFeatureMemberTypeEClass == null)
		{
			dynamicFeatureMemberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(157);
		}
		return dynamicFeatureMemberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFeatureMemberType_DynamicFeatureGroup()
	{
        return (EAttribute)getDynamicFeatureMemberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicFeatureMemberType_DynamicFeature()
	{
        return (EReference)getDynamicFeatureMemberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFeatureMemberType_Actuate()
	{
        return (EAttribute)getDynamicFeatureMemberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFeatureMemberType_Arcrole()
	{
        return (EAttribute)getDynamicFeatureMemberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFeatureMemberType_Href()
	{
        return (EAttribute)getDynamicFeatureMemberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFeatureMemberType_NilReason()
	{
        return (EAttribute)getDynamicFeatureMemberType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFeatureMemberType_RemoteSchema()
	{
        return (EAttribute)getDynamicFeatureMemberType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFeatureMemberType_Role()
	{
        return (EAttribute)getDynamicFeatureMemberType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFeatureMemberType_Show()
	{
        return (EAttribute)getDynamicFeatureMemberType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFeatureMemberType_Title()
	{
        return (EAttribute)getDynamicFeatureMemberType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFeatureMemberType_Type()
	{
        return (EAttribute)getDynamicFeatureMemberType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicFeatureType()
	{
		if (dynamicFeatureTypeEClass == null)
		{
			dynamicFeatureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(158);
		}
		return dynamicFeatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicFeatureType_ValidTime()
	{
        return (EReference)getDynamicFeatureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFeatureType_HistoryGroup()
	{
        return (EAttribute)getDynamicFeatureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicFeatureType_History()
	{
        return (EReference)getDynamicFeatureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicFeatureType_DataSource()
	{
        return (EReference)getDynamicFeatureType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicFeatureType_DataSourceReference()
	{
        return (EReference)getDynamicFeatureType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeType()
	{
		if (edgeTypeEClass == null)
		{
			edgeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(159);
		}
		return edgeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeType_Container()
	{
        return (EReference)getEdgeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeType_DirectedNode()
	{
        return (EReference)getEdgeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeType_DirectedFace()
	{
        return (EReference)getEdgeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeType_CurveProperty()
	{
        return (EReference)getEdgeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeType_AggregationType()
	{
        return (EAttribute)getEdgeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipsoidalCSPropertyType()
	{
		if (ellipsoidalCSPropertyTypeEClass == null)
		{
			ellipsoidalCSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(160);
		}
		return ellipsoidalCSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsoidalCSPropertyType_EllipsoidalCS()
	{
        return (EReference)getEllipsoidalCSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidalCSPropertyType_Actuate()
	{
        return (EAttribute)getEllipsoidalCSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidalCSPropertyType_Arcrole()
	{
        return (EAttribute)getEllipsoidalCSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidalCSPropertyType_Href()
	{
        return (EAttribute)getEllipsoidalCSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidalCSPropertyType_NilReason()
	{
        return (EAttribute)getEllipsoidalCSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidalCSPropertyType_RemoteSchema()
	{
        return (EAttribute)getEllipsoidalCSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidalCSPropertyType_Role()
	{
        return (EAttribute)getEllipsoidalCSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidalCSPropertyType_Show()
	{
        return (EAttribute)getEllipsoidalCSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidalCSPropertyType_Title()
	{
        return (EAttribute)getEllipsoidalCSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidalCSPropertyType_Type()
	{
        return (EAttribute)getEllipsoidalCSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipsoidalCSType()
	{
		if (ellipsoidalCSTypeEClass == null)
		{
			ellipsoidalCSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(161);
		}
		return ellipsoidalCSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipsoidPropertyType()
	{
		if (ellipsoidPropertyTypeEClass == null)
		{
			ellipsoidPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(162);
		}
		return ellipsoidPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsoidPropertyType_Ellipsoid()
	{
        return (EReference)getEllipsoidPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidPropertyType_Actuate()
	{
        return (EAttribute)getEllipsoidPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidPropertyType_Arcrole()
	{
        return (EAttribute)getEllipsoidPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidPropertyType_Href()
	{
        return (EAttribute)getEllipsoidPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidPropertyType_NilReason()
	{
        return (EAttribute)getEllipsoidPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidPropertyType_RemoteSchema()
	{
        return (EAttribute)getEllipsoidPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidPropertyType_Role()
	{
        return (EAttribute)getEllipsoidPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidPropertyType_Show()
	{
        return (EAttribute)getEllipsoidPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidPropertyType_Title()
	{
        return (EAttribute)getEllipsoidPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipsoidPropertyType_Type()
	{
        return (EAttribute)getEllipsoidPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipsoidType()
	{
		if (ellipsoidTypeEClass == null)
		{
			ellipsoidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(163);
		}
		return ellipsoidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsoidType_SemiMajorAxis()
	{
        return (EReference)getEllipsoidType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipsoidType_SecondDefiningParameter()
	{
        return (EReference)getEllipsoidType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineeringCRSPropertyType()
	{
		if (engineeringCRSPropertyTypeEClass == null)
		{
			engineeringCRSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(164);
		}
		return engineeringCRSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringCRSPropertyType_EngineeringCRS()
	{
        return (EReference)getEngineeringCRSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSPropertyType_Actuate()
	{
        return (EAttribute)getEngineeringCRSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSPropertyType_Arcrole()
	{
        return (EAttribute)getEngineeringCRSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSPropertyType_Href()
	{
        return (EAttribute)getEngineeringCRSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSPropertyType_NilReason()
	{
        return (EAttribute)getEngineeringCRSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSPropertyType_RemoteSchema()
	{
        return (EAttribute)getEngineeringCRSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSPropertyType_Role()
	{
        return (EAttribute)getEngineeringCRSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSPropertyType_Show()
	{
        return (EAttribute)getEngineeringCRSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSPropertyType_Title()
	{
        return (EAttribute)getEngineeringCRSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSPropertyType_Type()
	{
        return (EAttribute)getEngineeringCRSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineeringCRSType()
	{
		if (engineeringCRSTypeEClass == null)
		{
			engineeringCRSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(165);
		}
		return engineeringCRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSType_AffineCSGroup()
	{
        return (EAttribute)getEngineeringCRSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringCRSType_AffineCS()
	{
        return (EReference)getEngineeringCRSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSType_CartesianCSGroup()
	{
        return (EAttribute)getEngineeringCRSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringCRSType_CartesianCS()
	{
        return (EReference)getEngineeringCRSType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringCRSType_CylindricalCS()
	{
        return (EReference)getEngineeringCRSType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringCRSType_LinearCS()
	{
        return (EReference)getEngineeringCRSType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringCRSType_PolarCS()
	{
        return (EReference)getEngineeringCRSType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSType_SphericalCSGroup()
	{
        return (EAttribute)getEngineeringCRSType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringCRSType_SphericalCS()
	{
        return (EReference)getEngineeringCRSType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringCRSType_UserDefinedCS()
	{
        return (EReference)getEngineeringCRSType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSType_CoordinateSystemGroup()
	{
        return (EAttribute)getEngineeringCRSType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringCRSType_CoordinateSystem()
	{
        return (EReference)getEngineeringCRSType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringCRSType_EngineeringDatumGroup()
	{
        return (EAttribute)getEngineeringCRSType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringCRSType_EngineeringDatum()
	{
        return (EReference)getEngineeringCRSType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineeringDatumPropertyType()
	{
		if (engineeringDatumPropertyTypeEClass == null)
		{
			engineeringDatumPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(166);
		}
		return engineeringDatumPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringDatumPropertyType_EngineeringDatum()
	{
        return (EReference)getEngineeringDatumPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringDatumPropertyType_Actuate()
	{
        return (EAttribute)getEngineeringDatumPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringDatumPropertyType_Arcrole()
	{
        return (EAttribute)getEngineeringDatumPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringDatumPropertyType_Href()
	{
        return (EAttribute)getEngineeringDatumPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringDatumPropertyType_NilReason()
	{
        return (EAttribute)getEngineeringDatumPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringDatumPropertyType_RemoteSchema()
	{
        return (EAttribute)getEngineeringDatumPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringDatumPropertyType_Role()
	{
        return (EAttribute)getEngineeringDatumPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringDatumPropertyType_Show()
	{
        return (EAttribute)getEngineeringDatumPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringDatumPropertyType_Title()
	{
        return (EAttribute)getEngineeringDatumPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringDatumPropertyType_Type()
	{
        return (EAttribute)getEngineeringDatumPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineeringDatumType()
	{
		if (engineeringDatumTypeEClass == null)
		{
			engineeringDatumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(167);
		}
		return engineeringDatumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvelopeType()
	{
		if (envelopeTypeEClass == null)
		{
			envelopeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(168);
		}
		return envelopeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvelopeType_LowerCorner()
	{
        return (EReference)getEnvelopeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvelopeType_UpperCorner()
	{
        return (EReference)getEnvelopeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvelopeType_Pos()
	{
        return (EReference)getEnvelopeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvelopeType_Coordinates()
	{
        return (EReference)getEnvelopeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvelopeType_AxisLabels()
	{
        return (EAttribute)getEnvelopeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvelopeType_SrsDimension()
	{
        return (EAttribute)getEnvelopeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvelopeType_SrsName()
	{
        return (EAttribute)getEnvelopeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvelopeType_UomLabels()
	{
        return (EAttribute)getEnvelopeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvelopeWithTimePeriodType()
	{
		if (envelopeWithTimePeriodTypeEClass == null)
		{
			envelopeWithTimePeriodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(169);
		}
		return envelopeWithTimePeriodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvelopeWithTimePeriodType_BeginPosition()
	{
        return (EReference)getEnvelopeWithTimePeriodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvelopeWithTimePeriodType_EndPosition()
	{
        return (EReference)getEnvelopeWithTimePeriodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvelopeWithTimePeriodType_Frame()
	{
        return (EAttribute)getEnvelopeWithTimePeriodType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaceOrTopoSolidPropertyType()
	{
		if (faceOrTopoSolidPropertyTypeEClass == null)
		{
			faceOrTopoSolidPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(170);
		}
		return faceOrTopoSolidPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaceOrTopoSolidPropertyType_Face()
	{
        return (EReference)getFaceOrTopoSolidPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaceOrTopoSolidPropertyType_TopoSolid()
	{
        return (EReference)getFaceOrTopoSolidPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceOrTopoSolidPropertyType_Actuate()
	{
        return (EAttribute)getFaceOrTopoSolidPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceOrTopoSolidPropertyType_Arcrole()
	{
        return (EAttribute)getFaceOrTopoSolidPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceOrTopoSolidPropertyType_Href()
	{
        return (EAttribute)getFaceOrTopoSolidPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceOrTopoSolidPropertyType_NilReason()
	{
        return (EAttribute)getFaceOrTopoSolidPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceOrTopoSolidPropertyType_Owns()
	{
        return (EAttribute)getFaceOrTopoSolidPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceOrTopoSolidPropertyType_RemoteSchema()
	{
        return (EAttribute)getFaceOrTopoSolidPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceOrTopoSolidPropertyType_Role()
	{
        return (EAttribute)getFaceOrTopoSolidPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceOrTopoSolidPropertyType_Show()
	{
        return (EAttribute)getFaceOrTopoSolidPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceOrTopoSolidPropertyType_Title()
	{
        return (EAttribute)getFaceOrTopoSolidPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceOrTopoSolidPropertyType_Type()
	{
        return (EAttribute)getFaceOrTopoSolidPropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaceType()
	{
		if (faceTypeEClass == null)
		{
			faceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(171);
		}
		return faceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaceType_Isolated()
	{
        return (EReference)getFaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaceType_DirectedEdge()
	{
        return (EReference)getFaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaceType_DirectedTopoSolid()
	{
        return (EReference)getFaceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaceType_SurfaceProperty()
	{
        return (EReference)getFaceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceType_AggregationType()
	{
        return (EAttribute)getFaceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaceType_Universal()
	{
        return (EAttribute)getFaceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureArrayPropertyType()
	{
		if (featureArrayPropertyTypeEClass == null)
		{
			featureArrayPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(172);
		}
		return featureArrayPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureArrayPropertyType_Group()
	{
        return (EAttribute)getFeatureArrayPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureArrayPropertyType_AbstractFeatureGroup()
	{
        return (EAttribute)getFeatureArrayPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureArrayPropertyType_AbstractFeature()
	{
        return (EReference)getFeatureArrayPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureCollectionType()
	{
		if (featureCollectionTypeEClass == null)
		{
			featureCollectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(173);
		}
		return featureCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturePropertyType()
	{
		if (featurePropertyTypeEClass == null)
		{
			featurePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(174);
		}
		return featurePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePropertyType_AbstractFeatureGroup()
	{
        return (EAttribute)getFeaturePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeaturePropertyType_AbstractFeature()
	{
        return (EReference)getFeaturePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePropertyType_Actuate()
	{
        return (EAttribute)getFeaturePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePropertyType_Arcrole()
	{
        return (EAttribute)getFeaturePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePropertyType_Href()
	{
        return (EAttribute)getFeaturePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePropertyType_NilReason()
	{
        return (EAttribute)getFeaturePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePropertyType_Owns()
	{
        return (EAttribute)getFeaturePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePropertyType_RemoteSchema()
	{
        return (EAttribute)getFeaturePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePropertyType_Role()
	{
        return (EAttribute)getFeaturePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePropertyType_Show()
	{
        return (EAttribute)getFeaturePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePropertyType_Title()
	{
        return (EAttribute)getFeaturePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePropertyType_Type()
	{
        return (EAttribute)getFeaturePropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileType()
	{
		if (fileTypeEClass == null)
		{
			fileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(175);
		}
		return fileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileType_RangeParameters()
	{
        return (EReference)getFileType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_FileName()
	{
        return (EAttribute)getFileType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_FileReference()
	{
        return (EAttribute)getFileType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileType_FileStructure()
	{
        return (EReference)getFileType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_MimeType()
	{
        return (EAttribute)getFileType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_Compression()
	{
        return (EAttribute)getFileType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormulaCitationType()
	{
		if (formulaCitationTypeEClass == null)
		{
			formulaCitationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(176);
		}
		return formulaCitationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulaCitationType_CICitation()
	{
        return (EReference)getFormulaCitationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaCitationType_Actuate()
	{
        return (EAttribute)getFormulaCitationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaCitationType_Arcrole()
	{
        return (EAttribute)getFormulaCitationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaCitationType_Href()
	{
        return (EAttribute)getFormulaCitationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaCitationType_NilReason()
	{
        return (EAttribute)getFormulaCitationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaCitationType_RemoteSchema()
	{
        return (EAttribute)getFormulaCitationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaCitationType_Role()
	{
        return (EAttribute)getFormulaCitationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaCitationType_Show()
	{
        return (EAttribute)getFormulaCitationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaCitationType_Title()
	{
        return (EAttribute)getFormulaCitationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaCitationType_Type()
	{
        return (EAttribute)getFormulaCitationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormulaType()
	{
		if (formulaTypeEClass == null)
		{
			formulaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(177);
		}
		return formulaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaType_A()
	{
        return (EAttribute)getFormulaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaType_B()
	{
        return (EAttribute)getFormulaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaType_C()
	{
        return (EAttribute)getFormulaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaType_D()
	{
        return (EAttribute)getFormulaType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralConversionPropertyType()
	{
		if (generalConversionPropertyTypeEClass == null)
		{
			generalConversionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(178);
		}
		return generalConversionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralConversionPropertyType_AbstractGeneralConversionGroup()
	{
        return (EAttribute)getGeneralConversionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralConversionPropertyType_AbstractGeneralConversion()
	{
        return (EReference)getGeneralConversionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralConversionPropertyType_Actuate()
	{
        return (EAttribute)getGeneralConversionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralConversionPropertyType_Arcrole()
	{
        return (EAttribute)getGeneralConversionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralConversionPropertyType_Href()
	{
        return (EAttribute)getGeneralConversionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralConversionPropertyType_NilReason()
	{
        return (EAttribute)getGeneralConversionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralConversionPropertyType_RemoteSchema()
	{
        return (EAttribute)getGeneralConversionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralConversionPropertyType_Role()
	{
        return (EAttribute)getGeneralConversionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralConversionPropertyType_Show()
	{
        return (EAttribute)getGeneralConversionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralConversionPropertyType_Title()
	{
        return (EAttribute)getGeneralConversionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralConversionPropertyType_Type()
	{
        return (EAttribute)getGeneralConversionPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralTransformationPropertyType()
	{
		if (generalTransformationPropertyTypeEClass == null)
		{
			generalTransformationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(179);
		}
		return generalTransformationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralTransformationPropertyType_AbstractGeneralTransformationGroup()
	{
        return (EAttribute)getGeneralTransformationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralTransformationPropertyType_AbstractGeneralTransformation()
	{
        return (EReference)getGeneralTransformationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralTransformationPropertyType_Actuate()
	{
        return (EAttribute)getGeneralTransformationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralTransformationPropertyType_Arcrole()
	{
        return (EAttribute)getGeneralTransformationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralTransformationPropertyType_Href()
	{
        return (EAttribute)getGeneralTransformationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralTransformationPropertyType_NilReason()
	{
        return (EAttribute)getGeneralTransformationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralTransformationPropertyType_RemoteSchema()
	{
        return (EAttribute)getGeneralTransformationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralTransformationPropertyType_Role()
	{
        return (EAttribute)getGeneralTransformationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralTransformationPropertyType_Show()
	{
        return (EAttribute)getGeneralTransformationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralTransformationPropertyType_Title()
	{
        return (EAttribute)getGeneralTransformationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralTransformationPropertyType_Type()
	{
        return (EAttribute)getGeneralTransformationPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericMetaDataType()
	{
		if (genericMetaDataTypeEClass == null)
		{
			genericMetaDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(180);
		}
		return genericMetaDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericMetaDataType_Any()
	{
        return (EAttribute)getGenericMetaDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeocentricCRSPropertyType()
	{
		if (geocentricCRSPropertyTypeEClass == null)
		{
			geocentricCRSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(181);
		}
		return geocentricCRSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeocentricCRSPropertyType_GeocentricCRS()
	{
        return (EReference)getGeocentricCRSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeocentricCRSPropertyType_Actuate()
	{
        return (EAttribute)getGeocentricCRSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeocentricCRSPropertyType_Arcrole()
	{
        return (EAttribute)getGeocentricCRSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeocentricCRSPropertyType_Href()
	{
        return (EAttribute)getGeocentricCRSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeocentricCRSPropertyType_NilReason()
	{
        return (EAttribute)getGeocentricCRSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeocentricCRSPropertyType_RemoteSchema()
	{
        return (EAttribute)getGeocentricCRSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeocentricCRSPropertyType_Role()
	{
        return (EAttribute)getGeocentricCRSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeocentricCRSPropertyType_Show()
	{
        return (EAttribute)getGeocentricCRSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeocentricCRSPropertyType_Title()
	{
        return (EAttribute)getGeocentricCRSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeocentricCRSPropertyType_Type()
	{
        return (EAttribute)getGeocentricCRSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeocentricCRSType()
	{
		if (geocentricCRSTypeEClass == null)
		{
			geocentricCRSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(182);
		}
		return geocentricCRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeocentricCRSType_UsesCartesianCS()
	{
        return (EReference)getGeocentricCRSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeocentricCRSType_UsesSphericalCS()
	{
        return (EReference)getGeocentricCRSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeocentricCRSType_UsesGeodeticDatum()
	{
        return (EReference)getGeocentricCRSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeodesicStringType()
	{
		if (geodesicStringTypeEClass == null)
		{
			geodesicStringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(183);
		}
		return geodesicStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeodesicStringType_PosList()
	{
        return (EReference)getGeodesicStringType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodesicStringType_GeometricPositionGroup()
	{
        return (EAttribute)getGeodesicStringType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeodesicStringType_Pos()
	{
        return (EReference)getGeodesicStringType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeodesicStringType_PointProperty()
	{
        return (EReference)getGeodesicStringType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodesicStringType_Interpolation()
	{
        return (EAttribute)getGeodesicStringType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeodesicType()
	{
		if (geodesicTypeEClass == null)
		{
			geodesicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(184);
		}
		return geodesicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeodeticCRSPropertyType()
	{
		if (geodeticCRSPropertyTypeEClass == null)
		{
			geodeticCRSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(185);
		}
		return geodeticCRSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeodeticCRSPropertyType_GeodeticCRS()
	{
        return (EReference)getGeodeticCRSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSPropertyType_Actuate()
	{
        return (EAttribute)getGeodeticCRSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSPropertyType_Arcrole()
	{
        return (EAttribute)getGeodeticCRSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSPropertyType_Href()
	{
        return (EAttribute)getGeodeticCRSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSPropertyType_NilReason()
	{
        return (EAttribute)getGeodeticCRSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSPropertyType_RemoteSchema()
	{
        return (EAttribute)getGeodeticCRSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSPropertyType_Role()
	{
        return (EAttribute)getGeodeticCRSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSPropertyType_Show()
	{
        return (EAttribute)getGeodeticCRSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSPropertyType_Title()
	{
        return (EAttribute)getGeodeticCRSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSPropertyType_Type()
	{
        return (EAttribute)getGeodeticCRSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeodeticCRSType()
	{
		if (geodeticCRSTypeEClass == null)
		{
			geodeticCRSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(186);
		}
		return geodeticCRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSType_EllipsoidalCSGroup()
	{
        return (EAttribute)getGeodeticCRSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeodeticCRSType_EllipsoidalCS()
	{
        return (EReference)getGeodeticCRSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSType_CartesianCSGroup()
	{
        return (EAttribute)getGeodeticCRSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeodeticCRSType_CartesianCS()
	{
        return (EReference)getGeodeticCRSType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSType_SphericalCSGroup()
	{
        return (EAttribute)getGeodeticCRSType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeodeticCRSType_SphericalCS()
	{
        return (EReference)getGeodeticCRSType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticCRSType_GeodeticDatumGroup()
	{
        return (EAttribute)getGeodeticCRSType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeodeticCRSType_GeodeticDatum()
	{
        return (EReference)getGeodeticCRSType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeodeticDatumPropertyType()
	{
		if (geodeticDatumPropertyTypeEClass == null)
		{
			geodeticDatumPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(187);
		}
		return geodeticDatumPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeodeticDatumPropertyType_GeodeticDatum()
	{
        return (EReference)getGeodeticDatumPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticDatumPropertyType_Actuate()
	{
        return (EAttribute)getGeodeticDatumPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticDatumPropertyType_Arcrole()
	{
        return (EAttribute)getGeodeticDatumPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticDatumPropertyType_Href()
	{
        return (EAttribute)getGeodeticDatumPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticDatumPropertyType_NilReason()
	{
        return (EAttribute)getGeodeticDatumPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticDatumPropertyType_RemoteSchema()
	{
        return (EAttribute)getGeodeticDatumPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticDatumPropertyType_Role()
	{
        return (EAttribute)getGeodeticDatumPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticDatumPropertyType_Show()
	{
        return (EAttribute)getGeodeticDatumPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticDatumPropertyType_Title()
	{
        return (EAttribute)getGeodeticDatumPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticDatumPropertyType_Type()
	{
        return (EAttribute)getGeodeticDatumPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeodeticDatumType()
	{
		if (geodeticDatumTypeEClass == null)
		{
			geodeticDatumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(188);
		}
		return geodeticDatumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticDatumType_PrimeMeridianGroup()
	{
        return (EAttribute)getGeodeticDatumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeodeticDatumType_PrimeMeridian()
	{
        return (EReference)getGeodeticDatumType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeodeticDatumType_EllipsoidGroup()
	{
        return (EAttribute)getGeodeticDatumType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeodeticDatumType_Ellipsoid()
	{
        return (EReference)getGeodeticDatumType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeographicCRSPropertyType()
	{
		if (geographicCRSPropertyTypeEClass == null)
		{
			geographicCRSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(189);
		}
		return geographicCRSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeographicCRSPropertyType_GeographicCRS()
	{
        return (EReference)getGeographicCRSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographicCRSPropertyType_Actuate()
	{
        return (EAttribute)getGeographicCRSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographicCRSPropertyType_Arcrole()
	{
        return (EAttribute)getGeographicCRSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographicCRSPropertyType_Href()
	{
        return (EAttribute)getGeographicCRSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographicCRSPropertyType_NilReason()
	{
        return (EAttribute)getGeographicCRSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographicCRSPropertyType_RemoteSchema()
	{
        return (EAttribute)getGeographicCRSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographicCRSPropertyType_Role()
	{
        return (EAttribute)getGeographicCRSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographicCRSPropertyType_Show()
	{
        return (EAttribute)getGeographicCRSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographicCRSPropertyType_Title()
	{
        return (EAttribute)getGeographicCRSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeographicCRSPropertyType_Type()
	{
        return (EAttribute)getGeographicCRSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeographicCRSType()
	{
		if (geographicCRSTypeEClass == null)
		{
			geographicCRSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(190);
		}
		return geographicCRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeographicCRSType_UsesEllipsoidalCS()
	{
        return (EReference)getGeographicCRSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeographicCRSType_UsesGeodeticDatum()
	{
        return (EReference)getGeographicCRSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometricComplexPropertyType()
	{
		if (geometricComplexPropertyTypeEClass == null)
		{
			geometricComplexPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(191);
		}
		return geometricComplexPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometricComplexPropertyType_GeometricComplex()
	{
        return (EReference)getGeometricComplexPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometricComplexPropertyType_CompositeCurve()
	{
        return (EReference)getGeometricComplexPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometricComplexPropertyType_CompositeSurface()
	{
        return (EReference)getGeometricComplexPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometricComplexPropertyType_CompositeSolid()
	{
        return (EReference)getGeometricComplexPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricComplexPropertyType_Actuate()
	{
        return (EAttribute)getGeometricComplexPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricComplexPropertyType_Arcrole()
	{
        return (EAttribute)getGeometricComplexPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricComplexPropertyType_Href()
	{
        return (EAttribute)getGeometricComplexPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricComplexPropertyType_NilReason()
	{
        return (EAttribute)getGeometricComplexPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricComplexPropertyType_Owns()
	{
        return (EAttribute)getGeometricComplexPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricComplexPropertyType_RemoteSchema()
	{
        return (EAttribute)getGeometricComplexPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricComplexPropertyType_Role()
	{
        return (EAttribute)getGeometricComplexPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricComplexPropertyType_Show()
	{
        return (EAttribute)getGeometricComplexPropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricComplexPropertyType_Title()
	{
        return (EAttribute)getGeometricComplexPropertyType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricComplexPropertyType_Type()
	{
        return (EAttribute)getGeometricComplexPropertyType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometricComplexType()
	{
		if (geometricComplexTypeEClass == null)
		{
			geometricComplexTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(192);
		}
		return geometricComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometricComplexType_Element()
	{
        return (EReference)getGeometricComplexType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricComplexType_AggregationType()
	{
        return (EAttribute)getGeometricComplexType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometricPrimitivePropertyType()
	{
		if (geometricPrimitivePropertyTypeEClass == null)
		{
			geometricPrimitivePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(193);
		}
		return geometricPrimitivePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricPrimitivePropertyType_AbstractGeometricPrimitiveGroup()
	{
        return (EAttribute)getGeometricPrimitivePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometricPrimitivePropertyType_AbstractGeometricPrimitive()
	{
        return (EReference)getGeometricPrimitivePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricPrimitivePropertyType_Actuate()
	{
        return (EAttribute)getGeometricPrimitivePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricPrimitivePropertyType_Arcrole()
	{
        return (EAttribute)getGeometricPrimitivePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricPrimitivePropertyType_Href()
	{
        return (EAttribute)getGeometricPrimitivePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricPrimitivePropertyType_NilReason()
	{
        return (EAttribute)getGeometricPrimitivePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricPrimitivePropertyType_Owns()
	{
        return (EAttribute)getGeometricPrimitivePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricPrimitivePropertyType_RemoteSchema()
	{
        return (EAttribute)getGeometricPrimitivePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricPrimitivePropertyType_Role()
	{
        return (EAttribute)getGeometricPrimitivePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricPrimitivePropertyType_Show()
	{
        return (EAttribute)getGeometricPrimitivePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricPrimitivePropertyType_Title()
	{
        return (EAttribute)getGeometricPrimitivePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometricPrimitivePropertyType_Type()
	{
        return (EAttribute)getGeometricPrimitivePropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometryArrayPropertyType()
	{
		if (geometryArrayPropertyTypeEClass == null)
		{
			geometryArrayPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(194);
		}
		return geometryArrayPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryArrayPropertyType_Group()
	{
        return (EAttribute)getGeometryArrayPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryArrayPropertyType_AbstractGeometryGroup()
	{
        return (EAttribute)getGeometryArrayPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometryArrayPropertyType_AbstractGeometry()
	{
        return (EReference)getGeometryArrayPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryArrayPropertyType_Owns()
	{
        return (EAttribute)getGeometryArrayPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometryPropertyType()
	{
		if (geometryPropertyTypeEClass == null)
		{
			geometryPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(195);
		}
		return geometryPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryPropertyType_AbstractGeometryGroup()
	{
        return (EAttribute)getGeometryPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometryPropertyType_AbstractGeometry()
	{
        return (EReference)getGeometryPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryPropertyType_Actuate()
	{
        return (EAttribute)getGeometryPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryPropertyType_Arcrole()
	{
        return (EAttribute)getGeometryPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryPropertyType_Href()
	{
        return (EAttribute)getGeometryPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryPropertyType_NilReason()
	{
        return (EAttribute)getGeometryPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryPropertyType_Owns()
	{
        return (EAttribute)getGeometryPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryPropertyType_RemoteSchema()
	{
        return (EAttribute)getGeometryPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryPropertyType_Role()
	{
        return (EAttribute)getGeometryPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryPropertyType_Show()
	{
        return (EAttribute)getGeometryPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryPropertyType_Title()
	{
        return (EAttribute)getGeometryPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryPropertyType_Type()
	{
        return (EAttribute)getGeometryPropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridEnvelopeType()
	{
		if (gridEnvelopeTypeEClass == null)
		{
			gridEnvelopeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(196);
		}
		return gridEnvelopeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridEnvelopeType_Low()
	{
        return (EAttribute)getGridEnvelopeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridEnvelopeType_High()
	{
        return (EAttribute)getGridEnvelopeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridFunctionType()
	{
		if (gridFunctionTypeEClass == null)
		{
			gridFunctionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(197);
		}
		return gridFunctionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridFunctionType_SequenceRule()
	{
        return (EReference)getGridFunctionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridFunctionType_StartPoint()
	{
        return (EAttribute)getGridFunctionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridLengthType()
	{
		if (gridLengthTypeEClass == null)
		{
			gridLengthTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(198);
		}
		return gridLengthTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridLimitsType()
	{
		if (gridLimitsTypeEClass == null)
		{
			gridLimitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(199);
		}
		return gridLimitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridLimitsType_GridEnvelope()
	{
        return (EReference)getGridLimitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridType()
	{
		if (gridTypeEClass == null)
		{
			gridTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(200);
		}
		return gridTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridType_Limits()
	{
        return (EReference)getGridType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_AxisLabels1()
	{
        return (EAttribute)getGridType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_AxisName()
	{
        return (EAttribute)getGridType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_Dimension()
	{
        return (EAttribute)getGridType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryPropertyType()
	{
		if (historyPropertyTypeEClass == null)
		{
			historyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(201);
		}
		return historyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryPropertyType_AbstractTimeSliceGroup()
	{
        return (EAttribute)getHistoryPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryPropertyType_AbstractTimeSlice()
	{
        return (EReference)getHistoryPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryPropertyType_Owns()
	{
        return (EAttribute)getHistoryPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedObjectType()
	{
		if (identifiedObjectTypeEClass == null)
		{
			identifiedObjectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(202);
		}
		return identifiedObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageCRSPropertyType()
	{
		if (imageCRSPropertyTypeEClass == null)
		{
			imageCRSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(203);
		}
		return imageCRSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageCRSPropertyType_ImageCRS()
	{
        return (EReference)getImageCRSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCRSPropertyType_Actuate()
	{
        return (EAttribute)getImageCRSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCRSPropertyType_Arcrole()
	{
        return (EAttribute)getImageCRSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCRSPropertyType_Href()
	{
        return (EAttribute)getImageCRSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCRSPropertyType_NilReason()
	{
        return (EAttribute)getImageCRSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCRSPropertyType_RemoteSchema()
	{
        return (EAttribute)getImageCRSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCRSPropertyType_Role()
	{
        return (EAttribute)getImageCRSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCRSPropertyType_Show()
	{
        return (EAttribute)getImageCRSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCRSPropertyType_Title()
	{
        return (EAttribute)getImageCRSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCRSPropertyType_Type()
	{
        return (EAttribute)getImageCRSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageCRSType()
	{
		if (imageCRSTypeEClass == null)
		{
			imageCRSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(204);
		}
		return imageCRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCRSType_CartesianCSGroup()
	{
        return (EAttribute)getImageCRSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageCRSType_CartesianCS()
	{
        return (EReference)getImageCRSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCRSType_AffineCSGroup()
	{
        return (EAttribute)getImageCRSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageCRSType_AffineCS()
	{
        return (EReference)getImageCRSType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageCRSType_UsesObliqueCartesianCS()
	{
        return (EReference)getImageCRSType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCRSType_ImageDatumGroup()
	{
        return (EAttribute)getImageCRSType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageCRSType_ImageDatum()
	{
        return (EReference)getImageCRSType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageDatumPropertyType()
	{
		if (imageDatumPropertyTypeEClass == null)
		{
			imageDatumPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(205);
		}
		return imageDatumPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageDatumPropertyType_ImageDatum()
	{
        return (EReference)getImageDatumPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageDatumPropertyType_Actuate()
	{
        return (EAttribute)getImageDatumPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageDatumPropertyType_Arcrole()
	{
        return (EAttribute)getImageDatumPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageDatumPropertyType_Href()
	{
        return (EAttribute)getImageDatumPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageDatumPropertyType_NilReason()
	{
        return (EAttribute)getImageDatumPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageDatumPropertyType_RemoteSchema()
	{
        return (EAttribute)getImageDatumPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageDatumPropertyType_Role()
	{
        return (EAttribute)getImageDatumPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageDatumPropertyType_Show()
	{
        return (EAttribute)getImageDatumPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageDatumPropertyType_Title()
	{
        return (EAttribute)getImageDatumPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageDatumPropertyType_Type()
	{
        return (EAttribute)getImageDatumPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageDatumType()
	{
		if (imageDatumTypeEClass == null)
		{
			imageDatumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(206);
		}
		return imageDatumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageDatumType_PixelInCell()
	{
        return (EReference)getImageDatumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndirectEntryType()
	{
		if (indirectEntryTypeEClass == null)
		{
			indirectEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(209);
		}
		return indirectEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndirectEntryType_DefinitionProxy()
	{
        return (EReference)getIndirectEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlinePropertyType()
	{
		if (inlinePropertyTypeEClass == null)
		{
			inlinePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(210);
		}
		return inlinePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlinePropertyType_Any()
	{
        return (EAttribute)getInlinePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlinePropertyType_Owns()
	{
        return (EAttribute)getInlinePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnotPropertyType()
	{
		if (knotPropertyTypeEClass == null)
		{
			knotPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(214);
		}
		return knotPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnotPropertyType_Knot()
	{
        return (EReference)getKnotPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnotType()
	{
		if (knotTypeEClass == null)
		{
			knotTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(215);
		}
		return knotTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnotType_Value()
	{
        return (EAttribute)getKnotType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnotType_Multiplicity()
	{
        return (EAttribute)getKnotType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnotType_Weight()
	{
        return (EAttribute)getKnotType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthType()
	{
		if (lengthTypeEClass == null)
		{
			lengthTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(218);
		}
		return lengthTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearCSPropertyType()
	{
		if (linearCSPropertyTypeEClass == null)
		{
			linearCSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(219);
		}
		return linearCSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearCSPropertyType_LinearCS()
	{
        return (EReference)getLinearCSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearCSPropertyType_Actuate()
	{
        return (EAttribute)getLinearCSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearCSPropertyType_Arcrole()
	{
        return (EAttribute)getLinearCSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearCSPropertyType_Href()
	{
        return (EAttribute)getLinearCSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearCSPropertyType_NilReason()
	{
        return (EAttribute)getLinearCSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearCSPropertyType_RemoteSchema()
	{
        return (EAttribute)getLinearCSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearCSPropertyType_Role()
	{
        return (EAttribute)getLinearCSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearCSPropertyType_Show()
	{
        return (EAttribute)getLinearCSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearCSPropertyType_Title()
	{
        return (EAttribute)getLinearCSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearCSPropertyType_Type()
	{
        return (EAttribute)getLinearCSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearCSType()
	{
		if (linearCSTypeEClass == null)
		{
			linearCSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(220);
		}
		return linearCSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearRingPropertyType()
	{
		if (linearRingPropertyTypeEClass == null)
		{
			linearRingPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(221);
		}
		return linearRingPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearRingPropertyType_LinearRing()
	{
        return (EReference)getLinearRingPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearRingType()
	{
		if (linearRingTypeEClass == null)
		{
			linearRingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(222);
		}
		return linearRingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearRingType_Group()
	{
        return (EAttribute)getLinearRingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearRingType_Pos()
	{
        return (EReference)getLinearRingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearRingType_PointProperty()
	{
        return (EReference)getLinearRingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearRingType_PointRep()
	{
        return (EReference)getLinearRingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearRingType_PosList()
	{
        return (EReference)getLinearRingType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearRingType_Coordinates()
	{
        return (EReference)getLinearRingType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineStringSegmentArrayPropertyType()
	{
		if (lineStringSegmentArrayPropertyTypeEClass == null)
		{
			lineStringSegmentArrayPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(223);
		}
		return lineStringSegmentArrayPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStringSegmentArrayPropertyType_Group()
	{
        return (EAttribute)getLineStringSegmentArrayPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineStringSegmentArrayPropertyType_LineStringSegment()
	{
        return (EReference)getLineStringSegmentArrayPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineStringSegmentType()
	{
		if (lineStringSegmentTypeEClass == null)
		{
			lineStringSegmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(224);
		}
		return lineStringSegmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStringSegmentType_Group()
	{
        return (EAttribute)getLineStringSegmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineStringSegmentType_Pos()
	{
        return (EReference)getLineStringSegmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineStringSegmentType_PointProperty()
	{
        return (EReference)getLineStringSegmentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineStringSegmentType_PointRep()
	{
        return (EReference)getLineStringSegmentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineStringSegmentType_PosList()
	{
        return (EReference)getLineStringSegmentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineStringSegmentType_Coordinates()
	{
        return (EReference)getLineStringSegmentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStringSegmentType_Interpolation()
	{
        return (EAttribute)getLineStringSegmentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineStringType()
	{
		if (lineStringTypeEClass == null)
		{
			lineStringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(225);
		}
		return lineStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStringType_Group()
	{
        return (EAttribute)getLineStringType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineStringType_Pos()
	{
        return (EReference)getLineStringType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineStringType_PointProperty()
	{
        return (EReference)getLineStringType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineStringType_PointRep()
	{
        return (EReference)getLineStringType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineStringType_PosList()
	{
        return (EReference)getLineStringType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineStringType_Coordinates()
	{
        return (EReference)getLineStringType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationPropertyType()
	{
		if (locationPropertyTypeEClass == null)
		{
			locationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(226);
		}
		return locationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPropertyType_AbstractGeometryGroup()
	{
        return (EAttribute)getLocationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationPropertyType_AbstractGeometry()
	{
        return (EReference)getLocationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationPropertyType_LocationKeyWord()
	{
        return (EReference)getLocationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationPropertyType_LocationString()
	{
        return (EReference)getLocationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPropertyType_Null()
	{
        return (EAttribute)getLocationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPropertyType_Actuate()
	{
        return (EAttribute)getLocationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPropertyType_Arcrole()
	{
        return (EAttribute)getLocationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPropertyType_Href()
	{
        return (EAttribute)getLocationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPropertyType_NilReason()
	{
        return (EAttribute)getLocationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPropertyType_RemoteSchema()
	{
        return (EAttribute)getLocationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPropertyType_Role()
	{
        return (EAttribute)getLocationPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPropertyType_Show()
	{
        return (EAttribute)getLocationPropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPropertyType_Title()
	{
        return (EAttribute)getLocationPropertyType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationPropertyType_Type()
	{
        return (EAttribute)getLocationPropertyType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingRuleType()
	{
		if (mappingRuleTypeEClass == null)
		{
			mappingRuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(227);
		}
		return mappingRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingRuleType_RuleDefinition()
	{
        return (EAttribute)getMappingRuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingRuleType_RuleReference()
	{
        return (EReference)getMappingRuleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureListType()
	{
		if (measureListTypeEClass == null)
		{
			measureListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(228);
		}
		return measureListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureListType_Value()
	{
        return (EAttribute)getMeasureListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureListType_Uom()
	{
        return (EAttribute)getMeasureListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureOrNilReasonListType()
	{
		if (measureOrNilReasonListTypeEClass == null)
		{
			measureOrNilReasonListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(229);
		}
		return measureOrNilReasonListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureOrNilReasonListType_Value()
	{
        return (EAttribute)getMeasureOrNilReasonListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureOrNilReasonListType_Uom()
	{
        return (EAttribute)getMeasureOrNilReasonListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureType()
	{
		if (measureTypeEClass == null)
		{
			measureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(230);
		}
		return measureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Value()
	{
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Uom()
	{
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaDataPropertyType()
	{
		if (metaDataPropertyTypeEClass == null)
		{
			metaDataPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(231);
		}
		return metaDataPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaDataPropertyType_AbstractMetaDataGroup()
	{
        return (EAttribute)getMetaDataPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaDataPropertyType_AbstractMetaData()
	{
        return (EReference)getMetaDataPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaDataPropertyType_About()
	{
        return (EAttribute)getMetaDataPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaDataPropertyType_Actuate()
	{
        return (EAttribute)getMetaDataPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaDataPropertyType_Arcrole()
	{
        return (EAttribute)getMetaDataPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaDataPropertyType_Href()
	{
        return (EAttribute)getMetaDataPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaDataPropertyType_NilReason()
	{
        return (EAttribute)getMetaDataPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaDataPropertyType_RemoteSchema()
	{
        return (EAttribute)getMetaDataPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaDataPropertyType_Role()
	{
        return (EAttribute)getMetaDataPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaDataPropertyType_Show()
	{
        return (EAttribute)getMetaDataPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaDataPropertyType_Title()
	{
        return (EAttribute)getMetaDataPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaDataPropertyType_Type()
	{
        return (EAttribute)getMetaDataPropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMovingObjectStatusType()
	{
		if (movingObjectStatusTypeEClass == null)
		{
			movingObjectStatusTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(232);
		}
		return movingObjectStatusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovingObjectStatusType_Position()
	{
        return (EReference)getMovingObjectStatusType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovingObjectStatusType_Pos()
	{
        return (EReference)getMovingObjectStatusType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovingObjectStatusType_LocationName()
	{
        return (EReference)getMovingObjectStatusType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovingObjectStatusType_LocationReference()
	{
        return (EReference)getMovingObjectStatusType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovingObjectStatusType_LocationGroup()
	{
        return (EAttribute)getMovingObjectStatusType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovingObjectStatusType_Location()
	{
        return (EReference)getMovingObjectStatusType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovingObjectStatusType_Speed()
	{
        return (EReference)getMovingObjectStatusType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovingObjectStatusType_Bearing()
	{
        return (EReference)getMovingObjectStatusType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovingObjectStatusType_Acceleration()
	{
        return (EReference)getMovingObjectStatusType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovingObjectStatusType_Elevation()
	{
        return (EReference)getMovingObjectStatusType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovingObjectStatusType_Status()
	{
        return (EReference)getMovingObjectStatusType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovingObjectStatusType_StatusReference()
	{
        return (EReference)getMovingObjectStatusType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiCurvePropertyType()
	{
		if (multiCurvePropertyTypeEClass == null)
		{
			multiCurvePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(233);
		}
		return multiCurvePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiCurvePropertyType_MultiCurve()
	{
        return (EReference)getMultiCurvePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiCurvePropertyType_Actuate()
	{
        return (EAttribute)getMultiCurvePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiCurvePropertyType_Arcrole()
	{
        return (EAttribute)getMultiCurvePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiCurvePropertyType_Href()
	{
        return (EAttribute)getMultiCurvePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiCurvePropertyType_NilReason()
	{
        return (EAttribute)getMultiCurvePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiCurvePropertyType_Owns()
	{
        return (EAttribute)getMultiCurvePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiCurvePropertyType_RemoteSchema()
	{
        return (EAttribute)getMultiCurvePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiCurvePropertyType_Role()
	{
        return (EAttribute)getMultiCurvePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiCurvePropertyType_Show()
	{
        return (EAttribute)getMultiCurvePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiCurvePropertyType_Title()
	{
        return (EAttribute)getMultiCurvePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiCurvePropertyType_Type()
	{
        return (EAttribute)getMultiCurvePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiCurveType()
	{
		if (multiCurveTypeEClass == null)
		{
			multiCurveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(234);
		}
		return multiCurveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiCurveType_CurveMember()
	{
        return (EReference)getMultiCurveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiCurveType_CurveMembers()
	{
        return (EReference)getMultiCurveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiGeometryPropertyType()
	{
		if (multiGeometryPropertyTypeEClass == null)
		{
			multiGeometryPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(235);
		}
		return multiGeometryPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiGeometryPropertyType_AbstractGeometricAggregateGroup()
	{
        return (EAttribute)getMultiGeometryPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiGeometryPropertyType_AbstractGeometricAggregate()
	{
        return (EReference)getMultiGeometryPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiGeometryPropertyType_Actuate()
	{
        return (EAttribute)getMultiGeometryPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiGeometryPropertyType_Arcrole()
	{
        return (EAttribute)getMultiGeometryPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiGeometryPropertyType_Href()
	{
        return (EAttribute)getMultiGeometryPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiGeometryPropertyType_NilReason()
	{
        return (EAttribute)getMultiGeometryPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiGeometryPropertyType_Owns()
	{
        return (EAttribute)getMultiGeometryPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiGeometryPropertyType_RemoteSchema()
	{
        return (EAttribute)getMultiGeometryPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiGeometryPropertyType_Role()
	{
        return (EAttribute)getMultiGeometryPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiGeometryPropertyType_Show()
	{
        return (EAttribute)getMultiGeometryPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiGeometryPropertyType_Title()
	{
        return (EAttribute)getMultiGeometryPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiGeometryPropertyType_Type()
	{
        return (EAttribute)getMultiGeometryPropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiGeometryType()
	{
		if (multiGeometryTypeEClass == null)
		{
			multiGeometryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(236);
		}
		return multiGeometryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiGeometryType_GeometryMember()
	{
        return (EReference)getMultiGeometryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiGeometryType_GeometryMembers()
	{
        return (EReference)getMultiGeometryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPointPropertyType()
	{
		if (multiPointPropertyTypeEClass == null)
		{
			multiPointPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(237);
		}
		return multiPointPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPointPropertyType_MultiPoint()
	{
        return (EReference)getMultiPointPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPointPropertyType_Actuate()
	{
        return (EAttribute)getMultiPointPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPointPropertyType_Arcrole()
	{
        return (EAttribute)getMultiPointPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPointPropertyType_Href()
	{
        return (EAttribute)getMultiPointPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPointPropertyType_NilReason()
	{
        return (EAttribute)getMultiPointPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPointPropertyType_Owns()
	{
        return (EAttribute)getMultiPointPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPointPropertyType_RemoteSchema()
	{
        return (EAttribute)getMultiPointPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPointPropertyType_Role()
	{
        return (EAttribute)getMultiPointPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPointPropertyType_Show()
	{
        return (EAttribute)getMultiPointPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPointPropertyType_Title()
	{
        return (EAttribute)getMultiPointPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPointPropertyType_Type()
	{
        return (EAttribute)getMultiPointPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPointType()
	{
		if (multiPointTypeEClass == null)
		{
			multiPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(238);
		}
		return multiPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPointType_PointMember()
	{
        return (EReference)getMultiPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPointType_PointMembers()
	{
        return (EReference)getMultiPointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiSolidPropertyType()
	{
		if (multiSolidPropertyTypeEClass == null)
		{
			multiSolidPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(239);
		}
		return multiSolidPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiSolidPropertyType_MultiSolid()
	{
        return (EReference)getMultiSolidPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSolidPropertyType_Actuate()
	{
        return (EAttribute)getMultiSolidPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSolidPropertyType_Arcrole()
	{
        return (EAttribute)getMultiSolidPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSolidPropertyType_Href()
	{
        return (EAttribute)getMultiSolidPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSolidPropertyType_NilReason()
	{
        return (EAttribute)getMultiSolidPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSolidPropertyType_Owns()
	{
        return (EAttribute)getMultiSolidPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSolidPropertyType_RemoteSchema()
	{
        return (EAttribute)getMultiSolidPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSolidPropertyType_Role()
	{
        return (EAttribute)getMultiSolidPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSolidPropertyType_Show()
	{
        return (EAttribute)getMultiSolidPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSolidPropertyType_Title()
	{
        return (EAttribute)getMultiSolidPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSolidPropertyType_Type()
	{
        return (EAttribute)getMultiSolidPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiSolidType()
	{
		if (multiSolidTypeEClass == null)
		{
			multiSolidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(240);
		}
		return multiSolidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiSolidType_SolidMember()
	{
        return (EReference)getMultiSolidType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiSolidType_SolidMembers()
	{
        return (EReference)getMultiSolidType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiSurfacePropertyType()
	{
		if (multiSurfacePropertyTypeEClass == null)
		{
			multiSurfacePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(241);
		}
		return multiSurfacePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiSurfacePropertyType_MultiSurface()
	{
        return (EReference)getMultiSurfacePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSurfacePropertyType_Actuate()
	{
        return (EAttribute)getMultiSurfacePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSurfacePropertyType_Arcrole()
	{
        return (EAttribute)getMultiSurfacePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSurfacePropertyType_Href()
	{
        return (EAttribute)getMultiSurfacePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSurfacePropertyType_NilReason()
	{
        return (EAttribute)getMultiSurfacePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSurfacePropertyType_Owns()
	{
        return (EAttribute)getMultiSurfacePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSurfacePropertyType_RemoteSchema()
	{
        return (EAttribute)getMultiSurfacePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSurfacePropertyType_Role()
	{
        return (EAttribute)getMultiSurfacePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSurfacePropertyType_Show()
	{
        return (EAttribute)getMultiSurfacePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSurfacePropertyType_Title()
	{
        return (EAttribute)getMultiSurfacePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiSurfacePropertyType_Type()
	{
        return (EAttribute)getMultiSurfacePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiSurfaceType()
	{
		if (multiSurfaceTypeEClass == null)
		{
			multiSurfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(242);
		}
		return multiSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiSurfaceType_SurfaceMember()
	{
        return (EReference)getMultiSurfaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiSurfaceType_SurfaceMembers()
	{
        return (EReference)getMultiSurfaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeOrEdgePropertyType()
	{
		if (nodeOrEdgePropertyTypeEClass == null)
		{
			nodeOrEdgePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(252);
		}
		return nodeOrEdgePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeOrEdgePropertyType_Node()
	{
        return (EReference)getNodeOrEdgePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeOrEdgePropertyType_Edge()
	{
        return (EReference)getNodeOrEdgePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOrEdgePropertyType_Actuate()
	{
        return (EAttribute)getNodeOrEdgePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOrEdgePropertyType_Arcrole()
	{
        return (EAttribute)getNodeOrEdgePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOrEdgePropertyType_Href()
	{
        return (EAttribute)getNodeOrEdgePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOrEdgePropertyType_NilReason()
	{
        return (EAttribute)getNodeOrEdgePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOrEdgePropertyType_Owns()
	{
        return (EAttribute)getNodeOrEdgePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOrEdgePropertyType_RemoteSchema()
	{
        return (EAttribute)getNodeOrEdgePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOrEdgePropertyType_Role()
	{
        return (EAttribute)getNodeOrEdgePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOrEdgePropertyType_Show()
	{
        return (EAttribute)getNodeOrEdgePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOrEdgePropertyType_Title()
	{
        return (EAttribute)getNodeOrEdgePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOrEdgePropertyType_Type()
	{
        return (EAttribute)getNodeOrEdgePropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodePropertyType()
	{
		if (nodePropertyTypeEClass == null)
		{
			nodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(253);
		}
		return nodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodePropertyType_Node()
	{
        return (EReference)getNodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePropertyType_Actuate()
	{
        return (EAttribute)getNodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePropertyType_Arcrole()
	{
        return (EAttribute)getNodePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePropertyType_Href()
	{
        return (EAttribute)getNodePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePropertyType_NilReason()
	{
        return (EAttribute)getNodePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePropertyType_Owns()
	{
        return (EAttribute)getNodePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePropertyType_RemoteSchema()
	{
        return (EAttribute)getNodePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePropertyType_Role()
	{
        return (EAttribute)getNodePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePropertyType_Show()
	{
        return (EAttribute)getNodePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePropertyType_Title()
	{
        return (EAttribute)getNodePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePropertyType_Type()
	{
        return (EAttribute)getNodePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeType()
	{
		if (nodeTypeEClass == null)
		{
			nodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(254);
		}
		return nodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_Container()
	{
        return (EReference)getNodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_DirectedEdge()
	{
        return (EReference)getNodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeType_PointProperty()
	{
        return (EReference)getNodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_AggregationType()
	{
        return (EAttribute)getNodeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObliqueCartesianCSPropertyType()
	{
		if (obliqueCartesianCSPropertyTypeEClass == null)
		{
			obliqueCartesianCSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(255);
		}
		return obliqueCartesianCSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObliqueCartesianCSPropertyType_ObliqueCartesianCS()
	{
        return (EReference)getObliqueCartesianCSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObliqueCartesianCSPropertyType_Actuate()
	{
        return (EAttribute)getObliqueCartesianCSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObliqueCartesianCSPropertyType_Arcrole()
	{
        return (EAttribute)getObliqueCartesianCSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObliqueCartesianCSPropertyType_Href()
	{
        return (EAttribute)getObliqueCartesianCSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObliqueCartesianCSPropertyType_NilReason()
	{
        return (EAttribute)getObliqueCartesianCSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObliqueCartesianCSPropertyType_RemoteSchema()
	{
        return (EAttribute)getObliqueCartesianCSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObliqueCartesianCSPropertyType_Role()
	{
        return (EAttribute)getObliqueCartesianCSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObliqueCartesianCSPropertyType_Show()
	{
        return (EAttribute)getObliqueCartesianCSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObliqueCartesianCSPropertyType_Title()
	{
        return (EAttribute)getObliqueCartesianCSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObliqueCartesianCSPropertyType_Type()
	{
        return (EAttribute)getObliqueCartesianCSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObliqueCartesianCSType()
	{
		if (obliqueCartesianCSTypeEClass == null)
		{
			obliqueCartesianCSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(256);
		}
		return obliqueCartesianCSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationType()
	{
		if (observationTypeEClass == null)
		{
			observationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(257);
		}
		return observationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationType_ValidTime()
	{
        return (EReference)getObservationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationType_Using()
	{
        return (EReference)getObservationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservationType_TargetGroup()
	{
        return (EAttribute)getObservationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationType_Target()
	{
        return (EReference)getObservationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationType_ResultOf()
	{
        return (EReference)getObservationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffsetCurveType()
	{
		if (offsetCurveTypeEClass == null)
		{
			offsetCurveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(258);
		}
		return offsetCurveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffsetCurveType_OffsetBase()
	{
        return (EReference)getOffsetCurveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffsetCurveType_Distance()
	{
        return (EReference)getOffsetCurveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffsetCurveType_RefDirection()
	{
        return (EReference)getOffsetCurveType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationMethodPropertyType()
	{
		if (operationMethodPropertyTypeEClass == null)
		{
			operationMethodPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(259);
		}
		return operationMethodPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationMethodPropertyType_OperationMethod()
	{
        return (EReference)getOperationMethodPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationMethodPropertyType_Actuate()
	{
        return (EAttribute)getOperationMethodPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationMethodPropertyType_Arcrole()
	{
        return (EAttribute)getOperationMethodPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationMethodPropertyType_Href()
	{
        return (EAttribute)getOperationMethodPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationMethodPropertyType_NilReason()
	{
        return (EAttribute)getOperationMethodPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationMethodPropertyType_RemoteSchema()
	{
        return (EAttribute)getOperationMethodPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationMethodPropertyType_Role()
	{
        return (EAttribute)getOperationMethodPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationMethodPropertyType_Show()
	{
        return (EAttribute)getOperationMethodPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationMethodPropertyType_Title()
	{
        return (EAttribute)getOperationMethodPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationMethodPropertyType_Type()
	{
        return (EAttribute)getOperationMethodPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationMethodType()
	{
		if (operationMethodTypeEClass == null)
		{
			operationMethodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(260);
		}
		return operationMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationMethodType_FormulaCitation()
	{
        return (EReference)getOperationMethodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationMethodType_FormulaGroup()
	{
        return (EAttribute)getOperationMethodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationMethodType_Formula()
	{
        return (EReference)getOperationMethodType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationMethodType_SourceDimensions()
	{
        return (EAttribute)getOperationMethodType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationMethodType_TargetDimensions()
	{
        return (EAttribute)getOperationMethodType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationMethodType_Parameter()
	{
        return (EReference)getOperationMethodType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationParameterGroupPropertyType()
	{
		if (operationParameterGroupPropertyTypeEClass == null)
		{
			operationParameterGroupPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(261);
		}
		return operationParameterGroupPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationParameterGroupPropertyType_OperationParameterGroup()
	{
        return (EReference)getOperationParameterGroupPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterGroupPropertyType_Actuate()
	{
        return (EAttribute)getOperationParameterGroupPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterGroupPropertyType_Arcrole()
	{
        return (EAttribute)getOperationParameterGroupPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterGroupPropertyType_Href()
	{
        return (EAttribute)getOperationParameterGroupPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterGroupPropertyType_NilReason()
	{
        return (EAttribute)getOperationParameterGroupPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterGroupPropertyType_RemoteSchema()
	{
        return (EAttribute)getOperationParameterGroupPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterGroupPropertyType_Role()
	{
        return (EAttribute)getOperationParameterGroupPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterGroupPropertyType_Show()
	{
        return (EAttribute)getOperationParameterGroupPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterGroupPropertyType_Title()
	{
        return (EAttribute)getOperationParameterGroupPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterGroupPropertyType_Type()
	{
        return (EAttribute)getOperationParameterGroupPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationParameterGroupType()
	{
		if (operationParameterGroupTypeEClass == null)
		{
			operationParameterGroupTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(262);
		}
		return operationParameterGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterGroupType_MaximumOccurs()
	{
        return (EAttribute)getOperationParameterGroupType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationParameterGroupType_Parameter()
	{
        return (EReference)getOperationParameterGroupType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationParameterPropertyType()
	{
		if (operationParameterPropertyTypeEClass == null)
		{
			operationParameterPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(263);
		}
		return operationParameterPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationParameterPropertyType_OperationParameter()
	{
        return (EReference)getOperationParameterPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterPropertyType_Actuate()
	{
        return (EAttribute)getOperationParameterPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterPropertyType_Arcrole()
	{
        return (EAttribute)getOperationParameterPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterPropertyType_Href()
	{
        return (EAttribute)getOperationParameterPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterPropertyType_NilReason()
	{
        return (EAttribute)getOperationParameterPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterPropertyType_RemoteSchema()
	{
        return (EAttribute)getOperationParameterPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterPropertyType_Role()
	{
        return (EAttribute)getOperationParameterPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterPropertyType_Show()
	{
        return (EAttribute)getOperationParameterPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterPropertyType_Title()
	{
        return (EAttribute)getOperationParameterPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterPropertyType_Type()
	{
        return (EAttribute)getOperationParameterPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationParameterType()
	{
		if (operationParameterTypeEClass == null)
		{
			operationParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(264);
		}
		return operationParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationPropertyType()
	{
		if (operationPropertyTypeEClass == null)
		{
			operationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(265);
		}
		return operationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationPropertyType_AbstractOperationGroup()
	{
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationPropertyType_AbstractOperation()
	{
        return (EReference)getOperationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationPropertyType_Actuate()
	{
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationPropertyType_Arcrole()
	{
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationPropertyType_Href()
	{
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationPropertyType_NilReason()
	{
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationPropertyType_RemoteSchema()
	{
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationPropertyType_Role()
	{
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationPropertyType_Show()
	{
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationPropertyType_Title()
	{
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationPropertyType_Type()
	{
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrientableCurveType()
	{
		if (orientableCurveTypeEClass == null)
		{
			orientableCurveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(266);
		}
		return orientableCurveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrientableCurveType_BaseCurve()
	{
        return (EReference)getOrientableCurveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrientableCurveType_Orientation()
	{
        return (EAttribute)getOrientableCurveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrientableSurfaceType()
	{
		if (orientableSurfaceTypeEClass == null)
		{
			orientableSurfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(267);
		}
		return orientableSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrientableSurfaceType_BaseSurface()
	{
        return (EReference)getOrientableSurfaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrientableSurfaceType_Orientation()
	{
        return (EAttribute)getOrientableSurfaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValueGroupType()
	{
		if (parameterValueGroupTypeEClass == null)
		{
			parameterValueGroupTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(268);
		}
		return parameterValueGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValueGroupType_ParameterValue()
	{
        return (EReference)getParameterValueGroupType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueGroupType_GroupGroup()
	{
        return (EAttribute)getParameterValueGroupType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValueGroupType_Group()
	{
        return (EReference)getParameterValueGroupType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValueType()
	{
		if (parameterValueTypeEClass == null)
		{
			parameterValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(269);
		}
		return parameterValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValueType_Value()
	{
        return (EReference)getParameterValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValueType_DmsAngleValue()
	{
        return (EReference)getParameterValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueType_StringValue()
	{
        return (EAttribute)getParameterValueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueType_IntegerValue()
	{
        return (EAttribute)getParameterValueType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueType_BooleanValue()
	{
        return (EAttribute)getParameterValueType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValueType_ValueList()
	{
        return (EReference)getParameterValueType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueType_IntegerValueList()
	{
        return (EAttribute)getParameterValueType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueType_ValueFile()
	{
        return (EAttribute)getParameterValueType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueType_OperationParameterGroup()
	{
        return (EAttribute)getParameterValueType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValueType_OperationParameter()
	{
        return (EReference)getParameterValueType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassThroughOperationPropertyType()
	{
		if (passThroughOperationPropertyTypeEClass == null)
		{
			passThroughOperationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(270);
		}
		return passThroughOperationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassThroughOperationPropertyType_PassThroughOperation()
	{
        return (EReference)getPassThroughOperationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThroughOperationPropertyType_Actuate()
	{
        return (EAttribute)getPassThroughOperationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThroughOperationPropertyType_Arcrole()
	{
        return (EAttribute)getPassThroughOperationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThroughOperationPropertyType_Href()
	{
        return (EAttribute)getPassThroughOperationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThroughOperationPropertyType_NilReason()
	{
        return (EAttribute)getPassThroughOperationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThroughOperationPropertyType_RemoteSchema()
	{
        return (EAttribute)getPassThroughOperationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThroughOperationPropertyType_Role()
	{
        return (EAttribute)getPassThroughOperationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThroughOperationPropertyType_Show()
	{
        return (EAttribute)getPassThroughOperationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThroughOperationPropertyType_Title()
	{
        return (EAttribute)getPassThroughOperationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThroughOperationPropertyType_Type()
	{
        return (EAttribute)getPassThroughOperationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassThroughOperationType()
	{
		if (passThroughOperationTypeEClass == null)
		{
			passThroughOperationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(271);
		}
		return passThroughOperationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThroughOperationType_ModifiedCoordinate()
	{
        return (EAttribute)getPassThroughOperationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThroughOperationType_CoordOperationGroup()
	{
        return (EAttribute)getPassThroughOperationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassThroughOperationType_CoordOperation()
	{
        return (EReference)getPassThroughOperationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassThroughOperationType_AggregationType()
	{
        return (EAttribute)getPassThroughOperationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointArrayPropertyType()
	{
		if (pointArrayPropertyTypeEClass == null)
		{
			pointArrayPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(272);
		}
		return pointArrayPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointArrayPropertyType_Group()
	{
        return (EAttribute)getPointArrayPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointArrayPropertyType_Point()
	{
        return (EReference)getPointArrayPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointArrayPropertyType_Owns()
	{
        return (EAttribute)getPointArrayPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointPropertyType()
	{
		if (pointPropertyTypeEClass == null)
		{
			pointPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(273);
		}
		return pointPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointPropertyType_Point()
	{
        return (EReference)getPointPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointPropertyType_Actuate()
	{
        return (EAttribute)getPointPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointPropertyType_Arcrole()
	{
        return (EAttribute)getPointPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointPropertyType_Href()
	{
        return (EAttribute)getPointPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointPropertyType_NilReason()
	{
        return (EAttribute)getPointPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointPropertyType_Owns()
	{
        return (EAttribute)getPointPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointPropertyType_RemoteSchema()
	{
        return (EAttribute)getPointPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointPropertyType_Role()
	{
        return (EAttribute)getPointPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointPropertyType_Show()
	{
        return (EAttribute)getPointPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointPropertyType_Title()
	{
        return (EAttribute)getPointPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointPropertyType_Type()
	{
        return (EAttribute)getPointPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointType()
	{
		if (pointTypeEClass == null)
		{
			pointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(274);
		}
		return pointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointType_Pos()
	{
        return (EReference)getPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointType_Coordinates()
	{
        return (EReference)getPointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolarCSPropertyType()
	{
		if (polarCSPropertyTypeEClass == null)
		{
			polarCSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(275);
		}
		return polarCSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolarCSPropertyType_PolarCS()
	{
        return (EReference)getPolarCSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarCSPropertyType_Actuate()
	{
        return (EAttribute)getPolarCSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarCSPropertyType_Arcrole()
	{
        return (EAttribute)getPolarCSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarCSPropertyType_Href()
	{
        return (EAttribute)getPolarCSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarCSPropertyType_NilReason()
	{
        return (EAttribute)getPolarCSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarCSPropertyType_RemoteSchema()
	{
        return (EAttribute)getPolarCSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarCSPropertyType_Role()
	{
        return (EAttribute)getPolarCSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarCSPropertyType_Show()
	{
        return (EAttribute)getPolarCSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarCSPropertyType_Title()
	{
        return (EAttribute)getPolarCSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolarCSPropertyType_Type()
	{
        return (EAttribute)getPolarCSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolarCSType()
	{
		if (polarCSTypeEClass == null)
		{
			polarCSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(276);
		}
		return polarCSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonPatchType()
	{
		if (polygonPatchTypeEClass == null)
		{
			polygonPatchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(277);
		}
		return polygonPatchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonPatchType_Exterior()
	{
        return (EReference)getPolygonPatchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonPatchType_Interior()
	{
        return (EReference)getPolygonPatchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonPatchType_Interpolation()
	{
        return (EAttribute)getPolygonPatchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonType()
	{
		if (polygonTypeEClass == null)
		{
			polygonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(278);
		}
		return polygonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonType_Exterior()
	{
        return (EReference)getPolygonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonType_Interior()
	{
        return (EReference)getPolygonType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimeMeridianPropertyType()
	{
		if (primeMeridianPropertyTypeEClass == null)
		{
			primeMeridianPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(279);
		}
		return primeMeridianPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimeMeridianPropertyType_PrimeMeridian()
	{
        return (EReference)getPrimeMeridianPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimeMeridianPropertyType_Actuate()
	{
        return (EAttribute)getPrimeMeridianPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimeMeridianPropertyType_Arcrole()
	{
        return (EAttribute)getPrimeMeridianPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimeMeridianPropertyType_Href()
	{
        return (EAttribute)getPrimeMeridianPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimeMeridianPropertyType_NilReason()
	{
        return (EAttribute)getPrimeMeridianPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimeMeridianPropertyType_RemoteSchema()
	{
        return (EAttribute)getPrimeMeridianPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimeMeridianPropertyType_Role()
	{
        return (EAttribute)getPrimeMeridianPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimeMeridianPropertyType_Show()
	{
        return (EAttribute)getPrimeMeridianPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimeMeridianPropertyType_Title()
	{
        return (EAttribute)getPrimeMeridianPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimeMeridianPropertyType_Type()
	{
        return (EAttribute)getPrimeMeridianPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimeMeridianType()
	{
		if (primeMeridianTypeEClass == null)
		{
			primeMeridianTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(280);
		}
		return primeMeridianTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimeMeridianType_GreenwichLongitude()
	{
        return (EReference)getPrimeMeridianType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorityLocationPropertyType()
	{
		if (priorityLocationPropertyTypeEClass == null)
		{
			priorityLocationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(281);
		}
		return priorityLocationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriorityLocationPropertyType_Priority()
	{
        return (EAttribute)getPriorityLocationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedurePropertyType()
	{
		if (procedurePropertyTypeEClass == null)
		{
			procedurePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(282);
		}
		return procedurePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePropertyType_AbstractFeatureGroup()
	{
        return (EAttribute)getProcedurePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedurePropertyType_AbstractFeature()
	{
        return (EReference)getProcedurePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePropertyType_Actuate()
	{
        return (EAttribute)getProcedurePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePropertyType_Arcrole()
	{
        return (EAttribute)getProcedurePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePropertyType_Href()
	{
        return (EAttribute)getProcedurePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePropertyType_NilReason()
	{
        return (EAttribute)getProcedurePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePropertyType_Owns()
	{
        return (EAttribute)getProcedurePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePropertyType_RemoteSchema()
	{
        return (EAttribute)getProcedurePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePropertyType_Role()
	{
        return (EAttribute)getProcedurePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePropertyType_Show()
	{
        return (EAttribute)getProcedurePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePropertyType_Title()
	{
        return (EAttribute)getProcedurePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedurePropertyType_Type()
	{
        return (EAttribute)getProcedurePropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectedCRSPropertyType()
	{
		if (projectedCRSPropertyTypeEClass == null)
		{
			projectedCRSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(283);
		}
		return projectedCRSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectedCRSPropertyType_ProjectedCRS()
	{
        return (EReference)getProjectedCRSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedCRSPropertyType_Actuate()
	{
        return (EAttribute)getProjectedCRSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedCRSPropertyType_Arcrole()
	{
        return (EAttribute)getProjectedCRSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedCRSPropertyType_Href()
	{
        return (EAttribute)getProjectedCRSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedCRSPropertyType_NilReason()
	{
        return (EAttribute)getProjectedCRSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedCRSPropertyType_RemoteSchema()
	{
        return (EAttribute)getProjectedCRSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedCRSPropertyType_Role()
	{
        return (EAttribute)getProjectedCRSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedCRSPropertyType_Show()
	{
        return (EAttribute)getProjectedCRSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedCRSPropertyType_Title()
	{
        return (EAttribute)getProjectedCRSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedCRSPropertyType_Type()
	{
        return (EAttribute)getProjectedCRSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectedCRSType()
	{
		if (projectedCRSTypeEClass == null)
		{
			projectedCRSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(284);
		}
		return projectedCRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectedCRSType_BaseGeodeticCRS()
	{
        return (EReference)getProjectedCRSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectedCRSType_BaseGeographicCRS()
	{
        return (EReference)getProjectedCRSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectedCRSType_CartesianCSGroup()
	{
        return (EAttribute)getProjectedCRSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectedCRSType_CartesianCS()
	{
        return (EReference)getProjectedCRSType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityExtentType()
	{
		if (quantityExtentTypeEClass == null)
		{
			quantityExtentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(286);
		}
		return quantityExtentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityPropertyType()
	{
		if (quantityPropertyTypeEClass == null)
		{
			quantityPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(287);
		}
		return quantityPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantityPropertyType_Quantity()
	{
        return (EReference)getQuantityPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityPropertyType_Actuate()
	{
        return (EAttribute)getQuantityPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityPropertyType_Arcrole()
	{
        return (EAttribute)getQuantityPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityPropertyType_Href()
	{
        return (EAttribute)getQuantityPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityPropertyType_NilReason()
	{
        return (EAttribute)getQuantityPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityPropertyType_RemoteSchema()
	{
        return (EAttribute)getQuantityPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityPropertyType_Role()
	{
        return (EAttribute)getQuantityPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityPropertyType_Show()
	{
        return (EAttribute)getQuantityPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityPropertyType_Title()
	{
        return (EAttribute)getQuantityPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityPropertyType_Type()
	{
        return (EAttribute)getQuantityPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityType()
	{
		if (quantityTypeEClass == null)
		{
			quantityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(288);
		}
		return quantityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityType_NilReason()
	{
        return (EAttribute)getQuantityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeSetType()
	{
		if (rangeSetTypeEClass == null)
		{
			rangeSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(289);
		}
		return rangeSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeSetType_ValueArray()
	{
        return (EReference)getRangeSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeSetType_AbstractScalarValueListGroup()
	{
        return (EAttribute)getRangeSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeSetType_AbstractScalarValueList()
	{
        return (EReference)getRangeSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeSetType_DataBlock()
	{
        return (EReference)getRangeSetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeSetType_File()
	{
        return (EReference)getRangeSetType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangleType()
	{
		if (rectangleTypeEClass == null)
		{
			rectangleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(290);
		}
		return rectangleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangleType_Exterior()
	{
        return (EReference)getRectangleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleType_Interpolation()
	{
        return (EAttribute)getRectangleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectifiedGridType()
	{
		if (rectifiedGridTypeEClass == null)
		{
			rectifiedGridTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(291);
		}
		return rectifiedGridTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectifiedGridType_Origin()
	{
        return (EReference)getRectifiedGridType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectifiedGridType_OffsetVector()
	{
        return (EReference)getRectifiedGridType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceType()
	{
		if (referenceTypeEClass == null)
		{
			referenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(292);
		}
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Actuate()
	{
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Arcrole()
	{
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Href()
	{
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_NilReason()
	{
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Owns()
	{
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_RemoteSchema()
	{
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Role()
	{
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Show()
	{
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Title()
	{
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Type()
	{
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefLocationType()
	{
		if (refLocationTypeEClass == null)
		{
			refLocationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(293);
		}
		return refLocationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefLocationType_AffinePlacement()
	{
        return (EReference)getRefLocationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedTimeType()
	{
		if (relatedTimeTypeEClass == null)
		{
			relatedTimeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(294);
		}
		return relatedTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatedTimeType_RelativePosition()
	{
        return (EAttribute)getRelatedTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultType()
	{
		if (resultTypeEClass == null)
		{
			resultTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(297);
		}
		return resultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Any()
	{
        return (EAttribute)getResultType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Actuate()
	{
        return (EAttribute)getResultType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Arcrole()
	{
        return (EAttribute)getResultType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Href()
	{
        return (EAttribute)getResultType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_NilReason()
	{
        return (EAttribute)getResultType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Owns()
	{
        return (EAttribute)getResultType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_RemoteSchema()
	{
        return (EAttribute)getResultType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Role()
	{
        return (EAttribute)getResultType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Show()
	{
        return (EAttribute)getResultType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Title()
	{
        return (EAttribute)getResultType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Type()
	{
        return (EAttribute)getResultType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRingPropertyType()
	{
		if (ringPropertyTypeEClass == null)
		{
			ringPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(298);
		}
		return ringPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRingPropertyType_Ring()
	{
        return (EReference)getRingPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRingType()
	{
		if (ringTypeEClass == null)
		{
			ringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(299);
		}
		return ringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRingType_CurveMember()
	{
        return (EReference)getRingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRingType_AggregationType()
	{
        return (EAttribute)getRingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowsType()
	{
		if (rowsTypeEClass == null)
		{
			rowsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(300);
		}
		return rowsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRowsType_Row()
	{
        return (EReference)getRowsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowType()
	{
		if (rowTypeEClass == null)
		{
			rowTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(301);
		}
		return rowTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRowType_PosList()
	{
        return (EReference)getRowType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowType_GeometricPositionGroup()
	{
        return (EAttribute)getRowType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRowType_Pos()
	{
        return (EReference)getRowType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRowType_PointProperty()
	{
        return (EReference)getRowType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaleType()
	{
		if (scaleTypeEClass == null)
		{
			scaleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(302);
		}
		return scaleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecondDefiningParameterType()
	{
		if (secondDefiningParameterTypeEClass == null)
		{
			secondDefiningParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(303);
		}
		return secondDefiningParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondDefiningParameterType_InverseFlattening()
	{
        return (EReference)getSecondDefiningParameterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondDefiningParameterType_SemiMinorAxis()
	{
        return (EReference)getSecondDefiningParameterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondDefiningParameterType_IsSphere()
	{
        return (EAttribute)getSecondDefiningParameterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecondDefiningParameterType1()
	{
		if (secondDefiningParameterType1EClass == null)
		{
			secondDefiningParameterType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(304);
		}
		return secondDefiningParameterType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondDefiningParameterType1_SecondDefiningParameter()
	{
        return (EReference)getSecondDefiningParameterType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceRuleType()
	{
		if (sequenceRuleTypeEClass == null)
		{
			sequenceRuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(307);
		}
		return sequenceRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceRuleType_Value()
	{
        return (EAttribute)getSequenceRuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceRuleType_AxisOrder()
	{
        return (EAttribute)getSequenceRuleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceRuleType_Order()
	{
        return (EAttribute)getSequenceRuleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShellPropertyType()
	{
		if (shellPropertyTypeEClass == null)
		{
			shellPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(308);
		}
		return shellPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShellPropertyType_Shell()
	{
        return (EReference)getShellPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShellType()
	{
		if (shellTypeEClass == null)
		{
			shellTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(309);
		}
		return shellTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShellType_SurfaceMember()
	{
        return (EReference)getShellType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShellType_AggregationType()
	{
        return (EAttribute)getShellType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleCRSPropertyType()
	{
		if (singleCRSPropertyTypeEClass == null)
		{
			singleCRSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(312);
		}
		return singleCRSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleCRSPropertyType_AbstractSingleCRSGroup()
	{
        return (EAttribute)getSingleCRSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleCRSPropertyType_AbstractSingleCRS()
	{
        return (EReference)getSingleCRSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleCRSPropertyType_Actuate()
	{
        return (EAttribute)getSingleCRSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleCRSPropertyType_Arcrole()
	{
        return (EAttribute)getSingleCRSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleCRSPropertyType_Href()
	{
        return (EAttribute)getSingleCRSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleCRSPropertyType_NilReason()
	{
        return (EAttribute)getSingleCRSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleCRSPropertyType_RemoteSchema()
	{
        return (EAttribute)getSingleCRSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleCRSPropertyType_Role()
	{
        return (EAttribute)getSingleCRSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleCRSPropertyType_Show()
	{
        return (EAttribute)getSingleCRSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleCRSPropertyType_Title()
	{
        return (EAttribute)getSingleCRSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleCRSPropertyType_Type()
	{
        return (EAttribute)getSingleCRSPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleOperationPropertyType()
	{
		if (singleOperationPropertyTypeEClass == null)
		{
			singleOperationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(313);
		}
		return singleOperationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleOperationPropertyType_AbstractSingleOperationGroup()
	{
        return (EAttribute)getSingleOperationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleOperationPropertyType_AbstractSingleOperation()
	{
        return (EReference)getSingleOperationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleOperationPropertyType_Actuate()
	{
        return (EAttribute)getSingleOperationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleOperationPropertyType_Arcrole()
	{
        return (EAttribute)getSingleOperationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleOperationPropertyType_Href()
	{
        return (EAttribute)getSingleOperationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleOperationPropertyType_NilReason()
	{
        return (EAttribute)getSingleOperationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleOperationPropertyType_RemoteSchema()
	{
        return (EAttribute)getSingleOperationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleOperationPropertyType_Role()
	{
        return (EAttribute)getSingleOperationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleOperationPropertyType_Show()
	{
        return (EAttribute)getSingleOperationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleOperationPropertyType_Title()
	{
        return (EAttribute)getSingleOperationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleOperationPropertyType_Type()
	{
        return (EAttribute)getSingleOperationPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolidArrayPropertyType()
	{
		if (solidArrayPropertyTypeEClass == null)
		{
			solidArrayPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(314);
		}
		return solidArrayPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidArrayPropertyType_Group()
	{
        return (EAttribute)getSolidArrayPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidArrayPropertyType_AbstractSolidGroup()
	{
        return (EAttribute)getSolidArrayPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolidArrayPropertyType_AbstractSolid()
	{
        return (EReference)getSolidArrayPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidArrayPropertyType_Owns()
	{
        return (EAttribute)getSolidArrayPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolidPropertyType()
	{
		if (solidPropertyTypeEClass == null)
		{
			solidPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(315);
		}
		return solidPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidPropertyType_AbstractSolidGroup()
	{
        return (EAttribute)getSolidPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolidPropertyType_AbstractSolid()
	{
        return (EReference)getSolidPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidPropertyType_Actuate()
	{
        return (EAttribute)getSolidPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidPropertyType_Arcrole()
	{
        return (EAttribute)getSolidPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidPropertyType_Href()
	{
        return (EAttribute)getSolidPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidPropertyType_NilReason()
	{
        return (EAttribute)getSolidPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidPropertyType_Owns()
	{
        return (EAttribute)getSolidPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidPropertyType_RemoteSchema()
	{
        return (EAttribute)getSolidPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidPropertyType_Role()
	{
        return (EAttribute)getSolidPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidPropertyType_Show()
	{
        return (EAttribute)getSolidPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidPropertyType_Title()
	{
        return (EAttribute)getSolidPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidPropertyType_Type()
	{
        return (EAttribute)getSolidPropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolidType()
	{
		if (solidTypeEClass == null)
		{
			solidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(316);
		}
		return solidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolidType_Exterior()
	{
        return (EReference)getSolidType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolidType_Interior()
	{
        return (EReference)getSolidType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeedType()
	{
		if (speedTypeEClass == null)
		{
			speedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(317);
		}
		return speedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphereType()
	{
		if (sphereTypeEClass == null)
		{
			sphereTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(318);
		}
		return sphereTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_HorizontalCurveType()
	{
        return (EAttribute)getSphereType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_VerticalCurveType()
	{
        return (EAttribute)getSphereType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalCSPropertyType()
	{
		if (sphericalCSPropertyTypeEClass == null)
		{
			sphericalCSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(319);
		}
		return sphericalCSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSphericalCSPropertyType_SphericalCS()
	{
        return (EReference)getSphericalCSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCSPropertyType_Actuate()
	{
        return (EAttribute)getSphericalCSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCSPropertyType_Arcrole()
	{
        return (EAttribute)getSphericalCSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCSPropertyType_Href()
	{
        return (EAttribute)getSphericalCSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCSPropertyType_NilReason()
	{
        return (EAttribute)getSphericalCSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCSPropertyType_RemoteSchema()
	{
        return (EAttribute)getSphericalCSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCSPropertyType_Role()
	{
        return (EAttribute)getSphericalCSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCSPropertyType_Show()
	{
        return (EAttribute)getSphericalCSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCSPropertyType_Title()
	{
        return (EAttribute)getSphericalCSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCSPropertyType_Type()
	{
        return (EAttribute)getSphericalCSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalCSType()
	{
		if (sphericalCSTypeEClass == null)
		{
			sphericalCSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(320);
		}
		return sphericalCSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringOrRefType()
	{
		if (stringOrRefTypeEClass == null)
		{
			stringOrRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(322);
		}
		return stringOrRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringOrRefType_Value()
	{
        return (EAttribute)getStringOrRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringOrRefType_Actuate()
	{
        return (EAttribute)getStringOrRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringOrRefType_Arcrole()
	{
        return (EAttribute)getStringOrRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringOrRefType_Href()
	{
        return (EAttribute)getStringOrRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringOrRefType_NilReason()
	{
        return (EAttribute)getStringOrRefType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringOrRefType_RemoteSchema()
	{
        return (EAttribute)getStringOrRefType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringOrRefType_Role()
	{
        return (EAttribute)getStringOrRefType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringOrRefType_Show()
	{
        return (EAttribute)getStringOrRefType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringOrRefType_Title()
	{
        return (EAttribute)getStringOrRefType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringOrRefType_Type()
	{
        return (EAttribute)getStringOrRefType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceArrayPropertyType()
	{
		if (surfaceArrayPropertyTypeEClass == null)
		{
			surfaceArrayPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(325);
		}
		return surfaceArrayPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceArrayPropertyType_Group()
	{
        return (EAttribute)getSurfaceArrayPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceArrayPropertyType_AbstractSurfaceGroup()
	{
        return (EAttribute)getSurfaceArrayPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfaceArrayPropertyType_AbstractSurface()
	{
        return (EReference)getSurfaceArrayPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceArrayPropertyType_Owns()
	{
        return (EAttribute)getSurfaceArrayPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfacePatchArrayPropertyType()
	{
		if (surfacePatchArrayPropertyTypeEClass == null)
		{
			surfacePatchArrayPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(328);
		}
		return surfacePatchArrayPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePatchArrayPropertyType_Group()
	{
        return (EAttribute)getSurfacePatchArrayPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePatchArrayPropertyType_AbstractSurfacePatchGroup()
	{
        return (EAttribute)getSurfacePatchArrayPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfacePatchArrayPropertyType_AbstractSurfacePatch()
	{
        return (EReference)getSurfacePatchArrayPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfacePropertyType()
	{
		if (surfacePropertyTypeEClass == null)
		{
			surfacePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(329);
		}
		return surfacePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePropertyType_AbstractSurfaceGroup()
	{
        return (EAttribute)getSurfacePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfacePropertyType_AbstractSurface()
	{
        return (EReference)getSurfacePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePropertyType_Actuate()
	{
        return (EAttribute)getSurfacePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePropertyType_Arcrole()
	{
        return (EAttribute)getSurfacePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePropertyType_Href()
	{
        return (EAttribute)getSurfacePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePropertyType_NilReason()
	{
        return (EAttribute)getSurfacePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePropertyType_Owns()
	{
        return (EAttribute)getSurfacePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePropertyType_RemoteSchema()
	{
        return (EAttribute)getSurfacePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePropertyType_Role()
	{
        return (EAttribute)getSurfacePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePropertyType_Show()
	{
        return (EAttribute)getSurfacePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePropertyType_Title()
	{
        return (EAttribute)getSurfacePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfacePropertyType_Type()
	{
        return (EAttribute)getSurfacePropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceType()
	{
		if (surfaceTypeEClass == null)
		{
			surfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(330);
		}
		return surfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceType_PatchesGroup()
	{
        return (EAttribute)getSurfaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfaceType_Patches()
	{
        return (EReference)getSurfaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetPropertyType()
	{
		if (targetPropertyTypeEClass == null)
		{
			targetPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(331);
		}
		return targetPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPropertyType_AbstractFeatureGroup()
	{
        return (EAttribute)getTargetPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPropertyType_AbstractFeature()
	{
        return (EReference)getTargetPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPropertyType_AbstractGeometryGroup()
	{
        return (EAttribute)getTargetPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPropertyType_AbstractGeometry()
	{
        return (EReference)getTargetPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPropertyType_Actuate()
	{
        return (EAttribute)getTargetPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPropertyType_Arcrole()
	{
        return (EAttribute)getTargetPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPropertyType_Href()
	{
        return (EAttribute)getTargetPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPropertyType_NilReason()
	{
        return (EAttribute)getTargetPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPropertyType_Owns()
	{
        return (EAttribute)getTargetPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPropertyType_RemoteSchema()
	{
        return (EAttribute)getTargetPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPropertyType_Role()
	{
        return (EAttribute)getTargetPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPropertyType_Show()
	{
        return (EAttribute)getTargetPropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPropertyType_Title()
	{
        return (EAttribute)getTargetPropertyType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPropertyType_Type()
	{
        return (EAttribute)getTargetPropertyType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalCRSPropertyType()
	{
		if (temporalCRSPropertyTypeEClass == null)
		{
			temporalCRSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(332);
		}
		return temporalCRSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalCRSPropertyType_TemporalCRS()
	{
        return (EReference)getTemporalCRSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCRSPropertyType_Actuate()
	{
        return (EAttribute)getTemporalCRSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCRSPropertyType_Arcrole()
	{
        return (EAttribute)getTemporalCRSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCRSPropertyType_Href()
	{
        return (EAttribute)getTemporalCRSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCRSPropertyType_NilReason()
	{
        return (EAttribute)getTemporalCRSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCRSPropertyType_RemoteSchema()
	{
        return (EAttribute)getTemporalCRSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCRSPropertyType_Role()
	{
        return (EAttribute)getTemporalCRSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCRSPropertyType_Show()
	{
        return (EAttribute)getTemporalCRSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCRSPropertyType_Title()
	{
        return (EAttribute)getTemporalCRSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCRSPropertyType_Type()
	{
        return (EAttribute)getTemporalCRSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalCRSType()
	{
		if (temporalCRSTypeEClass == null)
		{
			temporalCRSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(333);
		}
		return temporalCRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCRSType_TimeCSGroup()
	{
        return (EAttribute)getTemporalCRSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalCRSType_TimeCS()
	{
        return (EReference)getTemporalCRSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalCRSType_UsesTemporalCS()
	{
        return (EReference)getTemporalCRSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCRSType_TemporalDatumGroup()
	{
        return (EAttribute)getTemporalCRSType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalCRSType_TemporalDatum()
	{
        return (EReference)getTemporalCRSType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalCSPropertyType()
	{
		if (temporalCSPropertyTypeEClass == null)
		{
			temporalCSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(334);
		}
		return temporalCSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalCSPropertyType_TemporalCS()
	{
        return (EReference)getTemporalCSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCSPropertyType_Actuate()
	{
        return (EAttribute)getTemporalCSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCSPropertyType_Arcrole()
	{
        return (EAttribute)getTemporalCSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCSPropertyType_Href()
	{
        return (EAttribute)getTemporalCSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCSPropertyType_NilReason()
	{
        return (EAttribute)getTemporalCSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCSPropertyType_RemoteSchema()
	{
        return (EAttribute)getTemporalCSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCSPropertyType_Role()
	{
        return (EAttribute)getTemporalCSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCSPropertyType_Show()
	{
        return (EAttribute)getTemporalCSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCSPropertyType_Title()
	{
        return (EAttribute)getTemporalCSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalCSPropertyType_Type()
	{
        return (EAttribute)getTemporalCSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalCSType()
	{
		if (temporalCSTypeEClass == null)
		{
			temporalCSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(335);
		}
		return temporalCSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalDatumBaseType()
	{
		if (temporalDatumBaseTypeEClass == null)
		{
			temporalDatumBaseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(336);
		}
		return temporalDatumBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalDatumPropertyType()
	{
		if (temporalDatumPropertyTypeEClass == null)
		{
			temporalDatumPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(337);
		}
		return temporalDatumPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalDatumPropertyType_TemporalDatum()
	{
        return (EReference)getTemporalDatumPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalDatumPropertyType_Actuate()
	{
        return (EAttribute)getTemporalDatumPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalDatumPropertyType_Arcrole()
	{
        return (EAttribute)getTemporalDatumPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalDatumPropertyType_Href()
	{
        return (EAttribute)getTemporalDatumPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalDatumPropertyType_NilReason()
	{
        return (EAttribute)getTemporalDatumPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalDatumPropertyType_RemoteSchema()
	{
        return (EAttribute)getTemporalDatumPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalDatumPropertyType_Role()
	{
        return (EAttribute)getTemporalDatumPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalDatumPropertyType_Show()
	{
        return (EAttribute)getTemporalDatumPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalDatumPropertyType_Title()
	{
        return (EAttribute)getTemporalDatumPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalDatumPropertyType_Type()
	{
        return (EAttribute)getTemporalDatumPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalDatumType()
	{
		if (temporalDatumTypeEClass == null)
		{
			temporalDatumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(338);
		}
		return temporalDatumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalDatumType_Origin()
	{
        return (EAttribute)getTemporalDatumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeCalendarEraPropertyType()
	{
		if (timeCalendarEraPropertyTypeEClass == null)
		{
			timeCalendarEraPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(339);
		}
		return timeCalendarEraPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeCalendarEraPropertyType_TimeCalendarEra()
	{
        return (EReference)getTimeCalendarEraPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarEraPropertyType_Actuate()
	{
        return (EAttribute)getTimeCalendarEraPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarEraPropertyType_Arcrole()
	{
        return (EAttribute)getTimeCalendarEraPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarEraPropertyType_Href()
	{
        return (EAttribute)getTimeCalendarEraPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarEraPropertyType_NilReason()
	{
        return (EAttribute)getTimeCalendarEraPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarEraPropertyType_Owns()
	{
        return (EAttribute)getTimeCalendarEraPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarEraPropertyType_RemoteSchema()
	{
        return (EAttribute)getTimeCalendarEraPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarEraPropertyType_Role()
	{
        return (EAttribute)getTimeCalendarEraPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarEraPropertyType_Show()
	{
        return (EAttribute)getTimeCalendarEraPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarEraPropertyType_Title()
	{
        return (EAttribute)getTimeCalendarEraPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarEraPropertyType_Type()
	{
        return (EAttribute)getTimeCalendarEraPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeCalendarEraType()
	{
		if (timeCalendarEraTypeEClass == null)
		{
			timeCalendarEraTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(340);
		}
		return timeCalendarEraTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeCalendarEraType_ReferenceEvent()
	{
        return (EReference)getTimeCalendarEraType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarEraType_ReferenceDate()
	{
        return (EAttribute)getTimeCalendarEraType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarEraType_JulianReference()
	{
        return (EAttribute)getTimeCalendarEraType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeCalendarEraType_EpochOfUse()
	{
        return (EReference)getTimeCalendarEraType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeCalendarPropertyType()
	{
		if (timeCalendarPropertyTypeEClass == null)
		{
			timeCalendarPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(341);
		}
		return timeCalendarPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeCalendarPropertyType_TimeCalendar()
	{
        return (EReference)getTimeCalendarPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarPropertyType_Actuate()
	{
        return (EAttribute)getTimeCalendarPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarPropertyType_Arcrole()
	{
        return (EAttribute)getTimeCalendarPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarPropertyType_Href()
	{
        return (EAttribute)getTimeCalendarPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarPropertyType_NilReason()
	{
        return (EAttribute)getTimeCalendarPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarPropertyType_Owns()
	{
        return (EAttribute)getTimeCalendarPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarPropertyType_RemoteSchema()
	{
        return (EAttribute)getTimeCalendarPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarPropertyType_Role()
	{
        return (EAttribute)getTimeCalendarPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarPropertyType_Show()
	{
        return (EAttribute)getTimeCalendarPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarPropertyType_Title()
	{
        return (EAttribute)getTimeCalendarPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCalendarPropertyType_Type()
	{
        return (EAttribute)getTimeCalendarPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeCalendarType()
	{
		if (timeCalendarTypeEClass == null)
		{
			timeCalendarTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(342);
		}
		return timeCalendarTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeCalendarType_ReferenceFrame()
	{
        return (EReference)getTimeCalendarType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeClockPropertyType()
	{
		if (timeClockPropertyTypeEClass == null)
		{
			timeClockPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(343);
		}
		return timeClockPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeClockPropertyType_TimeClock()
	{
        return (EReference)getTimeClockPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeClockPropertyType_Actuate()
	{
        return (EAttribute)getTimeClockPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeClockPropertyType_Arcrole()
	{
        return (EAttribute)getTimeClockPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeClockPropertyType_Href()
	{
        return (EAttribute)getTimeClockPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeClockPropertyType_NilReason()
	{
        return (EAttribute)getTimeClockPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeClockPropertyType_Owns()
	{
        return (EAttribute)getTimeClockPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeClockPropertyType_RemoteSchema()
	{
        return (EAttribute)getTimeClockPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeClockPropertyType_Role()
	{
        return (EAttribute)getTimeClockPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeClockPropertyType_Show()
	{
        return (EAttribute)getTimeClockPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeClockPropertyType_Title()
	{
        return (EAttribute)getTimeClockPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeClockPropertyType_Type()
	{
        return (EAttribute)getTimeClockPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeClockType()
	{
		if (timeClockTypeEClass == null)
		{
			timeClockTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(344);
		}
		return timeClockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeClockType_ReferenceEvent()
	{
        return (EReference)getTimeClockType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeClockType_ReferenceTime()
	{
        return (EAttribute)getTimeClockType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeClockType_UtcReference()
	{
        return (EAttribute)getTimeClockType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeClockType_DateBasis()
	{
        return (EReference)getTimeClockType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeCoordinateSystemType()
	{
		if (timeCoordinateSystemTypeEClass == null)
		{
			timeCoordinateSystemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(345);
		}
		return timeCoordinateSystemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeCoordinateSystemType_OriginPosition()
	{
        return (EReference)getTimeCoordinateSystemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeCoordinateSystemType_Origin()
	{
        return (EReference)getTimeCoordinateSystemType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeCoordinateSystemType_Interval()
	{
        return (EReference)getTimeCoordinateSystemType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeCSPropertyType()
	{
		if (timeCSPropertyTypeEClass == null)
		{
			timeCSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(346);
		}
		return timeCSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeCSPropertyType_TimeCS()
	{
        return (EReference)getTimeCSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCSPropertyType_Actuate()
	{
        return (EAttribute)getTimeCSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCSPropertyType_Arcrole()
	{
        return (EAttribute)getTimeCSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCSPropertyType_Href()
	{
        return (EAttribute)getTimeCSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCSPropertyType_NilReason()
	{
        return (EAttribute)getTimeCSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCSPropertyType_RemoteSchema()
	{
        return (EAttribute)getTimeCSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCSPropertyType_Role()
	{
        return (EAttribute)getTimeCSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCSPropertyType_Show()
	{
        return (EAttribute)getTimeCSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCSPropertyType_Title()
	{
        return (EAttribute)getTimeCSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCSPropertyType_Type()
	{
        return (EAttribute)getTimeCSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeCSType()
	{
		if (timeCSTypeEClass == null)
		{
			timeCSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(347);
		}
		return timeCSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEdgePropertyType()
	{
		if (timeEdgePropertyTypeEClass == null)
		{
			timeEdgePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(348);
		}
		return timeEdgePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEdgePropertyType_TimeEdge()
	{
        return (EReference)getTimeEdgePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEdgePropertyType_Actuate()
	{
        return (EAttribute)getTimeEdgePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEdgePropertyType_Arcrole()
	{
        return (EAttribute)getTimeEdgePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEdgePropertyType_Href()
	{
        return (EAttribute)getTimeEdgePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEdgePropertyType_NilReason()
	{
        return (EAttribute)getTimeEdgePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEdgePropertyType_Owns()
	{
        return (EAttribute)getTimeEdgePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEdgePropertyType_RemoteSchema()
	{
        return (EAttribute)getTimeEdgePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEdgePropertyType_Role()
	{
        return (EAttribute)getTimeEdgePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEdgePropertyType_Show()
	{
        return (EAttribute)getTimeEdgePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEdgePropertyType_Title()
	{
        return (EAttribute)getTimeEdgePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEdgePropertyType_Type()
	{
        return (EAttribute)getTimeEdgePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEdgeType()
	{
		if (timeEdgeTypeEClass == null)
		{
			timeEdgeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(349);
		}
		return timeEdgeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEdgeType_Start()
	{
        return (EReference)getTimeEdgeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEdgeType_End()
	{
        return (EReference)getTimeEdgeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEdgeType_Extent()
	{
        return (EReference)getTimeEdgeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInstantPropertyType()
	{
		if (timeInstantPropertyTypeEClass == null)
		{
			timeInstantPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(352);
		}
		return timeInstantPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInstantPropertyType_TimeInstant()
	{
        return (EReference)getTimeInstantPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInstantPropertyType_Actuate()
	{
        return (EAttribute)getTimeInstantPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInstantPropertyType_Arcrole()
	{
        return (EAttribute)getTimeInstantPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInstantPropertyType_Href()
	{
        return (EAttribute)getTimeInstantPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInstantPropertyType_NilReason()
	{
        return (EAttribute)getTimeInstantPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInstantPropertyType_Owns()
	{
        return (EAttribute)getTimeInstantPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInstantPropertyType_RemoteSchema()
	{
        return (EAttribute)getTimeInstantPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInstantPropertyType_Role()
	{
        return (EAttribute)getTimeInstantPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInstantPropertyType_Show()
	{
        return (EAttribute)getTimeInstantPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInstantPropertyType_Title()
	{
        return (EAttribute)getTimeInstantPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInstantPropertyType_Type()
	{
        return (EAttribute)getTimeInstantPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInstantType()
	{
		if (timeInstantTypeEClass == null)
		{
			timeInstantTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(353);
		}
		return timeInstantTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInstantType_TimePosition()
	{
        return (EReference)getTimeInstantType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeIntervalLengthType()
	{
		if (timeIntervalLengthTypeEClass == null)
		{
			timeIntervalLengthTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(354);
		}
		return timeIntervalLengthTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeIntervalLengthType_Value()
	{
        return (EAttribute)getTimeIntervalLengthType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeIntervalLengthType_Factor()
	{
        return (EAttribute)getTimeIntervalLengthType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeIntervalLengthType_Radix()
	{
        return (EAttribute)getTimeIntervalLengthType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeIntervalLengthType_Unit()
	{
        return (EAttribute)getTimeIntervalLengthType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeNodePropertyType()
	{
		if (timeNodePropertyTypeEClass == null)
		{
			timeNodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(355);
		}
		return timeNodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeNodePropertyType_TimeNode()
	{
        return (EReference)getTimeNodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeNodePropertyType_Actuate()
	{
        return (EAttribute)getTimeNodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeNodePropertyType_Arcrole()
	{
        return (EAttribute)getTimeNodePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeNodePropertyType_Href()
	{
        return (EAttribute)getTimeNodePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeNodePropertyType_NilReason()
	{
        return (EAttribute)getTimeNodePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeNodePropertyType_Owns()
	{
        return (EAttribute)getTimeNodePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeNodePropertyType_RemoteSchema()
	{
        return (EAttribute)getTimeNodePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeNodePropertyType_Role()
	{
        return (EAttribute)getTimeNodePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeNodePropertyType_Show()
	{
        return (EAttribute)getTimeNodePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeNodePropertyType_Title()
	{
        return (EAttribute)getTimeNodePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeNodePropertyType_Type()
	{
        return (EAttribute)getTimeNodePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeNodeType()
	{
		if (timeNodeTypeEClass == null)
		{
			timeNodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(356);
		}
		return timeNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeNodeType_PreviousEdge()
	{
        return (EReference)getTimeNodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeNodeType_NextEdge()
	{
        return (EReference)getTimeNodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeNodeType_Position()
	{
        return (EReference)getTimeNodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeOrdinalEraPropertyType()
	{
		if (timeOrdinalEraPropertyTypeEClass == null)
		{
			timeOrdinalEraPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(357);
		}
		return timeOrdinalEraPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeOrdinalEraPropertyType_TimeOrdinalEra()
	{
        return (EReference)getTimeOrdinalEraPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeOrdinalEraPropertyType_Actuate()
	{
        return (EAttribute)getTimeOrdinalEraPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeOrdinalEraPropertyType_Arcrole()
	{
        return (EAttribute)getTimeOrdinalEraPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeOrdinalEraPropertyType_Href()
	{
        return (EAttribute)getTimeOrdinalEraPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeOrdinalEraPropertyType_NilReason()
	{
        return (EAttribute)getTimeOrdinalEraPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeOrdinalEraPropertyType_Owns()
	{
        return (EAttribute)getTimeOrdinalEraPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeOrdinalEraPropertyType_RemoteSchema()
	{
        return (EAttribute)getTimeOrdinalEraPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeOrdinalEraPropertyType_Role()
	{
        return (EAttribute)getTimeOrdinalEraPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeOrdinalEraPropertyType_Show()
	{
        return (EAttribute)getTimeOrdinalEraPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeOrdinalEraPropertyType_Title()
	{
        return (EAttribute)getTimeOrdinalEraPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeOrdinalEraPropertyType_Type()
	{
        return (EAttribute)getTimeOrdinalEraPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeOrdinalEraType()
	{
		if (timeOrdinalEraTypeEClass == null)
		{
			timeOrdinalEraTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(358);
		}
		return timeOrdinalEraTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeOrdinalEraType_RelatedTime()
	{
        return (EReference)getTimeOrdinalEraType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeOrdinalEraType_Start()
	{
        return (EReference)getTimeOrdinalEraType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeOrdinalEraType_End()
	{
        return (EReference)getTimeOrdinalEraType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeOrdinalEraType_Extent()
	{
        return (EReference)getTimeOrdinalEraType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeOrdinalEraType_Member()
	{
        return (EReference)getTimeOrdinalEraType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeOrdinalEraType_Group()
	{
        return (EReference)getTimeOrdinalEraType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeOrdinalReferenceSystemType()
	{
		if (timeOrdinalReferenceSystemTypeEClass == null)
		{
			timeOrdinalReferenceSystemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(359);
		}
		return timeOrdinalReferenceSystemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeOrdinalReferenceSystemType_Component()
	{
        return (EReference)getTimeOrdinalReferenceSystemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePeriodPropertyType()
	{
		if (timePeriodPropertyTypeEClass == null)
		{
			timePeriodPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(360);
		}
		return timePeriodPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimePeriodPropertyType_TimePeriod()
	{
        return (EReference)getTimePeriodPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodPropertyType_Actuate()
	{
        return (EAttribute)getTimePeriodPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodPropertyType_Arcrole()
	{
        return (EAttribute)getTimePeriodPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodPropertyType_Href()
	{
        return (EAttribute)getTimePeriodPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodPropertyType_NilReason()
	{
        return (EAttribute)getTimePeriodPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodPropertyType_Owns()
	{
        return (EAttribute)getTimePeriodPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodPropertyType_RemoteSchema()
	{
        return (EAttribute)getTimePeriodPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodPropertyType_Role()
	{
        return (EAttribute)getTimePeriodPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodPropertyType_Show()
	{
        return (EAttribute)getTimePeriodPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodPropertyType_Title()
	{
        return (EAttribute)getTimePeriodPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodPropertyType_Type()
	{
        return (EAttribute)getTimePeriodPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePeriodType()
	{
		if (timePeriodTypeEClass == null)
		{
			timePeriodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(361);
		}
		return timePeriodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimePeriodType_BeginPosition()
	{
        return (EReference)getTimePeriodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimePeriodType_Begin()
	{
        return (EReference)getTimePeriodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimePeriodType_EndPosition()
	{
        return (EReference)getTimePeriodType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimePeriodType_End()
	{
        return (EReference)getTimePeriodType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePeriodType_Duration()
	{
        return (EAttribute)getTimePeriodType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimePeriodType_TimeInterval()
	{
        return (EReference)getTimePeriodType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePositionType()
	{
		if (timePositionTypeEClass == null)
		{
			timePositionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(362);
		}
		return timePositionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePositionType_Value()
	{
        return (EAttribute)getTimePositionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePositionType_CalendarEraName()
	{
        return (EAttribute)getTimePositionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePositionType_Frame()
	{
        return (EAttribute)getTimePositionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePositionType_IndeterminatePosition()
	{
        return (EAttribute)getTimePositionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePrimitivePropertyType()
	{
		if (timePrimitivePropertyTypeEClass == null)
		{
			timePrimitivePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(364);
		}
		return timePrimitivePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePrimitivePropertyType_AbstractTimePrimitiveGroup()
	{
        return (EAttribute)getTimePrimitivePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimePrimitivePropertyType_AbstractTimePrimitive()
	{
        return (EReference)getTimePrimitivePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePrimitivePropertyType_Actuate()
	{
        return (EAttribute)getTimePrimitivePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePrimitivePropertyType_Arcrole()
	{
        return (EAttribute)getTimePrimitivePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePrimitivePropertyType_Href()
	{
        return (EAttribute)getTimePrimitivePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePrimitivePropertyType_NilReason()
	{
        return (EAttribute)getTimePrimitivePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePrimitivePropertyType_Owns()
	{
        return (EAttribute)getTimePrimitivePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePrimitivePropertyType_RemoteSchema()
	{
        return (EAttribute)getTimePrimitivePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePrimitivePropertyType_Role()
	{
        return (EAttribute)getTimePrimitivePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePrimitivePropertyType_Show()
	{
        return (EAttribute)getTimePrimitivePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePrimitivePropertyType_Title()
	{
        return (EAttribute)getTimePrimitivePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePrimitivePropertyType_Type()
	{
        return (EAttribute)getTimePrimitivePropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeReferenceSystemType()
	{
		if (timeReferenceSystemTypeEClass == null)
		{
			timeReferenceSystemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(365);
		}
		return timeReferenceSystemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeReferenceSystemType_DomainOfValidity()
	{
        return (EAttribute)getTimeReferenceSystemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeTopologyComplexPropertyType()
	{
		if (timeTopologyComplexPropertyTypeEClass == null)
		{
			timeTopologyComplexPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(366);
		}
		return timeTopologyComplexPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeTopologyComplexPropertyType_TimeTopologyComplex()
	{
        return (EReference)getTimeTopologyComplexPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyComplexPropertyType_Actuate()
	{
        return (EAttribute)getTimeTopologyComplexPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyComplexPropertyType_Arcrole()
	{
        return (EAttribute)getTimeTopologyComplexPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyComplexPropertyType_Href()
	{
        return (EAttribute)getTimeTopologyComplexPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyComplexPropertyType_NilReason()
	{
        return (EAttribute)getTimeTopologyComplexPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyComplexPropertyType_Owns()
	{
        return (EAttribute)getTimeTopologyComplexPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyComplexPropertyType_RemoteSchema()
	{
        return (EAttribute)getTimeTopologyComplexPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyComplexPropertyType_Role()
	{
        return (EAttribute)getTimeTopologyComplexPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyComplexPropertyType_Show()
	{
        return (EAttribute)getTimeTopologyComplexPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyComplexPropertyType_Title()
	{
        return (EAttribute)getTimeTopologyComplexPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyComplexPropertyType_Type()
	{
        return (EAttribute)getTimeTopologyComplexPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeTopologyComplexType()
	{
		if (timeTopologyComplexTypeEClass == null)
		{
			timeTopologyComplexTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(367);
		}
		return timeTopologyComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeTopologyComplexType_Primitive()
	{
        return (EReference)getTimeTopologyComplexType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeTopologyPrimitivePropertyType()
	{
		if (timeTopologyPrimitivePropertyTypeEClass == null)
		{
			timeTopologyPrimitivePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(368);
		}
		return timeTopologyPrimitivePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyPrimitivePropertyType_AbstractTimeTopologyPrimitiveGroup()
	{
        return (EAttribute)getTimeTopologyPrimitivePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeTopologyPrimitivePropertyType_AbstractTimeTopologyPrimitive()
	{
        return (EReference)getTimeTopologyPrimitivePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyPrimitivePropertyType_Actuate()
	{
        return (EAttribute)getTimeTopologyPrimitivePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyPrimitivePropertyType_Arcrole()
	{
        return (EAttribute)getTimeTopologyPrimitivePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyPrimitivePropertyType_Href()
	{
        return (EAttribute)getTimeTopologyPrimitivePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyPrimitivePropertyType_NilReason()
	{
        return (EAttribute)getTimeTopologyPrimitivePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyPrimitivePropertyType_Owns()
	{
        return (EAttribute)getTimeTopologyPrimitivePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyPrimitivePropertyType_RemoteSchema()
	{
        return (EAttribute)getTimeTopologyPrimitivePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyPrimitivePropertyType_Role()
	{
        return (EAttribute)getTimeTopologyPrimitivePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyPrimitivePropertyType_Show()
	{
        return (EAttribute)getTimeTopologyPrimitivePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyPrimitivePropertyType_Title()
	{
        return (EAttribute)getTimeTopologyPrimitivePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTopologyPrimitivePropertyType_Type()
	{
        return (EAttribute)getTimeTopologyPrimitivePropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeType()
	{
		if (timeTypeEClass == null)
		{
			timeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(369);
		}
		return timeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTinType()
	{
		if (tinTypeEClass == null)
		{
			tinTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(374);
		}
		return tinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTinType_StopLines()
	{
        return (EReference)getTinType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTinType_BreakLines()
	{
        return (EReference)getTinType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTinType_MaxLength()
	{
        return (EReference)getTinType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTinType_ControlPoint()
	{
        return (EReference)getTinType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoComplexPropertyType()
	{
		if (topoComplexPropertyTypeEClass == null)
		{
			topoComplexPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(375);
		}
		return topoComplexPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoComplexPropertyType_TopoComplex()
	{
        return (EReference)getTopoComplexPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoComplexPropertyType_Actuate()
	{
        return (EAttribute)getTopoComplexPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoComplexPropertyType_Arcrole()
	{
        return (EAttribute)getTopoComplexPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoComplexPropertyType_Href()
	{
        return (EAttribute)getTopoComplexPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoComplexPropertyType_NilReason()
	{
        return (EAttribute)getTopoComplexPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoComplexPropertyType_RemoteSchema()
	{
        return (EAttribute)getTopoComplexPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoComplexPropertyType_Role()
	{
        return (EAttribute)getTopoComplexPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoComplexPropertyType_Show()
	{
        return (EAttribute)getTopoComplexPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoComplexPropertyType_Title()
	{
        return (EAttribute)getTopoComplexPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoComplexPropertyType_Type()
	{
        return (EAttribute)getTopoComplexPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoComplexType()
	{
		if (topoComplexTypeEClass == null)
		{
			topoComplexTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(376);
		}
		return topoComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoComplexType_MaximalComplex()
	{
        return (EReference)getTopoComplexType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoComplexType_SuperComplex()
	{
        return (EReference)getTopoComplexType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoComplexType_SubComplex()
	{
        return (EReference)getTopoComplexType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoComplexType_TopoPrimitiveMember()
	{
        return (EReference)getTopoComplexType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoComplexType_TopoPrimitiveMembers()
	{
        return (EReference)getTopoComplexType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoComplexType_AggregationType()
	{
        return (EAttribute)getTopoComplexType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoComplexType_IsMaximal()
	{
        return (EAttribute)getTopoComplexType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoCurvePropertyType()
	{
		if (topoCurvePropertyTypeEClass == null)
		{
			topoCurvePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(377);
		}
		return topoCurvePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoCurvePropertyType_TopoCurve()
	{
        return (EReference)getTopoCurvePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoCurvePropertyType_Owns()
	{
        return (EAttribute)getTopoCurvePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoCurveType()
	{
		if (topoCurveTypeEClass == null)
		{
			topoCurveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(378);
		}
		return topoCurveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoCurveType_DirectedEdge()
	{
        return (EReference)getTopoCurveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoCurveType_AggregationType()
	{
        return (EAttribute)getTopoCurveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoPointPropertyType()
	{
		if (topoPointPropertyTypeEClass == null)
		{
			topoPointPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(379);
		}
		return topoPointPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoPointPropertyType_TopoPoint()
	{
        return (EReference)getTopoPointPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPointPropertyType_Owns()
	{
        return (EAttribute)getTopoPointPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoPointType()
	{
		if (topoPointTypeEClass == null)
		{
			topoPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(380);
		}
		return topoPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoPointType_DirectedNode()
	{
        return (EReference)getTopoPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoPrimitiveArrayAssociationType()
	{
		if (topoPrimitiveArrayAssociationTypeEClass == null)
		{
			topoPrimitiveArrayAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(381);
		}
		return topoPrimitiveArrayAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveArrayAssociationType_Group()
	{
        return (EAttribute)getTopoPrimitiveArrayAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveArrayAssociationType_AbstractTopoPrimitiveGroup()
	{
        return (EAttribute)getTopoPrimitiveArrayAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoPrimitiveArrayAssociationType_AbstractTopoPrimitive()
	{
        return (EReference)getTopoPrimitiveArrayAssociationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveArrayAssociationType_Owns()
	{
        return (EAttribute)getTopoPrimitiveArrayAssociationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoPrimitiveMemberType()
	{
		if (topoPrimitiveMemberTypeEClass == null)
		{
			topoPrimitiveMemberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(382);
		}
		return topoPrimitiveMemberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveMemberType_AbstractTopoPrimitiveGroup()
	{
        return (EAttribute)getTopoPrimitiveMemberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoPrimitiveMemberType_AbstractTopoPrimitive()
	{
        return (EReference)getTopoPrimitiveMemberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveMemberType_Actuate()
	{
        return (EAttribute)getTopoPrimitiveMemberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveMemberType_Arcrole()
	{
        return (EAttribute)getTopoPrimitiveMemberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveMemberType_Href()
	{
        return (EAttribute)getTopoPrimitiveMemberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveMemberType_NilReason()
	{
        return (EAttribute)getTopoPrimitiveMemberType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveMemberType_Owns()
	{
        return (EAttribute)getTopoPrimitiveMemberType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveMemberType_RemoteSchema()
	{
        return (EAttribute)getTopoPrimitiveMemberType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveMemberType_Role()
	{
        return (EAttribute)getTopoPrimitiveMemberType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveMemberType_Show()
	{
        return (EAttribute)getTopoPrimitiveMemberType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveMemberType_Title()
	{
        return (EAttribute)getTopoPrimitiveMemberType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoPrimitiveMemberType_Type()
	{
        return (EAttribute)getTopoPrimitiveMemberType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoSolidPropertyType()
	{
		if (topoSolidPropertyTypeEClass == null)
		{
			topoSolidPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(383);
		}
		return topoSolidPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoSolidPropertyType_TopoSolid()
	{
        return (EReference)getTopoSolidPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSolidPropertyType_Actuate()
	{
        return (EAttribute)getTopoSolidPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSolidPropertyType_Arcrole()
	{
        return (EAttribute)getTopoSolidPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSolidPropertyType_Href()
	{
        return (EAttribute)getTopoSolidPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSolidPropertyType_NilReason()
	{
        return (EAttribute)getTopoSolidPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSolidPropertyType_Owns()
	{
        return (EAttribute)getTopoSolidPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSolidPropertyType_RemoteSchema()
	{
        return (EAttribute)getTopoSolidPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSolidPropertyType_Role()
	{
        return (EAttribute)getTopoSolidPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSolidPropertyType_Show()
	{
        return (EAttribute)getTopoSolidPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSolidPropertyType_Title()
	{
        return (EAttribute)getTopoSolidPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSolidPropertyType_Type()
	{
        return (EAttribute)getTopoSolidPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoSolidType()
	{
		if (topoSolidTypeEClass == null)
		{
			topoSolidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(384);
		}
		return topoSolidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoSolidType_Isolated()
	{
        return (EReference)getTopoSolidType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoSolidType_DirectedFace()
	{
        return (EReference)getTopoSolidType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoSolidType_SolidProperty()
	{
        return (EReference)getTopoSolidType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSolidType_AggregationType()
	{
        return (EAttribute)getTopoSolidType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSolidType_Universal()
	{
        return (EAttribute)getTopoSolidType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoSurfacePropertyType()
	{
		if (topoSurfacePropertyTypeEClass == null)
		{
			topoSurfacePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(385);
		}
		return topoSurfacePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoSurfacePropertyType_TopoSurface()
	{
        return (EReference)getTopoSurfacePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSurfacePropertyType_Owns()
	{
        return (EAttribute)getTopoSurfacePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoSurfaceType()
	{
		if (topoSurfaceTypeEClass == null)
		{
			topoSurfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(386);
		}
		return topoSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoSurfaceType_DirectedFace()
	{
        return (EReference)getTopoSurfaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoSurfaceType_AggregationType()
	{
        return (EAttribute)getTopoSurfaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoVolumePropertyType()
	{
		if (topoVolumePropertyTypeEClass == null)
		{
			topoVolumePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(387);
		}
		return topoVolumePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoVolumePropertyType_TopoVolume()
	{
        return (EReference)getTopoVolumePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoVolumePropertyType_Owns()
	{
        return (EAttribute)getTopoVolumePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopoVolumeType()
	{
		if (topoVolumeTypeEClass == null)
		{
			topoVolumeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(388);
		}
		return topoVolumeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopoVolumeType_DirectedTopoSolid()
	{
        return (EReference)getTopoVolumeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopoVolumeType_AggregationType()
	{
        return (EAttribute)getTopoVolumeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationPropertyType()
	{
		if (transformationPropertyTypeEClass == null)
		{
			transformationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(389);
		}
		return transformationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationPropertyType_Transformation()
	{
        return (EReference)getTransformationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationPropertyType_Actuate()
	{
        return (EAttribute)getTransformationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationPropertyType_Arcrole()
	{
        return (EAttribute)getTransformationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationPropertyType_Href()
	{
        return (EAttribute)getTransformationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationPropertyType_NilReason()
	{
        return (EAttribute)getTransformationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationPropertyType_RemoteSchema()
	{
        return (EAttribute)getTransformationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationPropertyType_Role()
	{
        return (EAttribute)getTransformationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationPropertyType_Show()
	{
        return (EAttribute)getTransformationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationPropertyType_Title()
	{
        return (EAttribute)getTransformationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationPropertyType_Type()
	{
        return (EAttribute)getTransformationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationType()
	{
		if (transformationTypeEClass == null)
		{
			transformationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(390);
		}
		return transformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationType_MethodGroup()
	{
        return (EAttribute)getTransformationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationType_Method()
	{
        return (EReference)getTransformationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationType_ParameterValue()
	{
        return (EReference)getTransformationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriangleType()
	{
		if (triangleTypeEClass == null)
		{
			triangleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(391);
		}
		return triangleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriangleType_Exterior()
	{
        return (EReference)getTriangleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangleType_Interpolation()
	{
        return (EAttribute)getTriangleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitDefinitionType()
	{
		if (unitDefinitionTypeEClass == null)
		{
			unitDefinitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(392);
		}
		return unitDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitDefinitionType_QuantityType()
	{
        return (EReference)getUnitDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitDefinitionType_QuantityTypeReference()
	{
        return (EReference)getUnitDefinitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitDefinitionType_CatalogSymbol()
	{
        return (EReference)getUnitDefinitionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitOfMeasureType()
	{
		if (unitOfMeasureTypeEClass == null)
		{
			unitOfMeasureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(393);
		}
		return unitOfMeasureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitOfMeasureType_Uom()
	{
        return (EAttribute)getUnitOfMeasureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedCSPropertyType()
	{
		if (userDefinedCSPropertyTypeEClass == null)
		{
			userDefinedCSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(397);
		}
		return userDefinedCSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserDefinedCSPropertyType_UserDefinedCS()
	{
        return (EReference)getUserDefinedCSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedCSPropertyType_Actuate()
	{
        return (EAttribute)getUserDefinedCSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedCSPropertyType_Arcrole()
	{
        return (EAttribute)getUserDefinedCSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedCSPropertyType_Href()
	{
        return (EAttribute)getUserDefinedCSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedCSPropertyType_NilReason()
	{
        return (EAttribute)getUserDefinedCSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedCSPropertyType_RemoteSchema()
	{
        return (EAttribute)getUserDefinedCSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedCSPropertyType_Role()
	{
        return (EAttribute)getUserDefinedCSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedCSPropertyType_Show()
	{
        return (EAttribute)getUserDefinedCSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedCSPropertyType_Title()
	{
        return (EAttribute)getUserDefinedCSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedCSPropertyType_Type()
	{
        return (EAttribute)getUserDefinedCSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedCSType()
	{
		if (userDefinedCSTypeEClass == null)
		{
			userDefinedCSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(398);
		}
		return userDefinedCSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueArrayPropertyType()
	{
		if (valueArrayPropertyTypeEClass == null)
		{
			valueArrayPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(399);
		}
		return valueArrayPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueArrayPropertyType_Value()
	{
        return (EAttribute)getValueArrayPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueArrayPropertyType_AbstractValueGroup()
	{
        return (EAttribute)getValueArrayPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueArrayPropertyType_AbstractValue()
	{
        return (EReference)getValueArrayPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueArrayPropertyType_AbstractGeometryGroup()
	{
        return (EAttribute)getValueArrayPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueArrayPropertyType_AbstractGeometry()
	{
        return (EReference)getValueArrayPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueArrayPropertyType_AbstractTimeObjectGroup()
	{
        return (EAttribute)getValueArrayPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueArrayPropertyType_AbstractTimeObject()
	{
        return (EReference)getValueArrayPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueArrayPropertyType_Null()
	{
        return (EAttribute)getValueArrayPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueArrayPropertyType_Owns()
	{
        return (EAttribute)getValueArrayPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueArrayType()
	{
		if (valueArrayTypeEClass == null)
		{
			valueArrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(400);
		}
		return valueArrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueArrayType_CodeSpace()
	{
        return (EAttribute)getValueArrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueArrayType_Uom()
	{
        return (EAttribute)getValueArrayType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePropertyType()
	{
		if (valuePropertyTypeEClass == null)
		{
			valuePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(401);
		}
		return valuePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_AbstractValueGroup()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePropertyType_AbstractValue()
	{
        return (EReference)getValuePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_AbstractGeometryGroup()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePropertyType_AbstractGeometry()
	{
        return (EReference)getValuePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_AbstractTimeObjectGroup()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePropertyType_AbstractTimeObject()
	{
        return (EReference)getValuePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_Null()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_Actuate()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_Arcrole()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_Href()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_NilReason()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_Owns()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_RemoteSchema()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_Role()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_Show()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_Title()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuePropertyType_Type()
	{
        return (EAttribute)getValuePropertyType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorType()
	{
		if (vectorTypeEClass == null)
		{
			vectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(402);
		}
		return vectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalCRSPropertyType()
	{
		if (verticalCRSPropertyTypeEClass == null)
		{
			verticalCRSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(403);
		}
		return verticalCRSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerticalCRSPropertyType_VerticalCRS()
	{
        return (EReference)getVerticalCRSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCRSPropertyType_Actuate()
	{
        return (EAttribute)getVerticalCRSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCRSPropertyType_Arcrole()
	{
        return (EAttribute)getVerticalCRSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCRSPropertyType_Href()
	{
        return (EAttribute)getVerticalCRSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCRSPropertyType_NilReason()
	{
        return (EAttribute)getVerticalCRSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCRSPropertyType_RemoteSchema()
	{
        return (EAttribute)getVerticalCRSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCRSPropertyType_Role()
	{
        return (EAttribute)getVerticalCRSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCRSPropertyType_Show()
	{
        return (EAttribute)getVerticalCRSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCRSPropertyType_Title()
	{
        return (EAttribute)getVerticalCRSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCRSPropertyType_Type()
	{
        return (EAttribute)getVerticalCRSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalCRSType()
	{
		if (verticalCRSTypeEClass == null)
		{
			verticalCRSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(404);
		}
		return verticalCRSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCRSType_VerticalCSGroup()
	{
        return (EAttribute)getVerticalCRSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerticalCRSType_VerticalCS()
	{
        return (EReference)getVerticalCRSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCRSType_VerticalDatumGroup()
	{
        return (EAttribute)getVerticalCRSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerticalCRSType_VerticalDatum()
	{
        return (EReference)getVerticalCRSType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalCSPropertyType()
	{
		if (verticalCSPropertyTypeEClass == null)
		{
			verticalCSPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(405);
		}
		return verticalCSPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerticalCSPropertyType_VerticalCS()
	{
        return (EReference)getVerticalCSPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCSPropertyType_Actuate()
	{
        return (EAttribute)getVerticalCSPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCSPropertyType_Arcrole()
	{
        return (EAttribute)getVerticalCSPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCSPropertyType_Href()
	{
        return (EAttribute)getVerticalCSPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCSPropertyType_NilReason()
	{
        return (EAttribute)getVerticalCSPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCSPropertyType_RemoteSchema()
	{
        return (EAttribute)getVerticalCSPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCSPropertyType_Role()
	{
        return (EAttribute)getVerticalCSPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCSPropertyType_Show()
	{
        return (EAttribute)getVerticalCSPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCSPropertyType_Title()
	{
        return (EAttribute)getVerticalCSPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalCSPropertyType_Type()
	{
        return (EAttribute)getVerticalCSPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalCSType()
	{
		if (verticalCSTypeEClass == null)
		{
			verticalCSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(406);
		}
		return verticalCSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalDatumPropertyType()
	{
		if (verticalDatumPropertyTypeEClass == null)
		{
			verticalDatumPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(407);
		}
		return verticalDatumPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerticalDatumPropertyType_VerticalDatum()
	{
        return (EReference)getVerticalDatumPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumPropertyType_Actuate()
	{
        return (EAttribute)getVerticalDatumPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumPropertyType_Arcrole()
	{
        return (EAttribute)getVerticalDatumPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumPropertyType_Href()
	{
        return (EAttribute)getVerticalDatumPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumPropertyType_NilReason()
	{
        return (EAttribute)getVerticalDatumPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumPropertyType_RemoteSchema()
	{
        return (EAttribute)getVerticalDatumPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumPropertyType_Role()
	{
        return (EAttribute)getVerticalDatumPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumPropertyType_Show()
	{
        return (EAttribute)getVerticalDatumPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumPropertyType_Title()
	{
        return (EAttribute)getVerticalDatumPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumPropertyType_Type()
	{
        return (EAttribute)getVerticalDatumPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalDatumType()
	{
		if (verticalDatumTypeEClass == null)
		{
			verticalDatumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(408);
		}
		return verticalDatumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolumeType()
	{
		if (volumeTypeEClass == null)
		{
			volumeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(409);
		}
		return volumeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationType()
	{
		if (aggregationTypeEEnum == null)
		{
			aggregationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(43);
		}
		return aggregationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompassPointEnumeration()
	{
		if (compassPointEnumerationEEnum == null)
		{
			compassPointEnumerationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(84);
		}
		return compassPointEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCurveInterpolationType()
	{
		if (curveInterpolationTypeEEnum == null)
		{
			curveInterpolationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(113);
		}
		return curveInterpolationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionType()
	{
		if (directionTypeEEnum == null)
		{
			directionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(143);
		}
		return directionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIncrementOrder()
	{
		if (incrementOrderEEnum == null)
		{
			incrementOrderEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(207);
		}
		return incrementOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKnotTypesType()
	{
		if (knotTypesTypeEEnum == null)
		{
			knotTypesTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(216);
		}
		return knotTypesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNilReasonEnumerationMember0()
	{
		if (nilReasonEnumerationMember0EEnum == null)
		{
			nilReasonEnumerationMember0EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(248);
		}
		return nilReasonEnumerationMember0EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelativePositionType()
	{
		if (relativePositionTypeEEnum == null)
		{
			relativePositionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(295);
		}
		return relativePositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSequenceRuleEnumeration()
	{
		if (sequenceRuleEnumerationEEnum == null)
		{
			sequenceRuleEnumerationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(305);
		}
		return sequenceRuleEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSignType()
	{
		if (signTypeEEnum == null)
		{
			signTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(310);
		}
		return signTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSuccessionType()
	{
		if (successionTypeEEnum == null)
		{
			successionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(323);
		}
		return successionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSurfaceInterpolationType()
	{
		if (surfaceInterpolationTypeEEnum == null)
		{
			surfaceInterpolationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(326);
		}
		return surfaceInterpolationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeIndeterminateValueType()
	{
		if (timeIndeterminateValueTypeEEnum == null)
		{
			timeIndeterminateValueTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(350);
		}
		return timeIndeterminateValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnitTypeMember0()
	{
		if (timeUnitTypeMember0EEnum == null)
		{
			timeUnitTypeMember0EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(371);
		}
		return timeUnitTypeMember0EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAggregationTypeObject()
	{
		if (aggregationTypeObjectEDataType == null)
		{
			aggregationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(44);
		}
		return aggregationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArcMinutesType()
	{
		if (arcMinutesTypeEDataType == null)
		{
			arcMinutesTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(49);
		}
		return arcMinutesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArcSecondsType()
	{
		if (arcSecondsTypeEDataType == null)
		{
			arcSecondsTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(50);
		}
		return arcSecondsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAxisDirection()
	{
		if (axisDirectionEDataType == null)
		{
			axisDirectionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(58);
		}
		return axisDirectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAxisDirectionList()
	{
		if (axisDirectionListEDataType == null)
		{
			axisDirectionListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(59);
		}
		return axisDirectionListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanList()
	{
		if (booleanListEDataType == null)
		{
			booleanListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(63);
		}
		return booleanListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanOrNilReason()
	{
		if (booleanOrNilReasonEDataType == null)
		{
			booleanOrNilReasonEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(64);
		}
		return booleanOrNilReasonEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanOrNilReasonList()
	{
		if (booleanOrNilReasonListEDataType == null)
		{
			booleanOrNilReasonListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(65);
		}
		return booleanOrNilReasonListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalDate()
	{
		if (calDateEDataType == null)
		{
			calDateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(71);
		}
		return calDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompassPointEnumerationObject()
	{
		if (compassPointEnumerationObjectEDataType == null)
		{
			compassPointEnumerationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(85);
		}
		return compassPointEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCountExtentType()
	{
		if (countExtentTypeEDataType == null)
		{
			countExtentTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(106);
		}
		return countExtentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCurveInterpolationTypeObject()
	{
		if (curveInterpolationTypeObjectEDataType == null)
		{
			curveInterpolationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(114);
		}
		return curveInterpolationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDecimalMinutesType()
	{
		if (decimalMinutesTypeEDataType == null)
		{
			decimalMinutesTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(123);
		}
		return decimalMinutesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDegreeValueType()
	{
		if (degreeValueTypeEDataType == null)
		{
			degreeValueTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(128);
		}
		return degreeValueTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirectionTypeObject()
	{
		if (directionTypeObjectEDataType == null)
		{
			directionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(144);
		}
		return directionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDoubleList()
	{
		if (doubleListEDataType == null)
		{
			doubleListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(153);
		}
		return doubleListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDoubleOrNilReason()
	{
		if (doubleOrNilReasonEDataType == null)
		{
			doubleOrNilReasonEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(154);
		}
		return doubleOrNilReasonEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDoubleOrNilReasonList()
	{
		if (doubleOrNilReasonListEDataType == null)
		{
			doubleOrNilReasonListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(155);
		}
		return doubleOrNilReasonListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIncrementOrderObject()
	{
		if (incrementOrderObjectEDataType == null)
		{
			incrementOrderObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(208);
		}
		return incrementOrderObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerList()
	{
		if (integerListEDataType == null)
		{
			integerListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(211);
		}
		return integerListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerOrNilReason()
	{
		if (integerOrNilReasonEDataType == null)
		{
			integerOrNilReasonEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(212);
		}
		return integerOrNilReasonEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerOrNilReasonList()
	{
		if (integerOrNilReasonListEDataType == null)
		{
			integerOrNilReasonListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(213);
		}
		return integerOrNilReasonListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKnotTypesTypeObject()
	{
		if (knotTypesTypeObjectEDataType == null)
		{
			knotTypesTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(217);
		}
		return knotTypesTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameList()
	{
		if (nameListEDataType == null)
		{
			nameListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(243);
		}
		return nameListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameOrNilReason()
	{
		if (nameOrNilReasonEDataType == null)
		{
			nameOrNilReasonEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(244);
		}
		return nameOrNilReasonEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameOrNilReasonList()
	{
		if (nameOrNilReasonListEDataType == null)
		{
			nameOrNilReasonListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(245);
		}
		return nameOrNilReasonListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNCNameList()
	{
		if (ncNameListEDataType == null)
		{
			ncNameListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(246);
		}
		return ncNameListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNilReasonEnumeration()
	{
		if (nilReasonEnumerationEDataType == null)
		{
			nilReasonEnumerationEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(247);
		}
		return nilReasonEnumerationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNilReasonEnumerationMember0Object()
	{
		if (nilReasonEnumerationMember0ObjectEDataType == null)
		{
			nilReasonEnumerationMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(249);
		}
		return nilReasonEnumerationMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNilReasonEnumerationMember1()
	{
		if (nilReasonEnumerationMember1EDataType == null)
		{
			nilReasonEnumerationMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(250);
		}
		return nilReasonEnumerationMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNilReasonType()
	{
		if (nilReasonTypeEDataType == null)
		{
			nilReasonTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(251);
		}
		return nilReasonTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQNameList()
	{
		if (qNameListEDataType == null)
		{
			qNameListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(285);
		}
		return qNameListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelativePositionTypeObject()
	{
		if (relativePositionTypeObjectEDataType == null)
		{
			relativePositionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(296);
		}
		return relativePositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSequenceRuleEnumerationObject()
	{
		if (sequenceRuleEnumerationObjectEDataType == null)
		{
			sequenceRuleEnumerationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(306);
		}
		return sequenceRuleEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSignTypeObject()
	{
		if (signTypeObjectEDataType == null)
		{
			signTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(311);
		}
		return signTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringOrNilReason()
	{
		if (stringOrNilReasonEDataType == null)
		{
			stringOrNilReasonEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(321);
		}
		return stringOrNilReasonEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSuccessionTypeObject()
	{
		if (successionTypeObjectEDataType == null)
		{
			successionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(324);
		}
		return successionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSurfaceInterpolationTypeObject()
	{
		if (surfaceInterpolationTypeObjectEDataType == null)
		{
			surfaceInterpolationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(327);
		}
		return surfaceInterpolationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeIndeterminateValueTypeObject()
	{
		if (timeIndeterminateValueTypeObjectEDataType == null)
		{
			timeIndeterminateValueTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(351);
		}
		return timeIndeterminateValueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimePositionUnion()
	{
		if (timePositionUnionEDataType == null)
		{
			timePositionUnionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(363);
		}
		return timePositionUnionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeUnitType()
	{
		if (timeUnitTypeEDataType == null)
		{
			timeUnitTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(370);
		}
		return timeUnitTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeUnitTypeMember0Object()
	{
		if (timeUnitTypeMember0ObjectEDataType == null)
		{
			timeUnitTypeMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(372);
		}
		return timeUnitTypeMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeUnitTypeMember1()
	{
		if (timeUnitTypeMember1EDataType == null)
		{
			timeUnitTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(373);
		}
		return timeUnitTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUomIdentifier()
	{
		if (uomIdentifierEDataType == null)
		{
			uomIdentifierEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(394);
		}
		return uomIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUomSymbol()
	{
		if (uomSymbolEDataType == null)
		{
			uomSymbolEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(395);
		}
		return uomSymbolEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUomURI()
	{
		if (uomURIEDataType == null)
		{
			uomURIEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI).getEClassifiers().get(396);
		}
		return uomURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMLFactory getGMLFactory()
	{
		return (GMLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage()
	{
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null)
		{
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try
		{
			resource.load(null);
		}
		catch (IOException exception)
		{
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents()
	{
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier)
	{
		if (eClassifier.getInstanceClassName() == null)
		{
			eClassifier.setInstanceClassName("net.opengis.gml32." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //GMLPackageImpl
