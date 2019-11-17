package com.app.gfg;

import java.util.Scanner;

public class CountReactagles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- > 0){
		    int n = sc.nextInt(); // size of square
		    //total rectagles (n+1C 2) * (n+1 C 2) // including squares
		    
		    int tr = (fact(n+1) / (fact(2)*fact(n-1)) )* (fact(n+1) / (fact(2)*fact(n-1)) ); //(fact(n+1) / (fact(2)*fact(n-1)) );
		    System.out.println("tr ......."+tr);
		    int sq=0;
		    while(n >0){
		        sq += n*n;
		        n--;
		    }
		    System.out.println("sq...... "+sq);
		    System.out.println(tr - sq);
		}
		sc.close();
	}
	
	private static int fact(int n){
	    int r=1;
	    int o =n;
	    while(n >0){
	        r *= n;
	        n--;
	    }
//	    System.out.println(o+" >>> "+ r);
	    return r;
	}
}
