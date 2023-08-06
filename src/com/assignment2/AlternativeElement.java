package com.assignment2;
//WAP to print the alternate elements of an array of integers
public class AlternativeElement {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Call the function to print alternate elements
        printAlternateElements(array);
    }

    public static void printAlternateElements(int[] arr) {
        for (int i = 0; i < arr.length; i =i+ 2) {
            System.out.print(arr[i] + " ");
        }
    
		

	}

}
