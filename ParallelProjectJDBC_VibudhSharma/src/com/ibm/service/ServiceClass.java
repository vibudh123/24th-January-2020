package com.ibm.service;
import java.util.ArrayList;

import com.ibm.bean.Customer;
import com.ibm.dao.daoClass;
public class ServiceClass {
	
	daoClass dao = new daoClass();
	Customer cust = new Customer();
	public int currentUserAccount;
	public void createAccount(Customer cust) {
		currentUserAccount = cust.getAcc_no();
		dao.createAccount(cust);
	}
	
	public int retrieveBal() {
		return dao.retrieveBal(currentUserAccount);
	}
	public void AddMoney(int prev) {
		int upd=dao.retrieveBal(currentUserAccount);
		int newBal = upd+prev;
		dao.AddMoney(currentUserAccount,prev,newBal);
	}
	public void DeductMoney(int ded) {
		int prev1;
		int upd1=dao.retrieveBal(currentUserAccount);
		if((upd1-ded)<0) {
			System.out.println("Invalid Account Balance");
		}
		else {
			prev1 = upd1-ded;
			dao.DeductMoney(currentUserAccount,upd1,prev1);
		}
	}
	public void fundTrans(int ac1, int pas) {
		
		int up = dao.retrieveBal(currentUserAccount);
		int up1 = dao.retrieveBal(ac1);
		int nwBal1=up1+pas;
		int nwbal = up-pas;
		if((up-pas)<0) {
			System.out.println("Invalid account Balance");}
		else {
			
			dao.DeductMoney(currentUserAccount, up, nwbal);
			dao.AddMoney(currentUserAccount, up1, nwBal1);
		}
	}
	
	 public ArrayList<Integer> viewTransactions() {
			return dao.viewTransactions(currentUserAccount);
	}
	
}
