package com.arrayofobject;

public class Student {
	private int rollno;
	private String name;
	private double marks;
	
	Student()
	{
		
	}
	
	Student(int rollno, String name, double marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString()
	{
		return "Roll No: "+rollno+" Name: "+name+" Marks: "+marks;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getRollno() {
		return rollno;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public double getMarks() {
		return marks;
	}

	

}
