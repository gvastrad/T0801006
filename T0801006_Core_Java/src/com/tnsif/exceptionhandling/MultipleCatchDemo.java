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
public class MultipleCatchDemo {
	public static void main(String[] args) {
		int numberOne, numberTwo, numberThree;
		System.out.println("Enter the two numbers");
		Scanner sc=new Scanner(System.in);
		while(true) {
		try {
		numberOne = sc.nextInt();
		numberTwo = sc.nextInt();
		numberThree=numberOne / numberTwo;
		System.out.println("Division is " + numberThree);
		}
		catch (InputMismatchException e) {
			// e.printStackTrace();
			System.out.println("Invalid input. Please enter integers only.");
			sc.nextLine();
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
			break;
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
			break;
		}
	}
		sc.close();
		}

}
