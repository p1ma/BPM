/**
 * 
 */
package tp.s0.exercise1.rmi.v1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 29, 2017
 */
public class Account extends UnicastRemoteObject implements AccountInterface {

	private static final long serialVersionUID = 1L;
	private double money;
	
	/**
	 * Constructs a Account.java with the given parameter(s)
	 * @throws RemoteException
	 */
	public Account() throws RemoteException {
		super();
		money = 0;
	}
	
	public Account(double m) throws RemoteException {
		super();
		money = m;
	}

	@Override
	public void credit(double value) throws RemoteException {
		money += value;
	}

	@Override
	public void debit(double value) throws RemoteException {
		money -= value;
	}

	@Override
	public double getValue() throws RemoteException {
		return money;
	}

}
