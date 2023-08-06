package com.arrayofobject;

class Food
{
	int foodid;
	String foodname;
	double foodprice;
	
	Food(int foodid, String foodname,double foodprice)
	{
		this.foodid=foodid;
		this.foodname=foodname;
		this.foodprice=foodprice;
	}
	
	public int getFoodid()
	{
		return foodid;
	}
	
	public String getFoodname()
	{
		return foodname;
	}
	
	public double getFoodprice()
	{
		return foodprice;
	}

	@Override
	public String toString() {
		return "Food \nFood Id=" + foodid + "\nFood Name=" + foodname + "\nFood Pricerice=" + foodprice ;
	}
	
	
}

public class TestDemo1 {

	public static void main(String[] args) {
		Food foods[];
		foods=new Food[5];
		
		foods[0]=new Food(1,"pav bhaji",150);
		foods[1]=new Food(2,"misal pav",160);
		foods[2]=new Food(3,"Gulab jamun",112);
		foods[3]=new Food(4,"samosa",50);
		foods[4]=new Food(5,"birayni",450);
		
		for(Food f:foods)
		{
			System.out.println(f);
			System.out.println("__________________________________");
		}

	}

}
