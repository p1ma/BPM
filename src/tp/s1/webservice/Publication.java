/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.s1.webservice;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Pierre-Marie JUNGES - Master SSSR at University of Lorraine
 * 
 * Oct 4, 2017
 */
public class Publication {
    /*
        Web service launcher
    */
    public static void main(String[] args) {
        String url = "http://localhost:8080/?wsdl";
        Conversion conversion = new Conversion();
        /*
            Creates and publishes an endpoint for Conversion
            at adress url
        */
        Endpoint.publish(url, conversion);
        System.out.println("Web service published at:\n");
        System.out.println("\t" + url);
    }
}
