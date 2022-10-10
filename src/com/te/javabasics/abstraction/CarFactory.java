package com.te.javabasics.abstraction;

import java.util.Scanner;

public class CarFactory {
	static Car getCar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the car name");
		String carName = sc.next();
		if (carName.equalsIgnoreCase("audi"))
			return new Audi();
		else if (carName.equalsIgnoreCase("bmw"))
			return new BMW();
		else if (carName.equalsIgnoreCase("benz"))
			return new Benz();
		return null;

	}

}
