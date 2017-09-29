/**
 * 
 */
package tp.s0.exercise1.rmi.v1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 29, 2017
 */
public interface AccountInterface extends Remote {

	void credit(double value) throws RemoteException;
	
	void debit(double value) throws RemoteException;
	
	double getValue() throws RemoteException;
}
