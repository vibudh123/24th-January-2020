package com.ibm.eis.dao;
import java.util.List;
import java.util.ArrayList;

import com.ibm.eis.bean.Employee;
public class daoClass implements daoInterface
{
	public List<Employee> employees =new ArrayList();
	
	public void storeIntoList(Employee employee) {
		employees.add(employee);
	}
	public List<Employee> displayEmployee(){
		return employees;
	}
	
}
