/**
 * 
 */
package CM1.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 22, 2017
 */
public class ServerLauncher {

	/**
	 * R.M.I (Remote Method Invocation)
	 * 
	 * Perform remote method invocation
	 * 
	 * command:
	 * 		rmic CM1.rmi.ServerDollar
	 * 			-> creates a ServerDollar_Stub.class
	 * 
	 * 1) Start rmi registry:
	 * 	unix: rmiregistry & (/usr/lib/jvm/java-8-openjdk-amd64/bin/)
	 * 	windows: start rmiregistry
	 * 
	 * 2) Execute ServerLauncher
	 * 
	 * 3) Wait client's input
	 */
	public static void main(String[] args) {
		System.out.println("Starting RMI Server...");
		try {
			LocateRegistry.createRegistry(6666);
			
		} catch (RemoteException e) {
			System.out.println("RMI registry already exists");
			System.exit(1);
		}
		
		ServerInterface serverInterface = null;
		try {
			// Instanciate server
			serverInterface = new ServerDollar();
			
			// Bind the instance
			Naming.rebind("//localhost/Server", serverInterface);
			
			System.out.println("Server started.");
		} catch (RemoteException | MalformedURLException e) {
			System.out.println("Error: server creation()");
			System.exit(1);
		}
	}

}
