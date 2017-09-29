/**
 * 
 */
package tp.s0.exercise2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import cm.s0.serial.Person;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 29, 2017
 */
@XmlRootElement(name="Personnes")
public class PersonList implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Person> persons;
	
	public PersonList() {
		persons = new ArrayList<Person>();
	}
	
	public PersonList(List<Person> copy) {
		persons = new ArrayList<Person>(copy);
	}

	public void addPerson(Person p) {
		persons.add(p);
	}
	
	/**
	 * @return the persons
	 */
	@XmlElement(name="Personne")
	public List<Person> getPersons() {
		return persons;
	}

	/**
	 * @param persons the Lpersons to set
	 */
	public void setPersons(List<Person> Lpersons) {
		this.persons = Lpersons;
	}
	
}
