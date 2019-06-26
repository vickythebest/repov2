package com.crack.coding.interview.arrays;

/*
 * Implement an algorithm to determine if a string has al unique character  
 * What if you cannot use additional data structures ?
 * @author Vivek_Kumar
 *
 */
public class UniqueCharInArray {

	public boolean isUniqueChar1(String str) {
		
		int checker=0;
		for (int i=0;i <str.length();i++) {
			int val=str.charAt(i) - 'a';
			System.out.println((1 << val)+" checker = "+checker);
			if((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}
	public boolean isUniqueChar2(String str) {
		
		if(str.length() > 256) {
			return false;
		}
		boolean[] char_set=new boolean[256];
		
		for(int i=0;i<str.length();i++) {
			int val=str.charAt(i);
			if(char_set[val]) {  //Already found this char in string
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharInArray u = new UniqueCharInArray();
		System.out.println(u.isUniqueChar1("abcdedfgh"));
	}

}
