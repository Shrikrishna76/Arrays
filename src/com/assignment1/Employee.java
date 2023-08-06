package com.assignment1;
/*
 * WAP to print the employees from Employee[] array who has same salary (Create Employee class which has 3 attributes id, name, salary and add
 *  employee objects to your array) 
 */

public class Employee 
{
	 	private int id;
	    private String name;
	    private double salary;

	    public Employee(int id, String name, double salary)
	    {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    public int getId() 
	    {
	        return id;
	    }

	    public String getName()
	    {
	        return name;
	    }

	    public double getSalary()
	    {
	        return salary;
	    }

	    @Override
	    public String toString() 
	    {
	        return "Employee id=" + id + " Name=" + name + " Salary=" + salary ;
	    }

	    public static void main(String[] args) {
	        // Creating employee objects and adding them to the array
	        Employee[] emp = new Employee[5];
	        emp[0] = new Employee(101, "karan", 50000);
	        emp[1] = new Employee(102, "Amol", 55000);
	        emp[2] = new Employee(103, "Irfan", 50000);
	        emp[3] = new Employee(104, "Shubham", 60000);
	        emp[4] = new Employee(105, "Ravi", 60000);

	        // Find employees with the same salary
	        for (int i = 0; i < emp.length - 1; i++) 
	        {
	            for (int j = i + 1; j < emp.length; j++)
	            {
	                if (emp[i].getSalary() == emp[j].getSalary())
	                {
	                    System.out.println("Employees with the same salary:");
	                    System.out.println(emp[i]);
	                    System.out.println(emp[j]);
	                    System.out.println("------------------------");
	                }
	            }
	        }
	    }

}
