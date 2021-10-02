package com.jeevan.strings;

public class RotationS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdef";
		String s2 = "defabc";
		s1 = s1 + s1;
		boolean flag = false;
		if(s1.contains(s2)) {
			flag = true;
			}
		if(flag) {
		System.out.println("s2 string is rotation of s1");
		}
		else
		{
			System.out.println("s2 string is not rotation of s1");
		}
	}

}
