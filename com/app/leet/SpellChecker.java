package com.app.leet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SpellChecker {

	public static void main(String[] args) {

		File file = new File("F:\\sts-ws\\logic\\src\\com\\app\\leet\\data\\first.txt");
		File file2 = new File("F:\\sts-ws\\logic\\src\\com\\app\\leet\\data\\second.txt");
		try {
			Scanner sc = new Scanner(file);
			HashSet<String> dict = new HashSet<>();
			while (sc.hasNext())
				dict.add(sc.next());

			sc = new Scanner(file2);
			ArrayList<String> s=new ArrayList<>();
			int k = 0;
			while (sc.hasNext()) {
				String ss=sc.next();
				s.add(ss);
			}

			for (String string : s) {
				System.out.print(string+",");
				System.out.println();
			}
			System.out.println("Spel missing words ");
			for (int i = 0; i < s.size(); i++) {
				if ( s.get(i)!=null && !dict.contains(s.get(i) )) {
					System.out.println(s.get(i));
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
