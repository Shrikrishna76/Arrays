package com.assignment1;
/*
 * 30.	WAP to replace all negative value with its immediate left elements square. Means arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
 * Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49]. 


 */
public class ReplaceNegativewithLeftSquare {
	 public static void main(String[] args) {
	        int[] arr = {12, 3, -19, 29, 5, -61, 44, 7, -9};
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < 0) {
	                arr[i] = arr[i - 1] * arr[i - 1];
	            }
	        }

	        // Print the output array
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
}
