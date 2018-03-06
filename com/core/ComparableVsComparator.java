package com.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.core.pojo.Employee;

public class ComparableVsComparator {

	public static void main(String[] args) {

		//int comparable
		List<Integer> arr= new ArrayList<Integer>();
		arr.add(1);
		arr.add(14);
		arr.add(42);
		arr.add(21);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println("sorted list "+arr);
		
		Employee e1=new Employee(10, "Vijay", 20, 56000.0);
		Employee e2=new Employee(1, "Rabesh", 30, 60000.0);
		Employee e3=new Employee(1, "Ramesh", 24, 51000.0);

		Employee[] empArr=new Employee[3];
		empArr[0]=e1;
		empArr[1]=e2;
		empArr[2]=e3;
		//If Employee class didn't implements comparable interface the below line will give error. 
		Arrays.sort(empArr);
		System.out.println("Decending sorting using comparator \n"+Arrays.toString(empArr));
		
		Arrays.sort(empArr,Employee.salaryComparator);
		System.out.println("Sort by salary \n"+Arrays.toString(empArr));
		
		Arrays.sort(empArr,Employee.byIdAndNameComparator);
		System.out.println("Sort by IdAndName \n"+Arrays.toString(empArr));
		
		Arrays.sort(empArr,Employee.ageComparator);
		System.out.println("Sort by Age \n"+Arrays.toString(empArr));
		
	}

}
