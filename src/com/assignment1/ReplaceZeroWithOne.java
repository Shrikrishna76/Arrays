package com.assignment1;

import java.util.Arrays;

public class ReplaceZeroWithOne {
	public static void main(String[] args) {
        int[] arr = {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};

        // Replacing 0's with 1's
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
        }

        // Printing the modified array
        System.out.println("Modified array: " + Arrays.toString(arr));
	}

}
