package com.ibm.eis.service;
import java.util.List;
import java.util.ArrayList;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.*;

public class EmployeeServiceClass implements EmployeeServiceInterface{
	daoClass da =new daoClass();
	
	public String assignDesignation(int salary) {
		if(salary>5000 && salary<20000) {
			return "System Associate";
		}
		if(salary>=20000 && salary<40000) {
			return "Programmer";
		}
		if(salary>=40000) {
			return "Manager";
		}
		else {
			return "Clerk";
		}
		
	}
	
	public String assignInsurance(int salary) {
		
		if(salary>5000 && salary<20000) {
			return "Scheme C";
		}
		if(salary>=20000 && salary<40000) {
			return "Scheme B";
		}
		if(salary>=40000) {
			return "Scheme A";
		}
		else {
			return "No Scheme";
		}
	}
	public void storeIntoList(Employee employee) {
		da.storeIntoList(employee);
	}
	
	public List<Employee> displayEmployee(){
		return da.displayEmployee();
	}
	
}
