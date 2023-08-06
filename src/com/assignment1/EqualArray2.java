package com.assignment1;
//Write a Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22, 32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] 
//Here both arrays are equal 
import java.util.Arrays;

public class EqualArray2 {
	 public static boolean areArraysEqual(int[] arr1, int[] arr2) {
	        // Step 1: Sort both arrays
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        // Step 2: Check if both arrays have the same length
	        if (arr1.length != arr2.length)
	        {
	            return false;
	        }

	        // Step 3: Compare each element of the arrays
	        for (int i = 0; i < arr1.length; i++)
	        {
	            if (arr1[i] != arr2[i]) 
	            {
	                return false;
	            }
	        }

	        return true;
	 }
	 public static void main(String[] args)
	 {
	        int[] arr1 = {12, 22, 32, 42, 52, 62};
	        int[] arr2 = {52, 22, 62, 12, 42, 22};

	        boolean areEqual = areArraysEqual(arr1, arr2);

	        if (areEqual==false)
	        {
	            System.out.println("Both arrays are equal.");
	        }
	        else
	        {
	            System.out.println("The arrays are not equal.");
	        }
	    }

	    
	    

}
