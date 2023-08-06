package com.arrayofobjectassignment;
//Create array of students, student has (roll, name, age, marks). Print only 
//those students who have marks more than 60 and age is less than 15

public class Students {
	private int sroll;
	private String sname;
	private int sage;
	private double smarks;
	
	Students(int sroll, String sname, int sage,double smarks)
	{
		this.sroll=sroll;
		this.sname=sname;
		this.sage=sage;
		this.smarks=smarks;
	}
	
	
	
	public int getSroll() {
		return sroll;
	}



	public void setSroll(int sroll) {
		this.sroll = sroll;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public int getSage() {
		return sage;
	}



	public void setSage(int sage) {
		this.sage = sage;
	}



	public double getSmarks() {
		return smarks;
	}



	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}



	@Override
	public String toString() {
		return "Students: [sroll=" + sroll + ", sname=" + sname + ", sage=" + sage + ", smarks=" + smarks + "]";
	}



	public static void main(String[] args) {
		
		Students s[]=new Students[4];
		s[0]=new Students(1, "karan", 18, 89);
		s[1]=new Students(2, "Rohan", 8, 90);
		s[2]=new Students(3, "Nitin", 21, 82);
		s[3]=new Students(4, "kartik", 12, 88);
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].smarks>60&&s[i].sage<15)
			{
				System.out.println(s[i]);
			}
		}
		
		

	}

}
