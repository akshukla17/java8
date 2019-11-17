package com.app.enums;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map.Entry;

public class EnumLevel {

	public static void main(String[] args) {
		
		Level[] arr = Level.values();
//		for( Level l: arr){
//			System.out.println(l);
//		}
		//enum set
		EnumSet<Level> enumSet = EnumSet.of(Level.HIGH, Level.MEDIUM);
		//enum map
		
		EnumMap<Level, String> enumMap = new EnumMap<Level, String>(Level.class);
		enumMap.put(Level.LOW, "10");
//		enumMap.put(Level.NEW, "10");
		for(Entry<Level, String> l:enumMap.entrySet()) {
			System.out.println(l);
		}
	}
}
