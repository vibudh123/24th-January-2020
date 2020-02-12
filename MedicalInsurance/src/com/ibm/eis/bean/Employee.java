package com.ibm.eis.bean;

public class Employee {
	public int id;
	public String name;
	public int Salary;
	public String Designation;
	public String insuranceScheme;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	@Override
	public String toString() {
		return "Details: "+ id +" "+name +" "+Salary +" "+Designation +" "+insuranceScheme;
	}
	
}
