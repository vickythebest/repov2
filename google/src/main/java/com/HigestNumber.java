package com;

public class HigestNumber {

	public boolean are_reverses(String str1[],String str2[]) {
		
		int len=str1.length-1;
		for(int i=0;i<=len;i++) {
			if(str1[i]==str2[len-i]) {
				return true;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public boolean larger_than(String str1,String str2) {
		
		if(str1.length() > str2.length()) {
			return true;
		}else if(str1.length() < str2.length()) {
			return false;
		}
		
		for (int i=0;i<str1.length();i++) {
			if(str1.compareTo(str2)==0) {
				System.out.println("continue");
			}else if(str1.compareTo(str2)>0) {
				return true;
			}else {
				return false;
			}
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HigestNumber num=new HigestNumber();
		
		String str1="112";
		String str2="111";
		
		System.out.println(num.larger_than(str1, str2));

	}

}
