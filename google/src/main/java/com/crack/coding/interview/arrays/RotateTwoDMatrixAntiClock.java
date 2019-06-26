package com.crack.coding.interview.arrays;

public class RotateTwoDMatrixAntiClock {

	public void rotate(int[][] matrix, int n) {
		for(int row_i=0;row_i<n/2;row_i++) {
			//System.out.println("Outer loop begin");
			
			int max=n-row_i-1;
			//System.out.println("Inner loop begin");
			for(int col_j=row_i;col_j<max;col_j++) {
				int left=col_j-row_i;
				
				System.out.println(row_i+" row_i "+"col_j - "+col_j+"- left - "+matrix[row_i][left]);
				System.out.println(max+" Max "+left+" left - "+matrix[max][left]);
				System.out.println("Max-left "+matrix[max-left][row_i]);
				
				//Save Top layer
				int top = matrix[row_i][col_j];
				System.out.println("Top "+top);
				
				//left --> bottom
				//matrix[first][i]=matrix[last-left][first];
				matrix[row_i][col_j]=matrix[max-left][row_i];
				
				//Bottom -> left
				//matrix[last-left][layer] = matrix[last][last - left];
				matrix[max-left][row_i] = matrix[max][max-left];
				
				//Right --> bottom
				//matrix[last][last - left] = matrix[i][last];
				matrix[max][max-left]= matrix[col_j][max];
				
				//top --> right
				//matrix[i][last] = buffer; // right <- saved top
				matrix[col_j][max]=top;
			}
			//System.out.println("Inner loop finish");
		}
		System.out.println("Outer loop finish");
		printMatrix(matrix,4);
	}
	
	
	public static void printMatrix(int[][] matrix,int n){
        System.out.print("\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.print("\n");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateTwoDMatrixAntiClock arr = new RotateTwoDMatrixAntiClock();
		int matrix[][]= {
				{1,2,3,4},
				{12,13,14,5},
				{11,16,15,6},
				{10,9,8,7}
				};
		
		arr.rotate(matrix, 4);
	}

}
