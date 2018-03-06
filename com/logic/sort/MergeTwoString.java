package com.logic.sort;

public class MergeTwoString {

	public static void main(String[] args) {
		String s1="ragKKhavMMMhukla";
		String s2="shikha";
		System.out.println(s1 +" and "+s2);
		char[]first=s1.toCharArray();
		char[]sec=s2.toCharArray();
		char[]mix=new char[s1.length()+s2.length()];
		int i=0,j=0;
		int k=0;
		while(i<s1.length() && j<s2.length()) {
			mix[k++]=first[i++];
			mix[k++]=sec[j++];
		}
		while(i<s1.length()) {
			mix[k++]=first[i++];
		}
		while(j<s2.length()) {
			mix[k++]=sec[j++];
		}
		String str=String.valueOf(mix);
		System.out.println(" final string "+str);
	}
}
