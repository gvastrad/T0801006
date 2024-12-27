/**
 * 
 */
package com.tnsif.polymorphism.methodoverloading;

/**
 * @author Sagar
 *
 */
public class MethodOverloading {

	public static int addition(int a, int b){
		int c=a+b;
		return c;	
	}
	public static float addition(float a, float b){
		return a+b;	
	}
	public static float addition(int a, float b){
		return a+b;
	}
	public  static float addition(float a, int b){
		return a+b;	
	}
	public  static String addition(String a, String b){
		return a+b;	
	}
	
}
