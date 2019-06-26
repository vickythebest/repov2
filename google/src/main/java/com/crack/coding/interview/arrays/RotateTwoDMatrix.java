package com.crack.coding.interview.arrays;

public class RotateTwoDMatrix {

	public void rotate(int[][] matrix, int n) {
		for (int layer=0; layer < n/2; layer++) {
			int first=layer;
			int last=n - layer-1;
			System.out.println("first - "+first);
			System.out.println("last - "+last);
			for(int i=first;i<last;i++) {
				int offset=i-first;
			System.out.println("offset "+offset);
			//Save Top layer
			int top = matrix[first][i];
			
			//left --> top
			matrix[first][i]=matrix[last-offset][first];
			
			//Bottom -> left
			matrix[last-offset][first]=matrix[last][last-offset];
			
			//Right --> bottom 
			matrix[last][last-offset]=matrix[i][last];
			
			//top --> rigth
			matrix[i][last]=top;
			}
		}
		System.out.println("Length "+matrix.length);
		
		for(int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix.length;j++) {
				System.out.print(" "+matrix[i][j]);	
			}
			System.out.print("\n");
		}
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
		RotateTwoDMatrix arr = new RotateTwoDMatrix();
		int matrix[][]= {
				{1,2,3,4},
				{12,13,14,5},
				{11,16,15,6},
				{10,9,8,7}
				};
		
		arr.rotate(matrix, 4);
	}

}
