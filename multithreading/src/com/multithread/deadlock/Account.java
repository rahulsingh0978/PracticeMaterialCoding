package com.multithread.deadlock;

public class Account {
	private int balance = 1000;
	public void deposite(int balance){
		this.balance+=balance;
	}
	public void withdraw(int balance){
		this.balance-=balance;
	}
	public int getBalance(){
		return balance;
	}
	public static void transfer(Account acc1 , Account acc2 ,int amount){
		acc1.withdraw(amount);
		acc2.deposite(amount);
	}
}
