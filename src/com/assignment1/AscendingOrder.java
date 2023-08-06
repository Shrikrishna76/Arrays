package com.assignment1;
//18.WAP sort array elements in ascending order.

public class AscendingOrder {

	public static int[] sortElement(int a[])
	{
		int i,j,len=a.length;
		for(i=0;i<len;i++)
		{
			for(j=0;j<len-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int num[]= {23,54,78,5,9,65,23,11};
		int sort[]=sortElement(num);
		for(int s:sort)
		{
			System.out.println(s);
		}

	}
}
