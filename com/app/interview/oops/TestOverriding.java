package com.app.interview.oops;

import java.lang.Exception;
class Animal{
	public void sleep() throws CustomException{
		System.out.println("animal sleep");
	}
}

class Dog extends Animal{
	public void sleep() throws CustomException{
		System.out.println("dog sleep");
		throw new CustomException("Throwing exception from Dog");
	}
}

public class TestOverriding{
	public static void main(String[]args){
		Animal a=new Dog();
		try{
			a.sleep();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

class CustomException extends Exception{
	public CustomException(String m){
		super(m);
	}
}