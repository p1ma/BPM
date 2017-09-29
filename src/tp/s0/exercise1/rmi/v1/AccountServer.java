/**
 * 
 */
package tp.s0.exercise1.rmi.v1;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 29, 2017
 */
public class AccountServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			double money = 1664;
			
			// Creates a new Account
			Account account = new Account(money);
			
			final int no_port = 5555;
			
			// Creates and exports a Registry instance
			LocateRegistry.createRegistry(no_port);
						
			final String name = "rmi://localhost:" + no_port + "/Bank";
			
			// Rebinds the specified name to a new remote object
			Naming.rebind(name, account);
			
		} catch (Exception exception) {
			Logger.getLogger(AccountServer.class.getName()).log(Level.SEVERE,
					"Crash Account Server", 
					exception);
		}
	}

}
