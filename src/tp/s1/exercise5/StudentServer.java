/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.s1.exercise5;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Pierre-Marie JUNGES - Master SSSR at University of Lorraine
 */
public class StudentServer {
    
    public static void main(String[] args) {
        String url = "http://localhost:8089/?wsdl";
        StudentList conversion = new StudentList();
        /*
            Creates and publishes an endpoint for Conversion
            at adress url
        */
        Endpoint.publish(url, conversion);
        System.out.println("Web service published at:\n");
        System.out.println("\t" + url);
    }
}
