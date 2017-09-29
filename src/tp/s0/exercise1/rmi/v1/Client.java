/**
 * 
 */
package tp.s0.exercise1.rmi.v1;

import java.rmi.Naming;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 29, 2017
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AccountInterface accountInterface = (AccountInterface)
					Naming.lookup("rmi://localhost:5555/Bank");
			
			double money = accountInterface.getValue();
			double value = 50;
			double tmp = 0;
			
			System.out.println("[+]INITIAL STATE");
			System.out.println("\tBank account balance: " + money + "€");
			
			accountInterface.credit(value);
			tmp = accountInterface.getValue();
			System.out.println("[+] CREDIT " + value + "€");
			System.out.println("\tBank account balance: " + tmp + "€");
			assert(tmp == (money + 50));
			
			money = accountInterface.getValue();
			
			accountInterface.debit(value);
			tmp = accountInterface.getValue();
			System.out.println("[+] DEBIT " + value + "€");
			System.out.println("\tBank account balance: " + tmp + "€");
			assert(tmp == (money - 50));
			
		} catch (Exception exception) {
			Logger.getLogger(Client.class.getName()).log(Level.SEVERE, 
					"Crash Client", 
					exception);
		}
	}

}
