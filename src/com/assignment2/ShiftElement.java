package com.assignment2;

public class ShiftElement {

	public static void main(String[] args) {
		int arr[]= {4,5,6,7};
		int lastIndex=arr.length-1;
		int lastValue=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[lastIndex]=arr[i];
			lastIndex--;
			
			if(i==0)
			{
				arr[i]=lastValue;
				
			}
			
		}
		for(int a:arr)
		{
			System.out.print(a);
		}
	}

}
