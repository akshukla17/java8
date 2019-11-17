package com.app.collection;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import com.app.collection.map.MapHelper1;
import com.app.collection.map.MapHelper2;
import com.app.collection.map.MapHelper3;
import com.app.collection.map.MapHelper4;

public class SynAndCuncurrentMap {
	public static void main(String[] args) {
//		Map<String,Integer> map = new HashMap<>();
//		Map<String, Integer> syncMap = Collections.synchronizedMap(map);
		ConcurrentHashMap<String, Integer> conMap = new ConcurrentHashMap<>();
		MapHelper1 helper1 = new MapHelper1(conMap); //replace all 'conMap' with 'syncMap' to understand syncMap working flow
		MapHelper2 helper2 = new MapHelper2(conMap);
		MapHelper3 helper3 = new MapHelper3(conMap);
		MapHelper4 helper4 = new MapHelper4(conMap);
		
//		for(Entry<String, Integer> e: conMap.entrySet()) {
//			System.out.println(e);
//		}
		System.out.println("**********************");
		Iterator<String> itr = conMap.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+">>> ");
		}
	}

}
