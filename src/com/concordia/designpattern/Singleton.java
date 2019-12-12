package com.concordia.designpattern;

import java.io.BufferedReader;

public class Singleton {

	/**
	 * Reference: http://www.blackwasp.co.uk/Singleton.aspx
	 * 
	 * Single Pattern is creational pattern. Uses: Mainly used to control the class
	 * initiation.
	 * 
	 * It is better to use singleton approach instead of creating a globla variable.
	 * Global variable may be copied leading to multiple access points.
	 * 
	 * An example of the use of this pattern will be any legacy system which allows
	 * only single access point and that access point can be given in an effective
	 * way by using this pattern.
	 * 
	 * 
	 * @param args
	 */

	// Singleton variable.
	private static Object singletonInstance;
	private static Object _lockThis = new Object();

	public static Singleton GetSingleton() {

		if (singletonInstance == null)
			singletonInstance = new Singleton();
	
	return (Singleton) singletonInstance;

	}

}
