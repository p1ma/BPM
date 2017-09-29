/**
 * 
 */
package tp.s0.exercise2;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.codehaus.jackson.map.ObjectMapper;

import cm.s0.serial.Person;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 29, 2017
 */
public class Deserialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// Files XML where the Person will be stocked
			File xmlFile = new File("files/pima.xml");

			// Files JSON where the Person will be stocked
			File jsonFile = new File("files/pima.json");
			
			// Deserialization XML -> Person
			Person pimaXml = XML_to_object(xmlFile);
			
			// Deserialization JSON -> Person
			Person pimaJson = JSON_to_object(jsonFile);
			
			// Equality test
			assert(pimaXml.equals(pimaJson) == true);

		} catch (Exception exception) {
			Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, 
					"Crash main",
					exception);
		}
	}

	/*
	 * Transform a Java object (Person) into his XML representation.
	 */
	public static Person XML_to_object(File file) {
		try {
			// Obtain a new instance of a JAXBContext
			JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);

			// Create a new instance of Unmarshaller
			Unmarshaller marshaller = jaxbContext.createUnmarshaller();

			return (Person) marshaller.unmarshal(file);
		} catch (Exception exception) {
			Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, 
					"Crash object_to_XML", 
					exception);
		}
		return null;
	}

	/*
	 * Transform a Java object (Person) into his JSON representation.
	 */
	public static Person JSON_to_object(File file) {
		try {
			/*
			 * Need to add "jackson-all-1.9.0.jar" located in libs/
			 */

			// Instanciates a ObjectMapper
			ObjectMapper mapper = new ObjectMapper();

			// Read file and returns the new Object
			return (Person) mapper.readValue(file, Person.class);
		} catch (Exception exception) {
			Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, 
					"Crash object_to_JSON", 
					exception);
		}
		return null;
	}

}
