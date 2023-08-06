package com.classwork;

public class Demo {

	public static void main(String[] args) {
		
		int num[];	//declaring an array
		num=new int[5];	//instantiating an array
		
		System.out.println("---------------Before inserting array element--------------------");
		System.out.println("Element at index 0 : "+num[0]);
		System.out.println("Element at index 1 : "+num[1]);
		System.out.println("Element at index 2 : "+num[2]);
		System.out.println("Element at index 3 : "+num[3]);
		System.out.println("Element at index 4 : "+num[4]);
		
		//assigning value to array
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		//accessing array element by index
		System.out.println("---------------After inserting array element--------------------");
		System.out.println("Element at index 0 : "+num[0]);
		System.out.println("Element at index 1 : "+num[1]);
		System.out.println("Element at index 2 : "+num[2]);
		System.out.println("Element at index 3 : "+num[3]);
		System.out.println("Element at index 4 : "+num[4]);

	}

}
