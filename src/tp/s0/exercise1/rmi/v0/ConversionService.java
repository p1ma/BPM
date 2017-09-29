/**
 * 
 */
package tp.s0.exercise1.rmi.v0;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 29, 2017
 */
public class ConversionService extends UnicastRemoteObject implements InterfaceRemote {

	private static final long serialVersionUID = 1L;
	
	private static final double RATE = 1.9;
	
	/**
	 * Constructs a ConversionService.java with the given parameter(s)
	 * @throws RemoteException
	 */
	protected ConversionService() throws RemoteException {
		super();
	}
				
	@Override
	public double convert(double val) throws RemoteException {
		return RATE * val;
	}

}
