package com.ibm.dao;

public interface daoInterface {
	void createAccount(String name,int age,int balance);
	void AddMoney(int money,int prev,int bal);
	public int retrieveBal(int acc);
	//void viewBalance(int bal);
	
	
}
