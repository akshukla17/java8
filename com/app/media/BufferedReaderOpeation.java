package com.app.media;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderOpeation {

	public static void main(String[] args) {
		String path="/home/raghav/Desktop/bufferReader.txt";
		try {
			FileReader fr=new FileReader(new File(path));

			// true is use for appending data into the file
			FileWriter fw=new FileWriter(new File(path),true);  
			String data="File will create new text file at given location \n";
			fw.append(data);
			fw.close();
			int c;
			while((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
