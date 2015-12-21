/**
 */
package org.isotc211.iso19139.gss;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Geographic Spatial Schema (GSS) extensible markup language is a component of the XML Schema Implementation of Geographic Information Metadata documented in ISO/TS 19139:2007. GSS includes all the definitions of http://www.isotc211.org/2005/gss namespace. The root document of this namespace is the file gss.xsd. This geometry.xsd schema contains the implementation of GM_Object and GM_Point. The encoding of these classes is mapped to ISO 19136 geometric types.
 * Geographic Spatial Schema (GSS) extensible markup language is a component of the XML Schema Implementation of Geographic Information Metadata documented in ISO/TS 19139:2007. GSS includes all the definitions of http://www.isotc211.org/2005/gss namespace. The root document of this namespace is the file gss.xsd.
 * See ISO/DIS 19136 8.2.
 * W3C XML Schema provides a set of built-in "simple" types which define methods for representing values as literals without internal markup.  These are described in W3C XML Schema Part 2:2001.  Because GML is an XML encoding in which instances are described using XML Schema, these simple types shall be used as far as possible and practical for the representation of data types.  W3C XML Schema also provides methods for defining 
 * -	new simple types by restriction and combination of the built-in types, and 
 * -	complex types, with simple content, but which also have XML attributes.  
 * In many places where a suitable built-in simple type is not available, simple content types derived using the XML Schema mechanisms are used for the representation of data types in GML.  
 * A set of these simple content types that are required by several GML components are defined in the basicTypes schema, as well as some elements based on them. These are primarily based around components needed to record amounts, counts, flags and terms, together with support for exceptions or null values.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * 
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2007,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 15.6.
 * A number of types and relationships are defined to represent the time-varying properties of geographic features. 
 * In a comprehensive treatment of spatiotemporal modeling, Langran (see Bibliography) distinguished three principal temporal entities: states, events, and evidence; the schema specified in the following Subclauses incorporates elements for each.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 14.
 * Topology is the branch of mathematics describing the properties of objects which are invariant under continuous deformation. For example, a circle is topologically equivalent to an ellipse because one can be transformed into the other by stretching. In geographic modelling, the foremost use of topology is in accelerating computational geometry. The constructs of topology allow characterisation of the spatial relationships between objects using simple combinatorial or algebraic algorithms. Topology, realised by the appropriate geometry, also allows a compact and unambiguous mechanism for expressing shared geometry among geographic features.
 * There are four instantiable classes of primitive topology objects, one for each dimension up to 3D. In addition, topological complexes are supported, too. 
 * There is strong symmetry in the (topological boundary and coboundary) relationships between topology primitives of adjacent dimensions. Topology primitives are bounded by directed primitives of one lower dimension. The coboundary of each topology primitive is formed from directed topology primitives of one higher dimension.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 20.3.
 * A coverage incorporates a mapping from a spatiotemporal domain to a range set, the latter providing the set in which the attribute values live.  The range set may be an arbitrary set including discrete lists, integer or floating point ranges, and multi-dimensional vector spaces.
 * A coverage can be viewed as the graph of the coverage function f:A à B, that is as the set of ordered pairs {(x, f(x)) | where x is in A}. This view is especially applicable to the GML encoding of a coverage.  In the case of a discrete coverage, the domain set A is partitioned into a collection of subsets (typically a disjoint collection) A = UAi and the function f is constant on each Ai. For a spatial domain, the Ai are geometry elements, hence the coverage can be viewed as a collection of (geometry,value) pairs, where the value is an element of the range set.  If the spatial domain A is a topological space then the coverage can be viewed as a collection of (topology,value) pairs, where the topology element in the pair is a topological n-chain (in GML terms this is a gml:TopoPoint, gml:TopoCurve, gml:TopoSurface or gml:TopoSolid). 
 * A coverage is implemented as a GML feature. We can thus speak of a "temperature distribution feature", or a "remotely sensed image feature", or a "soil distribution feature".
 * As is the case for any GML object, a coverage object may also be the value of a property of a feature.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 13.3.
 * The spatial-temporal coordinate reference systems schema components are divided into two logical parts. One part defines elements and types for XML encoding of abstract coordinate reference systems definitions. The larger part defines specialized constructs for XML encoding of definitions of the multiple concrete types of spatial-temporal coordinate reference systems.
 * These schema components encode the Coordinate Reference System packages of the UML Models of ISO 19111 Clause 8 and ISO/DIS 19136 D.3.10, with the exception of the abstract "SC_CRS" class.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 19.
 * A GML observation models the act of observing, often with a camera, a person or some form of instrument.  An observation feature describes the "metadata" associated with an information capture event, together with a value for the result of the observation.  This covers a broad range of cases, from a tourist photo (not the photo but the act of taking the photo), to images acquired by space borne sensors or the measurement of a temperature 5 meters below the surfaces of a lake.
 * The basic structures introduced in this schema are intended to serve as the foundation for more comprehensive schemas for scientific, technical and engineering measurement schemas.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 15.5.
 * A value in the time domain is measured relative to a temporal reference system. Common types of reference systems include calendars, ordinal temporal reference systems, and temporal coordinate systems (time elapsed since some epoch).  The primary temporal reference system for use with geographic information is the Gregorian Calendar and 24 hour local or Coordinated Universal Time (UTC), but special applications may entail the use of alternative reference systems.  The Julian day numbering system is a temporal coordinate system that has an origin earlier than any known calendar, at noon on 1 January 4713 BC in the Julian proleptic calendar, and is useful in transformations between dates in different calendars.    
 * In GML seven concrete elements are used to describe temporal reference systems: gml:TimeReferenceSystem, gml:TimeCoordinateSystem, gml:TimeCalendar, gml:TimeCalendarEra, gml:TimeClock, gml:TimeOrdinalReferenceSystem, and gml:TimeOrdinalEra.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * All global schema components that are part of the GML schema, but were deprecated. See Annex I.
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2007,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 15.3.
 * Temporal topology is described in terms of time complexes, nodes, and edges, and the connectivity between these. Temporal topology does not directly provide information about temporal position. It is used in the case of describing a lineage or a history (e.g. a family tree expressing evolution of species, an ecological cycle, a lineage of lands or buildings, or a history of separation and merger of administrative boundaries). The following Subclauses specifies the temporal topology as temporal characteristics of features in compliance with ISO 19108.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 16.
 * Many applications require definitions of terms which are used within instance documents as the values of certain properties or as reference information to tie properties to standard information values in some way.  Units of measure and descriptions of measurable phenomena are two particular examples. 
 * It will often be convenient to use definitions provided by external authorities. These may already be packaged for delivery in various ways, both online and offline. In order that they may be referred to from GML documents it is generally necessary that a URI be available for each definition. Where this is the case then it is usually preferable to refer to these directly. 
 * Alternatively, it may be convenient or necessary to capture definitions in XML, either embedded within an instance document containing features or as a separate document. The definitions may be transcriptions from an external source, or may be new definitions for a local purpose. In order to support this case, some simple components are provided in GML in the form of 
 * -	a generic gml:Definition, which may serve as the basis for more specialized definitions
 * -	a generic gml:Dictionary, which allows a set of definitions or references to definitions to be collected 
 * These components may be used directly, but also serve as the basis for more specialised definition elements in GML, in particular: coordinate operations, coordinate reference systems, datums, temporal reference systems, and units of measure.  
 * Note that the GML definition and dictionary components implement a simple nested hierarchy of definitions with identifiers. The latter provide handles which may be used in the description of more complex relationships between terms. However, the GML dictionary components are not intended to provide direct support for complex taxonomies, ontologies or thesauri.  Specialised XML tools are available to satisfy the more sophisticated requirements.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 7.2.
 * The gmlBase schema components establish the GML model and syntax, in particular
 * -	a root XML type from which XML types for all GML objects should be derived,
 * -	a pattern and components for GML properties,
 * -	patterns for collections and arrays, and components for generic collections and arrays,
 * -	components for associating metadata with GML objects,
 * -	components for constructing definitions and dictionaries.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 15.2.
 * The GML temporal schemas include components for describing temporal geometry and topology, temporal reference systems, and the temporal characteristics of geographic data. The model underlying the representation constitutes a profile of the conceptual schema described in ISO 19108. The underlying spatiotemporal model strives to accommodate both feature-level and attribute-level time stamping; basic support for tracking moving objects is also included. 
 * Time is measured on two types of scales: interval and ordinal.  An interval scale offers a basis for measuring duration, an ordinal scale provides information only about relative position in time.
 * Two other ISO standards are relevant to describing temporal objects:  ISO 8601 describes encodings for time instants and time periods, as text strings with particular structure and punctuation; ISO 11404 provides a detailed description of time intervals as part of a general discussion of language independent datatypes.  
 * The temporal schemas cover two interrelated topics and provide basic schema components for representing temporal instants and periods, temporal topology, and reference systems; more specialized schema components defines components used for dynamic features. Instances of temporal geometric types are used as values for the temporal properties of geographic features.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 9.
 * A GML feature is a (representation of a) identifiable real-world object in a selected domain of discourse. The feature schema provides a framework for the creation of GML features and feature collections.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 18.
 * The direction schema components provide the GML Application Schema developer with a standard property element to describe direction, and associated objects that may be used to express orientation, direction, heading, bearing or other directional aspects of geographic features.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 17.5.
 * The elements declared in this Clause build on other GML schema components, in particular gml:AbstractTimeObject, gml:AbstractGeometry, and the following types:  gml:MeasureType, gml:MeasureListType, gml:CodeType, gml:CodeOrNilReasonListType, gml:BooleanOrNilReasonListType, gml:IntegerOrNilReasonList.  
 * Of particular interest are elements that are the heads of substitution groups, and one named choice group. These are the primary reasons for the value objects schema, since they may act as variables in the definition of content models, such as Observations, when it is desired to permit alternative value types to occur some of which may have complex content such as arrays, geometry and time objects, and where it is useful not to prescribe the actual value type in advance. The members of the groups include quantities, category classifications, boolean, count, temporal and spatial values, and aggregates of these.  
 * The value objects are defined in a hierarchy. The following relationships are defined:
 * -	Concrete elements gml:Quantity, gml:Category, gml:Count and gml:Boolean are substitutable for the abstract element gml:AbstractScalarValue.  
 * -	Concrete elements gml:QuantityList, gml:CategoryList, gml:CountList and gml:BooleanList are substitutable for the abstract element gml:AbstractScalarValueList.  
 * -	Concrete element gml:ValueArray is substitutable for the concrete element gml:CompositeValue.  
 * -	Abstract elements gml:AbstractScalarValue and gml:AbstractScalarValueList, and concrete elements gml:CompositeValue, gml:ValueExtent, gml:CategoryExtent, gml:CountExtent and gml:QuantityExtent are substitutable for abstract element gml:AbstractValue.  
 * -	Abstract elements gml:AbstractValue, gml:AbstractTimeObject and gml:AbstractGeometry are all in a choice group named gml:Value, which is used for compositing in gml:CompositeValue and gml:ValueExtent.  
 * -	Schemas which need values may use the abstract element gml:AbstractValue in a content model in order to permit any of the gml:AbstractScalarValues, gml:AbstractScalarValueLists, gml:CompositeValue or gml:ValueExtent to occur in an instance, or the named group gml:Value to also permit gml:AbstractTimeObjects, gml:AbstractGeometrys.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 10.
 * Any geometry element that inherits the semantics of AbstractGeometryType may be viewed as a set of direct positions. 
 * All of the classes derived from AbstractGeometryType inherit an optional association to a coordinate reference system. All direct positions shall directly or indirectly be associated with a coordinate reference system. When geometry elements are aggregated in another geometry element (such as a MultiGeometry or GeometricComplex), which already has a coordinate reference system specified, then these elements are assumed to be in that same coordinate reference system unless otherwise specified.
 * The geometry model distinguishes geometric primitives, aggregates and complexes. 
 * Geometric primitives, i.e. instances of a subtype of AbstractGeometricPrimitiveType, will be open, that is, they will not contain their boundary points; curves will not contain their end points, surfaces will not contain their boundary curves, and solids will not contain their bounding surfaces.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 13.4.
 * The coordinate systems schema components can be divded into  three logical parts, which define elements and types for XML encoding of the definitions of:
 * -	Coordinate system axes
 * -	Abstract coordinate system
 * -	Multiple concrete types of spatial-temporal coordinate systems
 * These schema components encode the Coordinate System packages of the UML Models of ISO 19111 Clause 9 and ISO/DIS 19136 D.3.10.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 13.5
 * The datums schema components can be divided into three logical parts, which define elements and types for XML encoding of the definitions of:
 * -	Abstract datum
 * -	Geodetic datums, including ellipsoid and prime meridian
 * -	Multiple other concrete types of spatial or temporal datums
 * These schema components encode the Datum packages of the UML Models of ISO 19111 Clause 10 and ISO/DIS 19136 D.3.10.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 13.6.
 * The spatial or temporal coordinate operations schema components can be divided into five logical parts, which define elements and types for XML encoding of the definitions of:
 * -	Multiple abstract coordinate operations
 * -	Multiple concrete types of coordinate operations, including Transformations and Conversions
 * -	Abstract and concrete parameter values and groups
 * -	Operation methods
 * -	Abstract and concrete operation parameters and groups
 * These schema component encodes the Coordinate Operation package of the UML Model for ISO 19111 Clause 11.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 13.2.
 * The reference systems schema components have two logical parts, which define elements and types for XML encoding of the definitions of:
 * -	Identified Object, inherited by the ten types of GML objects used for coordinate reference systems and coordinate operations
 * -	High-level part of the definitions of coordinate reference systems
 * This schema encodes the Identified Object and Reference System packages of the UML Model for ISO 19111.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 17.3.
 * gml:MeasureType is defined in the basicTypes schema.  The measure types defined here correspond with a set of convenience measure types described in ISO/TS 19103.  The XML implementation is based on the XML Schema simple type "double" which supports both decimal and scientific notation, and includes an XML attribute "uom" which refers to the units of measure for the value.  Note that, there is no requirement to store values using any particular format, and applications receiving elements of this type may choose to coerce the data to any other type as convenient.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 17.2.
 * Several GML Schema components concern or require a reference scale or units of measure.  Units are required for quantities that may occur as values of properties of feature types, as the results of observations, in the range parameters of a coverage, and for measures used in Coordinate Reference System definitions. 
 * The basic unit definition is an extension of the general gml:Definition element defined in 16.2.1.  Three specialized elements for unit definition are further derived from this. 
 * This model is based on the SI system of units [ISO 1000], which distinguishes between Base Units and Derived Units.  
 * -	Base Units are the preferred units for a set of orthogonal fundamental quantities which define the particular system of units, which may not be derived by combination of other base units.  
 * -	Derived Units are the preferred units for other quantities in the system, which may be defined by algebraic combination of the base units.  
 * In some application areas Conventional units are used, which may be converted to the preferred units using a scaling factor or a formula which defines a re-scaling and offset.  The set of preferred units for all physical quantity types in a particular system of units is composed of the union of its base units and derived units.  
 * Unit definitions are substitutable for the gml:Definition element declared as part of the dictionary model.  A dictionary that contains only unit definitions and references to unit definitions is a units dictionary.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 20.2.
 * An implicit description of geometry is one in which the items of the geometry do not explicitly appear in the encoding.  Instead, a compact notation records a set of parameters, and a set of objects may be generated using a rule with these parameters.  This Clause provides grid geometries that are used in the description of gridded coverages and other applications.
 * In GML two grid structures are defined, namely gml:Grid and gml:RectifiedGrid.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 12.3.
 * Geometric aggregates (i.e. instances of a subtype of gml:AbstractGeometricAggregateType) are arbitrary aggregations of geometry elements. They are not assumed to have any additional internal structure and are used to "collect" pieces of geometry of a specified type. Application schemas may use aggregates for features that use multiple geometric objects in their representations.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 11.
 * Beside the "simple" geometric primitives specified in the previous Clause, this Clause specifies additional primitives to describe real world situations which require a more expressive geometry model.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 12.2.
 * Geometric complexes (i.e. instances of gml:GeometricComplexType) are closed collections of geometric primitives, i.e. they will contain their boundaries. 
 * A geometric complex (gml:GeometricComplex) is defined by ISO 19107:2003, 6.6.1 as "a set of primitive geometric objects (in a common coordinate system) whose interiors are disjoint. Further, if a primitive is in a geometric complex, then there exists a set of primitives in that complex whose point-wise union is the boundary of this first primitive."
 * A geometric composite (gml:CompositeCurve, gml:CompositeSurface and gml:CompositeSolid) represents a geometric complex with an underlying core geometry that is isomorphic to a primitive, i.e. it can be viewed as a primitive and as a complex. See ISO 19107:2003, 6.1 and 6.6.3 for more details on the nature of composite geometries.
 * Geometric complexes and composites are intended to be used in application schemas where the sharing of geometry is important.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007,2010 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This schema document provides attribute declarations and
 * attribute group, complex type and simple type definitions which can be used in
 * the construction of user schemas to define the structure of particular linking
 * constructs, e.g.
 * 
 * <xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
 *            xmlns:xl="http://www.w3.org/1999/xlink">
 * 
 *  <xs:import namespace="http://www.w3.org/1999/xlink"
 *             location="http://www.w3.org/1999/xlink.xsd">
 * 
 *  <xs:element name="mySimple">
 *   <xs:complexType>
 *    ...
 *    <xs:attributeGroup ref="xl:simpleAttrs"/>
 *    ...
 *   </xs:complexType>
 *  </xs:element>
 *  ...
 * </xs:schema>
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *           <a name="usage">About this schema document</a>
 *         </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *           <a name="nsversioning">Versioning policy for this schema document</a>
 *         </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *               <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *             </li>
 *       <li>
 *               <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *             </li>
 *       <li>
 *               <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *             </li>
 *       <li>
 *               <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *             </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * See ISO/DIS 19136 Clause 10.
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2007,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * Geographic COmmon (GCO) extensible markup language is a component of the XML Schema Implementation of Geographic
 * Information Metadata documented in ISO/TS 19139:2007. GCO includes all the definitions of http://www.isotc211.org/2005/gco namespace. The root document of this namespace is the file gco.xsd. This gcoBase.xsd schema provides:
 * 		1.  tools to handle specific objects like "code lists" and "record";
 * 		2. Some XML types representing that do not follow the general encoding rules.
 * Geographic COmmon (GCO) extensible markup language is a component of the XML Schema Implementation of Geographic Information Metadata documented in ISO/TS 19139:2007. GCO includes all the definitions of http://www.isotc211.org/2005/gco namespace. The root document of this namespace is the file gco.xsd.
 * Geographic COmmon (GCO) extensible markup language is a component of the XML Schema Implementation of Geographic
 * Information Metadata documented in ISO/TS 19139:2007. GCO includes all the definitions of http://www.isotc211.org/2005/gco namespace. The root document of this namespace is the file gco.xsd. This basicTypes.xsd schema implements concepts from the "basic types" package of ISO/TS 19103.
 * <!-- end-model-doc -->
 * @see org.isotc211.iso19139.gss.GSSFactory
 * @model kind="package"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:basicTypes:3.2.1 appinfo='basicTypes.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:gml:3.2.1 appinfo='gml.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:dynamicFeature:3.2.1 appinfo='dynamicFeature.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:topology:3.2.1 appinfo='topology.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:coverage:3.2.1 appinfo='coverage.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:coordinateReferenceSystems:3.2.1 appinfo='coordinateReferenceSystems.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:observation:3.2.1 appinfo='observation.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:temporalReferenceSystems:3.2.1 appinfo='temporalReferenceSystems.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:deprecatedTypes:3.2.1 appinfo='deprecatedTypes.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:temporalTopology:3.2.1 appinfo='temporalTopology.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dictionary:v3.2.1 appinfo='dictionary.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:gmlBase:3.2.1 appinfo='gmlBase.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:temporal:3.2.1 appinfo='temporal.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:feature:3.2.1 appinfo='feature.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:direction:3.2.1 appinfo='direction.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:valueObjects:3.2.1 appinfo='valueObjects.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:geometryBasic0d1d:3.2.1 appinfo='geometryBasic0d1d.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:coordinateSystems:3.2.1 appinfo='coordinateSystems.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:datums:3.2.1 appinfo='datums.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:coordinateOperations:3.2.1 appinfo='coordinateOperations.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:referenceSystems:3.2.1 appinfo='referenceSystems.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:measures:3.2.1 appinfo='measures.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:units:3.2.1 appinfo='units.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:grids:3.2.1 appinfo='grids.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:geometryAggregates:3.2.1 appinfo='geometryAggregates.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:geometryPrimitives:3.2.1 appinfo='geometryPrimitives.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:geometryComplexes:3.2.1 appinfo='geometryComplexes.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:geometryBasic2d:3.2.1 appinfo='geometryBasic2d.xsd'"
 * @generated
 */
