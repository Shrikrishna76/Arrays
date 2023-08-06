package com.assignment1;

public class SecondSmallestInArray {
	public static void secondMinNum(int a[])
	{
		int i,min=a[0],smin=a[1],len=a.length;
		
		for(i=0;i<len;i++)
		{
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin && min<a[i])
			{
				smin=a[i];
			}
		}
		System.out.println("Smallest: "+min);
		System.out.println("Second Smallest: "+smin);
	}

	public static void main(String[] args) {
		int num[]= {23,42,45,67,567,89,867};
		secondMinNum(num);
	}
}
