package com.assignment1;
//WAP to print the elements within a 3D array
public class Array3D {

	public static void main(String[] args) {
		int[][][] a=  {{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }, { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },{ {19, 20, 21}, {22, 23, 24}, {25, 26, 27}} };

		
		  for (int d = 0; d < a.length; d++) {
	            System.out.println("Array" + d + ":");
	            for (int i = 0; i < a[0].length; i++) {
	                for (int j = 0; j < a[0][0].length; j++) {
	                    System.out.print(a[d][i][j] + " ");
	                }
	                System.out.println();
	            }
	            System.out.println();
	        }
	}

}
