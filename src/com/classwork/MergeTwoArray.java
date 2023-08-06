package com.classwork;

import java.util.Arrays;

public class MergeTwoArray {
	 public static int[] add(int[] arr1, int[] arr2)
	    {
	        int len1 = arr1.length;
	        int len2 = arr2.length;
	        int[] result = new int[len1 + len2];

	        // Copy elements from arr1 to result array
	        for (int i = 0; i < len1; i++) {
	            result[i] = arr1[i];
	        }

	        // Copy elements from arr2 to result array
	        for (int i = 0; i < len2; i++) {
	            result[len1 + i] = arr2[i];
	        }

	        return result;
	    }

	public static void main(String[] args) {
        int[] arr1 = {1, 3, 4,5};
        int[] arr2 = {2, 4, 6,8};

        int[] arr3 = add(arr1, arr2);

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Merge Array: " + Arrays.toString(arr3));
    }

   


	

}
