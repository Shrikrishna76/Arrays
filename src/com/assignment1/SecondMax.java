package com.assignment1;

public class SecondMax {
	public static void secondMaxNum(int a[])
	{
		int i,max=a[0],smax=a[1],len=a.length;
		
		for(i=0;i<len;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && max>a[i])
			{
				smax=a[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Second Max: "+smax);
	}

	public static void main(String[] args) {
		int num[]= {23,42,45,67,567,89,867};
		secondMaxNum(num);
	}
}
