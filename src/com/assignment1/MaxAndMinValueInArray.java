package com.assignment1;
//12.WAP to find the maximum and minimum value in an array.
public class MaxAndMinValueInArray {
	public static int findMaxNum(int a[])
	{
		int max=a[0];
		int i, len=a.length;
		
		for(i=1;i<len;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
	
	public static int findMinNum(int a[])
	{
		int min=a[0];
		int i, len=a.length;
		
		for(i=1;i<len;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int num[]=new int[] {24,88,95,45,90,11,8};
		System.out.println("Maximum Number is :"+findMaxNum(num));
		System.out.println("Minimum Number is :"+findMinNum(num));

	}

}
