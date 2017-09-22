/**
 * 
 */
package CM1;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

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
 */
@XmlRootElement(name="Person")
public class Person implements Serializable {

	/**
	 * serialVersionUID used to 
	 */
	private static final long serialVersionUID = 1L;
	
	// ATTRIBUTES
	private String lastName;
	private String firstName;
	private Date birthDate;
	
	/**
	 * Empty constructor
	 */
	public Person() {
		lastName = "";
		firstName = "";
		birthDate = new Date();
	}
	
	/**
	 * 
	 * Constructs a Person with the given parameters:
	 * @param f - the firstname
	 * @param l - the lastname
	 * @param d - the date of birth
	 */
	public Person(String f, String l, Date d) {
		lastName = l;
		firstName = f;
		birthDate = d;
	}

	/**
	 * @return the lastName
	 */
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
