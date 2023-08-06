package com.assignment1;
/*
 * WAP to print the employees from Employee[] array who has same joining date. You have Employee class which has 4 attributes id, name, salary, 
 * date (date is another object which has 3 attributes day, month, year) and add employee objects to your array 
 */

class Date 
{
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay()
    {
    	return day;
    }
    
    public int getMonth()
    {
    	return month;
    }
    
    public int getYear()
    {
    	return year;
    }
}

class Employee7
{
    int emp_id;
    String emp_name;
    double salary;
    Date date;
    

    public Employee7(int emp_id, String emp_name, double salary, Date date1)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
        this.date = date1;
        
    }
    
    public int getEmp_id()
    {
    	return emp_id;
    }
    
    public String getEmp_name()
    {
    	return emp_name;
    }
    
    public double getSalary()
    {
    	return salary;
    }
    
    public Date getDate()
    {
    	return date;
    }
    
   

    @Override
    public String toString()
    {
        return "Employee ID: " + emp_id +
                ", Name: " + emp_name +
                ", Salary: " + salary +
                ", Date of Joining: " + date.day + "/" + date.month + "/" + date.year ;
                
    }
}


public class SameJoinigDate {

	public static void main(String[] args) {
		
			

	        // Create some date objects
	       	Date date1 = new Date(15, 7, 2023);
	        Date date2 = new Date(20, 9, 2023);
	        Date date3 = new Date(10, 9, 2023);

	        // Create an array of Employee objects
	        Employee7[] employees = new Employee7[4];
	        employees[0] = new Employee7(101, "Irfan", 45000, date1);
	        employees[1] = new Employee7(102, "Amol", 55000, date2);
	        employees[2] = new Employee7(103, "Shubham", 60000, date3);
	        employees[3] = new Employee7(104, "karan", 60000, date1);

	        // Display the array elements
	        for (Employee7 emp : employees) {
	            System.out.println(emp);
	        }
	        
	        for (int i = 0; i < employees.length - 1; i++) 
	        {
	            for (int j = i +1; j < employees.length; j++)
	            {
	                if (employees[i].getDate() == employees[j].getDate())
	                {
	                    System.out.println("Employees with the same Joinig Date:");
	                    System.out.println(employees[i]);
	                    System.out.println(employees[j]);
	                    System.out.println("------------------------");
	                 }
	                
	                
	                
	            }
	           
	        }

	}

}
