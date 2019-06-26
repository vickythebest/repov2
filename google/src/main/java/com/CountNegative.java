package com;

public class CountNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int items[][] = {
				{-4,-3,-1,0},
                {-2,-2, 1,2},
                {-1, 1, 2,3},
                {1,2, 4,5}
          	};
		
		CountNegative n=new CountNegative();
		System.out.println(n.negativeNumber(items));
	}

	public int negativeNumber(int list[][]) {
		int count=0;
		int row_i=0;
		int col_i=list[0].length-1;
		System.out.println("Length -  "+col_i);
		while(col_i >= 0 && row_i < list.length) {
			if(list[row_i][col_i] < 0) {
				count += (col_i+1);
				System.out.println("count - > "+count);
				row_i += 1;
			}else {
				System.out.println("col_i - > "+col_i+"  count - > "+count);
				col_i -= 1;
			}
		}
		return count;
		
	}
}
