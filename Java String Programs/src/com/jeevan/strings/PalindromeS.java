package com.jeevan.strings;

import java.util.Scanner;

public class PalindromeS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toLowerCase();
		boolean flag = true;
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				flag = false;
				break;
				}
		}
		if(flag) {
			System.out.println(str+" is a palindrome");
		}
		else {
			System.out.println(str+" is  not a palindrome");
		}
		sc.close();
	}

}
