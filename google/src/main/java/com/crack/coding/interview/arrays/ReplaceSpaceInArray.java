package com.crack.coding.interview.arrays;
/*
 * Write a method to replace all spaces in a string with '%20' . you may assume that the string has sufficent space at the
 * end of the string to hold the additional character, and that you are given the "true" length of the string .
 * Note: if implementiong in java , please use a character array so that you can perform thei operation in place
 * 		EXAMPLE 
 * 		imput: "Mr John Smith     " ,13
 * 		output: "Mr%20John%20Smith"																		`								
 */
public class ReplaceSpaceInArray {

	public void replaceSpaces(char[] str, int length) {
		
		int spaceCount = 0, newlength, i;
		for(i=0; i < length; i++) {
			if(str[i] ==' ') 
				spaceCount++;
		}
		System.out.println(" 19 "+length);
		System.out.println(" 20 "+spaceCount);
		newlength = length + (spaceCount * 2);
		System.out.println(" 22 "+newlength);
		
		str[newlength] = '\0';
		for (int i1 =0; i1 < str.length;i1++) {
			System.out.println(i1+" index value is - "+str[i1]);	
		}
		System.out.println();
		for(i = length-1 ; i >=0 ; i--) {
			if(str[i] == ' ') {
				str[newlength - 1] = '0';
				str[newlength - 2] = '2';
				str[newlength - 3] = '%';
				System.out.println("newlength - "+newlength);
				newlength = newlength - 3;
				System.out.println("newlength - 3 ="+newlength);
			}else {
				str[newlength -1] = str[i];
				newlength = newlength - 1;
			}
		}
		System.out.println("final output");
		for (int i1 =0; i1 < str.length;i1++) {
			System.out.print(str[i1]);	
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[] str= {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' ',' '};
		//int length = 13;
		char[] str = {'t', 'h', 'e', ' ', 'd', 'o', 'g', ' ', ' ', ' ', ' ',' ',' '};
	    int length = 6;
	    
		ReplaceSpaceInArray r = new ReplaceSpaceInArray();
		r.replaceSpaces(str ,str.length);
		
	}

}
