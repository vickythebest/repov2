package com;
//You're given a configuration of a chessboard with some rooks. 
// In this chessboard, we want to see if any of the rooks are able to attack any other ones. 
// Just in case you've never played chess, rooks are able to move any number of spaces horizontally and vertically

public class ChassPuzzel {

	public boolean puzzel(int[][] chass) {
		
		int len=chass.length;
		for(int row_i =0;row_i<len;row_i++) {
			int rowCount=0;
			for (int col_i=0;col_i<len;col_i++) {
				System.out.println("-- rowCount --"+rowCount);
				rowCount+=chass[row_i][col_i];
				if(rowCount > 1) {
					return false;
				}
			}
		}
		
		for(int col_i =0;col_i<len;col_i++) {
			int colCount=0;
			for (int row_i=0;row_i<len;row_i++) {
				colCount+=chass[row_i][col_i];
				System.out.println("-- colCount --"+colCount);
				if(colCount > 1) {
					return false;
				}
			}
		}
		
		return true;
	}
	public static void main(String[] args) {

		int chass[][]= {
						{0,1,0,0},
						{0,0,0,1},
						{0,0,1,0},
						{0,0,1,0}
						};
		
		ChassPuzzel puzzel=new ChassPuzzel();
		System.out.println(puzzel.puzzel(chass));
	}

}
