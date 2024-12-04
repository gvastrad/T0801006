package com.tnsif.inheritance;

public class Student extends Citizen{
	
private int rollNo;
private String collegeName;

public Student() {
}


public Student(String name, long adharNo, String city, long phNo,int rollNo,String collegeName) {
	super(name, adharNo, city, phNo);
	this.rollNo=rollNo;
	this.collegeName=collegeName;
}


public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getCollegeName() {
	return collegeName;
}

public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}


@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName() + ", getAdharNo()="
			+ getAdharNo() + ", getCity()=" + getCity() + ", getPhNo()=" + getPhNo() + "]";
}

}
