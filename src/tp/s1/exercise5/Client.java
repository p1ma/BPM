/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.s1.exercise5;

import fr.test.Student;
import fr.test.StudentList;
import fr.test.StudentListService;


/**
 *
 * @author Pierre-Marie JUNGES - Master SSSR at University of Lorraine
 */
public class Client {
    
    public static void main(String[] args) {
        StudentList studentList = new StudentListService().getStudentListPort();
        System.out.println(studentList.getList());
        Student s = new Student();
        s.setAge(18);
        s.setName("MOI");
        studentList.add(s);
        System.out.println(studentList.getList());
    }
}
