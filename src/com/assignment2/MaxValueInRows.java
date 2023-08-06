package com.assignment2;
//WAP to print maximum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} output is: 31 and 25. 

public class MaxValueInRows {
	public static void maxValue(int a[][])
	{
		int rows0=a.length;
		int rows1=a.length;
		
		  for (int i = 0; i < rows0; i++) 
		  {
	            int max = a[i][0];
	            for (int j = 1; j < rows1; j++)
	            { 
	                if (a[i][j] > max)
	                {
	                    max = a[i][j];
	                }
	            }
	            System.out.println("Max value in row " + i + ": " + max);
	        }
	 }

		
		
	

	public static void main(String[] args) {
		
		int arr[][]= {{22,31,9},{12,25,16}};
		
		maxValue(arr);
		
		
	}

}
