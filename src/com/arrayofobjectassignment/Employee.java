package com.arrayofobjectassignment;

public class Employee {
	
	    private int id;
	    private String name;
	    private double salary;

	    public Employee(int id, String name, double salary) {
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
	        Employee[] emp = new Employee[3];

	        
	        emp[0] = new Employee(101, "Karan", 50000.0);
	        emp[1] = new Employee(102, "Amol", 60000.0);
	        emp[2] = new Employee(103, "Shubham", 55000.0);

	        
	        System.out.println("Employee Details:");
	        for (Employee e : emp) 
	        {
	            System.out.println(e);
	        }
	    }
	

}
