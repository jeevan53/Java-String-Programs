package com.jeevan.strings;

public class CountNS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Hello Jeevan";
		String word2 = "He said, 'Where are you from?' I heard it.";
		int count = 0;
		//System.out.println(word.charAt(0));
		for(int i = 0;i<word.length();i++) {
			if(word.charAt(i)!=' ') {
				count = count + 1;
			}
		}
		System.out.println("Number of characters in string word : "+count);
		
		//punctuation marks (!, . , ' , - , " , ? , ; ).
		int count2 = 0;
		//System.out.println(word.length());
		//System.out.println(word2.length());
		for(int i = 0;i<word2.length();i++) {
			if(word2.charAt(i)=='!'||word2.charAt(i)=='.'||word2.charAt(i)==','||word2.charAt(i)=='-'
					||word2.charAt(i)==';'||word2.charAt(i)==':'||word2.charAt(i)=='?'
					||word2.charAt(i)=='\''||word2.charAt(i)=='\"') {
				count2 = count2 + 1;
			}	
		}
		System.out.println("Number of punctuations in string word2 : "+count2);
		//Vowels = a,e,i,o,u
		//Consonants = other than vowels (characters)
		int vCount = 0;
		int cCount = 0;
		//lower case to remove upper case letters in word2
		word2 = word2.toLowerCase();
		//System.out.println(word2);
		for(int j =0;j<word2.length();j++) {
			if(word2.charAt(j)=='a'||word2.charAt(j)=='e'||word2.charAt(j)=='i'||
					word2.charAt(j)=='o'||word2.charAt(j)=='u') {
				vCount++;
			}
			else if(word2.charAt(j)>='a'&&word2.charAt(j)<='z'){
				cCount++;
			}	
		}
		System.out.println("Number of Vowels in string word2 : "+vCount);
		System.out.println("Number of Consonants in string word2 : "+cCount);
		
		word2 = word2.replaceAll("\s+","-");
		System.out.println("String without white spaces for word2 : "+word2);
}
}