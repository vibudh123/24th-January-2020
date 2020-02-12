package com.ibm.eis.dao;
import java.util.List;

import com.ibm.eis.bean.Employee;

public interface daoInterface {
	
	//void findInsurance(Employee employee);
	void storeIntoList(Employee employee);
	List<Employee> displayEmployee();
}
