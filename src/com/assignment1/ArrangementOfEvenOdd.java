package com.assignment1;

import java.util.Arrays;

//33.	WAP to arrange the elements of an given array of integers where all Even integers appear before all the Odd integers.
public class ArrangementOfEvenOdd {
	public static int[] arrangeEvenOdd(int[] arr) {
        int evenIndex = 0;
        int oddIndex = arr.length - 1;

        while (evenIndex < oddIndex) 
        {
            if (arr[evenIndex] % 2 == 0)
            {
                // Even number, move to the next element
                evenIndex++;
            } 
            else 
            {
                // Odd number, swap with the element at the oddIndex
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;
                oddIndex--;
            }
        }
        return arr;
    }
	 public static void main(String args[])
	 {
		  int[] inputArray = {5, 8, 2, 6, 1, 3, 7, 4};
	        System.out.println("Original Array: " + Arrays.toString(inputArray));

	        int[] resultArray = arrangeEvenOdd(inputArray);
	        System.out.println("Array after arranging even and odd numbers: " + Arrays.toString(resultArray));
	    }

}
