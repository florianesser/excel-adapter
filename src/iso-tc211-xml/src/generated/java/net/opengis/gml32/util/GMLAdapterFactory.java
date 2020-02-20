/**
 */
package net.opengis.gml32.util;

import net.opengis.gml32.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.gml32.GMLPackage
 * @generated
 */
public class GMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GMLSwitch<Adapter> modelSwitch =
		new GMLSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractContinuousCoverageType(AbstractContinuousCoverageType object) {
				return createAbstractContinuousCoverageTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCoordinateOperationType(AbstractCoordinateOperationType object) {
				return createAbstractCoordinateOperationTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCoordinateSystemType(AbstractCoordinateSystemType object) {
				return createAbstractCoordinateSystemTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCoverageType(AbstractCoverageType object) {
				return createAbstractCoverageTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCRSType(AbstractCRSType object) {
				return createAbstractCRSTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCurveSegmentType(AbstractCurveSegmentType object) {
				return createAbstractCurveSegmentTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCurveType(AbstractCurveType object) {
				return createAbstractCurveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDatumType(AbstractDatumType object) {
				return createAbstractDatumTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureCollectionType(AbstractFeatureCollectionType object) {
				return createAbstractFeatureCollectionTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureMemberType(AbstractFeatureMemberType object) {
				return createAbstractFeatureMemberTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureType(AbstractFeatureType object) {
				return createAbstractFeatureTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralConversionType(AbstractGeneralConversionType object) {
				return createAbstractGeneralConversionTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralDerivedCRSType(AbstractGeneralDerivedCRSType object) {
				return createAbstractGeneralDerivedCRSTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralOperationParameterPropertyType(AbstractGeneralOperationParameterPropertyType object) {
				return createAbstractGeneralOperationParameterPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralOperationParameterType(AbstractGeneralOperationParameterType object) {
				return createAbstractGeneralOperationParameterTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralParameterValuePropertyType(AbstractGeneralParameterValuePropertyType object) {
				return createAbstractGeneralParameterValuePropertyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralParameterValueType(AbstractGeneralParameterValueType object) {
				return createAbstractGeneralParameterValueTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralTransformationType(AbstractGeneralTransformationType object) {
				return createAbstractGeneralTransformationTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeometricAggregateType(AbstractGeometricAggregateType object) {
				return createAbstractGeometricAggregateTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeometricPrimitiveType(AbstractGeometricPrimitiveType object) {
				return createAbstractGeometricPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeometryType(AbstractGeometryType object) {
				return createAbstractGeometryTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGMLType(AbstractGMLType object) {
				return createAbstractGMLTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGriddedSurfaceType(AbstractGriddedSurfaceType object) {
				return createAbstractGriddedSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractMemberType(AbstractMemberType object) {
				return createAbstractMemberTypeAdapter();
			}
			@Override
			public Adapter caseAbstractMetadataPropertyType(AbstractMetadataPropertyType object) {
				return createAbstractMetadataPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractMetaDataType(AbstractMetaDataType object) {
				return createAbstractMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseAbstractParametricCurveSurfaceType(AbstractParametricCurveSurfaceType object) {
				return createAbstractParametricCurveSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractRingPropertyType(AbstractRingPropertyType object) {
				return createAbstractRingPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractRingType(AbstractRingType object) {
				return createAbstractRingTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSolidType(AbstractSolidType object) {
				return createAbstractSolidTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSurfacePatchType(AbstractSurfacePatchType object) {
				return createAbstractSurfacePatchTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSurfaceType(AbstractSurfaceType object) {
				return createAbstractSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeComplexType(AbstractTimeComplexType object) {
				return createAbstractTimeComplexTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeGeometricPrimitiveType(AbstractTimeGeometricPrimitiveType object) {
				return createAbstractTimeGeometricPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeObjectType(AbstractTimeObjectType object) {
				return createAbstractTimeObjectTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimePrimitiveType(AbstractTimePrimitiveType object) {
				return createAbstractTimePrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeSliceType(AbstractTimeSliceType object) {
				return createAbstractTimeSliceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeTopologyPrimitiveType(AbstractTimeTopologyPrimitiveType object) {
				return createAbstractTimeTopologyPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTopologyType(AbstractTopologyType object) {
				return createAbstractTopologyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTopoPrimitiveType(AbstractTopoPrimitiveType object) {
				return createAbstractTopoPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAffineCSPropertyType(AffineCSPropertyType object) {
				return createAffineCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAffineCSType(AffineCSType object) {
				return createAffineCSTypeAdapter();
			}
			@Override
			public Adapter caseAffinePlacementType(AffinePlacementType object) {
				return createAffinePlacementTypeAdapter();
			}
			@Override
			public Adapter caseAngleChoiceType(AngleChoiceType object) {
				return createAngleChoiceTypeAdapter();
			}
			@Override
			public Adapter caseAngleType(AngleType object) {
				return createAngleTypeAdapter();
			}
			@Override
			public Adapter caseArcByBulgeType(ArcByBulgeType object) {
				return createArcByBulgeTypeAdapter();
			}
			@Override
			public Adapter caseArcByCenterPointType(ArcByCenterPointType object) {
				return createArcByCenterPointTypeAdapter();
			}
			@Override
			public Adapter caseArcStringByBulgeType(ArcStringByBulgeType object) {
				return createArcStringByBulgeTypeAdapter();
			}
			@Override
			public Adapter caseArcStringType(ArcStringType object) {
				return createArcStringTypeAdapter();
			}
			@Override
			public Adapter caseArcType(ArcType object) {
				return createArcTypeAdapter();
			}
			@Override
			public Adapter caseAreaType(AreaType object) {
				return createAreaTypeAdapter();
			}
			@Override
			public Adapter caseArrayAssociationType(ArrayAssociationType object) {
				return createArrayAssociationTypeAdapter();
			}
			@Override
			public Adapter caseArrayType(ArrayType object) {
				return createArrayTypeAdapter();
			}
			@Override
			public Adapter caseAssociationRoleType(AssociationRoleType object) {
				return createAssociationRoleTypeAdapter();
			}
			@Override
			public Adapter caseBagType(BagType object) {
				return createBagTypeAdapter();
			}
			@Override
			public Adapter caseBaseUnitType(BaseUnitType object) {
				return createBaseUnitTypeAdapter();
			}
			@Override
			public Adapter caseBezierType(BezierType object) {
				return createBezierTypeAdapter();
			}
			@Override
			public Adapter caseBooleanPropertyType(BooleanPropertyType object) {
				return createBooleanPropertyTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseBoundedFeatureType(BoundedFeatureType object) {
				return createBoundedFeatureTypeAdapter();
			}
			@Override
			public Adapter caseBoundingShapeType(BoundingShapeType object) {
				return createBoundingShapeTypeAdapter();
			}
			@Override
			public Adapter caseBSplineType(BSplineType object) {
				return createBSplineTypeAdapter();
			}
			@Override
			public Adapter caseCartesianCSPropertyType(CartesianCSPropertyType object) {
				return createCartesianCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCartesianCSType(CartesianCSType object) {
				return createCartesianCSTypeAdapter();
			}
			@Override
			public Adapter caseCategoryExtentType(CategoryExtentType object) {
				return createCategoryExtentTypeAdapter();
			}
			@Override
			public Adapter caseCategoryPropertyType(CategoryPropertyType object) {
				return createCategoryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCategoryType(CategoryType object) {
				return createCategoryTypeAdapter();
			}
			@Override
			public Adapter caseCircleByCenterPointType(CircleByCenterPointType object) {
				return createCircleByCenterPointTypeAdapter();
			}
			@Override
			public Adapter caseCircleType(CircleType object) {
				return createCircleTypeAdapter();
			}
			@Override
			public Adapter caseClothoidType(ClothoidType object) {
				return createClothoidTypeAdapter();
			}
			@Override
			public Adapter caseCodeListType(CodeListType object) {
				return createCodeListTypeAdapter();
			}
			@Override
			public Adapter caseCodeOrNilReasonListType(CodeOrNilReasonListType object) {
				return createCodeOrNilReasonListTypeAdapter();
			}
			@Override
			public Adapter caseCodeType(CodeType object) {
				return createCodeTypeAdapter();
			}
			@Override
			public Adapter caseCodeWithAuthorityType(CodeWithAuthorityType object) {
				return createCodeWithAuthorityTypeAdapter();
			}
			@Override
			public Adapter caseCompositeCurveType(CompositeCurveType object) {
				return createCompositeCurveTypeAdapter();
			}
			@Override
			public Adapter caseCompositeSolidType(CompositeSolidType object) {
				return createCompositeSolidTypeAdapter();
			}
			@Override
			public Adapter caseCompositeSurfaceType(CompositeSurfaceType object) {
				return createCompositeSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseCompositeValueType(CompositeValueType object) {
				return createCompositeValueTypeAdapter();
			}
			@Override
			public Adapter caseCompoundCRSPropertyType(CompoundCRSPropertyType object) {
				return createCompoundCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCompoundCRSType(CompoundCRSType object) {
				return createCompoundCRSTypeAdapter();
			}
			@Override
			public Adapter caseConcatenatedOperationPropertyType(ConcatenatedOperationPropertyType object) {
				return createConcatenatedOperationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseConcatenatedOperationType(ConcatenatedOperationType object) {
				return createConcatenatedOperationTypeAdapter();
			}
			@Override
			public Adapter caseConeType(ConeType object) {
				return createConeTypeAdapter();
			}
			@Override
			public Adapter caseControlPointType(ControlPointType object) {
				return createControlPointTypeAdapter();
			}
			@Override
			public Adapter caseConventionalUnitType(ConventionalUnitType object) {
				return createConventionalUnitTypeAdapter();
			}
			@Override
			public Adapter caseConversionPropertyType(ConversionPropertyType object) {
				return createConversionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseConversionToPreferredUnitType(ConversionToPreferredUnitType object) {
				return createConversionToPreferredUnitTypeAdapter();
			}
			@Override
			public Adapter caseConversionType(ConversionType object) {
				return createConversionTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateOperationAccuracyType(CoordinateOperationAccuracyType object) {
				return createCoordinateOperationAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateOperationPropertyType(CoordinateOperationPropertyType object) {
				return createCoordinateOperationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCoordinatesType(CoordinatesType object) {
				return createCoordinatesTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateSystemAxisPropertyType(CoordinateSystemAxisPropertyType object) {
				return createCoordinateSystemAxisPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateSystemAxisType(CoordinateSystemAxisType object) {
				return createCoordinateSystemAxisTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateSystemPropertyType(CoordinateSystemPropertyType object) {
				return createCoordinateSystemPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCountPropertyType(CountPropertyType object) {
				return createCountPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCountType(CountType object) {
				return createCountTypeAdapter();
			}
			@Override
			public Adapter caseCoverageFunctionType(CoverageFunctionType object) {
				return createCoverageFunctionTypeAdapter();
			}
			@Override
			public Adapter caseCRSPropertyType(CRSPropertyType object) {
				return createCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCubicSplineType(CubicSplineType object) {
				return createCubicSplineTypeAdapter();
			}
			@Override
			public Adapter caseCurveArrayPropertyType(CurveArrayPropertyType object) {
				return createCurveArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCurvePropertyType(CurvePropertyType object) {
				return createCurvePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCurveSegmentArrayPropertyType(CurveSegmentArrayPropertyType object) {
				return createCurveSegmentArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCurveType(CurveType object) {
				return createCurveTypeAdapter();
			}
			@Override
			public Adapter caseCylinderType(CylinderType object) {
				return createCylinderTypeAdapter();
			}
			@Override
			public Adapter caseCylindricalCSPropertyType(CylindricalCSPropertyType object) {
				return createCylindricalCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCylindricalCSType(CylindricalCSType object) {
				return createCylindricalCSTypeAdapter();
			}
			@Override
			public Adapter caseDataBlockType(DataBlockType object) {
				return createDataBlockTypeAdapter();
			}
			@Override
			public Adapter caseDatumPropertyType(DatumPropertyType object) {
				return createDatumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionBaseType(DefinitionBaseType object) {
				return createDefinitionBaseTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionProxyType(DefinitionProxyType object) {
				return createDefinitionProxyTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionType(DefinitionType object) {
				return createDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseDegreesType(DegreesType object) {
				return createDegreesTypeAdapter();
			}
			@Override
			public Adapter caseDerivationUnitTermType(DerivationUnitTermType object) {
				return createDerivationUnitTermTypeAdapter();
			}
			@Override
			public Adapter caseDerivedCRSPropertyType(DerivedCRSPropertyType object) {
				return createDerivedCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDerivedCRSType(DerivedCRSType object) {
				return createDerivedCRSTypeAdapter();
			}
			@Override
			public Adapter caseDerivedUnitType(DerivedUnitType object) {
				return createDerivedUnitTypeAdapter();
			}
			@Override
			public Adapter caseDictionaryEntryType(DictionaryEntryType object) {
				return createDictionaryEntryTypeAdapter();
			}
			@Override
			public Adapter caseDictionaryType(DictionaryType object) {
				return createDictionaryTypeAdapter();
			}
			@Override
			public Adapter caseDirectedEdgePropertyType(DirectedEdgePropertyType object) {
				return createDirectedEdgePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectedFacePropertyType(DirectedFacePropertyType object) {
				return createDirectedFacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectedNodePropertyType(DirectedNodePropertyType object) {
				return createDirectedNodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectedObservationAtDistanceType(DirectedObservationAtDistanceType object) {
				return createDirectedObservationAtDistanceTypeAdapter();
			}
			@Override
			public Adapter caseDirectedObservationType(DirectedObservationType object) {
				return createDirectedObservationTypeAdapter();
			}
			@Override
			public Adapter caseDirectedTopoSolidPropertyType(DirectedTopoSolidPropertyType object) {
				return createDirectedTopoSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectionDescriptionType(DirectionDescriptionType object) {
				return createDirectionDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseDirectionPropertyType(DirectionPropertyType object) {
				return createDirectionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectionVectorType(DirectionVectorType object) {
				return createDirectionVectorTypeAdapter();
			}
			@Override
			public Adapter caseDirectPositionListType(DirectPositionListType object) {
				return createDirectPositionListTypeAdapter();
			}
			@Override
			public Adapter caseDirectPositionType(DirectPositionType object) {
				return createDirectPositionTypeAdapter();
			}
			@Override
			public Adapter caseDiscreteCoverageType(DiscreteCoverageType object) {
				return createDiscreteCoverageTypeAdapter();
			}
			@Override
			public Adapter caseDMSAngleType(DMSAngleType object) {
				return createDMSAngleTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDomainOfValidityType(DomainOfValidityType object) {
				return createDomainOfValidityTypeAdapter();
			}
			@Override
			public Adapter caseDomainSetType(DomainSetType object) {
				return createDomainSetTypeAdapter();
			}
			@Override
			public Adapter caseDynamicFeatureCollectionType(DynamicFeatureCollectionType object) {
				return createDynamicFeatureCollectionTypeAdapter();
			}
			@Override
			public Adapter caseDynamicFeatureMemberType(DynamicFeatureMemberType object) {
				return createDynamicFeatureMemberTypeAdapter();
			}
			@Override
			public Adapter caseDynamicFeatureType(DynamicFeatureType object) {
				return createDynamicFeatureTypeAdapter();
			}
			@Override
			public Adapter caseEdgeType(EdgeType object) {
				return createEdgeTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidalCSPropertyType(EllipsoidalCSPropertyType object) {
				return createEllipsoidalCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidalCSType(EllipsoidalCSType object) {
				return createEllipsoidalCSTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidPropertyType(EllipsoidPropertyType object) {
				return createEllipsoidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidType(EllipsoidType object) {
				return createEllipsoidTypeAdapter();
			}
			@Override
			public Adapter caseEngineeringCRSPropertyType(EngineeringCRSPropertyType object) {
				return createEngineeringCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEngineeringCRSType(EngineeringCRSType object) {
				return createEngineeringCRSTypeAdapter();
			}
			@Override
			public Adapter caseEngineeringDatumPropertyType(EngineeringDatumPropertyType object) {
				return createEngineeringDatumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEngineeringDatumType(EngineeringDatumType object) {
				return createEngineeringDatumTypeAdapter();
			}
			@Override
			public Adapter caseEnvelopeType(EnvelopeType object) {
				return createEnvelopeTypeAdapter();
			}
			@Override
			public Adapter caseEnvelopeWithTimePeriodType(EnvelopeWithTimePeriodType object) {
				return createEnvelopeWithTimePeriodTypeAdapter();
			}
			@Override
			public Adapter caseFaceOrTopoSolidPropertyType(FaceOrTopoSolidPropertyType object) {
				return createFaceOrTopoSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseFaceType(FaceType object) {
				return createFaceTypeAdapter();
			}
			@Override
			public Adapter caseFeatureArrayPropertyType(FeatureArrayPropertyType object) {
				return createFeatureArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseFeatureCollectionType(FeatureCollectionType object) {
				return createFeatureCollectionTypeAdapter();
			}
			@Override
			public Adapter caseFeaturePropertyType(FeaturePropertyType object) {
				return createFeaturePropertyTypeAdapter();
			}
			@Override
			public Adapter caseFileType(FileType object) {
				return createFileTypeAdapter();
			}
			@Override
			public Adapter caseFormulaCitationType(FormulaCitationType object) {
				return createFormulaCitationTypeAdapter();
			}
			@Override
			public Adapter caseFormulaType(FormulaType object) {
				return createFormulaTypeAdapter();
			}
			@Override
			public Adapter caseGeneralConversionPropertyType(GeneralConversionPropertyType object) {
				return createGeneralConversionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeneralTransformationPropertyType(GeneralTransformationPropertyType object) {
				return createGeneralTransformationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGenericMetaDataType(GenericMetaDataType object) {
				return createGenericMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseGeocentricCRSPropertyType(GeocentricCRSPropertyType object) {
				return createGeocentricCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeocentricCRSType(GeocentricCRSType object) {
				return createGeocentricCRSTypeAdapter();
			}
			@Override
			public Adapter caseGeodesicStringType(GeodesicStringType object) {
				return createGeodesicStringTypeAdapter();
			}
			@Override
			public Adapter caseGeodesicType(GeodesicType object) {
				return createGeodesicTypeAdapter();
			}
			@Override
			public Adapter caseGeodeticCRSPropertyType(GeodeticCRSPropertyType object) {
				return createGeodeticCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeodeticCRSType(GeodeticCRSType object) {
				return createGeodeticCRSTypeAdapter();
			}
			@Override
			public Adapter caseGeodeticDatumPropertyType(GeodeticDatumPropertyType object) {
				return createGeodeticDatumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeodeticDatumType(GeodeticDatumType object) {
				return createGeodeticDatumTypeAdapter();
			}
			@Override
			public Adapter caseGeographicCRSPropertyType(GeographicCRSPropertyType object) {
				return createGeographicCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeographicCRSType(GeographicCRSType object) {
				return createGeographicCRSTypeAdapter();
			}
			@Override
			public Adapter caseGeometricComplexPropertyType(GeometricComplexPropertyType object) {
				return createGeometricComplexPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeometricComplexType(GeometricComplexType object) {
				return createGeometricComplexTypeAdapter();
			}
			@Override
			public Adapter caseGeometricPrimitivePropertyType(GeometricPrimitivePropertyType object) {
				return createGeometricPrimitivePropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeometryArrayPropertyType(GeometryArrayPropertyType object) {
				return createGeometryArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeometryPropertyType(GeometryPropertyType object) {
				return createGeometryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGridEnvelopeType(GridEnvelopeType object) {
				return createGridEnvelopeTypeAdapter();
			}
			@Override
			public Adapter caseGridFunctionType(GridFunctionType object) {
				return createGridFunctionTypeAdapter();
			}
			@Override
			public Adapter caseGridLengthType(GridLengthType object) {
				return createGridLengthTypeAdapter();
			}
			@Override
			public Adapter caseGridLimitsType(GridLimitsType object) {
				return createGridLimitsTypeAdapter();
			}
			@Override
			public Adapter caseGridType(GridType object) {
				return createGridTypeAdapter();
			}
			@Override
			public Adapter caseHistoryPropertyType(HistoryPropertyType object) {
				return createHistoryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseIdentifiedObjectType(IdentifiedObjectType object) {
				return createIdentifiedObjectTypeAdapter();
			}
			@Override
			public Adapter caseImageCRSPropertyType(ImageCRSPropertyType object) {
				return createImageCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseImageCRSType(ImageCRSType object) {
				return createImageCRSTypeAdapter();
			}
			@Override
			public Adapter caseImageDatumPropertyType(ImageDatumPropertyType object) {
				return createImageDatumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseImageDatumType(ImageDatumType object) {
				return createImageDatumTypeAdapter();
			}
			@Override
			public Adapter caseIndirectEntryType(IndirectEntryType object) {
				return createIndirectEntryTypeAdapter();
			}
			@Override
			public Adapter caseInlinePropertyType(InlinePropertyType object) {
				return createInlinePropertyTypeAdapter();
			}
			@Override
			public Adapter caseKnotPropertyType(KnotPropertyType object) {
				return createKnotPropertyTypeAdapter();
			}
			@Override
			public Adapter caseKnotType(KnotType object) {
				return createKnotTypeAdapter();
			}
			@Override
			public Adapter caseLengthType(LengthType object) {
				return createLengthTypeAdapter();
			}
			@Override
			public Adapter caseLinearCSPropertyType(LinearCSPropertyType object) {
				return createLinearCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLinearCSType(LinearCSType object) {
				return createLinearCSTypeAdapter();
			}
			@Override
			public Adapter caseLinearRingPropertyType(LinearRingPropertyType object) {
				return createLinearRingPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLinearRingType(LinearRingType object) {
				return createLinearRingTypeAdapter();
			}
			@Override
			public Adapter caseLineStringSegmentArrayPropertyType(LineStringSegmentArrayPropertyType object) {
				return createLineStringSegmentArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLineStringSegmentType(LineStringSegmentType object) {
				return createLineStringSegmentTypeAdapter();
			}
			@Override
			public Adapter caseLineStringType(LineStringType object) {
				return createLineStringTypeAdapter();
			}
			@Override
			public Adapter caseLocationPropertyType(LocationPropertyType object) {
				return createLocationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMappingRuleType(MappingRuleType object) {
				return createMappingRuleTypeAdapter();
			}
			@Override
			public Adapter caseMeasureListType(MeasureListType object) {
				return createMeasureListTypeAdapter();
			}
			@Override
			public Adapter caseMeasureOrNilReasonListType(MeasureOrNilReasonListType object) {
				return createMeasureOrNilReasonListTypeAdapter();
			}
			@Override
			public Adapter caseMeasureType(MeasureType object) {
				return createMeasureTypeAdapter();
			}
			@Override
			public Adapter caseMetaDataPropertyType(MetaDataPropertyType object) {
				return createMetaDataPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMovingObjectStatusType(MovingObjectStatusType object) {
				return createMovingObjectStatusTypeAdapter();
			}
			@Override
			public Adapter caseMultiCurvePropertyType(MultiCurvePropertyType object) {
				return createMultiCurvePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiCurveType(MultiCurveType object) {
				return createMultiCurveTypeAdapter();
			}
			@Override
			public Adapter caseMultiGeometryPropertyType(MultiGeometryPropertyType object) {
				return createMultiGeometryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiGeometryType(MultiGeometryType object) {
				return createMultiGeometryTypeAdapter();
			}
			@Override
			public Adapter caseMultiPointPropertyType(MultiPointPropertyType object) {
				return createMultiPointPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiPointType(MultiPointType object) {
				return createMultiPointTypeAdapter();
			}
			@Override
			public Adapter caseMultiSolidPropertyType(MultiSolidPropertyType object) {
				return createMultiSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiSolidType(MultiSolidType object) {
				return createMultiSolidTypeAdapter();
			}
			@Override
			public Adapter caseMultiSurfacePropertyType(MultiSurfacePropertyType object) {
				return createMultiSurfacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiSurfaceType(MultiSurfaceType object) {
				return createMultiSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseNodeOrEdgePropertyType(NodeOrEdgePropertyType object) {
				return createNodeOrEdgePropertyTypeAdapter();
			}
			@Override
			public Adapter caseNodePropertyType(NodePropertyType object) {
				return createNodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseNodeType(NodeType object) {
				return createNodeTypeAdapter();
			}
			@Override
			public Adapter caseObliqueCartesianCSPropertyType(ObliqueCartesianCSPropertyType object) {
				return createObliqueCartesianCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseObliqueCartesianCSType(ObliqueCartesianCSType object) {
				return createObliqueCartesianCSTypeAdapter();
			}
			@Override
			public Adapter caseObservationType(ObservationType object) {
				return createObservationTypeAdapter();
			}
			@Override
			public Adapter caseOffsetCurveType(OffsetCurveType object) {
				return createOffsetCurveTypeAdapter();
			}
			@Override
			public Adapter caseOperationMethodPropertyType(OperationMethodPropertyType object) {
				return createOperationMethodPropertyTypeAdapter();
			}
			@Override
			public Adapter caseOperationMethodType(OperationMethodType object) {
				return createOperationMethodTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterGroupPropertyType(OperationParameterGroupPropertyType object) {
				return createOperationParameterGroupPropertyTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterGroupType(OperationParameterGroupType object) {
				return createOperationParameterGroupTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterPropertyType(OperationParameterPropertyType object) {
				return createOperationParameterPropertyTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterType(OperationParameterType object) {
				return createOperationParameterTypeAdapter();
			}
			@Override
			public Adapter caseOperationPropertyType(OperationPropertyType object) {
				return createOperationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseOrientableCurveType(OrientableCurveType object) {
				return createOrientableCurveTypeAdapter();
			}
			@Override
			public Adapter caseOrientableSurfaceType(OrientableSurfaceType object) {
				return createOrientableSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseParameterValueGroupType(ParameterValueGroupType object) {
				return createParameterValueGroupTypeAdapter();
			}
			@Override
			public Adapter caseParameterValueType(ParameterValueType object) {
				return createParameterValueTypeAdapter();
			}
			@Override
			public Adapter casePassThroughOperationPropertyType(PassThroughOperationPropertyType object) {
				return createPassThroughOperationPropertyTypeAdapter();
			}
			@Override
			public Adapter casePassThroughOperationType(PassThroughOperationType object) {
				return createPassThroughOperationTypeAdapter();
			}
			@Override
			public Adapter casePointArrayPropertyType(PointArrayPropertyType object) {
				return createPointArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter casePointPropertyType(PointPropertyType object) {
				return createPointPropertyTypeAdapter();
			}
			@Override
			public Adapter casePointType(PointType object) {
				return createPointTypeAdapter();
			}
			@Override
			public Adapter casePolarCSPropertyType(PolarCSPropertyType object) {
				return createPolarCSPropertyTypeAdapter();
			}
			@Override
			public Adapter casePolarCSType(PolarCSType object) {
				return createPolarCSTypeAdapter();
			}
			@Override
			public Adapter casePolygonPatchType(PolygonPatchType object) {
				return createPolygonPatchTypeAdapter();
			}
			@Override
			public Adapter casePolygonType(PolygonType object) {
				return createPolygonTypeAdapter();
			}
			@Override
			public Adapter casePrimeMeridianPropertyType(PrimeMeridianPropertyType object) {
				return createPrimeMeridianPropertyTypeAdapter();
			}
			@Override
			public Adapter casePrimeMeridianType(PrimeMeridianType object) {
				return createPrimeMeridianTypeAdapter();
			}
			@Override
			public Adapter casePriorityLocationPropertyType(PriorityLocationPropertyType object) {
				return createPriorityLocationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseProcedurePropertyType(ProcedurePropertyType object) {
				return createProcedurePropertyTypeAdapter();
			}
			@Override
			public Adapter caseProjectedCRSPropertyType(ProjectedCRSPropertyType object) {
				return createProjectedCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseProjectedCRSType(ProjectedCRSType object) {
				return createProjectedCRSTypeAdapter();
			}
			@Override
			public Adapter caseQuantityExtentType(QuantityExtentType object) {
				return createQuantityExtentTypeAdapter();
			}
			@Override
			public Adapter caseQuantityPropertyType(QuantityPropertyType object) {
				return createQuantityPropertyTypeAdapter();
			}
			@Override
			public Adapter caseQuantityType(QuantityType object) {
				return createQuantityTypeAdapter();
			}
			@Override
			public Adapter caseRangeSetType(RangeSetType object) {
				return createRangeSetTypeAdapter();
			}
			@Override
			public Adapter caseRectangleType(RectangleType object) {
				return createRectangleTypeAdapter();
			}
			@Override
			public Adapter caseRectifiedGridType(RectifiedGridType object) {
				return createRectifiedGridTypeAdapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseRefLocationType(RefLocationType object) {
				return createRefLocationTypeAdapter();
			}
			@Override
			public Adapter caseRelatedTimeType(RelatedTimeType object) {
				return createRelatedTimeTypeAdapter();
			}
			@Override
			public Adapter caseResultType(ResultType object) {
				return createResultTypeAdapter();
			}
			@Override
			public Adapter caseRingPropertyType(RingPropertyType object) {
				return createRingPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRingType(RingType object) {
				return createRingTypeAdapter();
			}
			@Override
			public Adapter caseRowsType(RowsType object) {
				return createRowsTypeAdapter();
			}
			@Override
			public Adapter caseRowType(RowType object) {
				return createRowTypeAdapter();
			}
			@Override
			public Adapter caseScaleType(ScaleType object) {
				return createScaleTypeAdapter();
			}
			@Override
			public Adapter caseSecondDefiningParameterType(SecondDefiningParameterType object) {
				return createSecondDefiningParameterTypeAdapter();
			}
			@Override
			public Adapter caseSecondDefiningParameterType1(SecondDefiningParameterType1 object) {
				return createSecondDefiningParameterType1Adapter();
			}
			@Override
			public Adapter caseSequenceRuleType(SequenceRuleType object) {
				return createSequenceRuleTypeAdapter();
			}
			@Override
			public Adapter caseShellPropertyType(ShellPropertyType object) {
				return createShellPropertyTypeAdapter();
			}
			@Override
			public Adapter caseShellType(ShellType object) {
				return createShellTypeAdapter();
			}
			@Override
			public Adapter caseSingleCRSPropertyType(SingleCRSPropertyType object) {
				return createSingleCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSingleOperationPropertyType(SingleOperationPropertyType object) {
				return createSingleOperationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSolidArrayPropertyType(SolidArrayPropertyType object) {
				return createSolidArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSolidPropertyType(SolidPropertyType object) {
				return createSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSolidType(SolidType object) {
				return createSolidTypeAdapter();
			}
			@Override
			public Adapter caseSpeedType(SpeedType object) {
				return createSpeedTypeAdapter();
			}
			@Override
			public Adapter caseSphereType(SphereType object) {
				return createSphereTypeAdapter();
			}
			@Override
			public Adapter caseSphericalCSPropertyType(SphericalCSPropertyType object) {
				return createSphericalCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSphericalCSType(SphericalCSType object) {
				return createSphericalCSTypeAdapter();
			}
			@Override
			public Adapter caseStringOrRefType(StringOrRefType object) {
				return createStringOrRefTypeAdapter();
			}
			@Override
			public Adapter caseSurfaceArrayPropertyType(SurfaceArrayPropertyType object) {
				return createSurfaceArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSurfacePatchArrayPropertyType(SurfacePatchArrayPropertyType object) {
				return createSurfacePatchArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSurfacePropertyType(SurfacePropertyType object) {
				return createSurfacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseSurfaceType(SurfaceType object) {
				return createSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseTargetPropertyType(TargetPropertyType object) {
				return createTargetPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTemporalCRSPropertyType(TemporalCRSPropertyType object) {
				return createTemporalCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTemporalCRSType(TemporalCRSType object) {
				return createTemporalCRSTypeAdapter();
			}
			@Override
			public Adapter caseTemporalCSPropertyType(TemporalCSPropertyType object) {
				return createTemporalCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTemporalCSType(TemporalCSType object) {
				return createTemporalCSTypeAdapter();
			}
			@Override
			public Adapter caseTemporalDatumBaseType(TemporalDatumBaseType object) {
				return createTemporalDatumBaseTypeAdapter();
			}
			@Override
			public Adapter caseTemporalDatumPropertyType(TemporalDatumPropertyType object) {
				return createTemporalDatumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTemporalDatumType(TemporalDatumType object) {
				return createTemporalDatumTypeAdapter();
			}
			@Override
			public Adapter caseTimeCalendarEraPropertyType(TimeCalendarEraPropertyType object) {
				return createTimeCalendarEraPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeCalendarEraType(TimeCalendarEraType object) {
				return createTimeCalendarEraTypeAdapter();
			}
			@Override
			public Adapter caseTimeCalendarPropertyType(TimeCalendarPropertyType object) {
				return createTimeCalendarPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeCalendarType(TimeCalendarType object) {
				return createTimeCalendarTypeAdapter();
			}
			@Override
			public Adapter caseTimeClockPropertyType(TimeClockPropertyType object) {
				return createTimeClockPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeClockType(TimeClockType object) {
				return createTimeClockTypeAdapter();
			}
			@Override
			public Adapter caseTimeCoordinateSystemType(TimeCoordinateSystemType object) {
				return createTimeCoordinateSystemTypeAdapter();
			}
			@Override
			public Adapter caseTimeCSPropertyType(TimeCSPropertyType object) {
				return createTimeCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeCSType(TimeCSType object) {
				return createTimeCSTypeAdapter();
			}
			@Override
			public Adapter caseTimeEdgePropertyType(TimeEdgePropertyType object) {
				return createTimeEdgePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeEdgeType(TimeEdgeType object) {
				return createTimeEdgeTypeAdapter();
			}
			@Override
			public Adapter caseTimeInstantPropertyType(TimeInstantPropertyType object) {
				return createTimeInstantPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeInstantType(TimeInstantType object) {
				return createTimeInstantTypeAdapter();
			}
			@Override
			public Adapter caseTimeIntervalLengthType(TimeIntervalLengthType object) {
				return createTimeIntervalLengthTypeAdapter();
			}
			@Override
			public Adapter caseTimeNodePropertyType(TimeNodePropertyType object) {
				return createTimeNodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeNodeType(TimeNodeType object) {
				return createTimeNodeTypeAdapter();
			}
			@Override
			public Adapter caseTimeOrdinalEraPropertyType(TimeOrdinalEraPropertyType object) {
				return createTimeOrdinalEraPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeOrdinalEraType(TimeOrdinalEraType object) {
				return createTimeOrdinalEraTypeAdapter();
			}
			@Override
			public Adapter caseTimeOrdinalReferenceSystemType(TimeOrdinalReferenceSystemType object) {
				return createTimeOrdinalReferenceSystemTypeAdapter();
			}
			@Override
			public Adapter caseTimePeriodPropertyType(TimePeriodPropertyType object) {
				return createTimePeriodPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimePeriodType(TimePeriodType object) {
				return createTimePeriodTypeAdapter();
			}
			@Override
			public Adapter caseTimePositionType(TimePositionType object) {
				return createTimePositionTypeAdapter();
			}
			@Override
			public Adapter caseTimePrimitivePropertyType(TimePrimitivePropertyType object) {
				return createTimePrimitivePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeReferenceSystemType(TimeReferenceSystemType object) {
				return createTimeReferenceSystemTypeAdapter();
			}
			@Override
			public Adapter caseTimeTopologyComplexPropertyType(TimeTopologyComplexPropertyType object) {
				return createTimeTopologyComplexPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeTopologyComplexType(TimeTopologyComplexType object) {
				return createTimeTopologyComplexTypeAdapter();
			}
			@Override
			public Adapter caseTimeTopologyPrimitivePropertyType(TimeTopologyPrimitivePropertyType object) {
				return createTimeTopologyPrimitivePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeType(TimeType object) {
				return createTimeTypeAdapter();
			}
			@Override
			public Adapter caseTinType(TinType object) {
				return createTinTypeAdapter();
			}
			@Override
			public Adapter caseTopoComplexPropertyType(TopoComplexPropertyType object) {
				return createTopoComplexPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoComplexType(TopoComplexType object) {
				return createTopoComplexTypeAdapter();
			}
			@Override
			public Adapter caseTopoCurvePropertyType(TopoCurvePropertyType object) {
				return createTopoCurvePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoCurveType(TopoCurveType object) {
				return createTopoCurveTypeAdapter();
			}
			@Override
			public Adapter caseTopoPointPropertyType(TopoPointPropertyType object) {
				return createTopoPointPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoPointType(TopoPointType object) {
				return createTopoPointTypeAdapter();
			}
			@Override
			public Adapter caseTopoPrimitiveArrayAssociationType(TopoPrimitiveArrayAssociationType object) {
				return createTopoPrimitiveArrayAssociationTypeAdapter();
			}
			@Override
			public Adapter caseTopoPrimitiveMemberType(TopoPrimitiveMemberType object) {
				return createTopoPrimitiveMemberTypeAdapter();
			}
			@Override
			public Adapter caseTopoSolidPropertyType(TopoSolidPropertyType object) {
				return createTopoSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoSolidType(TopoSolidType object) {
				return createTopoSolidTypeAdapter();
			}
			@Override
			public Adapter caseTopoSurfacePropertyType(TopoSurfacePropertyType object) {
				return createTopoSurfacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoSurfaceType(TopoSurfaceType object) {
				return createTopoSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseTopoVolumePropertyType(TopoVolumePropertyType object) {
				return createTopoVolumePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoVolumeType(TopoVolumeType object) {
				return createTopoVolumeTypeAdapter();
			}
			@Override
			public Adapter caseTransformationPropertyType(TransformationPropertyType object) {
				return createTransformationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTransformationType(TransformationType object) {
				return createTransformationTypeAdapter();
			}
			@Override
			public Adapter caseTriangleType(TriangleType object) {
				return createTriangleTypeAdapter();
			}
			@Override
			public Adapter caseUnitDefinitionType(UnitDefinitionType object) {
				return createUnitDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseUnitOfMeasureType(UnitOfMeasureType object) {
				return createUnitOfMeasureTypeAdapter();
			}
			@Override
			public Adapter caseUserDefinedCSPropertyType(UserDefinedCSPropertyType object) {
				return createUserDefinedCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseUserDefinedCSType(UserDefinedCSType object) {
				return createUserDefinedCSTypeAdapter();
			}
			@Override
			public Adapter caseValueArrayPropertyType(ValueArrayPropertyType object) {
				return createValueArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseValueArrayType(ValueArrayType object) {
				return createValueArrayTypeAdapter();
			}
			@Override
			public Adapter caseValuePropertyType(ValuePropertyType object) {
				return createValuePropertyTypeAdapter();
			}
			@Override
			public Adapter caseVectorType(VectorType object) {
				return createVectorTypeAdapter();
			}
			@Override
			public Adapter caseVerticalCRSPropertyType(VerticalCRSPropertyType object) {
				return createVerticalCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseVerticalCRSType(VerticalCRSType object) {
				return createVerticalCRSTypeAdapter();
			}
			@Override
			public Adapter caseVerticalCSPropertyType(VerticalCSPropertyType object) {
				return createVerticalCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseVerticalCSType(VerticalCSType object) {
				return createVerticalCSTypeAdapter();
			}
			@Override
			public Adapter caseVerticalDatumPropertyType(VerticalDatumPropertyType object) {
				return createVerticalDatumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseVerticalDatumType(VerticalDatumType object) {
				return createVerticalDatumTypeAdapter();
			}
			@Override
			public Adapter caseVolumeType(VolumeType object) {
				return createVolumeTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractContinuousCoverageType <em>Abstract Continuous Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractContinuousCoverageType
	 * @generated
	 */
	public Adapter createAbstractContinuousCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractCoordinateOperationType <em>Abstract Coordinate Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractCoordinateOperationType
	 * @generated
	 */
	public Adapter createAbstractCoordinateOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractCoordinateSystemType <em>Abstract Coordinate System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractCoordinateSystemType
	 * @generated
	 */
	public Adapter createAbstractCoordinateSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractCoverageType <em>Abstract Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractCoverageType
	 * @generated
	 */
	public Adapter createAbstractCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractCRSType <em>Abstract CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractCRSType
	 * @generated
	 */
	public Adapter createAbstractCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractCurveSegmentType <em>Abstract Curve Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractCurveSegmentType
	 * @generated
	 */
	public Adapter createAbstractCurveSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractCurveType <em>Abstract Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractCurveType
	 * @generated
	 */
	public Adapter createAbstractCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractDatumType <em>Abstract Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractDatumType
	 * @generated
	 */
	public Adapter createAbstractDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractFeatureCollectionType <em>Abstract Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractFeatureCollectionType
	 * @generated
	 */
	public Adapter createAbstractFeatureCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractFeatureMemberType <em>Abstract Feature Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractFeatureMemberType
	 * @generated
	 */
	public Adapter createAbstractFeatureMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractFeatureType <em>Abstract Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractFeatureType
	 * @generated
	 */
	public Adapter createAbstractFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractGeneralConversionType <em>Abstract General Conversion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractGeneralConversionType
	 * @generated
	 */
	public Adapter createAbstractGeneralConversionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractGeneralDerivedCRSType <em>Abstract General Derived CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractGeneralDerivedCRSType
	 * @generated
	 */
	public Adapter createAbstractGeneralDerivedCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractGeneralOperationParameterPropertyType <em>Abstract General Operation Parameter Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractGeneralOperationParameterPropertyType
	 * @generated
	 */
	public Adapter createAbstractGeneralOperationParameterPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractGeneralOperationParameterType <em>Abstract General Operation Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractGeneralOperationParameterType
	 * @generated
	 */
	public Adapter createAbstractGeneralOperationParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractGeneralParameterValuePropertyType <em>Abstract General Parameter Value Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractGeneralParameterValuePropertyType
	 * @generated
	 */
	public Adapter createAbstractGeneralParameterValuePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractGeneralParameterValueType <em>Abstract General Parameter Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractGeneralParameterValueType
	 * @generated
	 */
	public Adapter createAbstractGeneralParameterValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractGeneralTransformationType <em>Abstract General Transformation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractGeneralTransformationType
	 * @generated
	 */
	public Adapter createAbstractGeneralTransformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractGeometricAggregateType <em>Abstract Geometric Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractGeometricAggregateType
	 * @generated
	 */
	public Adapter createAbstractGeometricAggregateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractGeometricPrimitiveType <em>Abstract Geometric Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractGeometricPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractGeometricPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractGeometryType <em>Abstract Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractGeometryType
	 * @generated
	 */
	public Adapter createAbstractGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractGMLType <em>Abstract GML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractGMLType
	 * @generated
	 */
	public Adapter createAbstractGMLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractGriddedSurfaceType <em>Abstract Gridded Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractGriddedSurfaceType
	 * @generated
	 */
	public Adapter createAbstractGriddedSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractMemberType <em>Abstract Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractMemberType
	 * @generated
	 */
	public Adapter createAbstractMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractMetadataPropertyType <em>Abstract Metadata Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractMetadataPropertyType
	 * @generated
	 */
	public Adapter createAbstractMetadataPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractMetaDataType <em>Abstract Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractMetaDataType
	 * @generated
	 */
	public Adapter createAbstractMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractParametricCurveSurfaceType <em>Abstract Parametric Curve Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractParametricCurveSurfaceType
	 * @generated
	 */
	public Adapter createAbstractParametricCurveSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractRingPropertyType <em>Abstract Ring Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractRingPropertyType
	 * @generated
	 */
	public Adapter createAbstractRingPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractRingType <em>Abstract Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractRingType
	 * @generated
	 */
	public Adapter createAbstractRingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractSolidType <em>Abstract Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractSolidType
	 * @generated
	 */
	public Adapter createAbstractSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractSurfacePatchType <em>Abstract Surface Patch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractSurfacePatchType
	 * @generated
	 */
	public Adapter createAbstractSurfacePatchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractSurfaceType <em>Abstract Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractSurfaceType
	 * @generated
	 */
	public Adapter createAbstractSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractTimeComplexType <em>Abstract Time Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractTimeComplexType
	 * @generated
	 */
	public Adapter createAbstractTimeComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractTimeGeometricPrimitiveType <em>Abstract Time Geometric Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractTimeGeometricPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractTimeGeometricPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractTimeObjectType <em>Abstract Time Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractTimeObjectType
	 * @generated
	 */
	public Adapter createAbstractTimeObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractTimePrimitiveType <em>Abstract Time Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractTimePrimitiveType
	 * @generated
	 */
	public Adapter createAbstractTimePrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractTimeSliceType <em>Abstract Time Slice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractTimeSliceType
	 * @generated
	 */
	public Adapter createAbstractTimeSliceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractTimeTopologyPrimitiveType <em>Abstract Time Topology Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractTimeTopologyPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractTimeTopologyPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractTopologyType <em>Abstract Topology Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractTopologyType
	 * @generated
	 */
	public Adapter createAbstractTopologyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AbstractTopoPrimitiveType <em>Abstract Topo Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AbstractTopoPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractTopoPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AffineCSPropertyType <em>Affine CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AffineCSPropertyType
	 * @generated
	 */
	public Adapter createAffineCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AffineCSType <em>Affine CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AffineCSType
	 * @generated
	 */
	public Adapter createAffineCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AffinePlacementType <em>Affine Placement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AffinePlacementType
	 * @generated
	 */
	public Adapter createAffinePlacementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AngleChoiceType <em>Angle Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AngleChoiceType
	 * @generated
	 */
	public Adapter createAngleChoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AngleType <em>Angle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AngleType
	 * @generated
	 */
	public Adapter createAngleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ArcByBulgeType <em>Arc By Bulge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ArcByBulgeType
	 * @generated
	 */
	public Adapter createArcByBulgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ArcByCenterPointType <em>Arc By Center Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ArcByCenterPointType
	 * @generated
	 */
	public Adapter createArcByCenterPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ArcStringByBulgeType <em>Arc String By Bulge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ArcStringByBulgeType
	 * @generated
	 */
	public Adapter createArcStringByBulgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ArcStringType <em>Arc String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ArcStringType
	 * @generated
	 */
	public Adapter createArcStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ArcType
	 * @generated
	 */
	public Adapter createArcTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AreaType <em>Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AreaType
	 * @generated
	 */
	public Adapter createAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ArrayAssociationType <em>Array Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ArrayAssociationType
	 * @generated
	 */
	public Adapter createArrayAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.AssociationRoleType <em>Association Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.AssociationRoleType
	 * @generated
	 */
	public Adapter createAssociationRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.BagType
	 * @generated
	 */
	public Adapter createBagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.BaseUnitType <em>Base Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.BaseUnitType
	 * @generated
	 */
	public Adapter createBaseUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.BezierType <em>Bezier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.BezierType
	 * @generated
	 */
	public Adapter createBezierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.BooleanPropertyType <em>Boolean Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.BooleanPropertyType
	 * @generated
	 */
	public Adapter createBooleanPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.BoundedFeatureType <em>Bounded Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.BoundedFeatureType
	 * @generated
	 */
	public Adapter createBoundedFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.BoundingShapeType <em>Bounding Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.BoundingShapeType
	 * @generated
	 */
	public Adapter createBoundingShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.BSplineType <em>BSpline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.BSplineType
	 * @generated
	 */
	public Adapter createBSplineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CartesianCSPropertyType <em>Cartesian CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CartesianCSPropertyType
	 * @generated
	 */
	public Adapter createCartesianCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CartesianCSType <em>Cartesian CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CartesianCSType
	 * @generated
	 */
	public Adapter createCartesianCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CategoryExtentType <em>Category Extent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CategoryExtentType
	 * @generated
	 */
	public Adapter createCategoryExtentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CategoryPropertyType <em>Category Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CategoryPropertyType
	 * @generated
	 */
	public Adapter createCategoryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CategoryType
	 * @generated
	 */
	public Adapter createCategoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CircleByCenterPointType <em>Circle By Center Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CircleByCenterPointType
	 * @generated
	 */
	public Adapter createCircleByCenterPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CircleType <em>Circle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CircleType
	 * @generated
	 */
	public Adapter createCircleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ClothoidType <em>Clothoid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ClothoidType
	 * @generated
	 */
	public Adapter createClothoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CodeListType <em>Code List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CodeListType
	 * @generated
	 */
	public Adapter createCodeListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CodeOrNilReasonListType <em>Code Or Nil Reason List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CodeOrNilReasonListType
	 * @generated
	 */
	public Adapter createCodeOrNilReasonListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CodeType
	 * @generated
	 */
	public Adapter createCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CodeWithAuthorityType <em>Code With Authority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CodeWithAuthorityType
	 * @generated
	 */
	public Adapter createCodeWithAuthorityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CompositeCurveType <em>Composite Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CompositeCurveType
	 * @generated
	 */
	public Adapter createCompositeCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CompositeSolidType <em>Composite Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CompositeSolidType
	 * @generated
	 */
	public Adapter createCompositeSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CompositeSurfaceType <em>Composite Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CompositeSurfaceType
	 * @generated
	 */
	public Adapter createCompositeSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CompositeValueType <em>Composite Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CompositeValueType
	 * @generated
	 */
	public Adapter createCompositeValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CompoundCRSPropertyType <em>Compound CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CompoundCRSPropertyType
	 * @generated
	 */
	public Adapter createCompoundCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CompoundCRSType <em>Compound CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CompoundCRSType
	 * @generated
	 */
	public Adapter createCompoundCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ConcatenatedOperationPropertyType <em>Concatenated Operation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ConcatenatedOperationPropertyType
	 * @generated
	 */
	public Adapter createConcatenatedOperationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ConcatenatedOperationType <em>Concatenated Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ConcatenatedOperationType
	 * @generated
	 */
	public Adapter createConcatenatedOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ConeType <em>Cone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ConeType
	 * @generated
	 */
	public Adapter createConeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ControlPointType <em>Control Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ControlPointType
	 * @generated
	 */
	public Adapter createControlPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ConventionalUnitType <em>Conventional Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ConventionalUnitType
	 * @generated
	 */
	public Adapter createConventionalUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ConversionPropertyType <em>Conversion Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ConversionPropertyType
	 * @generated
	 */
	public Adapter createConversionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ConversionToPreferredUnitType <em>Conversion To Preferred Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ConversionToPreferredUnitType
	 * @generated
	 */
	public Adapter createConversionToPreferredUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ConversionType <em>Conversion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ConversionType
	 * @generated
	 */
	public Adapter createConversionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CoordinateOperationAccuracyType <em>Coordinate Operation Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CoordinateOperationAccuracyType
	 * @generated
	 */
	public Adapter createCoordinateOperationAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CoordinateOperationPropertyType <em>Coordinate Operation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CoordinateOperationPropertyType
	 * @generated
	 */
	public Adapter createCoordinateOperationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CoordinatesType <em>Coordinates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CoordinatesType
	 * @generated
	 */
	public Adapter createCoordinatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CoordinateSystemAxisPropertyType <em>Coordinate System Axis Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CoordinateSystemAxisPropertyType
	 * @generated
	 */
	public Adapter createCoordinateSystemAxisPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CoordinateSystemAxisType <em>Coordinate System Axis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CoordinateSystemAxisType
	 * @generated
	 */
	public Adapter createCoordinateSystemAxisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CoordinateSystemPropertyType <em>Coordinate System Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CoordinateSystemPropertyType
	 * @generated
	 */
	public Adapter createCoordinateSystemPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CountPropertyType <em>Count Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CountPropertyType
	 * @generated
	 */
	public Adapter createCountPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CountType <em>Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CountType
	 * @generated
	 */
	public Adapter createCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CoverageFunctionType <em>Coverage Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CoverageFunctionType
	 * @generated
	 */
	public Adapter createCoverageFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CRSPropertyType <em>CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CRSPropertyType
	 * @generated
	 */
	public Adapter createCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CubicSplineType <em>Cubic Spline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CubicSplineType
	 * @generated
	 */
	public Adapter createCubicSplineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CurveArrayPropertyType <em>Curve Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CurveArrayPropertyType
	 * @generated
	 */
	public Adapter createCurveArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CurvePropertyType <em>Curve Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CurvePropertyType
	 * @generated
	 */
	public Adapter createCurvePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CurveSegmentArrayPropertyType <em>Curve Segment Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CurveSegmentArrayPropertyType
	 * @generated
	 */
	public Adapter createCurveSegmentArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CurveType <em>Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CurveType
	 * @generated
	 */
	public Adapter createCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CylinderType <em>Cylinder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CylinderType
	 * @generated
	 */
	public Adapter createCylinderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CylindricalCSPropertyType <em>Cylindrical CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CylindricalCSPropertyType
	 * @generated
	 */
	public Adapter createCylindricalCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.CylindricalCSType <em>Cylindrical CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.CylindricalCSType
	 * @generated
	 */
	public Adapter createCylindricalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DataBlockType <em>Data Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DataBlockType
	 * @generated
	 */
	public Adapter createDataBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DatumPropertyType <em>Datum Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DatumPropertyType
	 * @generated
	 */
	public Adapter createDatumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DefinitionBaseType <em>Definition Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DefinitionBaseType
	 * @generated
	 */
	public Adapter createDefinitionBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DefinitionProxyType <em>Definition Proxy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DefinitionProxyType
	 * @generated
	 */
	public Adapter createDefinitionProxyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DefinitionType
	 * @generated
	 */
	public Adapter createDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DegreesType <em>Degrees Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DegreesType
	 * @generated
	 */
	public Adapter createDegreesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DerivationUnitTermType <em>Derivation Unit Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DerivationUnitTermType
	 * @generated
	 */
	public Adapter createDerivationUnitTermTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DerivedCRSPropertyType <em>Derived CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DerivedCRSPropertyType
	 * @generated
	 */
	public Adapter createDerivedCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DerivedCRSType <em>Derived CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DerivedCRSType
	 * @generated
	 */
	public Adapter createDerivedCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DerivedUnitType <em>Derived Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DerivedUnitType
	 * @generated
	 */
	public Adapter createDerivedUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DictionaryEntryType <em>Dictionary Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DictionaryEntryType
	 * @generated
	 */
	public Adapter createDictionaryEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DictionaryType
	 * @generated
	 */
	public Adapter createDictionaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DirectedEdgePropertyType <em>Directed Edge Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DirectedEdgePropertyType
	 * @generated
	 */
	public Adapter createDirectedEdgePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DirectedFacePropertyType <em>Directed Face Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DirectedFacePropertyType
	 * @generated
	 */
	public Adapter createDirectedFacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DirectedNodePropertyType <em>Directed Node Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DirectedNodePropertyType
	 * @generated
	 */
	public Adapter createDirectedNodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DirectedObservationAtDistanceType <em>Directed Observation At Distance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DirectedObservationAtDistanceType
	 * @generated
	 */
	public Adapter createDirectedObservationAtDistanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DirectedObservationType <em>Directed Observation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DirectedObservationType
	 * @generated
	 */
	public Adapter createDirectedObservationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DirectedTopoSolidPropertyType <em>Directed Topo Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DirectedTopoSolidPropertyType
	 * @generated
	 */
	public Adapter createDirectedTopoSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DirectionDescriptionType <em>Direction Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DirectionDescriptionType
	 * @generated
	 */
	public Adapter createDirectionDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DirectionPropertyType <em>Direction Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DirectionPropertyType
	 * @generated
	 */
	public Adapter createDirectionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DirectionVectorType <em>Direction Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DirectionVectorType
	 * @generated
	 */
	public Adapter createDirectionVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DirectPositionListType <em>Direct Position List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DirectPositionListType
	 * @generated
	 */
	public Adapter createDirectPositionListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DirectPositionType <em>Direct Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DirectPositionType
	 * @generated
	 */
	public Adapter createDirectPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DiscreteCoverageType <em>Discrete Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DiscreteCoverageType
	 * @generated
	 */
	public Adapter createDiscreteCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DMSAngleType <em>DMS Angle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DMSAngleType
	 * @generated
	 */
	public Adapter createDMSAngleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DomainOfValidityType <em>Domain Of Validity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DomainOfValidityType
	 * @generated
	 */
	public Adapter createDomainOfValidityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DomainSetType <em>Domain Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DomainSetType
	 * @generated
	 */
	public Adapter createDomainSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DynamicFeatureCollectionType <em>Dynamic Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DynamicFeatureCollectionType
	 * @generated
	 */
	public Adapter createDynamicFeatureCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DynamicFeatureMemberType <em>Dynamic Feature Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DynamicFeatureMemberType
	 * @generated
	 */
	public Adapter createDynamicFeatureMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.DynamicFeatureType <em>Dynamic Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.DynamicFeatureType
	 * @generated
	 */
	public Adapter createDynamicFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.EdgeType <em>Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.EdgeType
	 * @generated
	 */
	public Adapter createEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.EllipsoidalCSPropertyType <em>Ellipsoidal CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.EllipsoidalCSPropertyType
	 * @generated
	 */
	public Adapter createEllipsoidalCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.EllipsoidalCSType <em>Ellipsoidal CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.EllipsoidalCSType
	 * @generated
	 */
	public Adapter createEllipsoidalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.EllipsoidPropertyType <em>Ellipsoid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.EllipsoidPropertyType
	 * @generated
	 */
	public Adapter createEllipsoidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.EllipsoidType <em>Ellipsoid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.EllipsoidType
	 * @generated
	 */
	public Adapter createEllipsoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.EngineeringCRSPropertyType <em>Engineering CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.EngineeringCRSPropertyType
	 * @generated
	 */
	public Adapter createEngineeringCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.EngineeringCRSType <em>Engineering CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.EngineeringCRSType
	 * @generated
	 */
	public Adapter createEngineeringCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.EngineeringDatumPropertyType <em>Engineering Datum Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.EngineeringDatumPropertyType
	 * @generated
	 */
	public Adapter createEngineeringDatumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.EngineeringDatumType <em>Engineering Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.EngineeringDatumType
	 * @generated
	 */
	public Adapter createEngineeringDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.EnvelopeType <em>Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.EnvelopeType
	 * @generated
	 */
	public Adapter createEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.EnvelopeWithTimePeriodType <em>Envelope With Time Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.EnvelopeWithTimePeriodType
	 * @generated
	 */
	public Adapter createEnvelopeWithTimePeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.FaceOrTopoSolidPropertyType <em>Face Or Topo Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.FaceOrTopoSolidPropertyType
	 * @generated
	 */
	public Adapter createFaceOrTopoSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.FaceType <em>Face Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.FaceType
	 * @generated
	 */
	public Adapter createFaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.FeatureArrayPropertyType <em>Feature Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.FeatureArrayPropertyType
	 * @generated
	 */
	public Adapter createFeatureArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.FeatureCollectionType <em>Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.FeatureCollectionType
	 * @generated
	 */
	public Adapter createFeatureCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.FeaturePropertyType <em>Feature Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.FeaturePropertyType
	 * @generated
	 */
	public Adapter createFeaturePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.FileType
	 * @generated
	 */
	public Adapter createFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.FormulaCitationType <em>Formula Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.FormulaCitationType
	 * @generated
	 */
	public Adapter createFormulaCitationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.FormulaType <em>Formula Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.FormulaType
	 * @generated
	 */
	public Adapter createFormulaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeneralConversionPropertyType <em>General Conversion Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeneralConversionPropertyType
	 * @generated
	 */
	public Adapter createGeneralConversionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeneralTransformationPropertyType <em>General Transformation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeneralTransformationPropertyType
	 * @generated
	 */
	public Adapter createGeneralTransformationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GenericMetaDataType <em>Generic Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GenericMetaDataType
	 * @generated
	 */
	public Adapter createGenericMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeocentricCRSPropertyType <em>Geocentric CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeocentricCRSPropertyType
	 * @generated
	 */
	public Adapter createGeocentricCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeocentricCRSType <em>Geocentric CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeocentricCRSType
	 * @generated
	 */
	public Adapter createGeocentricCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeodesicStringType <em>Geodesic String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeodesicStringType
	 * @generated
	 */
	public Adapter createGeodesicStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeodesicType <em>Geodesic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeodesicType
	 * @generated
	 */
	public Adapter createGeodesicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeodeticCRSPropertyType <em>Geodetic CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeodeticCRSPropertyType
	 * @generated
	 */
	public Adapter createGeodeticCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeodeticCRSType <em>Geodetic CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeodeticCRSType
	 * @generated
	 */
	public Adapter createGeodeticCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeodeticDatumPropertyType <em>Geodetic Datum Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeodeticDatumPropertyType
	 * @generated
	 */
	public Adapter createGeodeticDatumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeodeticDatumType <em>Geodetic Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeodeticDatumType
	 * @generated
	 */
	public Adapter createGeodeticDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeographicCRSPropertyType <em>Geographic CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeographicCRSPropertyType
	 * @generated
	 */
	public Adapter createGeographicCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeographicCRSType <em>Geographic CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeographicCRSType
	 * @generated
	 */
	public Adapter createGeographicCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeometricComplexPropertyType <em>Geometric Complex Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeometricComplexPropertyType
	 * @generated
	 */
	public Adapter createGeometricComplexPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeometricComplexType <em>Geometric Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeometricComplexType
	 * @generated
	 */
	public Adapter createGeometricComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeometricPrimitivePropertyType <em>Geometric Primitive Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeometricPrimitivePropertyType
	 * @generated
	 */
	public Adapter createGeometricPrimitivePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeometryArrayPropertyType <em>Geometry Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeometryArrayPropertyType
	 * @generated
	 */
	public Adapter createGeometryArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GeometryPropertyType <em>Geometry Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GeometryPropertyType
	 * @generated
	 */
	public Adapter createGeometryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GridEnvelopeType <em>Grid Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GridEnvelopeType
	 * @generated
	 */
	public Adapter createGridEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GridFunctionType <em>Grid Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GridFunctionType
	 * @generated
	 */
	public Adapter createGridFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GridLengthType <em>Grid Length Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GridLengthType
	 * @generated
	 */
	public Adapter createGridLengthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GridLimitsType <em>Grid Limits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GridLimitsType
	 * @generated
	 */
	public Adapter createGridLimitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.GridType <em>Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.GridType
	 * @generated
	 */
	public Adapter createGridTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.HistoryPropertyType <em>History Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.HistoryPropertyType
	 * @generated
	 */
	public Adapter createHistoryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.IdentifiedObjectType <em>Identified Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.IdentifiedObjectType
	 * @generated
	 */
	public Adapter createIdentifiedObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ImageCRSPropertyType <em>Image CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ImageCRSPropertyType
	 * @generated
	 */
	public Adapter createImageCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ImageCRSType <em>Image CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ImageCRSType
	 * @generated
	 */
	public Adapter createImageCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ImageDatumPropertyType <em>Image Datum Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ImageDatumPropertyType
	 * @generated
	 */
	public Adapter createImageDatumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ImageDatumType <em>Image Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ImageDatumType
	 * @generated
	 */
	public Adapter createImageDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.IndirectEntryType <em>Indirect Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.IndirectEntryType
	 * @generated
	 */
	public Adapter createIndirectEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.InlinePropertyType <em>Inline Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.InlinePropertyType
	 * @generated
	 */
	public Adapter createInlinePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.KnotPropertyType <em>Knot Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.KnotPropertyType
	 * @generated
	 */
	public Adapter createKnotPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.KnotType <em>Knot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.KnotType
	 * @generated
	 */
	public Adapter createKnotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.LengthType <em>Length Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.LengthType
	 * @generated
	 */
	public Adapter createLengthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.LinearCSPropertyType <em>Linear CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.LinearCSPropertyType
	 * @generated
	 */
	public Adapter createLinearCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.LinearCSType <em>Linear CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.LinearCSType
	 * @generated
	 */
	public Adapter createLinearCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.LinearRingPropertyType <em>Linear Ring Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.LinearRingPropertyType
	 * @generated
	 */
	public Adapter createLinearRingPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.LinearRingType <em>Linear Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.LinearRingType
	 * @generated
	 */
	public Adapter createLinearRingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.LineStringSegmentArrayPropertyType <em>Line String Segment Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.LineStringSegmentArrayPropertyType
	 * @generated
	 */
	public Adapter createLineStringSegmentArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.LineStringSegmentType <em>Line String Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.LineStringSegmentType
	 * @generated
	 */
	public Adapter createLineStringSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.LineStringType <em>Line String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.LineStringType
	 * @generated
	 */
	public Adapter createLineStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.LocationPropertyType <em>Location Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.LocationPropertyType
	 * @generated
	 */
	public Adapter createLocationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MappingRuleType <em>Mapping Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MappingRuleType
	 * @generated
	 */
	public Adapter createMappingRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MeasureListType <em>Measure List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MeasureListType
	 * @generated
	 */
	public Adapter createMeasureListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MeasureOrNilReasonListType <em>Measure Or Nil Reason List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MeasureOrNilReasonListType
	 * @generated
	 */
	public Adapter createMeasureOrNilReasonListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MeasureType
	 * @generated
	 */
	public Adapter createMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MetaDataPropertyType <em>Meta Data Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MetaDataPropertyType
	 * @generated
	 */
	public Adapter createMetaDataPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MovingObjectStatusType <em>Moving Object Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MovingObjectStatusType
	 * @generated
	 */
	public Adapter createMovingObjectStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MultiCurvePropertyType <em>Multi Curve Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MultiCurvePropertyType
	 * @generated
	 */
	public Adapter createMultiCurvePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MultiCurveType <em>Multi Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MultiCurveType
	 * @generated
	 */
	public Adapter createMultiCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MultiGeometryPropertyType <em>Multi Geometry Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MultiGeometryPropertyType
	 * @generated
	 */
	public Adapter createMultiGeometryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MultiGeometryType <em>Multi Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MultiGeometryType
	 * @generated
	 */
	public Adapter createMultiGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MultiPointPropertyType <em>Multi Point Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MultiPointPropertyType
	 * @generated
	 */
	public Adapter createMultiPointPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MultiPointType <em>Multi Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MultiPointType
	 * @generated
	 */
	public Adapter createMultiPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MultiSolidPropertyType <em>Multi Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MultiSolidPropertyType
	 * @generated
	 */
	public Adapter createMultiSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MultiSolidType <em>Multi Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MultiSolidType
	 * @generated
	 */
	public Adapter createMultiSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MultiSurfacePropertyType <em>Multi Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MultiSurfacePropertyType
	 * @generated
	 */
	public Adapter createMultiSurfacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.MultiSurfaceType <em>Multi Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.MultiSurfaceType
	 * @generated
	 */
	public Adapter createMultiSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.NodeOrEdgePropertyType <em>Node Or Edge Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.NodeOrEdgePropertyType
	 * @generated
	 */
	public Adapter createNodeOrEdgePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.NodePropertyType <em>Node Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.NodePropertyType
	 * @generated
	 */
	public Adapter createNodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.NodeType
	 * @generated
	 */
	public Adapter createNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ObliqueCartesianCSPropertyType <em>Oblique Cartesian CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ObliqueCartesianCSPropertyType
	 * @generated
	 */
	public Adapter createObliqueCartesianCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ObliqueCartesianCSType <em>Oblique Cartesian CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ObliqueCartesianCSType
	 * @generated
	 */
	public Adapter createObliqueCartesianCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ObservationType <em>Observation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ObservationType
	 * @generated
	 */
	public Adapter createObservationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.OffsetCurveType <em>Offset Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.OffsetCurveType
	 * @generated
	 */
	public Adapter createOffsetCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.OperationMethodPropertyType <em>Operation Method Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.OperationMethodPropertyType
	 * @generated
	 */
	public Adapter createOperationMethodPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.OperationMethodType <em>Operation Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.OperationMethodType
	 * @generated
	 */
	public Adapter createOperationMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.OperationParameterGroupPropertyType <em>Operation Parameter Group Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.OperationParameterGroupPropertyType
	 * @generated
	 */
	public Adapter createOperationParameterGroupPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.OperationParameterGroupType <em>Operation Parameter Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.OperationParameterGroupType
	 * @generated
	 */
	public Adapter createOperationParameterGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.OperationParameterPropertyType <em>Operation Parameter Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.OperationParameterPropertyType
	 * @generated
	 */
	public Adapter createOperationParameterPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.OperationParameterType <em>Operation Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.OperationParameterType
	 * @generated
	 */
	public Adapter createOperationParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.OperationPropertyType <em>Operation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.OperationPropertyType
	 * @generated
	 */
	public Adapter createOperationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.OrientableCurveType <em>Orientable Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.OrientableCurveType
	 * @generated
	 */
	public Adapter createOrientableCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.OrientableSurfaceType <em>Orientable Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.OrientableSurfaceType
	 * @generated
	 */
	public Adapter createOrientableSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ParameterValueGroupType <em>Parameter Value Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ParameterValueGroupType
	 * @generated
	 */
	public Adapter createParameterValueGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ParameterValueType <em>Parameter Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ParameterValueType
	 * @generated
	 */
	public Adapter createParameterValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.PassThroughOperationPropertyType <em>Pass Through Operation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.PassThroughOperationPropertyType
	 * @generated
	 */
	public Adapter createPassThroughOperationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.PassThroughOperationType <em>Pass Through Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.PassThroughOperationType
	 * @generated
	 */
	public Adapter createPassThroughOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.PointArrayPropertyType <em>Point Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.PointArrayPropertyType
	 * @generated
	 */
	public Adapter createPointArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.PointPropertyType <em>Point Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.PointPropertyType
	 * @generated
	 */
	public Adapter createPointPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.PointType
	 * @generated
	 */
	public Adapter createPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.PolarCSPropertyType <em>Polar CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.PolarCSPropertyType
	 * @generated
	 */
	public Adapter createPolarCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.PolarCSType <em>Polar CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.PolarCSType
	 * @generated
	 */
	public Adapter createPolarCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.PolygonPatchType <em>Polygon Patch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.PolygonPatchType
	 * @generated
	 */
	public Adapter createPolygonPatchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.PolygonType
	 * @generated
	 */
	public Adapter createPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.PrimeMeridianPropertyType <em>Prime Meridian Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.PrimeMeridianPropertyType
	 * @generated
	 */
	public Adapter createPrimeMeridianPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.PrimeMeridianType <em>Prime Meridian Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.PrimeMeridianType
	 * @generated
	 */
	public Adapter createPrimeMeridianTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.PriorityLocationPropertyType <em>Priority Location Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.PriorityLocationPropertyType
	 * @generated
	 */
	public Adapter createPriorityLocationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ProcedurePropertyType <em>Procedure Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ProcedurePropertyType
	 * @generated
	 */
	public Adapter createProcedurePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ProjectedCRSPropertyType <em>Projected CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ProjectedCRSPropertyType
	 * @generated
	 */
	public Adapter createProjectedCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ProjectedCRSType <em>Projected CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ProjectedCRSType
	 * @generated
	 */
	public Adapter createProjectedCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.QuantityExtentType <em>Quantity Extent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.QuantityExtentType
	 * @generated
	 */
	public Adapter createQuantityExtentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.QuantityPropertyType <em>Quantity Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.QuantityPropertyType
	 * @generated
	 */
	public Adapter createQuantityPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.QuantityType <em>Quantity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.QuantityType
	 * @generated
	 */
	public Adapter createQuantityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.RangeSetType <em>Range Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.RangeSetType
	 * @generated
	 */
	public Adapter createRangeSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.RectangleType <em>Rectangle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.RectangleType
	 * @generated
	 */
	public Adapter createRectangleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.RectifiedGridType <em>Rectified Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.RectifiedGridType
	 * @generated
	 */
	public Adapter createRectifiedGridTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.RefLocationType <em>Ref Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.RefLocationType
	 * @generated
	 */
	public Adapter createRefLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.RelatedTimeType <em>Related Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.RelatedTimeType
	 * @generated
	 */
	public Adapter createRelatedTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ResultType
	 * @generated
	 */
	public Adapter createResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.RingPropertyType <em>Ring Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.RingPropertyType
	 * @generated
	 */
	public Adapter createRingPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.RingType <em>Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.RingType
	 * @generated
	 */
	public Adapter createRingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.RowsType <em>Rows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.RowsType
	 * @generated
	 */
	public Adapter createRowsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.RowType <em>Row Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.RowType
	 * @generated
	 */
	public Adapter createRowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ScaleType <em>Scale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ScaleType
	 * @generated
	 */
	public Adapter createScaleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SecondDefiningParameterType <em>Second Defining Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SecondDefiningParameterType
	 * @generated
	 */
	public Adapter createSecondDefiningParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SecondDefiningParameterType1 <em>Second Defining Parameter Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SecondDefiningParameterType1
	 * @generated
	 */
	public Adapter createSecondDefiningParameterType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SequenceRuleType <em>Sequence Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SequenceRuleType
	 * @generated
	 */
	public Adapter createSequenceRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ShellPropertyType <em>Shell Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ShellPropertyType
	 * @generated
	 */
	public Adapter createShellPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ShellType <em>Shell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ShellType
	 * @generated
	 */
	public Adapter createShellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SingleCRSPropertyType <em>Single CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SingleCRSPropertyType
	 * @generated
	 */
	public Adapter createSingleCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SingleOperationPropertyType <em>Single Operation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SingleOperationPropertyType
	 * @generated
	 */
	public Adapter createSingleOperationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SolidArrayPropertyType <em>Solid Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SolidArrayPropertyType
	 * @generated
	 */
	public Adapter createSolidArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SolidPropertyType <em>Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SolidPropertyType
	 * @generated
	 */
	public Adapter createSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SolidType <em>Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SolidType
	 * @generated
	 */
	public Adapter createSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SpeedType <em>Speed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SpeedType
	 * @generated
	 */
	public Adapter createSpeedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SphereType <em>Sphere Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SphereType
	 * @generated
	 */
	public Adapter createSphereTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SphericalCSPropertyType <em>Spherical CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SphericalCSPropertyType
	 * @generated
	 */
	public Adapter createSphericalCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SphericalCSType <em>Spherical CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SphericalCSType
	 * @generated
	 */
	public Adapter createSphericalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.StringOrRefType <em>String Or Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.StringOrRefType
	 * @generated
	 */
	public Adapter createStringOrRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SurfaceArrayPropertyType <em>Surface Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SurfaceArrayPropertyType
	 * @generated
	 */
	public Adapter createSurfaceArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SurfacePatchArrayPropertyType <em>Surface Patch Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SurfacePatchArrayPropertyType
	 * @generated
	 */
	public Adapter createSurfacePatchArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SurfacePropertyType <em>Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SurfacePropertyType
	 * @generated
	 */
	public Adapter createSurfacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.SurfaceType <em>Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.SurfaceType
	 * @generated
	 */
	public Adapter createSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TargetPropertyType <em>Target Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TargetPropertyType
	 * @generated
	 */
	public Adapter createTargetPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TemporalCRSPropertyType <em>Temporal CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TemporalCRSPropertyType
	 * @generated
	 */
	public Adapter createTemporalCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TemporalCRSType <em>Temporal CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TemporalCRSType
	 * @generated
	 */
	public Adapter createTemporalCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TemporalCSPropertyType <em>Temporal CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TemporalCSPropertyType
	 * @generated
	 */
	public Adapter createTemporalCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TemporalCSType <em>Temporal CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TemporalCSType
	 * @generated
	 */
	public Adapter createTemporalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TemporalDatumBaseType <em>Temporal Datum Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TemporalDatumBaseType
	 * @generated
	 */
	public Adapter createTemporalDatumBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TemporalDatumPropertyType <em>Temporal Datum Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TemporalDatumPropertyType
	 * @generated
	 */
	public Adapter createTemporalDatumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TemporalDatumType <em>Temporal Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TemporalDatumType
	 * @generated
	 */
	public Adapter createTemporalDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeCalendarEraPropertyType <em>Time Calendar Era Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeCalendarEraPropertyType
	 * @generated
	 */
	public Adapter createTimeCalendarEraPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeCalendarEraType <em>Time Calendar Era Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeCalendarEraType
	 * @generated
	 */
	public Adapter createTimeCalendarEraTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeCalendarPropertyType <em>Time Calendar Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeCalendarPropertyType
	 * @generated
	 */
	public Adapter createTimeCalendarPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeCalendarType <em>Time Calendar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeCalendarType
	 * @generated
	 */
	public Adapter createTimeCalendarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeClockPropertyType <em>Time Clock Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeClockPropertyType
	 * @generated
	 */
	public Adapter createTimeClockPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeClockType <em>Time Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeClockType
	 * @generated
	 */
	public Adapter createTimeClockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeCoordinateSystemType <em>Time Coordinate System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeCoordinateSystemType
	 * @generated
	 */
	public Adapter createTimeCoordinateSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeCSPropertyType <em>Time CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeCSPropertyType
	 * @generated
	 */
	public Adapter createTimeCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeCSType <em>Time CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeCSType
	 * @generated
	 */
	public Adapter createTimeCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeEdgePropertyType <em>Time Edge Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeEdgePropertyType
	 * @generated
	 */
	public Adapter createTimeEdgePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeEdgeType <em>Time Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeEdgeType
	 * @generated
	 */
	public Adapter createTimeEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeInstantPropertyType <em>Time Instant Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeInstantPropertyType
	 * @generated
	 */
	public Adapter createTimeInstantPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeInstantType <em>Time Instant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeInstantType
	 * @generated
	 */
	public Adapter createTimeInstantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeIntervalLengthType <em>Time Interval Length Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeIntervalLengthType
	 * @generated
	 */
	public Adapter createTimeIntervalLengthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeNodePropertyType <em>Time Node Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeNodePropertyType
	 * @generated
	 */
	public Adapter createTimeNodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeNodeType <em>Time Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeNodeType
	 * @generated
	 */
	public Adapter createTimeNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeOrdinalEraPropertyType <em>Time Ordinal Era Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeOrdinalEraPropertyType
	 * @generated
	 */
	public Adapter createTimeOrdinalEraPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeOrdinalEraType <em>Time Ordinal Era Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeOrdinalEraType
	 * @generated
	 */
	public Adapter createTimeOrdinalEraTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeOrdinalReferenceSystemType <em>Time Ordinal Reference System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeOrdinalReferenceSystemType
	 * @generated
	 */
	public Adapter createTimeOrdinalReferenceSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimePeriodPropertyType <em>Time Period Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimePeriodPropertyType
	 * @generated
	 */
	public Adapter createTimePeriodPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimePeriodType <em>Time Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimePeriodType
	 * @generated
	 */
	public Adapter createTimePeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimePositionType <em>Time Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimePositionType
	 * @generated
	 */
	public Adapter createTimePositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimePrimitivePropertyType <em>Time Primitive Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimePrimitivePropertyType
	 * @generated
	 */
	public Adapter createTimePrimitivePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeReferenceSystemType <em>Time Reference System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeReferenceSystemType
	 * @generated
	 */
	public Adapter createTimeReferenceSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeTopologyComplexPropertyType <em>Time Topology Complex Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeTopologyComplexPropertyType
	 * @generated
	 */
	public Adapter createTimeTopologyComplexPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeTopologyComplexType <em>Time Topology Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeTopologyComplexType
	 * @generated
	 */
	public Adapter createTimeTopologyComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeTopologyPrimitivePropertyType <em>Time Topology Primitive Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeTopologyPrimitivePropertyType
	 * @generated
	 */
	public Adapter createTimeTopologyPrimitivePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TimeType
	 * @generated
	 */
	public Adapter createTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TinType <em>Tin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TinType
	 * @generated
	 */
	public Adapter createTinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoComplexPropertyType <em>Topo Complex Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoComplexPropertyType
	 * @generated
	 */
	public Adapter createTopoComplexPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoComplexType <em>Topo Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoComplexType
	 * @generated
	 */
	public Adapter createTopoComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoCurvePropertyType <em>Topo Curve Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoCurvePropertyType
	 * @generated
	 */
	public Adapter createTopoCurvePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoCurveType <em>Topo Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoCurveType
	 * @generated
	 */
	public Adapter createTopoCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoPointPropertyType <em>Topo Point Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoPointPropertyType
	 * @generated
	 */
	public Adapter createTopoPointPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoPointType <em>Topo Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoPointType
	 * @generated
	 */
	public Adapter createTopoPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoPrimitiveArrayAssociationType <em>Topo Primitive Array Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoPrimitiveArrayAssociationType
	 * @generated
	 */
	public Adapter createTopoPrimitiveArrayAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoPrimitiveMemberType <em>Topo Primitive Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoPrimitiveMemberType
	 * @generated
	 */
	public Adapter createTopoPrimitiveMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoSolidPropertyType <em>Topo Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoSolidPropertyType
	 * @generated
	 */
	public Adapter createTopoSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoSolidType <em>Topo Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoSolidType
	 * @generated
	 */
	public Adapter createTopoSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoSurfacePropertyType <em>Topo Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoSurfacePropertyType
	 * @generated
	 */
	public Adapter createTopoSurfacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoSurfaceType <em>Topo Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoSurfaceType
	 * @generated
	 */
	public Adapter createTopoSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoVolumePropertyType <em>Topo Volume Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoVolumePropertyType
	 * @generated
	 */
	public Adapter createTopoVolumePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TopoVolumeType <em>Topo Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TopoVolumeType
	 * @generated
	 */
	public Adapter createTopoVolumeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TransformationPropertyType <em>Transformation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TransformationPropertyType
	 * @generated
	 */
	public Adapter createTransformationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TransformationType <em>Transformation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TransformationType
	 * @generated
	 */
	public Adapter createTransformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.TriangleType <em>Triangle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.TriangleType
	 * @generated
	 */
	public Adapter createTriangleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.UnitDefinitionType <em>Unit Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.UnitDefinitionType
	 * @generated
	 */
	public Adapter createUnitDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.UnitOfMeasureType <em>Unit Of Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.UnitOfMeasureType
	 * @generated
	 */
	public Adapter createUnitOfMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.UserDefinedCSPropertyType <em>User Defined CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.UserDefinedCSPropertyType
	 * @generated
	 */
	public Adapter createUserDefinedCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.UserDefinedCSType <em>User Defined CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.UserDefinedCSType
	 * @generated
	 */
	public Adapter createUserDefinedCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ValueArrayPropertyType <em>Value Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ValueArrayPropertyType
	 * @generated
	 */
	public Adapter createValueArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ValueArrayType <em>Value Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ValueArrayType
	 * @generated
	 */
	public Adapter createValueArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.ValuePropertyType <em>Value Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.ValuePropertyType
	 * @generated
	 */
	public Adapter createValuePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.VectorType <em>Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.VectorType
	 * @generated
	 */
	public Adapter createVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.VerticalCRSPropertyType <em>Vertical CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.VerticalCRSPropertyType
	 * @generated
	 */
	public Adapter createVerticalCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.VerticalCRSType <em>Vertical CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.VerticalCRSType
	 * @generated
	 */
	public Adapter createVerticalCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.VerticalCSPropertyType <em>Vertical CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.VerticalCSPropertyType
	 * @generated
	 */
	public Adapter createVerticalCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.VerticalCSType <em>Vertical CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.VerticalCSType
	 * @generated
	 */
	public Adapter createVerticalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.VerticalDatumPropertyType <em>Vertical Datum Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.VerticalDatumPropertyType
	 * @generated
	 */
	public Adapter createVerticalDatumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.VerticalDatumType <em>Vertical Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.VerticalDatumType
	 * @generated
	 */
	public Adapter createVerticalDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml32.VolumeType <em>Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml32.VolumeType
	 * @generated
	 */
	public Adapter createVolumeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GMLAdapterFactory
