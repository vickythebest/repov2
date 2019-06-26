package com;
/**
 * 
 */

/**
 * @author Vivek_Kumar
 *
 */
public class SecondHighest {

	public int findSecondHighest(int list[]) {
		
		System.out.println("Inside find Second Highest");
		int largest=-1;
		int secondlargest=-1;
		
		for (int i=0;i<list.length;i++) {
			
			if (largest < 0) {
				largest=list[i];
			}else if(list[i] > largest ) {
				secondlargest=largest;
				largest=list[i];
			}else if(secondlargest < 0) {
				secondlargest = list[i];
			}else if(list[i] > secondlargest  ) {
				secondlargest=list[i];
			}
		}
				
		return secondlargest;
		
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[]= {2,98,4,63,10};
		
		SecondHighest secondlarge = new SecondHighest();
		System.out.println(secondlarge.findSecondHighest(list));

	}

}
