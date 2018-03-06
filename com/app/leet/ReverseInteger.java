package com.app.leet;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*int num=12345544232;//sc.nextInt();
		sc.close();*/
		System.out.println(reverse(sc.nextInt()));
		
	}
	
	public static int reverse(int x)
	{
	    int result = 0;

	    while (x != 0)
	    {
	        int tail = x % 10;
	        int newResult = result * 10 + tail;
	        if ((newResult - tail) / 10 != result)
	        { return 0; }
	        result = newResult;
	        x = x / 10;
	    }

	    return result;
	}

}
