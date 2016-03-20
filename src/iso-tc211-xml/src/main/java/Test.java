import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import de.bespire.registry.io.excel.configuration.DocumentRoot;
import de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationFactory;
import de.bespire.registry.io.excel.configuration.ExcelAdapterConfigurationPackage;
import de.bespire.registry.io.excel.configuration.ExcelConfiguration;
import de.bespire.registry.io.excel.configuration.SheetConfiguration;

public class Test
{
//	public static void main(String[] args) throws IOException {
//		EPackage.Registry.INSTANCE.put(GMLPackage.eNS_URI, GMLPackage.eINSTANCE);
////		EPackage.Registry.INSTANCE.put(Org_w3_xml__1998_namespacePackage.eNS_URI, Org_w3_xml__1998_namespacePackage.eINSTANCE);
//		// extension GML -> erzeuge XML-Ressource
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("gml", new XMLResourceFactoryImpl());
//		
//		
//		EllipsoidType ellipsoid = GMLFactory.eINSTANCE.createEllipsoidType();
////		ellipsoid.eSet(Net_opengis_gml__3Package.eINSTANCE.getEllipsoidPropertyType_Title(), "Ellipsoid");
//		StringOrRefType name = GMLFactory.eINSTANCE.createStringOrRefType();
//		name.setValue("Ellipsoid");
//		ellipsoid.setDescription(name);
//		
//		DocumentRoot root = GMLFactory.eINSTANCE.createDocumentRoot();
//		root.getXSISchemaLocation().put("http://www.opengis.net/gml/3.2", "http://schemas.opengis.net/gml/3.2.1/gml.xsd");
//		root.getXMLNSPrefixMap().put("gml", "http://www.opengis.net/gml/3.2");
//		
//		root.setEllipsoid1(ellipsoid);
//		
//		ResourceSet resourceSet = new ResourceSetImpl();
//		Resource resource = resourceSet.createResource(URI.createFileURI("D:/test2.gml"));
//		resource.getContents().add(root);
//		
//		Map<Object, Object> options = new HashMap<>();
//		options.put(XMLResource.OPTION_EXTENDED_META_DATA, true);
//		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
//		resource.save(options);
//	}
	
	public static void main(String[] args) throws IOException {
		EPackage.Registry.INSTANCE.put(ExcelAdapterConfigurationPackage.eNS_URI, ExcelAdapterConfigurationPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xlio", new XMLResourceFactoryImpl());
		
		DocumentRoot root = ExcelAdapterConfigurationFactory.eINSTANCE.createDocumentRoot();
		ExcelConfiguration xlConfig = ExcelAdapterConfigurationFactory.eINSTANCE.createExcelConfiguration();
		
		root.setExcelConfiguration(xlConfig);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createFileURI("D:/test.xlio"));

		Map<Object, Object> options = new HashMap<>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, true);
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");

//		resource.getContents().add(root);
//		resource.save(options);
		
		resource.load(options);
		DocumentRoot loadedRoot = (DocumentRoot)resource.getContents().get(0);
		ExcelConfiguration loadedConfig = loadedRoot.getExcelConfiguration();
		for (SheetConfiguration sheetConfig : loadedConfig.getSheet()) {
			System.out.println(sheetConfig.getSheetName());
		}
		
	}
}
