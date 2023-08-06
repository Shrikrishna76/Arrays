package com.arrayofobjectassignment;

public class EmployeeArray {

	public static void main(String[] args) {
		Department hrDept = new Department(1, "Human Resources");
        Department itDept = new Department(2, "Information Technology");
        Department salesDept = new Department(3, "Sales");

        // Creating Employee objects with respective departments
        Employee3[] emp = new Employee3[4];
        emp[0] = new Employee3(101, "karan", 50000, hrDept);
        emp[1] = new Employee3(102, "Amol", 60000, itDept);
        emp[2] = new Employee3(103, "Shubham", 55000, hrDept);
        emp[3] = new Employee3(104, "Ravi", 70000, salesDept);

        // Traversing the array and displaying employee data
        System.out.println("Employee Data:");
        for (Employee3 e : emp) {
            System.out.println(e);
        }
        
        System.out.println();
        System.out.println("Sales Department:");
        
      
        for(int i=0;i<emp.length;i++)
        {
        	if(emp[i].department.dname=="Sales")
        	{
        		System.out.println(emp[i]);
        	}
        }
        
        
        
        System.out.println();
       
        System.out.println("Employees in the same department :");
        
        for(int i=0;i<emp.length;i++)
        {
        	for(int j=i+1;j<emp.length;j++)
        	{
        		if(emp[i].department==emp[j].department)
        		{
        			System.out.println("Same Department: "+emp[i]);
        			System.out.println("Same Department: "+emp[j]);
        		}
        	}
        }
        
       
    }

	

}
