package com.arrayofobjectassignment;
/*
 * Employee class has (id, name, salary, joining date) Use MyDate class as a 
joining date. MyDate class has (day, month, year). Now create array of 
Employee and print only those Employees who joined after 2010
 */

public class Employee4 {

	private int eId;
	private String eName;
	private double eSalary;
	MyDate date;
	
	Employee4(int eId, String eName, double eSalary, MyDate date)
	{
		this.eId=eId;
		this.eName=eName;
		this.eSalary=eSalary;
		this.date=date;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee: eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", date=" + date ;
	}
	
	
}
