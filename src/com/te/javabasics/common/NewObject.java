package com.te.javabasics.common;

public class NewObject {

	public static void main(String[] args) {

		AccessSpecifierDemo accessSpecifierDemo = new AccessSpecifierDemo();
		accessSpecifierDemo.firstMethod();
		accessSpecifierDemo.secondMethod();
		// accessSpecifierDemo.privateMethod();//private method cannot be accessed
		// outside the class
		accessSpecifierDemo.protectedMethod();

	}
}
