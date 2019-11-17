package com.app.string;
/**
 * calculate total number of characters in the String
 * @author Ajay
 *
 */
public class BasicStringCountQues {

	public static void main(String[] args) {
		//to count all charactors get length
		//OR unique count chars, store chars into Set and print length of set
		
		//calculate total number of vowels in String **************************
		/*
		 * Ans: create a set with a, e, i,o,u  
		 * 		and while interation of chars of string, check if set contains 'char'. if Y, increase count++;
		 * 		print count	
		 */
		String s = String.join("", "ajay"," test"," game"," f", " g", " vv"); // joining multiple strings 
		System.out.println(s);
	}
}
