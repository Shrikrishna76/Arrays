package com.assignment1;

/*
 * 40.	Create class Dept(did, dname), class MyDate(day, month, year) Class Employee(emp_id, emp_name, salary, date(object), dept(object)).
 *  Create array of Employee and display the array elements.
 */

class Dept 
{
    int did;
    String dname;

    public Dept(int did, String dname)
    {
        this.did = did;
        this.dname = dname;
    }
}

class MyDate 
{
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class Employee5
{
    int emp_id;
    String emp_name;
    double salary;
    MyDate date;
    Dept dept;

    public Employee5(int emp_id, String emp_name, double salary, MyDate date, Dept dept)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
        this.date = date;
        this.dept = dept;
    }
    
   

    @Override
    public String toString()
    {
        return "Employee ID: " + emp_id +
                ", Name: " + emp_name +
                ", Salary: " + salary +
                ", Date of Joining: " + date.day + "/" + date.month + "/" + date.year +
                ", Department: " + dept.dname;
    }
}



public class EmployeeArray
{
	 public static void main(String[] args)
	 {
	        // Create some departments
	        Dept dept1 = new Dept(1, "HR");
	        Dept dept2 = new Dept(2, "Engineering");

	        // Create some date objects
	        MyDate date1 = new MyDate(15, 7, 2023);
	        MyDate date2 = new MyDate(20, 9, 2023);

	        // Create an array of Employee objects
	        Employee5[] employees = new Employee5[3];
	        employees[0] = new Employee5(101, "John Doe", 45000, date1, dept1);
	        employees[1] = new Employee5(102, "Jane Smith", 55000, date2, dept2);
	        employees[2] = new Employee5(103, "Bob Johnson", 60000, date1, dept2);

	        // Display the array elements
	        for (Employee5 emp : employees) {
	            System.out.println(emp);
	        }
	        
	       
	    }
}
