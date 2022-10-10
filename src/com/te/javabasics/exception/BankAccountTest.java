package com.te.javabasics.exception;

import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount(10000.00);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		try {
			bank.withdraw(sc.nextDouble());
		} catch (InsufficieantBalanceException e) {
			System.out.println(e.getMessage());
		}

	}  
}
