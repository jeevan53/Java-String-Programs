package com.jeevan.strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MostRepeatedWordSF {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String line,word = "";
		int count = 0,mCount=0;
		ArrayList<String> words = new ArrayList<String>();
		
		//open file in read mode
		FileReader file = new FileReader("src/data.txt");
		BufferedReader br = new BufferedReader(file);
		
		//Reads each line
		while((line = br.readLine())!= null) {
			String string[] = line.toLowerCase().split("[,.\\s]+");
			//Adding aal words genereted to ArrayList words
			for(String s:string) {
			words.add(s);
		}
		}
		for(int i =0;i<words.size();i++) {
			count = 1;
			for(int j = i+1;j<words.size();j++) {
				if((words.get(i)).equals(words.get(j))) {
					count++;
				}
			}
			if(count>mCount) {
				mCount = count;
				word = words.get(i);
			}
		}
		System.out.println("Most Repeating word : "+word);
		System.out.println("Number of words : "+words.size());
		br.close();
	}

}
