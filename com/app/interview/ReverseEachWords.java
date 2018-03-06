package com.app.interview;

public class ReverseEachWords{
	// reverse the given string.
	// this is javatpoint >>  siht si tnioptavaj
	public static void main(String []args){
		StringBuffer sb=null;
		StringBuffer sbn=new StringBuffer();
		/* 
		1 ways of iteration
		
		for(int i=0;i<args.length;i++){
			sb=new StringBuffer();
			sb.append(args[i]);
			sbn.append(sb.reverse()+" ");
			sb=null;
		}*/
		
		// using foreach iterator
		String given="This is ajAY";
		String []words =given.split("\\s");
		for(String word: words){
			sb=new StringBuffer();
			sbn.append(sb.append(word).reverse()+" ");
			sb=null;
		}
		System.out.println(sbn);
	}
}