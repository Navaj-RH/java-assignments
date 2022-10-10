package com.te.javabasics.assignment;

import com.te.javabasics.common.AccessSpecifierDemo;

public class DemoObject extends AccessSpecifierDemo {

	public static void main(String[] args) {
		AccessSpecifierDemo accessSpecifierDemo = new AccessSpecifierDemo();
		accessSpecifierDemo.firstMethod();
		DemoObject demoObject = new DemoObject();
		demoObject.protectedMethod();// parent class protected method
		// accessSpecifierDemo.secondMethod();
		// accessSpecifierDemo.privateMethod();//private method cannot be accessed
		// outside the class
		// accessSpecifierDemo.protectedMethod();

	}
}
