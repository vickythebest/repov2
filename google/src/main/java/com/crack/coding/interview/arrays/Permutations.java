package com.crack.coding.interview.arrays;

/*
 * Given two string write a method to decide if one is a premutation of the other
 */
public class Permutations {

	public String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	public boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	public boolean permutation2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		int[] letters = new int[256]; //Assumption
		char[] a_array=s.toCharArray();
		for (char c: a_array) {
			letters[c]++;
		}
		
		for(int i=0;i <t.length();i++) {
			int c=(int) t.charAt(i);
			if(--letters[c] < 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutations p = new Permutations();
		System.out.println(p.permutation("vivek", "k"));

	}

}
