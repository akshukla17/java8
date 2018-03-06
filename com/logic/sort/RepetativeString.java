package com.logic.sort;

import java.util.HashMap;
import java.util.Map;

import com.logic.common.Print;

public class RepetativeString {
	public static void main(String[] args) {
		Print pr=new Print();
		String s="My name is ajay. my village is guddijor. Raghav is my son";
		String [] sa=s.split(" ");
		pr.printArr("string", sa);
		Map<String, Integer> map= null;
		for (String string : sa) {
			if(map==null) {
				map=new HashMap<String, Integer>();
				map.put(string, 1);
			}else {
				if(map.containsKey(string)) { 
				map.put(string, map.get(string)+1);
				}else {
				map.put(string, 1);
				}
			}
		}
		System.out.println(map);
		
	}

}
