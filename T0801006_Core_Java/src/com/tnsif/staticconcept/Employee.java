/**
 * 
 */
package com.tnsif.staticconcept;

/**
 * @author Sagar
 *
 */
public class Employee {
	private String ename;
	private int eid;
	
	static String ecompany="TNSIF";

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Employee(String ename, int eid) {
		this.ename = ename;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid +",ecompany="+ecompany+"]";
	}
	
	

}
