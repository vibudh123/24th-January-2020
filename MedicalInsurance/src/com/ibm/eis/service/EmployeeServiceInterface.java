package com.ibm.eis.service;
import java.util.List;

import com.ibm.eis.bean.*;

public interface EmployeeServiceInterface {
	String assignDesignation(int salary);
	String assignInsurance(int salary);
	void storeIntoList(Employee employee);
	
	List<Employee> displayEmployee();
}
