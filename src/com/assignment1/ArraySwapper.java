package com.assignment1;
//26.	 WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 0, 2, 4] 
import java.util.Arrays;

public class ArraySwapper {
	public static int[] swapArray(int[] arr) {
        int length = arr.length;
        int mid = length / 2;
       
        for (int i = 0; i < mid; i++) {
            // Swap elements from the first half with the second half
            int temp = arr[i];
            arr[i] = arr[i + mid];
            arr[i + mid] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 0};
       System.out.println("Orignal Array: ");
        for(int c:arr)
        {
        	System.out.print(c+" " );
        }
        System.out.println();
      int[] a= swapArray(arr);
      System.out.println("Swap Array");
      for(int b:a)
      {
    	 
    	  System.out.print(b+" ");
      }
    }

    
}

