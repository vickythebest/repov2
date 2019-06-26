package com.crack.coding.interview.arrays;

public class StringFrequencyInArray {

	public String compressBad(String str) {
		String mystr = "";
		char last = str.charAt(0);
		int count=1;
		for (int i=0;i <str.length();i++) {
			if(str.charAt(i) < str.charAt(i+1)) {
				count ++;
				mystr += str.charAt(i)+count;
			}
			else{  // Insert char count and update last char
				mystr += last + " " + count;
			}
		}
		
		return mystr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
