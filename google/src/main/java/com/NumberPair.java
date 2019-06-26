package com;

import java.util.HashMap;

public class NumberPair {

	public boolean pair10(int list[]) {
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		
		for (int i=0;i<list.length;i++) {
			System.out.println(10 - list[i]+ "  contain in hm");
			if(hm.containsValue(10 - list[i])) {
				System.out.println(String.valueOf(10 - list[i]+" , "+String.valueOf(list[i])));
				return true;
			}else {
				System.out.println(list[i]+ "  add in hm");
				hm.put(list[i], 1);
			}
		}
		System.out.println("There is no pair that adds up to 10.");
		return false;
	}
	public static void main(String[] args) {
		int list[]= {3,4,5,2,9};
		NumberPair p=new NumberPair();
		p.pair10(list);
	}

}
