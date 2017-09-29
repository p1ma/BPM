/**
 * 
 */
package cm.s0.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 22, 2017
 */
public interface ServerInterface extends Remote {

	public double conversion(double value) throws RemoteException;
}
