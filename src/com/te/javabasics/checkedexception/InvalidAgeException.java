package com.te.javabasics.checkedexception;

public class InvalidAgeException extends Exception {
	String msg;

//public InvalidAgeException(String msg2) {
//  super(msg2);
//}

	public InvalidAgeException(String msg2) {
		this.msg = msg2;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}
}
