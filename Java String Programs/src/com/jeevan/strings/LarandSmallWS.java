package com.jeevan.strings;

public class LarandSmallWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Java Program to find the largest and smallest word in a string";
		String[] words = string.split(" ");
		String largestWord = "";
		String smallestWord = "";
		int largest = 0;
		int smallest = 1;
		for(int i=0;i<words.length;i++) {

		//	System.out.println(words[i]+" "+words[i].length());
			if(largest<words[i].length()) {
			 largestWord = words[i]; 
			 largest =words[i].length(); 
			}
			if(smallest>=words[i].length()) {
				 smallestWord = words[i]; 
				 smallest =words[i].length(); 
				}
		}
		System.out.println("Largest word is : "+largestWord+" with length "+largestWord.length());
		System.out.println("Smallest word is : "+smallestWord+" with length "+smallestWord.length());
		
	}

}
