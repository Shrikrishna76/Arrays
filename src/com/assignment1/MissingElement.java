package com.assignment1;

import java.util.Arrays;

// 27.	Write a Java program to find a missing number in an array. Means e.g. array has 1 to n element in sequence(n can be 50 or 100)
//arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5 

public class MissingElement {
	public static void findMissingNumber(int arr[]) 
	{
		int small=arr[0];
		int large=arr[0];
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		System.out.println("Smallest Number: "+small);
		System.out.println("Largest Number: "+large);
		System.out.println("-----------------------------------");
		

		int i,j,len=arr.length;
		for( i=small;i<=large;i++)
		{
			int flag=0;
			for(j=0;j<len;j++)
			{
				if(i==arr[j])
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println("missing Number:"+i);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 7,12};
		
		findMissingNumber(arr);
		
	}

}
