package com.assignment1;
//28.	WAP to calculate average of all elements in an Array except max and min element (Means don’t include the highest and lowest number of your 
//array in your average).

import java.util.Scanner;

public class AvarageOfArray {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int sum = 0;
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;

	        // Calculate sum, min, and max values in the array
	        for (int num : arr) {
	            sum += num;
	            if (num < min) {
	                min = num;
	            }
	            if (num > max) {
	                max = num;
	            }
	        }

	        // Calculate the average excluding min and max
	        int count = n - 2; // Subtract 2 to exclude min and max
	        double average = (double) (sum - min - max) / count;

	        System.out.println("Average of elements excluding min and max: " + average);
	    
	}

}
