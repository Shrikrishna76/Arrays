package com.assignment1;
/*
 * WAP to reverse the array itself, don’t print array in reverse – I want current array reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] 
 * so your same array must be [78, 37, 29, 45, 90, 3] without using temporary array.
 */

public class ReverseWithoutTemporaryArray {
	
	public static void reverseArray1(int[] arr) {
        int i = 0;
        int len = arr.length - 1;

        while (i < len) {
            // XOR swap to reverse the elements at left and right indices
            arr[i] = arr[i] ^ arr[len];
            arr[len] = arr[i] ^ arr[len];
            arr[i] = arr[i] ^ arr[len];

            // Move the left and right pointers towards the middle
            i++;
            len--;
        }
    }


	 public static void main(String[] args) {
	        int[] arr = { 3, 90, 45, 29, 37, 78 };

	        System.out.println("Original Array:");
	        printArray(arr);

	        reverseArray1(arr);

	        System.out.println("\nArray after reversing in-place:");
	        printArray(arr);
	    }

	    

	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
}
