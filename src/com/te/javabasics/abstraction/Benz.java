package com.te.javabasics.abstraction;

public class Benz implements Car {

	@Override
	public void break1() {
		System.out.println("Benz has its brake");

	}

	@Override
	public void accelerator() {
		System.out.println("Benz is accelarating");

	}

	@Override
	public void gear() {
		System.out.println("Benz changes the gear");
	}

	@Override
	public void gps() {
		System.out.println("Benz using GPS");
	}

}
