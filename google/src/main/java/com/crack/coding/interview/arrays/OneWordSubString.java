package com.crack.coding.interview.arrays;

/*
 * Assume you have a method isSubstring which check if one word is a substring of another.
 * Given two string, s1 and s2
 * Write code to check if s2 is a rotation of s1 using only one call to isSubstring (e.g "waterbottle" is a rotation of "erbottlewat")
 */
public class OneWordSubString {

	public boolean isRoation(String s1, String s2) {
		int len=s1.length();
		/* check that s1 and s2 are equal length and not empty*/
		if(len==s2.length() && len >0) {
			/* Concatenate s1 and s2 within new buffer */
			String s1s1 = s1 + s1;
			return isSubstring(s1s1,s2);
		}
		return false;
	}
	
	private boolean isSubstring(String s1s1, String s2) {
		System.out.println("s1s1=="+s1s1);
		if(s1s1.contains(s2)) {
			return true;	
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneWordSubString s=new OneWordSubString();
		String s1="waterbottle";
		String s2="erbottlewat";
		
		System.out.println(s.isRoation(s1, s2));
	}

}
