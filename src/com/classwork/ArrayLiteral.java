package com.classwork;

public class ArrayLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[]= {'A','B','C','D','E','F'};
		
		int len=ch.length;
		
		System.out.println("Length of array is: "+len);
		System.out.println("First Element of array is: "+ch[0]);
		System.out.println("Last Element of array is: "+ch[len-1]);
		System.out.println("Last elment index no: "+(len-1));
		System.out.println("----------------------------------");
		for(int i = 0;i<len;i++)
		{
			System.out.println("Element of ch at "+i+" : "+ch[i]);
		}
		
	}

}
