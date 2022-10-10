package com.te.javabasics.exception;

import java.util.Scanner;

public class BankAccount {
	double balance;

	public BankAccount(double balance) {

		this.balance = balance;
	}

	public void withdraw(double nextDouble) {
		if (nextDouble <= balance) {
			this.balance = this.balance - nextDouble;
			System.out.println("collect your amount");
			System.out.println("your balance is :" + this.balance);
		} else {

			throw new InsufficieantBalanceException("Insufficient balance");
		}
	}
}