public interface GSSPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gss";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.isotc211.org/2005/gss";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GSSPackage eINSTANCE = org.isotc211.iso19139.gss.impl.GSSPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.isotc211.iso19139.gss.impl.GMObjectPropertyTypeImpl <em>GM Object Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211.iso19139.gss.impl.GMObjectPropertyTypeImpl
	 * @see org.isotc211.iso19139.gss.impl.GSSPackageImpl#getGMObjectPropertyType()
	 * @generated
	 */
	int GM_OBJECT_PROPERTY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE__ABSTRACT_GEOMETRY = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE__NIL_REASON = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE__UUIDREF = 10;

	/**
	 * The number of structural features of the '<em>GM Object Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>GM Object Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_OBJECT_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211.iso19139.gss.impl.GMPointPropertyTypeImpl <em>GM Point Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211.iso19139.gss.impl.GMPointPropertyTypeImpl
	 * @see org.isotc211.iso19139.gss.impl.GSSPackageImpl#getGMPointPropertyType()
	 * @generated
	 */
	int GM_POINT_PROPERTY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_POINT_PROPERTY_TYPE__POINT = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_POINT_PROPERTY_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_POINT_PROPERTY_TYPE__ARCROLE = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_POINT_PROPERTY_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_POINT_PROPERTY_TYPE__NIL_REASON = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_POINT_PROPERTY_TYPE__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_POINT_PROPERTY_TYPE__SHOW = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_POINT_PROPERTY_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_POINT_PROPERTY_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_POINT_PROPERTY_TYPE__UUIDREF = 9;

	/**
	 * The number of structural features of the '<em>GM Point Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_POINT_PROPERTY_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>GM Point Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GM_POINT_PROPERTY_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.isotc211.iso19139.gss.GMObjectPropertyType <em>GM Object Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GM Object Property Type</em>'.
	 * @see org.isotc211.iso19139.gss.GMObjectPropertyType
	 * @generated
	 */
	EClass getGMObjectPropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211.iso19139.gss.GMObjectPropertyType#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Geometry Group</em>'.
	 * @see org.isotc211.iso19139.gss.GMObjectPropertyType#getAbstractGeometryGroup()
	 * @see #getGMObjectPropertyType()
	 * @generated
	 */
	EAttribute getGMObjectPropertyType_AbstractGeometryGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211.iso19139.gss.GMObjectPropertyType#getAbstractGeometry <em>Abstract Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Geometry</em>'.
	 * @see org.isotc211.iso19139.gss.GMObjectPropertyType#getAbstractGeometry()
	 * @see #getGMObjectPropertyType()
	 * @generated
	 */
	EReference getGMObjectPropertyType_AbstractGeometry();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMObjectPropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211.iso19139.gss.GMObjectPropertyType#getActuate()
	 * @see #getGMObjectPropertyType()
	 * @generated
	 */
	EAttribute getGMObjectPropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMObjectPropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211.iso19139.gss.GMObjectPropertyType#getArcrole()
	 * @see #getGMObjectPropertyType()
	 * @generated
	 */
	EAttribute getGMObjectPropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMObjectPropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211.iso19139.gss.GMObjectPropertyType#getHref()
	 * @see #getGMObjectPropertyType()
	 * @generated
	 */
	EAttribute getGMObjectPropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMObjectPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211.iso19139.gss.GMObjectPropertyType#getNilReason()
	 * @see #getGMObjectPropertyType()
	 * @generated
	 */
	EAttribute getGMObjectPropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMObjectPropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211.iso19139.gss.GMObjectPropertyType#getRole()
	 * @see #getGMObjectPropertyType()
	 * @generated
	 */
	EAttribute getGMObjectPropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMObjectPropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211.iso19139.gss.GMObjectPropertyType#getShow()
	 * @see #getGMObjectPropertyType()
	 * @generated
	 */
	EAttribute getGMObjectPropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMObjectPropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211.iso19139.gss.GMObjectPropertyType#getTitle()
	 * @see #getGMObjectPropertyType()
	 * @generated
	 */
	EAttribute getGMObjectPropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMObjectPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211.iso19139.gss.GMObjectPropertyType#getType()
	 * @see #getGMObjectPropertyType()
	 * @generated
	 */
	EAttribute getGMObjectPropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMObjectPropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211.iso19139.gss.GMObjectPropertyType#getUuidref()
	 * @see #getGMObjectPropertyType()
	 * @generated
	 */
	EAttribute getGMObjectPropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211.iso19139.gss.GMPointPropertyType <em>GM Point Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GM Point Property Type</em>'.
	 * @see org.isotc211.iso19139.gss.GMPointPropertyType
	 * @generated
	 */
	EClass getGMPointPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211.iso19139.gss.GMPointPropertyType#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see org.isotc211.iso19139.gss.GMPointPropertyType#getPoint()
	 * @see #getGMPointPropertyType()
	 * @generated
	 */
	EReference getGMPointPropertyType_Point();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMPointPropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211.iso19139.gss.GMPointPropertyType#getActuate()
	 * @see #getGMPointPropertyType()
	 * @generated
	 */
	EAttribute getGMPointPropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMPointPropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211.iso19139.gss.GMPointPropertyType#getArcrole()
	 * @see #getGMPointPropertyType()
	 * @generated
	 */
	EAttribute getGMPointPropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMPointPropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211.iso19139.gss.GMPointPropertyType#getHref()
	 * @see #getGMPointPropertyType()
	 * @generated
	 */
	EAttribute getGMPointPropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMPointPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211.iso19139.gss.GMPointPropertyType#getNilReason()
	 * @see #getGMPointPropertyType()
	 * @generated
	 */
	EAttribute getGMPointPropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMPointPropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211.iso19139.gss.GMPointPropertyType#getRole()
	 * @see #getGMPointPropertyType()
	 * @generated
	 */
	EAttribute getGMPointPropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMPointPropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211.iso19139.gss.GMPointPropertyType#getShow()
	 * @see #getGMPointPropertyType()
	 * @generated
	 */
	EAttribute getGMPointPropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMPointPropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211.iso19139.gss.GMPointPropertyType#getTitle()
	 * @see #getGMPointPropertyType()
	 * @generated
	 */
	EAttribute getGMPointPropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMPointPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211.iso19139.gss.GMPointPropertyType#getType()
	 * @see #getGMPointPropertyType()
	 * @generated
	 */
	EAttribute getGMPointPropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211.iso19139.gss.GMPointPropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211.iso19139.gss.GMPointPropertyType#getUuidref()
	 * @see #getGMPointPropertyType()
	 * @generated
	 */
	EAttribute getGMPointPropertyType_Uuidref();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GSSFactory getGSSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.isotc211.iso19139.gss.impl.GMObjectPropertyTypeImpl <em>GM Object Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211.iso19139.gss.impl.GMObjectPropertyTypeImpl
		 * @see org.isotc211.iso19139.gss.impl.GSSPackageImpl#getGMObjectPropertyType()
		 * @generated
		 */
		EClass GM_OBJECT_PROPERTY_TYPE = eINSTANCE.getGMObjectPropertyType();

		/**
		 * The meta object literal for the '<em><b>Abstract Geometry Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_OBJECT_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP = eINSTANCE.getGMObjectPropertyType_AbstractGeometryGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GM_OBJECT_PROPERTY_TYPE__ABSTRACT_GEOMETRY = eINSTANCE.getGMObjectPropertyType_AbstractGeometry();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_OBJECT_PROPERTY_TYPE__ACTUATE = eINSTANCE.getGMObjectPropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_OBJECT_PROPERTY_TYPE__ARCROLE = eINSTANCE.getGMObjectPropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_OBJECT_PROPERTY_TYPE__HREF = eINSTANCE.getGMObjectPropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_OBJECT_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getGMObjectPropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_OBJECT_PROPERTY_TYPE__ROLE = eINSTANCE.getGMObjectPropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_OBJECT_PROPERTY_TYPE__SHOW = eINSTANCE.getGMObjectPropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_OBJECT_PROPERTY_TYPE__TITLE = eINSTANCE.getGMObjectPropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_OBJECT_PROPERTY_TYPE__TYPE = eINSTANCE.getGMObjectPropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_OBJECT_PROPERTY_TYPE__UUIDREF = eINSTANCE.getGMObjectPropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211.iso19139.gss.impl.GMPointPropertyTypeImpl <em>GM Point Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211.iso19139.gss.impl.GMPointPropertyTypeImpl
		 * @see org.isotc211.iso19139.gss.impl.GSSPackageImpl#getGMPointPropertyType()
		 * @generated
		 */
		EClass GM_POINT_PROPERTY_TYPE = eINSTANCE.getGMPointPropertyType();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GM_POINT_PROPERTY_TYPE__POINT = eINSTANCE.getGMPointPropertyType_Point();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_POINT_PROPERTY_TYPE__ACTUATE = eINSTANCE.getGMPointPropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_POINT_PROPERTY_TYPE__ARCROLE = eINSTANCE.getGMPointPropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_POINT_PROPERTY_TYPE__HREF = eINSTANCE.getGMPointPropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_POINT_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getGMPointPropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_POINT_PROPERTY_TYPE__ROLE = eINSTANCE.getGMPointPropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_POINT_PROPERTY_TYPE__SHOW = eINSTANCE.getGMPointPropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_POINT_PROPERTY_TYPE__TITLE = eINSTANCE.getGMPointPropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_POINT_PROPERTY_TYPE__TYPE = eINSTANCE.getGMPointPropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GM_POINT_PROPERTY_TYPE__UUIDREF = eINSTANCE.getGMPointPropertyType_Uuidref();

	}

} //GSSPackage
