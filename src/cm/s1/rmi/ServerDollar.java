/**
 * 
 */
package cm.s1.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 22, 2017
 */
public class ServerDollar extends UnicastRemoteObject implements ServerInterface {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a ServerDollar.java with the given parameter(s)
	 * @throws RemoteException
	 */
	protected ServerDollar() throws RemoteException {
		super(0);
	}

	private static final double USrate = 0.85;
	
	@Override
	public double conversion(double value) throws RemoteException {
		if (value <= 0) {
			throw new RemoteException("Error: conversion()");
		}
		return USrate * value;
	}

}
