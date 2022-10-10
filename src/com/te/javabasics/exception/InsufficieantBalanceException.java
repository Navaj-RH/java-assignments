package com.te.javabasics.exception;

public class InsufficieantBalanceException extends RuntimeException {

	String msg;

	public InsufficieantBalanceException(String msg) {
//		super(string);//can be called by super
		this.msg = msg;
	}// we can get message by overriding getMessage method

	@Override
	public String getMessage() {
		return this.msg;
	}

}
