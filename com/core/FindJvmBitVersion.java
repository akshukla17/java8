package com.core;

//Find which JVM bit size we are using corrently
public class FindJvmBitVersion {
	FindJvmBitVersion classVersion=new FindJvmBitVersion();
	public static void main(String[] args) {
		System.out.println("JVM bit version "+System.getProperty("sun.arch.data.model"));
		
		System.out.println("It'll return the OS version");
		System.out.println("OS version : "+ System.getProperty("os.arch"));
		
		
	}

}
