package com.tnsif.scanner;

import java.util.Scanner;

//Program to demonstrate scanner class
public class PersonDemo {

	public static void main(String[] args) {

		// Initializing the object through default constructor
		Person person1 = new Person();
		person1.setAge(20);
		person1.setName("Rohith");
		person1.setGender("male");
		person1.setIncome(32000.50f);
		System.out.println(person1);

		// Initializing the object through parameterized constructor
		Person person2 = new Person(21, "Rocky", 34500.34f, "male");
		System.out.println(person2);

		// Initialize the object through user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the person");
		String name = sc.next();
		System.out.println("Enter the age of the person");
		int age = sc.nextInt();
		System.out.println("Enter the gender of the person");
		String gender = sc.next();
		System.out.println("Enter the salary of the person");
		float salary = sc.nextFloat();

		Person person3 = new Person(age, name, salary, gender);
		System.out.println(person3);

	}
}
