package com.jeevan.strings;

public class SwapS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Jeevan";
		String s2 = "Kumar";
		String str = s1+s2;
		
		s2 = str.substring(0,s1.length());
		
		s1 = str.substring(s1.length(),str.length());
		
		System.out.println(s1+" "+s2);

	}

}
