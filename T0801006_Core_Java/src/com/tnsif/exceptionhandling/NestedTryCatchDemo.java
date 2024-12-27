/**
 * 
 */
package com.tnsif.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Sagar
 *
 */
public class NestedTryCatchDemo {
	public static void main(String[] args) {
		String name;
		int pos;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your name");
			name=sc.next();
			System.out.println("Enter the position : ");
			pos = sc.nextInt();
			try {
				System.out.println("character at index " + pos + " in '" + name + "' is " + name.charAt(pos));
			}
			catch (StringIndexOutOfBoundsException e) {
				// e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
		}
		catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
