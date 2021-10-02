package com.jeevan.strings;

public class ConvertStringS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Hello Jeevan";
		StringBuffer str1 = new StringBuffer(word);
		for(int i =0;i<word.length();i++) {
		if(Character.isLowerCase(str1.charAt(i))) {
			str1.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
		}
		else if(Character.isUpperCase(str1.charAt(i))) {
			str1.setCharAt(i,Character.toLowerCase(str1.charAt(i)));
		}
	}
		System.out.println("Changed String : "+str1);
	}

}
