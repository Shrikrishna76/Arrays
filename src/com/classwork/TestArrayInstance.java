package com.classwork;

import java.util.Arrays;

class Student
{
	int rollno;
	String name;
	int marks[];
	
	Student(int rollno,String name,int marks[])
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
		
	}
	
	public static void show(int m[])
	{
		int len=m.length;
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum=sum+m[i];
		}
		System.out.println("Sum: "+sum);
		double average = (double) sum / len;
		System.out.println("Avarage: "+average);
		
	
	}
	

	
	public String toString() {
		return "Student:\nRoll No=" + rollno + "\nName=" + name + "\nMarks=" + Arrays.toString(marks);
	}
	
	
}

public class TestArrayInstance {
	

	public static void main(String[] args) {
		
		int m1[]= {12,34,66,89,78,24};
		int m2[]= {13,78,95,56,90,34};
		int m3[]= {16,70,80,54,87,44};
		int m4[]= {17,89,85,35,65,76};
		
		
		Student s1=new Student(11,"karan",m1);
		Student s2=new Student(12,"Amol",m2);
		Student s3=new Student(13,"Irfan",m3);
		Student s4=new Student(14,"Shubham",m4);
		
		System.out.println(s1);
		s1.show(m1);
		System.out.println("___________________________________________________________");
		System.out.println(s2);
		s1.show(m2);
		System.out.println("____________________________________________________________");
		System.out.println(s3);
		s1.show(m3);
		System.out.println("____________________________________________________________");
		System.out.println(s4);
		s1.show(m4);
		
	}

}
