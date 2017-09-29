/**
 * 
 */
package tp.s0.exercise1.rmi.v0;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 29, 2017
 */
public class ServerRmi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// Creates a new instance of ConversionService
			ConversionService conversionService = new ConversionService();
			
			final int no_port = 6666;
			
			// Creates and exports a Registry instance
			LocateRegistry.createRegistry(no_port);
			
			final String name = "rmi://localhost:" + no_port + "/Conversion";
			
			// Rebinds the specified name to a new remote object
			Naming.rebind(name, conversionService);
			
			// Prints informations on conversionService
			System.out.println(conversionService);
		} catch (Exception exception) {
			Logger.getLogger(ServerRmi.class.getName()).log(Level.SEVERE, 
					"Crash Server RMI", 
					exception);
		}

	}

}
