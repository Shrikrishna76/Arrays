package com.arrayassignmentinclass;

public class DisplayAlternative {
	public static void alternative(int a[])
	{
		int i,len=a.length;
		
		for(i=0;i<len;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]);
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		
		int num[]= {11,32,45,66,76,89,22,43,65,90};
		System.out.println("Alternative  Number From Array:");
		alternative(num);

	}

}
