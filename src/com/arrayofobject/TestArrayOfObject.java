package com.arrayofobject;

public class TestArrayOfObject {

	public static void main(String[] args) {
		Student1 s1=new Student1(1,"karan",new double[] {12,34,44});
		Student1 s2=new Student1(2,"Amol",new double[] {54,44,604});
		Student1 s3=new Student1(3,"Ravi",new double[] {19,24,84});
		Student1 s4=new Student1(4,"Shubham",new double[] {92,94,14});
		Student1 s5=new Student1(5,"krishna",new double[] {62,54,54});
		
		
		
//		System.out.println("---------Student1----------");
//		s1.display();
//		
//		System.out.println("---------Student2----------");
//		s2.display();
//		
//		System.out.println("---------Student3----------");
//		s3.display();
//		
//		System.out.println("---------Student4----------");
//		s4.display();
//		
//		System.out.println("---------Student5----------");
//		s5.display();
		
		
		//OR
		
		double m1[]= {12,34,56};
		Student1 ss=new Student1(1,"karan",m1);
		
		ss.display();

	}

}
