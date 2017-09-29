/**
 * 
 */
package tp.s0.exercise2;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.codehaus.jackson.map.ObjectMapper;

import cm.s0.serial.Date;
import cm.s0.serial.Person;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 29, 2017
 */
public class Serialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// Files XML where the Person will be stocked
			File xmlFile = new File("files/pima.xml");

			// Files JSON where the Person will be stocked
			File jsonFile = new File("files/pima.json");

			// Creates a new Person
			Person pima = new Person("Pierre-Marie", 
					"JUNGES", 
					new Date(01, 23, 4567),
					23);

			// Serializes Object -> XML
			object_to_XML(pima, xmlFile);

			// Serializes Object -> JSON
			object_to_JSON(pima, jsonFile);

			/*
			 * Serialization multiple Objects
			 */

			// Files XML where the Person will be stocked
			xmlFile = new File("files/persons.xml");

			// Files JSON where the Person will be stocked
			jsonFile = new File("files/persons.json");

			PersonList list = new PersonList();
			list.addPerson(pima);
			list.addPerson(new Person("A", "B", new Date(0,1,2), 12));
			list.addPerson(new Person("C", "D", new Date(3,4,5), 345));
			list.addPerson(new Person("E", "F", new Date(6,7,8), 678));

			object_to_XML(list, xmlFile);
			object_to_JSON(list, jsonFile);

		} catch (Exception exception) {
			Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, 
					"Crash main",
					exception);
		}
	}

	/*
	 * Transform a Java object (Person) into his XML representation.
	 */
	public static void object_to_XML(Person person, File file) {
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
			marshaller.marshal(person, file);
		} catch (Exception exception) {
			Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, 
					"Crash object_to_XML", 
					exception);
		}
	}

	/*
	 * Transform a Java object (Person) into his JSON representation.
	 */
	public static void object_to_JSON(Person person, File file) {
		try {
			/*
			 * Need to add "jackson-all-1.9.0.jar" located in libs/
			 */

			// Instanciates a ObjectMapper
			ObjectMapper mapper = new ObjectMapper();

			// Writes into file the JSON value of person
			mapper.writeValue(file, person);

		} catch (Exception exception) {
			Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, 
					"Crash object_to_JSON", 
					exception);
		}
	}
	
	/*
	 * Transform a Java object (PersonList) into his XML representation.
	 */
	public static void object_to_XML(PersonList persons, File file) {
		try {
			// Obtain a new instance of a JAXBContext
			JAXBContext jaxbContext = JAXBContext.newInstance(PersonList.class);

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
			marshaller.marshal(persons, file);
		} catch (Exception exception) {
			Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, 
					"Crash object_to_XML", 
					exception);
		}
	}
	
	/*
	 * Transform a Java object (PersonList) into his JSON representation.
	 */
	public static void object_to_JSON(PersonList persons, File file) {
		try {
			/*
			 * Need to add "jackson-all-1.9.0.jar" located in libs/
			 */

			// Instanciates a ObjectMapper
			ObjectMapper mapper = new ObjectMapper();

			// Writes into file the JSON value of person
			mapper.writeValue(file, persons);
			
		} catch (Exception exception) {
			Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, 
					"Crash object_to_JSON", 
					exception);
		}
	}

}
