package com.app.media;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BasicIoOpearion {

	public static void main(String[] args) throws IOException {
		
		String pathname = "/home/raghav/Desktop/test.txt";
		Scanner sc =new Scanner(System.in);
		String msg="wrting text into text.txt";//sc.nextLine();
		sc.close();
		
		/* BYTE stream
		 * 
		 * writing and reading file using byte stream (8 bit bytes)
		For this, we are using FileOutputStream and FileInputStream
		*/
		FileInputStream in=null;
		FileOutputStream out=null;
		//writing
		out=new FileOutputStream(new File(pathname));
		
		out.write(msg.getBytes());
		//reading file 
		in=new FileInputStream(new File(pathname));
		int c;
		System.out.println("reading from file");
		while((c=in.read())!=-1) {
			System.out.print((char)c);
		}
		in.close();
		
		// Character stream(support 16 bit bytes)
		/*
		 * This mode we read/write 2 byte at a single move.
		 * It internally use Byte streams
		 */
		System.out.println("\n********Using Character streams***********************");
		String textFile="/home/raghav/Desktop/demo.txt";
		FileReader reader=null;
		FileWriter writer=null;
		reader=new FileReader(new File(textFile));
		/*writer =new FileWriter(new File(textFile));
		writer.close();
		*/
		while((c=reader.read())!=-1) {
			System.out.print((char)c);
		}
		reader.close();
	}

}
