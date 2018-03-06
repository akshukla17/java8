package com.core.pojo;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int age;
	private double salary;
	public Employee() {
		
	}
	public Employee(int id,String name,int age,double salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	// use comparable to sort based on id
	@Override
	public int compareTo(Employee e) {
		//decending order of sorting
		return -(this.id - e.id);
	}

	//using comparator for sort Employee based on salary
	public static Comparator<Employee> salaryComparator=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o1.salary-o2.salary);
		}
		
	};
	
	//sort Employee based on the age
	
	public static Comparator<Employee> ageComparator=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.age-o2.age;
		}
		
	};
	//sort based by name
	
	public static Comparator<Employee> byIdAndNameComparator=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			int flag= o1.id-o2.id;
			if(flag==0) flag=o1.name.compareTo(o2.name);
			return flag;
		}
	};
	
	@Override
	public String toString() {
		return "[id= " +this.id+" ,name= "+this.name+" ,age= "+age+" salary= "+salary+"]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
