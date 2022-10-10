package com.te.javabasics.common;

public class AccessSpecifierDemo {

//modified code changes

	public void firstMethod() {
		System.out.println("public  method");
	}

	void secondMethod() {
		System.out.println("default method");
	}

	private void privateMethod() {
		System.out.println("private method");

	}

	protected void protectedMethod() {
		System.out.println("protected method");

	}

	public static void main(String[] args) {
		AccessSpecifierDemo accessSpecifierDemo = new AccessSpecifierDemo();
		accessSpecifierDemo.firstMethod();
		accessSpecifierDemo.secondMethod();
		accessSpecifierDemo.privateMethod();
		accessSpecifierDemo.protectedMethod();
	}
}
