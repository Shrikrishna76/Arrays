package com.assignment1;
//Write a Java program to find the duplicate values of an array of integer values. Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], 
//so duplicates are 10 and 78. 
public class DublicateCount {
	public static void dublicateElement(int a[])
	{
		int i,j,len=a.length;
		int count ;
		for(i=0;i<len;i++)
		{
			count=0;
			if(a[i]==-1)
				continue;
			for(j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
				count++;
				a[j]=-1;
				}
			}
		
		if(count>=1)
		{
			System.out.println(a[i]);
			
			//System.out.println(count);
		}
		
		
		}
		
	}
	public static void main(String[] args) {
		int arr[]=  {3, 10, 90, 78, 56, 10, 78, 34, 61};
		
		 
		System.out.println("Dublicate Array Element");
		dublicateElement(arr);

	}

}
