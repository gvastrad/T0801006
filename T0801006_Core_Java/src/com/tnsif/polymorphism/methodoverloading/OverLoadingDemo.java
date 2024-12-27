/**
 * 
 */
package com.tnsif.polymorphism.methodoverloading;

/**
 * @author Sagar
 *
 */
public class OverLoadingDemo {

	public static void main(String[] args) {
		int sum=MethodOverloading.addition(10, 20);
		System.out.println(sum);
		System.out.println("The sum of two float numbers is "+MethodOverloading.addition(10.22f, 20.11f));
		System.out.println(MethodOverloading.addition(10.f, 20));
		System.out.println(MethodOverloading.addition(10, 20.7f));
		System.out.println(MethodOverloading.addition("One ","Nation"));
	}
}
