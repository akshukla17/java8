package com.logic;

public class StringReverse {

	public static void main(String[] args) {

		String str="My name is Ajay";
		System.out.println("Original String : "+str);
		usingLoop(str.toCharArray());
		String strRecurion= usingRecursion(str);
		System.out.println("String reverse using recorsion : "+strRecurion);
		
	}

	private static String usingRecursion(String str) {

		if (str.length()<2) {
				return str;
		}
		return usingRecursion(str.substring(1))+str.charAt(0);
	}

	private static void usingLoop(char[] charArray) {
		StringBuffer strB=new StringBuffer();
		for(int i=charArray.length-1;i>=0;i--) {
			strB.append(charArray[i]);
		}
		System.out.println(" String reverse using loop :"+strB.toString());
		
	}

}
