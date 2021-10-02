package com.jeevan.strings;

public class DivideSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "abcdefghijkl";
		int length = string1.length();
		int n =3;
		if(length%n!=0) {
			System.out.println("String cannot be divided into "+n+" parts");
		}
		else {
		String[] equalParts = new String[n];
		int parts = length/n;
		int temp =0;
		for(int i=0;i<length;i=i+parts) {
			String part = string1.substring(i,i+parts);
			equalParts[temp] = part;
			temp++;
		}
		for(int j=0;j<n;j++) {
			System.out.println(equalParts[j]);
		}
		}
	}

}
