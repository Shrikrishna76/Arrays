package com.assignment2;

import java.util.Arrays;
//delete an element from an array at specified position.
public class DeleteElementfromArray {

	 public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        int positionToDelete = 2; // Specify the position to delete (0-indexed)

	        // Check if the specified position is valid
	        if (positionToDelete >= 0 && positionToDelete < array.length)
	        {
	            // Create a new array with one less element
	            int[] newArray = new int[array.length - 1];

	            // Copy elements before the specified position
	            for (int i = 0; i < positionToDelete; i++)
	            {
	                newArray[i] = array[i];
	            }

	            // Copy elements after the specified position
	            for (int i = positionToDelete; i < array.length - 1; i++)
	            {
	                newArray[i] = array[i + 1];
	            }

	            // Print the original and modified arrays
	            System.out.println("Original Array: " + Arrays.toString(array));
	            System.out.println("Array after deleting element at position " + positionToDelete + ": " + Arrays.toString(newArray));
	        } 
	        else 
	        {
	            System.out.println("Invalid position. Please provide a valid position within the range of the array.");
	        }
	    }
}
