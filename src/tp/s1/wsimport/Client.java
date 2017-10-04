/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.s1.wsimport;

import fr.univ_lorraine.fst.Conversion;
import fr.univ_lorraine.fst.ConversionService;
import java.io.File;

/**
 *
 * @author Pierre-Marie JUNGES - Master SSSR at University of Lorraine
 * 
 * Oct 4, 2017
 */
public class Client {
    
    private static final String PATH = "build/classes/";
    /*
        How do I generate jaxws?
        root directory (Netbeans: build/classes):
    tape in:   
        wsgen -verbose -cp . tp.s1.webservice.Conversion
    outputs:
        tp/s1/webservice/jaxws/Convert.java
        tp/s1/webservice/jaxws/ConvertResponse.java
    
        How do I generate .wsdl?
        root directory (Netbeans: build/classes):
    tape in:
        wsgen -verbose -cp . tp.s1.webservice.Conversion -wsdl; ls
    outputs:
        ConversionService.wsdl
        ConversionService_schema1.xsd
    */
    public static void main(String[] args) {
        // Do not execute this class if you don't have ConversionService.wsdl.
        
        String toHave = "ConversionService.wsdl";
        File fileToHave = new File(PATH + toHave);
        if ( !fileToHave.exists() ) {
            System.err.println("File " + toHave + " is missing!");
            System.exit(1);
        }
        
        /*
            Need to generate JAX-WS portable artifacts that can be packaged 
            in a web application archive.
        
            How I do generate them?
            root directory (Netbeans: build/classes):
        
        tape in: 
            cp ConversionService.wsdl ../../src/tp/s1/wsimport;
            cp ConversionService_schema1.xsd ../../src/tp/s1/wsimport;
            cd ../../src/tp/s1/wsimport;
            wsimport -s . ConversionService.wsdl;
        ouputs:
            parsing WSDL...
            Generating code...
            Compiling code...
        
        A new package (tp.s1.wsimport.fr) was created
        */
        double request = 1664.;
        Conversion stub = new ConversionService().getConversionPort(); 
        System.out.println("Server response: " + stub.conversion(request));
        
        /*
            Server response: 2662.4
            Problem ?
                execute Publication first
        */
        
    }
}
