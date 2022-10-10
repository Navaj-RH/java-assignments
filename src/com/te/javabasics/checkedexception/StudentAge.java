package com.te.javabasics.checkedexception;

public class StudentAge {
	int age;

	public StudentAge(int age) {

		this.age = age;
	}

	public void checkAge(int ag) throws InvalidAgeException {
		if (ag < this.age) {
			throw new InvalidAgeException("invalid age");
		} else {
			System.out.println("age is valid");
		}
	}
}
