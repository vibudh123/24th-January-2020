package com.ibm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ibm.bean.Customer;




public class daoClass {
	
	Connection dbCon;
	PreparedStatement pstmt;
	PreparedStatement pstmt1;

	ArrayList<Integer> list = new ArrayList<>();

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	public daoClass() {
		 
		try {
			dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/parallelproject?serverTimezone=IST", "root", "");
		} catch (SQLException e) {
			System.out.println("Some issues while connecting : " + e.getMessage());
		}
	}
	
//	public void fundTrans(int ac, int ac1, int first,int second,int pas) {
//		String updateQry2 = "update customer set userBalance = ? where userAccount = ?";
//		String updateQry3 = "update transaction set userBal = ? ,prevBal=? ,moneyMoved=? where userAcc = ?";
//		try {
////			int diff=money-prev;
////		
//			pstmt = dbCon.prepareStatement(updateQry2);
//			pstmt1=dbCon.prepareStatement(updateQry3);
//			pstmt.setInt(1,first);
//			pstmt.setInt(2,ac);
//			pstmt.setInt(1,second);
//			pstmt.setInt(2,ac1);
////			pstmt1.setInt(1,money);
//////			pstmt1.setInt(2,prev);
////			pstmt1.setInt(3,diff);
////			pstmt1.setInt(4,ac);
//			
//			if(pstmt.executeUpdate()>0 && pstmt1.executeUpdate()>0) {
//				System.out.println("Done successfully");
//			}
//			else {
//				System.out.println("Failed");
//			}
//		} catch (SQLException e) {
//	
//			System.out.println("Error Caught here:"+ e.getMessage());
//		}
//	}
	public void createAccount(Customer cust) {
		String insertQry = "insert into customer (userName,userAge,userBalance) values(?,?,?)";
		String insertQry1 = "insert into transaction (updatedBal) values(?)";

		try {
			pstmt = dbCon.prepareStatement(insertQry);

			pstmt1 = dbCon.prepareStatement(insertQry1);
			pstmt.setString(1, cust.getName());
			pstmt.setInt(2,cust.getAge());
			pstmt.setInt(3,cust.getBalance());
			pstmt1.setInt(1,cust.getBalance());
			
			if(pstmt.executeUpdate()>0 && pstmt1.executeUpdate()>0) {
				System.out.println("Added successfully");
			}
			else {
				System.out.println("Failed");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	 public ArrayList<Integer> viewTransactions(int acc) {
			
			String fetchQry = "select * from userTransactions where userPhoneNumber = ?";
			
			try {
				
				pstmt = dbCon.prepareStatement(fetchQry);
				pstmt.setInt(1, acc);
				
				ResultSet rs = pstmt.executeQuery();
			
				while(rs.next()) {
					list.add(rs.getInt("userAcc"));
					list.add(rs.getInt("userPrev"));
					list.add(rs.getInt("userBal"));
					list.add(rs.getInt("userMoney"));
				}
			} catch(Exception e){
				System.out.println(e);
			}
			return list;
		}
	 
	public int retrieveBal(int acc) {
		String fetchQry = "select userBalance from customer where userAccount=?";
		try {
			pstmt = dbCon.prepareStatement(fetchQry);
			pstmt.setInt(1, acc);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				 return rs.getInt("userBalance");
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		try {
			dbCon.close();
		} catch (SQLException e) {
			System.out.println("Issues while closing the connection: "+e.getMessage());
		}
		return 0;
	}
	public void AddMoney(int acc,int prev,int money) {
		String updateQry = "update customer set userBalance = ? where userAccount = ?";
		String updateQry1 = "update transaction set userBal = ? ,prevBal=? ,moneyMoved=? where userAcc = ?";
		try {
			int diff=money-prev;
		
			pstmt = dbCon.prepareStatement(updateQry);
			pstmt1=dbCon.prepareStatement(updateQry1);
			pstmt.setInt(1,money);
			pstmt.setInt(2,acc);
			pstmt1.setInt(1,money);
			pstmt1.setInt(2,prev);
			pstmt1.setInt(3,diff);
			pstmt1.setInt(4,acc);
			
			if(pstmt.executeUpdate()>0 && pstmt1.executeUpdate()>0) {
				System.out.println("Done successfully");
			}
			else {
				System.out.println("Failed");
			}
		} catch (SQLException e) {
	
			System.out.println("Error Caught here:"+ e.getMessage());
		}
	}
	public void DeductMoney(int acc,int prev,int money) {
		String updateQry = "update customer set userBalance = ? where userAccount = ?";
		String updateQry1 = "update transaction set userBal = ? ,prevBal=? ,moneyMoved=? where userAcc = ?";
		try {
			int diff=money-prev;
		
			pstmt = dbCon.prepareStatement(updateQry);
			pstmt1=dbCon.prepareStatement(updateQry1);
			pstmt.setInt(1,money);
			pstmt.setInt(2,acc);
			pstmt1.setInt(1,money);
			pstmt1.setInt(2,prev);
			pstmt1.setInt(3,diff);
			pstmt1.setInt(4,acc);
			
			if(pstmt.executeUpdate()>0 && pstmt1.executeUpdate()>0) {
				System.out.println("Done successfully");
			}
			else {
				System.out.println("Failed");
			}
		} catch (SQLException e) {
	
			System.out.println("Error Caught here:"+ e.getMessage());
		}
	}
//	void updateTransaction(Transaction transaction);
//	void deposit(int money);
//	void withdraw(int bal);
//	void viewBalance(int bal);


	
	

}
