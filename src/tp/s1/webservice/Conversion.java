/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.s1.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Pierre-Marie JUNGES - Master SSSR at University of Lorraine
 * 
 * Oct 4, 2017
 */
/*
    @WebService = Creates a Web Services with JAX-WS
*/
@WebService(name="Conversion", targetNamespace="http://www.fst.univ-lorraine.fr")
public class Conversion {
    
    private static final double RATE = 1.6;
    
    /*
        @WebMethod declares a Web method
    */
    @WebMethod(operationName="conversion", action="convert")
    public double convert(@WebParam(name="amount")double amount) {
        return RATE * amount;
    }
}
