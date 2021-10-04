package com.jeevan.strings;

import java.util.ArrayList;

public class DuplicateS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Hello Jeevan";
		word = word.toLowerCase();
		ArrayList<Character> list = new ArrayList<>();
		for(int i =0;i<word.length();i++) {
			list.add(word.charAt(i));
		}
		int count = 0;
		System.out.println("Duplicate characters in a given string : ");
		for(int i=0;i<list.size();i++) {
			count = count+1;
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					count++;
					//Set string[j] to 0 to avoid printing visited character
					list.set(j,' ');
				}
			}
			if(count>1) {
				System.out.println(list.get(i));
			}
			count = 0;
			
		}
	}

}
