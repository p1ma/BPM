/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.s1.exercise5;

/**
 *
 * @author Pierre-Marie JUNGES - Master SSSR at University of Lorraine
 */
public class Student {
    
    private String name;
    private int age;
    
    public Student() {
        name = "";
        age = 0;
    }
    
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getInfo() {
        return "Much info such knowledge";
    }
    
    public String toString() {
        return name + " - " + age;
    }
}
