package com.assignment2;

public class MinInColumn {
	 public static void main(String[] args) {
	        int[][] arr = {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}};
	        int rows = arr.length;
	        int columns = arr[0].length;

	        int[] minimumInColumns = new int[columns];

	        // Find minimum in each column
	        for (int j = 0; j < columns; j++) 
	        {
	            int min = arr[0][j];
	            for (int i = 1; i < rows; i++)
	            {
	                if (arr[i][j] < min) 
	                {
	                    min = arr[i][j];
	                }
	            }
	            minimumInColumns[j] = min;
	        }

	        // Print the result
	        for (int i = 0; i < columns; i++) 
	        {
	            System.out.print(minimumInColumns[i]);
	            if (i < columns - 1)
	            {
	                System.out.print(", ");
	            }
	        }
	    }

}
