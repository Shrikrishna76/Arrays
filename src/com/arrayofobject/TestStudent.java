package com.arrayofobject;

public class TestStudent {
	public static void showName(Student s[])
	{
		int len=s.length;
		for(int i=0;i<len;i++)
		{
			if(s[i].getMarks()>=400)
			{
				System.out.println(s[i]);
			}
		}
	}

	public static void main(String[] args) {
		Student stuarr[]=new Student[5];
		
		stuarr[0]=new Student (1,"karan",420);
		stuarr[1]=new Student (2,"skkl",350);
		stuarr[2]=new Student (3,"Amol",390);
		stuarr[3]=new Student (4,"Shubham",410);
		stuarr[4]=new Student (5,"krishna",470);
		
		System.out.println("=============================Student Details using for loop======================");
		for(int i=0;i<stuarr.length;i++)
		{
			System.out.println(stuarr[i]);
		}
		
		System.out.println("=============================Student Details using for each loop======================");
		for(Student s:stuarr)
		{
			System.out.println(s);
		}
		System.out.println();
		System.out.println("==============================Above marks  400 those student name :====================== ");
		showName(stuarr);

	}

}
