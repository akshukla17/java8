package com.app.interview;

import java.util.List;
import java.util.ArrayList;
public class MaxBooks{
	/*
	
	*/
	public static void main(String []args){
		int amount=50;
		int books=0;
		int[]bundleQuantity={20,19};
		int []bundleCost={24,20};
		float min=Float.MIN_VALUE;
		
		for(int i=0;i<bundleCost.length;i++){
			float temp= (bundleQuantity[i]*1.0f)/bundleCost[i];
			if(min<temp){
				min=temp;
			}
		}
		//System.out.println(min);
		books = (int) Math.ceil(amount*min);
		//System.out.println(books);
		//return books;
		
	}
}