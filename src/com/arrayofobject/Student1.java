package com.arrayofobject;

import java.util.Arrays;

public class Student1 {

	private int rollno;
	private String name;
	private double marks[];
	
	Student1()
	{
		
	}
	
	Student1(int rollno, String name, double marks[])
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	public void display() {
		System.out.println("Roll No: "+rollno);
		System.out.println("Name :"+name);
		System.out.println("Marks: "+Arrays.toString(marks));
	}
	 	
}
