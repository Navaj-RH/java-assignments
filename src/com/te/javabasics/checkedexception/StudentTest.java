package com.te.javabasics.checkedexception;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		StudentAge studentAge = new StudentAge(21);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student age");
		try {
			studentAge.checkAge(sc.nextInt());
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}
}
