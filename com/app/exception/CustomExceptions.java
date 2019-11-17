package com.app.exception;

import java.util.Scanner;

public class CustomExceptions {

	public static void main(String[] args) throws AgeIsNegative {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		sc.close();
		try {
		if(age< 0) {
			throw new AgeIsNegative("age can't be less than 0");
		}else {
			System.out.println("Entered age: "+ age);
		}}
		catch(Exception e) {
//			e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}
	}
}

class AgeIsNegative extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String errorMessage;
	
	public AgeIsNegative(String msg) {
		super(msg);
		this.errorMessage = msg;
	}
	
}