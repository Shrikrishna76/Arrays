package com.assignment2;

import java.util.Arrays;

public class ShiftArray 
{
	public static void shiftArrayLeft(int[] arr) 
	{
	       int temp = arr[0];
	       for (int i = 1; i < arr.length; i++)
	       {
	    	   
	           arr[i - 1] = arr[i];
	           	           
	       }
	       arr[arr.length - 1] = temp;
	   }
	public static void main(String args[])
	{
	   int[] arr = {5, 6, 23, 67, 39, 10, 2};
       shiftArrayLeft(arr);
       
       System.out.println("shift array: " + Arrays.toString(arr));
   
   
	}

}
