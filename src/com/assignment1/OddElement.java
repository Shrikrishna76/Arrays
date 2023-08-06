package com.assignment1;
//WAP to print only odd numbers within an array of integers

public class OddElement {
	public static void main(String[] args) 
	{
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printOddElements(arr);
    }

    public static void printOddElements(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) 
        {
        	if(arr[i]%2!=0)
        	{
        		System.out.print(arr[i] + " ");
        	}
        }
    }

}
