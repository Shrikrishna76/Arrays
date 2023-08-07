package com.assignment1;
////WAP to print the alternate elements of an array of integers

public class AlternateElementInArray {
	public static void main(String[] args) 
	{
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printAlternateElements(arr);
    }
	 public static void printAlternateElements(int[] arr)
	    {
	        for (int i = 0; i < arr.length; i += 2) 
	        {
	            System.out.print(arr[i] + " ");
	        }
	    }


}
