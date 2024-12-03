package com.tnsif.scanner;
//Entity class
public class Person {
	
private int age;
private String name;
private float income;
private float tax;
public String gender;

  public Person() {
  
  }
 
public Person(int age, String name, float income,String gender) {
	this.age = age;
	this.name = name;
	this.income = income;
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getIncome() {
	return income;
}
public void setIncome(float income) {
	this.income = income;
}
public float getTax() {
	return tax;
}
public void setTax(float tax) {
	this.tax = tax;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + ", income=" + income + ", tax=" + tax + ", gender=" + gender + "]";
}
}
