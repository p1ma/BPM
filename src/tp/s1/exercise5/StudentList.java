/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.s1.exercise5;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Pierre-Marie JUNGES - Master SSSR at University of Lorraine
 * 
 * wsgen -verbose -cp . tp.s1.exercise5.StudentList
 * tp/s1/exercise5/jaxws/Add.java
 * tp/s1/exercise5/jaxws/AddResponse.java
 * tp/s1/exercise5/jaxws/GetInfo.java
 * tp/s1/exercise5/jaxws/GetInfoResponse.java
 * tp/s1/exercise5/jaxws/Remove.java
 * tp/s1/exercise5/jaxws/RemoveIndex.java
 * tp/s1/exercise5/jaxws/RemoveIndexResponse.java
 * tp/s1/exercise5/jaxws/RemoveResponse.java

 */
@WebService(name="StudentManagement", targetNamespace="http://www.fst.univ-lorraine.fr")
public class StudentList {

    private List<Student> students;
    
    public StudentList() {
        students = new ArrayList<Student>();
    }
    
    @WebMethod(operationName="add", action="add")
    public void add(@WebParam(name="studentA")Student student) {
        
    }
    
    @WebMethod(operationName="removeS", action="removeS")
    public void remove(@WebParam(name="studentR")Student student) {
        students.remove(student);
    }
    
    @WebMethod(operationName="removeI", action="removeI")
    public void removeIndex(@WebParam(name="indice")int indice) {
        students.remove(indice);
    }
    
    @WebMethod(operationName="getInfo", action="getInfo")
    public String getInfo(@WebParam(name="studentG")Student student) {
        return student.getInfo();
    }
    
    @WebMethod(operationName="getList", action="getList")
    public String getList() {
        if (students.size() == 0) {
            return "No student yet";
        } else { 
        StringBuilder sb = new StringBuilder("");
        for (Student s : students) {
            sb.append(s.toString() + "\n");
        }
        return sb.toString();
        }
    }
    
}
