
package fr.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentR" type="{http://www.test.fr}student" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeS", propOrder = {
    "studentR"
})
public class RemoveS {

    protected Student studentR;

    /**
     * Gets the value of the studentR property.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     */
    public Student getStudentR() {
        return studentR;
    }

    /**
     * Sets the value of the studentR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     */
    public void setStudentR(Student value) {
        this.studentR = value;
    }

}
