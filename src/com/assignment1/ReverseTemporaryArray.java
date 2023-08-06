package com.assignment1;
/*
 * 22.	WAP to reverse the array itself, don’t print array in reverse – I want current array reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78]
 *  so your same array must be [78, 37, 29, 45, 90, 3] by using temporary array. 
 */

public class ReverseTemporaryArray 
{
	public static void reverse(int[] arr) 
	   {
	        int i = 0;
	        int len = arr.length - 1;

	        while (i < len) {
	            // Swap the elements at left and right indices
	            int temp = arr[i];
	            arr[i] = arr[len];
	            arr[len] = temp;

	            // Move the pointers towards the center
	            i++;
	            len--;
	        }
	    }

	  public static void main(String[] args) {
	        int[] arr = {3, 90, 45, 29, 37, 78};

	        // Reversing the array in-place
	        reverse(arr);

	        // Printing the reversed array
	        System.out.print("Reversed Array: ");
	        for (int num : arr)
	        {
	            System.out.print(num + " ");
	        }
	    }

}
