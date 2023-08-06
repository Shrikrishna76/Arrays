package com.arrayofobjectassignment;

public class Employee1 {
	
    private int id;
    private String name;
    private double salary;

    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        // Creating an array of Employee objects
        Employee1[] emp1 = new Employee1[3];

        
        emp1[0] = new Employee1(101, "Karan", 5000.0);
        emp1[1] = new Employee1(102, "Amol", 60000.0);
        emp1[2] = new Employee1(103, "Shubham", 55000.0);

        
        System.out.println("Employee Details:");
        for (Employee1 e : emp1) 
        {
        	if(e.getSalary()>10000)
        	{
        		System.out.println(e);
        	}
        }
    }


}