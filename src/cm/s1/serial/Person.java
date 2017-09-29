/**
 * 
 */
package cm.s1.serial;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 22, 2017
 */
/*
 * XML annotations:
 * @XmlRootElement: 
 * 		-Serialization OK
 * 		-No indentation in the <file.xml>
 * 		-XML root will be by default '<person>'
 * @XmlRootElement(name=Person)
 * 		-Serialization OK
 * 		-No indentation in the <file.xml>
 * 		-XML root will be <Person> because of the parameter name=Person
 * 
 * Only 1 @XmlRootElement per class(trivial...) and does not manage
 * the xml indentation (Marshaller do)
 * 
 * @XmlTransient (hide a attribute in th xml file)
 * 		-Above a PUBLIC attribute then this attribute won't
 * 		be visible in the xml file.
 * 		-Above a getter's attribute(PRIVATE one) we want to hide
 * 
 * @XmlType(propOrder = {"lastName", "firstName"})
 * 		-The attribute's order in the XML file will be:
 * 			<lastName> ...
 * 			<firstName> ...
 * 
 * @XmlAttribute 
 * Put a class' attribute as xml attribute instead of xml element
 * If the class attribute is private:
 * 		-Put @XmlAttribute above getter method
 * If public:
 * 		-Put @XmlAttribute above attribute declaration
 * 
 * @XmlElement(name=XX)
 * Change attribute's name inside xml fil
 * If the class attribute is private:
 * 		-Put @XmlElement(name=XX) above getter method
 * If public:
 * 		-Put @XmlElement(name=XX) above attribute declaration
 */
@XmlRootElement(name="Person")
@XmlType(propOrder={"lastName", "firstName"})
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// ATTRIBUTES
	private String firstName;
	private String lastName;
	private int age;
	private Date birthDate;
	
	/**
	 * Empty constructor
	 */
	public Person() {
		lastName = "";
		firstName = "";
		birthDate = new Date();
		age = 0;
	}
	
	/**
	 * 
	 * Constructs a Person with the given parameters:
	 * @param f - the firstname
	 * @param l - the lastname
	 * @param d - the date of birth
	 * @param a - the age
	 */
	public Person(String f, String l, Date d, int a) {
		lastName = l;
		firstName = f;
		birthDate = d;
		age = a;
	}

	/**
	 * @return the lastName
	 */
	@XmlElement(name="nom")
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	@XmlElement(name="prenom")
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the birthDate
	 */
	@XmlTransient
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the age
	 */
	@XmlAttribute
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Equality test 
	 */
	public boolean equals(Object o) {
		Person p = (Person) o;
		if (firstName.compareTo(p.getFirstName()) < 0) {
			return false;
		}
		if (lastName.compareTo(p.getLastName()) < 0) {
			return false;
		}
		return true;
	}
}
