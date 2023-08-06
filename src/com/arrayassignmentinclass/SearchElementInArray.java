package com.arrayassignmentinclass;

import java.util.Scanner;

public class SearchElementInArray {
	public static void SearchElement(int arr[],int searchElement)
	{
		int i,len=arr.length,position=-1;
		
		for(i=0;i<len;i++)
		{
			if(searchElement==arr[i])
			{
				position=i;
				break;
			}
		}
		
		if(position!=-1)
		{
			System.out.println(searchElement+" is present at index :"+position);
		}
		else
		{
			System.out.println(searchElement+" is not present in the given array ");
		}
	}

	public static void main(String[] args) {
		
		int num[]= {12,32,56,87,88,9,54,32,44};
		//int search;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which number you want:");
		int search=sc.nextInt();		
		SearchElement(num, search);
	}

}
