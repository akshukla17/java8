package com.app.interview;

public class FirstNonRepetativeCharacter{
	//find first non repeatative character in given string
	
	public static void main(String []args){
		String s="stress";
		System.out.println(s.substring(1,s.length()));
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			String sub=s.substring(i+1,s.length());
			if(!sub.contains(String.valueOf(c))){
				System.out.println("First non repeatative char: "+c);
				break;
			}
		}
	}

}