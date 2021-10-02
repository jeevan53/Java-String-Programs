package com.jeevan.strings;

import java.util.Arrays;

public class AnagramS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "Brag";
		String word2 = "Grab ";
		
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		
		//string to char array to sort (to compare irrespective of position)
				char[] string1 = word1.toCharArray();
				char[] string2 = word2.toCharArray();
				
				Arrays.sort(string1);
				Arrays.sort(string2);
				
				//System.out.println(string1);
				
		if(word1.length()!=word2.length()) {
			System.out.println("Two strings are not same length");
		}
		
		else if(Arrays.equals(string1,string2)) {
			System.out.println("the two strings are Anagram");
		}
		else {
			System.out.println("the two strings are Not Anagram");
		}
	
	}

}
