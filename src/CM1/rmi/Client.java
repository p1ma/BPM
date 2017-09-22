/**
 * 
 */
package CM1.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 22, 2017
 */
public class Client {

	/**
	 * Client RMI
	 * just execute it, and if the server is online then
	 * you will have your response !
	 * 
	 */
	public static void main(String[] args) {
		ServerInterface server = null;
		try {
			server = (ServerInterface)Naming.lookup("//localhost/Server");
			double euro = 1.0;
			System.out.println(euro + " = " + server.conversion(euro));
		} catch (NotBoundException | RemoteException | MalformedURLException e) {
			System.out.println("Client error");
			System.exit(1);
		} 
	}
}
