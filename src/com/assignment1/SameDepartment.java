package com.assignment1;


class Dept1 
{
    int did;
    String dname;

    public Dept1(int did, String dname)
    {
        this.did = did;
        this.dname = dname;
    }
    
    public void setDid(int did)
    {
    	this.did=did;
    }
    
    public void setDname(String dname)
    {
    	this.dname=dname;
    }
    
    public int getDid()
    {
    	return did;
    }
    
    public String getDname()
    {
    	return dname;
    }
}

class MyDate1 
{
    int day;
    int month;
    int year;

    public MyDate1(int day, int month, int year) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class Employee6
{
    int emp_id;
    String emp_name;
    double salary;
    MyDate date;
    Dept dept;

    public Employee6(int emp_id, String emp_name, double salary, MyDate date, Dept dept)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
        this.date = date;
        this.dept = dept;
    }
    public Dept getDept()
    {
    	return dept;
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
public class SameDepartment {

	public static void main(String[] args) {
		// Create some departments
        Dept dept1 = new Dept(1, "HR");
        Dept dept2 = new Dept(2, "Engineering");

        // Create some date objects
        MyDate date1 = new MyDate(15, 7, 2023);
        MyDate date2 = new MyDate(20, 9, 2023);

        // Create an array of Employee objects
        Employee6[] employees = new Employee6[4];
        employees[0] = new Employee6(101, "Irfan", 45000, date1, dept1);
        employees[1] = new Employee6(102, "Amol", 55000, date2, dept2);
        employees[2] = new Employee6(103, "Shubham", 60000, date1, dept2);
        employees[3] = new Employee6(104, "karan", 60000, date1, dept1);

        // Display the array elements
        for (Employee6 emp : employees) {
            System.out.println(emp);
        }
        
        for (int i = 0; i < employees.length - 1; i++) 
        {
            for (int j = i +1; j < employees.length; j++)
            {
                if (employees[i].getDept() == employees[j].getDept())
                {
                    System.out.println("Employees with the same Department:");
                    System.out.println(employees[i]);
                    System.out.println(employees[j]);
                    System.out.println("------------------------");
                 }
                
                
                
            }
           
        }

	}

}
