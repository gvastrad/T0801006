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
public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		// Accept student details
		Student student = new Student();
		System.out.println();
		System.out.println("Enter the roll no: ");
		int rollNo = sc.nextInt();
		student.setRollNo(rollNo);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		sc.nextLine();
		student.setName(name);
		System.out.println("Enter the no.of subjects ");
		int sub = sc.nextInt();
		
		if (sub > 0) {
			student.setNoOfsubjects(sub);
			System.out.println("enter the marks for " + sub);
			int[] marks = new int[sub];
			for (int i = 0; i < sub; i++)
				marks[i] = sc.nextInt();

			StudentService studentService = new StudentService();
			studentService.setMarks(student, marks);
			System.out.println(student);
		} else
			System.out.println("Enter valid subjects");
		}
		catch (InvalidMarksException e) {
			// e.printStackTrace();
			System.err.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			// e.printStackTrace();
			System.err.println("Enter Valid Input");
		}
	}

}
