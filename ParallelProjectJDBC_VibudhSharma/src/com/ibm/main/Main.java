package com.ibm.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.ibm.bean.Customer;
import com.ibm.bean.Transaction;
import com.ibm.service.ServiceClass;

public class Main {
	public static ServiceClass serviceClass= new ServiceClass();
	public static boolean flag=true;
public static int userIntInput() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				int intInput = sc.nextInt();
				return intInput;
			}
			catch (Exception e) {
				System.out.println("\nPlease enter an integer input...\n");
				sc.nextLine();
			}
		}
	}
	
	
	
	public static String userStrInput() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String strInput = sc.next();
		sc.nextLine();
		return strInput;
	}
	public static void main(String[] args) {
		
		Customer cust= new Customer();
		Transaction trans = new Transaction();
		//Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1. Login to Account Number \n2. Create Account");
		
		int a = userIntInput();
		
		switch(a) {
		case 1:
			System.out.println("Enter account number:");
			int ac = userIntInput();
			System.out.println("What do you want:\n1. View Balance\n2. Fund Transfer \n3. Print Transactions\n4. Deposit Money\n5. Withdraw Money");
			int in = userIntInput();
			switch(in) {
			case 1:
				System.out.println(serviceClass.retrieveBal());
				if(serviceClass.retrieveBal()<100) {
					System.out.println("Balance very low!!!");
				}
				break;
			case 2:
				
				System.out.println("Enter the acc number you want to enter amount:");
				int acc1 = userIntInput();
				
				System.out.println("Enter the amount to be sent:");
				int pas = userIntInput();
				serviceClass.fundTrans(acc1, pas);
				break;
			case 3:
				viewTransactions();
				break;
			case 4:
				System.out.println("Enter the amount to be added:");
				int dep = userIntInput();
				serviceClass.AddMoney(dep);
				break;
			case 5:
				System.out.println("Enter the amount to be deducted:");
				int dep1 = userIntInput();
				serviceClass.DeductMoney(dep1);
				break;
			default:
				System.out.println("Invalid Input!!");
			}
		case 2:
			System.out.println("Enter name:");
			String name = userStrInput();
			cust.setName(name);
			System.out.println("Enter age:");
			int age = userIntInput();
			cust.setAge(age);
			System.out.println("Enter Balance:");
			int bal = userIntInput();
			cust.setBalance(bal);
			trans.setBalance(bal);
			serviceClass.createAccount(cust);
			
			break;
		case 3:
			System.out.println("Exit");
			flag =false;
		default:
			System.out.println("InCorrect Input!!");
		}
		
		}
		
		
		
			// TODO: handle exception
		}



	private static void viewTransactions() {
			ArrayList<Integer> transactions = serviceClass.viewTransactions();
			int len = transactions.size();
			int count = 0;
			while(count<len) {
				
				System.out.println("\n[Account number: "+ transactions.get(count) + 
						"  ||  Previous Balance: "+ transactions.get(++count) +
						"  ||  Updated Balance: "+ transactions.get(++count) + 
						"  ||  Transaction Amount: "+ transactions.get(++count));
				System.out.println("------------------------------------------------------------------"
							+ "---------------------------------------------------------------------------");
				count++;
				
			}
		}
	}


