package com.ibm.jdbc.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeData {
	Connection dbCon;
	PreparedStatement pstmt;
	static Scanner sc = new Scanner(System.in);
	public EmployeeData() {
		try {
			dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibmtraining?serverTimezone=IST", "root", "");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		EmployeeData data= new EmployeeData();
		System.out.println("Enter what you want to do :\n1. Add name \n2. Display\n3. Update Username\n4. Delete\n");
		int n = sc.nextInt();
		switch(n){
		case 1:
			data.add();
			break;
		case 2:
			data.display();
			break;
			
		case 3:
			data.updateData();
			break;
		case 4:
			data.delete();
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
	
	public void display() {
		String fetchQry = "select * from employee";
		try {
			pstmt = dbCon.prepareStatement(fetchQry);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("name: "+ rs.getString("emp_name")+ " id: "+ rs.getInt("emp_id")+" salary: "+ rs.getInt("emp_salary")
						+ " Designation: " + rs.getString("emp_designation"));
			}
		}catch(Exception e){
			System.out.println(e);
		}
		try {
			dbCon.close();
		} catch (SQLException e) {
			System.out.println("Issues while closing the connection: "+e.getMessage());
		}
	}
	public void updateData() {
		System.out.println("Enter the id of person you want to change name for: ");
		int a = sc.nextInt();
		System.out.println("Enter the new name: ");
		String str= sc.next();
		String updateQry = "update employee set emp_name = ? where emp_id = ?";
		try {
			pstmt = dbCon.prepareStatement(updateQry);
			pstmt.setString(1, str);
			pstmt.setInt(2,a);

			if(pstmt.executeUpdate()>0) {
				System.out.println("done successfully");
			}
			else {
				System.out.println("Failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void delete() {
		System.out.println("Enter the id of person you want to delete: ");
		int a = sc.nextInt();
		
		String delQry = "delete from employee where emp_id=?";
		try {
			pstmt = dbCon.prepareStatement(delQry);
			pstmt.setInt(1,a);
			if(pstmt.executeUpdate()>0) {
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("Failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void add() {
		
		System.out.println("Enter the name: ");
		String na= sc.next();
		System.out.println("Enter the salary of person: ");
		int c = sc.nextInt();
		System.out.println("Enter the designation: ");
		String de= sc.next();
		
		String insertQry = "insert into employee (emp_name,emp_designation,emp_salary) values(?,?,?)";
		try {
			pstmt = dbCon.prepareStatement(insertQry);
			pstmt.setString(1, na);
			pstmt.setInt(3,c);
			pstmt.setString(2,de);

			if(pstmt.executeUpdate()>0) {
				System.out.println("done successfully");
			}
			else {
				System.out.println("Failed");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
