package com.jeevan.strings;

public class DuplicateWordS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Big black bug bit a big black dog";
		s1 = s1.toLowerCase();
		String[] words = s1.split(" ");
		int count = 0;
		System.out.println("Duplicate words in a given string : ");
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j = i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					//set to "0" to avoid printed visited word
					words[j] = "0";
				}
			}
			if(count>1&&words[i]!="0") {
				System.out.println(words[i]);
			}
		}}}
