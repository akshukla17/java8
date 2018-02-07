package com.app.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImportantConversion {

	public static void main(String[] args) {
		int[] a= {1,3,25,43,223,3};
		Integer[] wrapper=Arrays.stream(a).boxed().toArray(Integer[]::new);
		List<Integer> ls=Arrays.stream(a).boxed().collect(Collectors.toList());
	}

}
