package com.arrayofobject;

import java.util.Scanner;

public class StudentTestBySetterAndGetter {
	static Scanner sc=new Scanner(System.in);
	public static void addstudent(Student s)
	{
		
		
		System.out.println("Enter Roll No: ");
		s.setRollno(sc.nextInt());
		
		System.out.println("Enter Name: ");
		s.setName(sc.next());
		
		System.out.println("Enter Marks: ");
		s.setMarks(sc.nextDouble());
		
	}
	
	public static void showdata(Student sarr[])
	{
		for(Student s:sarr)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Student[] str=new Student[3];
		int i,len=str.length;
//		System.out.println("Enter Data for Student array:");
//		//Scanner sc=new Scanner(System.in);
//		for(i=0;i<len;i++)
//		{
//			str[i]=new Student();
//			System.out.println("Enter Roll No: ");
//			str[i].setRollno(sc.nextInt());
//			
//			System.out.println("Enter Name: ");
//			str[i].setName(sc.next());
//			
//			System.out.println("Enter Marks: ");
//			str[i].setMarks(sc.nextDouble());
//		}
//		
//		System.out.println("---------------Data Display----------------");
//		for(Student s:str)
//		{
//			System.out.println(s);
//		}
//		
		
		for(i=0;i<len;i++)
		{
			str[i]=new Student();
			addstudent(str[i]);
		}
		
		showdata(str);

	}

}
