package com.crack.coding.interview.arrays;

/*
 * Write an algorithm such that if an element in an MxN matrix is 0;
 * its entire row and column are set to 0
 */
public class MatrixMxN {
	
	public void setZeros(int[][] matrix) {
		System.out.println("Input");
		printMatrix(matrix);
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		//Store the row an column index with value 0
		
		for(int i=0; i < matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j] == 0) {
					row[i]=true;
					column[j]=true;
				}
			}
		}
		//Nullify rows
		for(int i=0;i<row.length;i++) {
			if(row[i])
				nullifyRow(matrix,i);
		}
		
		//Nullify Colums
		for(int j=0;j<column.length;j++) {
			if(column[j])
				nullifyColumn(matrix, j);
				
		}
		System.out.println();
		System.out.println("Output");
		printMatrix(matrix);
	}

	public void nullifyRow(int[][] matrix, int row) {
		for(int j=0;j <matrix[0].length;j++) {
			matrix[row][j] = 0;
		}
	}
	
	public void nullifyColumn(int[][] matrix, int col) {
		for(int i=0;i < matrix.length;i++) {
			matrix[i][col]=0;
		}
	}
	
	public static void printMatrix(int[][] matrix){
        System.out.print("\n");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=  {
		           {1,2,9,2,4},
		           {2,0,3,2,1},
		           {2,3,4,5,0},
		           {3,4,6,3,4}
		       };
		MatrixMxN matrix=new MatrixMxN();
		matrix.setZeros(a);
	}
}
