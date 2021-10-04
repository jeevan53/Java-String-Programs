package com.jeevan.strings;

import java.util.ArrayList;

public class FrequencyCharS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abbcccddddEEEEedd";
		str1 =str1.toLowerCase();
		str1=str1.replaceAll("[^a-zA-Z]","");
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<str1.length();i++) {
			list.add(str1.charAt(i));
		}
		System.out.println(list);
		int count =0;
		int Max = 0;
		int Min = 0;
		int maxPosition = 0;
		int minPosition = 0;
		ArrayList<Integer> freq = new ArrayList<Integer>();
		for(int i = 0;i<list.size();i++) {
			count = 1;
			Max = count;
			Min = count;
			for(int j = i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
				count++;
				//setting empty ' ' to avoid repeating character
				list.set(j,' ');
				}
				}
			freq.add(count);
			if(count>Max) {
				maxPosition = i;
				Max = count;
			}
			else if(count<Min) {
				minPosition = i;
				Min = count;
			}
		}
		System.out.println("Maximum Occurence : "+list.get(maxPosition));
		System.out.println("Minimum Occurence : "+list.get(minPosition));
		for(int i=0;i<freq.size();i++) {
			if(list.get(i)!=' ') {
			System.out.println(list.get(i)+" "+freq.get(i));
			}}
	}
	

}
