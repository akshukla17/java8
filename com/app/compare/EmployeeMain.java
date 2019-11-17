package com.app.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"sohan","DEVELOPER",20000f));
		list.add(new Employee(3,"ram","MANAGER",90000f));
		list.add(new Employee(4,"mighuel","DEVELOPER",30000f));
		list.add(new Employee(5,"abhi","HR",30000f));
		list.add(new Employee(2,"sara","OPERATIONS",70000f));
		
		System.out.println("***************sort based on employee name****DESC order************");
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return  -(e1.name.compareTo(e2.name));
			}
		});
		for(Employee e: list) {
			System.out.println(e);
		}
		
		System.out.println("*********sort by salary***********");
		
		Collections.sort(list, new Comparator<Employee>() {
			
			public int compare(Employee e1, Employee e2) {
				return (int)(e1.getSalary() - e2.getSalary());
			}
		});
		for(Employee e: list) {
			System.out.println(e);
		}
		
		System.out.println("**********sort by dept and id***********");
		Collections.sort(list, new Comparator<Employee>() {
			
			public int compare(Employee e1, Employee e2) {
				if(!e1.getDept().equals(e2.getDept())) {
					return e1.getDept().compareToIgnoreCase(e2.getDept());
				}else {
					return e1.getId() - e2.getId();
				}
			}
		});
		for(Employee e: list) {
			System.out.println(e);
		}
	}
}
