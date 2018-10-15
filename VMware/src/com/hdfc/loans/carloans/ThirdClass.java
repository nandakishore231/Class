package com.hdfc.loans.carloans;

public class ThirdClass
{
	  
	int a,b,c;
	
	public void add()
	{
		c=a+b;
		System.out.println("addition of a and b is:"+c);
		
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("subtraction of a and b is:"+c);
	}
	public static void main(String[] args) 
	{
		ThirdClass obj=new ThirdClass();
		obj.add();
		obj.sub();
		
		ThirdClass obj1=new ThirdClass();
		obj1.add();
		obj1.sub();
	}
		
}
