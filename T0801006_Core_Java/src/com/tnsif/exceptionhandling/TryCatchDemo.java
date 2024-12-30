/**
 * 
 */
package com.tnsif.exceptionhandling;

/**
 * @author Sagar
 *
 */
public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("I am in main method");
		int result;
		try {

			result = TryCatchExample.performDivision(12, 0);
			if (result != 0)
				System.out.println("Diviosin is " + result);

			System.out.println("------------------------------");

			result = TryCatchExample.performDivision(12, 3);
			if (result != 0)
				System.out.println("Division is " + result);

			System.out.println("------------------------------");
		} 
		catch (ArithmeticException e) {
			System.out.println("I am in catch block: " + e.getMessage());
		}
		System.out.println("Execute anyway");

	}

}
