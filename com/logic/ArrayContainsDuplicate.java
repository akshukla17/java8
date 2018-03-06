package com.logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.logic.common.Print;

public class ArrayContainsDuplicate {
	static Print print=new Print();
	public static void main(String[] args) {
		String[] strArray= {"ajay","vijay","raghav","ramesh","raghav","shyam","vijay","ramesh","ramesh"};
		List<String> ls=Arrays.asList(strArray);
		print.printArr("Print Array", strArray);
		
		Set<String> strSet=new HashSet<String>();
		strSet.addAll(strSet);
		
		if(strSet.size()<strArray.length) {
			System.out.println("Given array has duplicate elements");
			findOccurances(strArray);
			System.out.println("find  ramesh frequency : "+Collections.frequency(ls, "ramesh"));
		}else {
			System.out.println("Given array has no duplicate elements");
		}
	}

	private static void findOccurances(String[] arr) {
		Map<String,Integer> map=new HashMap<>();

		for (String string : arr) {
			Integer count=map.get(string);
			map.put(string, count==null?1:count+1);
		}
		print.printMap(map);
		
		System.out.println("entry set "+map.entrySet());
		/*Map<String,Integer> sortedMap=new TreeMap<>(map);
		System.out.println("Sorted map ====");
		print.printMap(sortedMap);*/
	}

}
