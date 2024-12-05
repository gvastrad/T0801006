package com.tnsif.inheritance.singlelevel;

public class Citizen {

	private String name;
	private long adharNo;
	private String city;
	private long phNo;
	
	public Citizen() {
	}

	public Citizen(String name, long adharNo, String city, long phNo) {
		this.name = name;
		this.adharNo = adharNo;
		this.city = city;
		this.phNo = phNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharNo=" + adharNo + ", city=" + city + ", phNo=" + phNo + "]";
	}
}
