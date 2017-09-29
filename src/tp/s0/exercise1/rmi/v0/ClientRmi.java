/**
 * 
 */
package tp.s0.exercise1.rmi.v0;

import java.rmi.Naming;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 29, 2017
 */
public class ClientRmi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// Creates then uses InterfaceRemote
			RemoteInterface interfaceRemote = (RemoteInterface) 
					Naming.lookup("rmi://localhost:6666/Conversion");
			
			int euros = 1664;
			
			System.out.println(euros + "€ => " + interfaceRemote.convert(euros) + "$.");
		} catch (Exception exception) {
			Logger.getLogger(ClientRmi.class.getName()).log(Level.SEVERE, 
					"Crash Client RMI", 
					exception);
		}
	}

}
