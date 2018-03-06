package com.app.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


//destroy singleton design pattern 
public class PrivateClassTest {
	public static void main(String[] args) {
		A a=A.getInstance();
		A b=null;
		
		Constructor<?>[] cons=A.class.getConstructors();
		for (Constructor<?> constructor : cons) {
			constructor.setAccessible(false);
			try {
				b=(A) constructor.newInstance();
				break;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}

}

class A{
	
	private A() {};
	
	public static A getInstance() {  return new A();}
}
