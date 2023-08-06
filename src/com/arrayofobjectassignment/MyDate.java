package com.arrayofobjectassignment;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	MyDate(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	
	

	


	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}



	public static void main(String[] args) {
		
		MyDate md1=new MyDate(12, 6, 2012);
		MyDate md2=new MyDate(2, 6, 2009);
		MyDate md3=new MyDate(1, 5, 2011);
		MyDate md4=new MyDate(12, 6, 2006);
		
		
		Employee4[] emp = new Employee4[5];
		emp[0] = new Employee4(101, "karan", 50000, md1);
        emp[1] = new Employee4(102, "Amol", 60000, md2);
        emp[2] = new Employee4(103, "Shubham", 55000, md3);
        emp[3] = new Employee4(104, "Ravi", 70000, md4);
        emp[4] = new Employee4(105, "Rohan", 90000, md3);
        
        System.out.println("Employees who join after 2010:");
        for(Employee4 e:emp)
        {
        	if(e.date.year>2010)
        	{
        		System.out.println(e);
        	}
        }
        
        System.out.println();
        System.out.println("Employees whose same joining date:");
        for(int i=0;i<emp.length;i++)
        {
        	for(int j=i+1;j<emp.length;j++)
        	{
        		if(emp[i].date==emp[j].date)
        		{
        			System.out.println(emp[i]);
        			System.out.println(emp[j]);
        		}
        	}
        }
       
		

	}

}
