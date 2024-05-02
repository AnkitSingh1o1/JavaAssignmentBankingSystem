package com.exception;

public class InvalidAccountException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	String message;
	
	//Constructor
	public InvalidAccountException(String message) {
		this.message = message;
	}
	
	//Getter
	public String getMessage() {
		return message;
	}
	

}
