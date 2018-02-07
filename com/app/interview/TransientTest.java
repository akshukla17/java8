package com.app.leet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class TransientTest {

	public static void main(String[] args) {
		Student s1=new Student(101, "Ajay", new Date(),30);
		
		//writing into file
		try {
			FileOutputStream f=new FileOutputStream("F:\\sts-ws\\logic\\src\\com\\app\\leet\\f.txt");
			ObjectOutputStream out=new ObjectOutputStream(f);
			out.writeObject(s1);
			System.out.println("Insertation success");
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//print object data from file
		FileInputStream file;
		try {
			file = new FileInputStream("F:\\sts-ws\\logic\\src\\com\\app\\leet\\f.txt");
			ObjectInputStream in=new ObjectInputStream(file);
			
			Student ss=(Student) in.readObject();
			in.close();
			System.out.println("Student : "+ss);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	transient int age;
	Date dob;
	
	public Student(int id, String name, Date dob, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.age=age;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + "age="+age +"]";
	}
	
}
