package com.classwork;

import java.util.Arrays;

public class Merge {
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr3 = new int[len1 + len2];

        int index1 = 0, index2 = 0, index3 = 0;

        // Interleave the elements from both arrays
        while (index1 < len1 && index2 < len2) {
            arr3[index3++] = arr1[index1++];
            arr3[index3++] = arr2[index2++];
        }

        // If there are any remaining elements in array1, copy them to the result array
        while (index1 < len1) {
            arr3[index3++] = arr1[index1++];
        }

        // If there are any remaining elements in array2, copy them to the result array
        while (index2 < len2) {
            arr3[index3++] = arr2[index2++];
        }

        return arr3;
    }
	public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {11, 22, 33, 44, 55, 66};

        int[] array3 = mergeArrays(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(array3));
    }

    

}
