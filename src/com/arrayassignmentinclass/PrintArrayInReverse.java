package com.arrayassignmentinclass;

public class PrintArrayInReverse {

	public static void main(String[] args) {
		
		int arr[]= {12,34,56,78,90};
		int i,len=arr.length;
		
		//print array in reverse order
		for(i=len-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
