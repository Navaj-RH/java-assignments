package com.te.javabasics.abstraction;

public class Audi implements Car{

	@Override
	public void break1() {
		System.out.println("Audi is racing car");
	}

	@Override
	public void accelerator() {
		System.out.println("Audi 8 has accelarator");
	}

	@Override
	public void gear() {
		System.out.println("Audi changes the gear");
	}
	
	@Override
	public void gps()
	{
		System.out.println("Audi using GPS");
	}

}
