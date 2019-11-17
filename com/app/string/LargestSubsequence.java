package com.app.string;

/**
 * Find the largest subsequence between two given strings
 * @author Ajay
 *
 */
public class LargestSubsequence {

	public static void main(String[] args) {
		String a="ABAZDC";//"aggtab";//"abba";//"aaaa";//
		String b ="BACBADSC";//"gxtxayb";//"abcaba";//"aa";//
		System.out.println(a+ "    " + b);
//		System.out.println(find(a.toCharArray(),b.toCharArray()));
		System.out.println(findSub(a, b));
	}

	private static String find(char []a, char []b) {
		
		int l = a.length;
		int m = b.length;
		int t[][] = new int [l+1][m+1];
		
		
		for(int i=1;i< a.length;i++) {
			
			for(int j=1;j< b.length;j++) {
				
				if(a[i-1] == b[j-1]) {
					t[i][j] = t[i-1][j-1] +1;
				}else {
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
		
		
		return null;
	}
	// O(n^3) complexity*********************************************
	private static String findSub(String a, String b) {
		String res="";
		String t ="";
		int start =0;
		int k=0;
		while(k < a.length()) {
			
			for(int i=k;i<a.length();) {
				
				for(int j=start;j<b.length();) {
					if(i >= a.length() || j >=b.length()) {
						break;
					}
					char aa = a.charAt(i);
					char bb = b.charAt(j);
					if(aa == bb) {
						t +=aa;
						i++;
						j++;
						start=i+1;
						
					}else {
						j++;
					}
				}
				i++;
				
			}
			if(res.length() < t.length()) {
				res = t;
			}
			k++;
			start=k;
			t="";
		}
		
		return res;
	}
}
