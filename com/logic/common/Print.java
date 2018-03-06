package com.logic.common;

import java.util.Map;


public class Print {
	
	public  void printArr(String type, int[] arr) {
		System.out.println(type);
		for(int i=0;i<arr.length;i++) {
			String next= i<arr.length-1? ", ":"";
			System.out.print(arr[i]+ next);
		}
		System.out.println();
	}

	public  void printArr(String type, String[] arr) {
		System.out.println(type);
		for(int i=0;i<arr.length;i++) {
			String next= i<arr.length-1? ", ":"";
			System.out.print(arr[i]+next);
		}
		System.out.println();
	}
	
	public void printMap(Map<String, Integer> map){

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("[ Key : " + entry.getKey() + " Value : "
				+ entry.getValue()+" ]");
		}

	  }

}
