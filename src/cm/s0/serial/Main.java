/**
 * 
 */
package cm.s0.serial;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 22, 2017
 */
public class Main {

	/**
	 * File where to_XML() is supposed to stock the Java Object
	 */
	private static File xmlFile = new File("files/person.xml");
	
	/**
	 * File where the XSD Schema is located
	 */
	private static File xsdFile = new File("files/person.xsd");
	
	/**
	 * Launch the CM1 Application
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * A JavaBean is a Java Object that is:
		 * serializable, 
		 * has a nullary constructor,
		 * allows access to properties using getter and setter methods.
		*/
		Person p1 = new Person("Bob", 
				"Dylan", 
				new Date(25,05,1941), 
				77);

		/*
		 * Serialization: Object -> XML
		 */
		object_to_XML(p1);
		
		/*
		 * Deserialization: XML -> Object
		 */
		Person p2 = XML_to_object();
		
		/*
		 * Check if p1 == p2
		 */
		if (p1.equals(p2)) {
			System.out.println("Serialization and Deserialization done right !");
		}
		
		/*
		 * Generate XSD Schema from Person.class
		 */
		generate_XSD();
		
		/*
		 * (xjc in /usr/lib/jvm/java-8-openjdk-amd64/bin/)
		 * Create java classes from xsd schema:
		 * 		xjc [options] <schema.xsd>
		 * 
		 * options:
		 *	-d <rep> generate classes inside rep/
		 *	-p <pack> classes's package will be pack
		 */
	}
	
	/*
	 * Transform a Java object (Person) into his XML representation.
	 */
	public static void object_to_XML(Person person) {
		try {
			// Obtain a new instance of a JAXBContext
			JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
			
			// Create a new instance of Marshaller
			Marshaller marshaller = jaxbContext.createMarshaller();
			
			// Set indentation in the XML File
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, 
					true);
			
			/*
			 *  Marshal the content tree rooted at person into xmlFile
			 *  Need @XML... annotations in Person class.
			 *  If no @XmlRootElement then JAXBException raised.
			 *  See class: Person
			 */
			marshaller.marshal(person, xmlFile);
			
			System.out.println("object_to_XML() done.");
		} catch (JAXBException e) {
			System.err.println("Error: to object_to_XML()");
			System.exit(1);
		}
	}
	
	/*
	 * Transform a XML representation into a Java class.
	 */
	public static Person XML_to_object() {
		try {
			// Obtain a new instance of a JAXBContext
			JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
			
			// Create a new instance of UnMarshaller
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			
			// Read a XML file and create a Java Object
			Person person = (Person) unmarshaller.unmarshal(xmlFile);
			
			System.out.println("XML_to_object() done.");
			
			return person;
		} catch (JAXBException e) {
			System.err.println("Error: to XML_to_object()");
			System.exit(1);
		}
		return null;
	}
	
	/*
	 * Create a XSD Schema
	 */
	public static void generate_XSD() {
		try {
			// Obtain a new instance of a JAXBContext
			JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
			
			// In order to create a schema
			jaxbContext.generateSchema(new SchemaOutputResolver() {

				@Override
				public Result createOutput(String arg0, String arg1) throws IOException {
					return new StreamResult(xsdFile);
				}
				
			});
			System.out.println("XSD Schema generated !");
		} catch (JAXBException | IOException e) {
			System.err.println("Error: generate XSD Schema");
			System.exit(1);
		}
	}
}
