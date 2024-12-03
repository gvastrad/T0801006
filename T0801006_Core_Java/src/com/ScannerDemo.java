package com;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  your name:");
		String n= sc.next();
		System.out.println("Hello" + n);
	}
}