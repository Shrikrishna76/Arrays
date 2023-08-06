package com.assignment1;

import java.util.Arrays;

public class NegativePositiveArragement {
	 public static void arrangeNegativePositive(int[] arr) {
	        int i = 0;
	        int len = arr.length - 1;

	        while (i < len) {
	            // Find the first positive integer from the left
	            while (arr[i] < 0 && i < len)
	            {
	                i++;
	            }

	            // Find the first negative integer from the right
	            while (arr[len] >= 0 && i < len) {
	                len--;
	            }

	            // Swap the positive and negative integers
	            if (i < len) {
	                int temp = arr[i];
	                arr[i] = arr[len];
	                arr[len] = temp;
	                i++;
	                len--;
	            }
	        }
	    }

	 public static void main(String[] args) {
	        int[] arr = {10, -1, 5, -8, -3, 7, 0, -4, 2};
	        System.out.println("Original Array: " + Arrays.toString(arr));
	        arrangeNegativePositive(arr);
	        System.out.println("Arranged Array: " + Arrays.toString(arr));
	    }

	   
}
