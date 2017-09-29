/**
 * 
 */
package tp.s0.exercise1.rmi.v0;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 29, 2017
 */
public interface InterfaceRemote extends Remote {
	public double convert(double val) throws RemoteException;
}
