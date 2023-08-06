package com.assignment1;
//WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your output must be 78, 37, 29, 45, 90, 3 

public class ReverseArray {
	
	public static void main(String[] args) 
	{
		
		int arr[]= {3, 90, 45, 29, 37, 78};
		int i,len=arr.length;
		System.out.println("----Array in Reverse Order----");
		for(i=len-1;i>=0;i--) 
		{
			System.out.print(arr[i]+" ");
		}
	}

}
