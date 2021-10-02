package com.jeevan.strings;

import java.util.ArrayList;

public class SubStringS {
	//no of substrings in a string is equal to length*(length+1)/2
	public static void main(String[] args) {
		String string1 = "acbdfbdfacb";
		int length = string1.length();
		String[] sub = new String[length*(length+1)/2];
		int temp = 0;
		for(int i =0;i<length;i++) {
			for(int j = i;j<length;j++) {
				String parts = string1.substring(i,j+1);
				sub[temp] = parts;
				temp++;
			}
		}
		for(int j =0;j<sub.length;j++) {
			System.out.println(sub[j]);
		}
		ArrayList<String> rep = new ArrayList<String>();
		for(int i=0;i<sub.length;i++) {
			for(int j =i+1;j<sub.length;j++) {
				if(sub[i].equals(sub[j])) {
					rep.add(sub[i]);
				}
			}
		}
		int largestString = 0;
		System.out.println(rep);
		for(int k =0;k<rep.size();k++) {
			if(rep.get(k).length()>largestString) {
				largestString = rep.get(k).length();
			}		
		}
		for(int k =0;k<rep.size();k++) {
		if(rep.get(k).length()==largestString) {
			System.out.println("the longest repeating sequence in a string : "+rep.get(k));
		}
		}
	}
}
