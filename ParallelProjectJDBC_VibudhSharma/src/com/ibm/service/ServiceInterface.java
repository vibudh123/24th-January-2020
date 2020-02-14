package com.ibm.service;


public interface ServiceInterface {
	public void createAccount(String name, int age,int balance);
	void AddMoney(int acc,int prev);
	public int retrieveBal(int acc);
}
