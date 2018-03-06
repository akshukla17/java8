package com.app.compare;

import java.util.Comparator;
import java.util.TreeSet;

//sort string in reverse order
public class StringReverseComparator {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet(new MyStringReverseComparator());
		t.add("ramu");
		t.add("nisha");
		t.add("rakhi");
		t.add("vijay");
		t.add("amit");
		
		System.out.println(t);

	}
}

class MyStringReverseComparator implements Comparator{

	@Override
	public int compare(Object s1, Object s2) {
		String a=s1.toString();
		String b=s2.toString();
		return -(a.compareTo(b));
	}
	
}