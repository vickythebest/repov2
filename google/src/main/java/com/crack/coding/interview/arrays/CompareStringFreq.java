package com.crack.coding.interview.arrays;

/*
 * Implement a method to perform basic string comression using the count of repeated character. 
 * for example the string aabcccccaaa would become a2b1ccccc5a3.
 * if the compressed string would not become smaller than the original string your method should return the original string 
 */
public class CompareStringFreq {

	public String compressBad(String str) {
		String mystr = "";
		char previous = str.charAt(0);
		int count=1;
		for (int i=0;i <str.length();i++) {
			if(str.charAt(i) == previous ) {
				count ++;
			}else{  // Insert char count and update previous char
				mystr += previous + " " + count;
				previous = str.charAt(i);
				count = 1;
			}
		}
		return mystr +previous + count;
	}
	public String compressBetter(String str) {
		
		/* Check if compression would create a longer string */
		int size = countCompression(str);
		if(size >= str.length()) {
			return str;	
		}
		
		StringBuffer mystr = new StringBuffer();
		char previous = str.charAt(0);
		int count =1;
		for(int i=1;i < str.length();i++) {
			if(str.charAt(i) == previous) {  //Found repeated char
				count++;
			}else { //Insert char count and update previous char
				mystr.append(previous); //Insert char
				mystr.append(count); //Insert count
				previous = str.charAt(i);
				count = 1;
			}
		}
		/*
		 * we need to update the string at the end of the method as well
		 * since the very previous set of repeted character wouldnot be set in the compressed string yet
		 */
		mystr.append(previous);
		mystr.append(count);
		
		return mystr.toString();
	}
	
	String compressAlternate(String str) {
		/*Check if compression would create a longer string		 */
		int size = countCompression(str);
		if (size >=str.length()){
			return str;
		}
		
		char[] array = new char[size];
		int index=0;
		char previous = str.charAt(0);
		int count =1;
		for (int i=1;i <str.length();i++) {
			if(str.charAt(i)==previous) {  //found repeted charater
				count++;
			}else {
				/* Update the repeated character count*/
				index = setChar(array,previous,index,count);
				previous = str.charAt(i);
				count =1;
			}
		}
		
		/* Update string with the previous set of repeated characters*/
		index=setChar(array,previous,index,count);
		return String.valueOf(array);
	}

	public int setChar(char[] array,char c, int index, int count) {
		array[index] =c;
		index++;
		
		/* Convert the count to a string then to an array of char*/
		char[] cnt = String.valueOf(count).toCharArray();
		
		/* copy characters from biggest digit to smallest*/
		for (char x:cnt) {
			array[index]=x;
			index++;
		}
		return index;
	}
	public int countCompression(String str) {
		
		if(str == null || str.isEmpty())
			return 0;
		
		char previous = str.charAt(0);
		System.out.println("previous- "+previous);
		int size = 0 ;
		int count = 1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i) == previous) {
				count++;
				System.out.println("end if condition - "+count);
			}else {
				previous = str.charAt(i);
				size += 1+String.valueOf(count).length();
				System.out.println("previous- for Inner "+previous);
				System.out.println("size -for Inner "+size);
				count =1;
			}
			System.out.println("count -for end Inner "+count);
		}
		size += 1 + String.valueOf(count).length();
		System.out.println("count -for end outer "+size);
		return size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareStringFreq st=new CompareStringFreq();
		String freq = "aaabbccaaabb";
		System.out.println(freq);
		System.out.println("-->  "+st.compressBad(freq));
		System.out.println("-->  "+st.compressBetter(freq));
		System.out.println("-->  "+st.compressAlternate(freq));
	}
}
