package com.assignment2;
//43.	WAP to print minimum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} output is: 9 and 12. 
public class MinInRows {
	public static void minValue(int a[][])
	{
		int rows0=a.length;
		int rows1=a[0].length;
		
		  for (int i = 0; i < rows0; i++) 
		  {
	            int min = a[i][0];
	            for (int j = 1; j < rows1; j++)
	            { 
	                if (a[i][j] < min)
	                {
	                    min = a[i][j];
	                }
	            }
	            System.out.println("Min value in row " + i + ": " + min);
	        }
	 }

		
		
	

	public static void main(String[] args) {
		
		int arr[][]= {{22,31,9},{12,25,16}};
		
		minValue(arr);
		
		
	}


}
