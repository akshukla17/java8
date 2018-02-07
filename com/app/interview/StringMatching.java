package com.app.interview;

public class StringMatching {

	public static void main(String[] args) {

		String s="world hello";
		String a="hello";
		System.out.println(s.indexOf(a)!=-1? true:false);
		System.out.println(s.contains(a));
		s="BAAravarAAB";
		int l=s.length();
		//checking palendrome
		boolean isPalen=false;
		for(int i=0;i<l/2;i++) {
			if(!(s.charAt(i)==s.charAt(l-1-i))){
				isPalen=false;
				break;
			}else {
				isPalen=true;
			}
		}
		if(isPalen) {
			System.out.println(s+" is a palendrome");
		}else {
			System.out.println(s+" is not a palendrome");
		}
		
	}

}
