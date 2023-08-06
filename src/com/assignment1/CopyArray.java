package com.assignment1;
//WAP to copy an array by iterating the array.
public class CopyArray {
	  public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int[] copy = new int[arr.length];

	        // Iterate through the source array and copy each element to the target array
	        for (int i = 0; i < arr.length; i++) {
	            copy[i] = arr[i];
	        }

	        System.out.println("Orignal Array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        System.out.println("Copy Array:");
	        for(int num2:copy)
	        {
	        	System.out.print(num2+" ");
	        }
	    }
	

}
