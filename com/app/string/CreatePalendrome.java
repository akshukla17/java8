package com.app.string;
/**
 * Create possible palendrome using given string 
 * 
 * @author Ajay
 */
import java.util.ArrayList;
import java.util.List;

public class CreatePalendrome {

	public static void main(String[] args) {
		String s ="tttxx";
		System.out.println(rearrangeMakePalen(s));
	}

	private static String rearrangeMakePalen(String s) {
			if(isPalen(s)) {
				return s;
			}
			char [] c= s.toCharArray();
			List<Integer> notPossible = new ArrayList<Integer>();
			int i=0,j=c.length-1;
			while(i<j) {
				if(c[i] ==c[j]) {
					i++;
					j--;
				}else {
					//find matching element of c[i] 
					int k =j-1;
					boolean match =false;
					for(; k> i;k--) {
						if(c[k] == c[i]) {
							swap(c, j,k);
							match=true;
							break;
						}
					}
					if(!match) {
						notPossible.add(i);
					}else {
						j--;
					}
					if(notPossible.size() >1) {
						return null;
					}
					i++;
				}
			}
			if(notPossible.size() <= 1) {
				if(notPossible.size() <= 0) {
					return String.copyValueOf(c);
				}else{
					int y= notPossible.get(0);
					for(; y<j;y++) {
						swap(c,y,y+1);
					}
//				c[y]=c[notPossible.get(0)];
					return String.copyValueOf(c);
					
				}
			}
		return null;
	}

	private static void swap(char[] c, int j, int k) {
		char t =c[j];
		c[j] = c[k];
		c[k]=t;
		
	}

	private static boolean isPalen(String s) {
		int i=0,j=s.length()-1;
		while(i< j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		return true;
	}
}
