package com.assignment1;

import java.util.Scanner;

//10.WAP to insert an element in a specific position into an array.

public class InsertElement {
	

   public static void InsertElementInArray(int arr[],int idx,int n) {
		
		int i,len=arr.length;
		if(idx<len) {
			arr[idx]=n;
		}
		else {
			System.out.println("index not found");
		}
		
	}
	public static void main(String[] args) {
		int age[]= {78,58,96,69,36};
		
		int index,num,i,len=age.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("you can enter index number from 0 to "+(len-1));

		System.out.println("Enter index for that number which you want to replace:");
		index=sc.nextInt();
		System.out.println("Enter the new number:");
		num=sc.nextInt();
		
		InsertElementInArray(age, index, num);
		System.out.println("-----After replacing with new number-----");
		for(i=0;i<len;i++) {
			System.out.println(age[i]);
		}
	
		
		
		
			
	}

}
