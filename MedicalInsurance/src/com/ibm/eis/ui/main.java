package com.ibm.eis.ui;
import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.*;
import com.ibm.eis.service.*;


import java.util.*;


public class main {
	public static void main(String[] args) throws MyOwnException {
		Scanner sc = new Scanner(System.in);
		EmployeeServiceInterface emp = new EmployeeServiceClass();
		
		String name;
		int salary,id;
		try {
//		while(True) {
			System.out.println("Enter the name of the employee");
			name = sc.next();
			System.out.println("Enter the employee id");
			id=sc.nextInt();
			System.out.println("Enter the salary");
			salary=sc.nextInt();
//			System.out.println("Enter the designation");
//			String design=sc.next();
//			}
		
			Employee employee = new Employee();
			employee.setId((id));
			employee.setName(name);
			employee.setSalary(salary);
			employee.setDesignation(emp.assignDesignation(salary));
			employee.setInsuranceScheme(emp.assignInsurance(salary));
			emp.storeIntoList(employee);
		}
		
		catch (MyOwnException e) {
			System.out.println(e.getMessage());
		}
			
			System.out.println(emp.displayEmployee());
		
		
		
	}
}
class MyOwnException extends Exception{
	public MyOwnException(String s) {
		super(s);
	}
}
