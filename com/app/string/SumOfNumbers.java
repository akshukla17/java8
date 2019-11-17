package com.app.string;
/**
 * https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string/0
 * Given a string str containing alphanumeric characters, 
 * calculate sum of all numbers present in the string.
 * Example:
		Input:
		4
		1abc23
		geeks4geeks
		1abc2x30yz67
		123abc
		
		Output:
		24
		4
		100
		123
 * @author Ajay
 *
 */
public class SumOfNumbers {

	public static void main(String[] args) {
		String s="1abc23";
		System.out.println(getInt(s));
	}
	
	private static int getInt(String s){
	    //1abc23
	    int res=0;
	    int tr=0;
	    boolean nc=false;
	    char [] cc = s.toCharArray();
	    
	    for(int i=0;i<cc.length;i++){
	        if(Character.isDigit(s.charAt(i))){
	            nc =true;
	            tr = tr*10+( s.charAt(i) -48);
	        }else{
	            nc=false;
	            if(tr >0){
	                res +=tr;
	                tr=0;
	            }
	        }
	    }
	    if(tr > 0){
	        res +=tr;
	       tr=0;
	    }
	    return res;
	}
}
