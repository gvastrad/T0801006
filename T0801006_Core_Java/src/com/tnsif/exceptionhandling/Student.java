/**
 * 
 */
package com.tnsif.exceptionhandling;

import java.util.Arrays;

/**
 * @author Sagar
 *
 */
public class Student {
	 private int rollNo;
	 private String name;
	 private int noOfsubjects;
	 private float percentage;
	 private int marks[];
	 
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfsubjects() {
		return noOfsubjects;
	}
	public void setNoOfsubjects(int noOfsubjects) {
		this.noOfsubjects = noOfsubjects;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", noOfsubjects=" + noOfsubjects + ", percentage="
				+ percentage + ", marks=" + Arrays.toString(marks) + "]";
	}
	}
