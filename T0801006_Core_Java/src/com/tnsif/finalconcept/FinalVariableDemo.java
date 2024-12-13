/**
 * 
 */
package com.tnsif.finalconcept;

/**
 * @author Sagar
 *
 */
public class FinalVariableDemo {
	
	final int x =100;
	
	final static int Y;
	
	final static int Z=300;
	
	static void change() {
	//	x=10;
	 //   Y=200;
	}
	
	static {
		Y = 20;
	//Z = 100; // Once intialized can't be reassigned
		System.out.println("Value of Y: " + Y);
	}
	

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

}
