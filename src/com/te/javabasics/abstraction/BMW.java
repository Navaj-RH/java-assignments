package com.te.javabasics.abstraction;

public class BMW implements Car {

	@Override
	public void break1() {
		System.out.println("BMW is german brand");
	}

	@Override
	public void accelerator() {
		System.out.println("Bmw is accelarating");
	}

	@Override
	public void gear() {
		System.out.println("BMW changes the gear");
	}

}
