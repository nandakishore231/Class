package com.products;

public class CalculatorConstructor 
{
	int a,b,c;
	

	public CalculatorConstructor(int a, int b) 
	{
		this.a=a;
		this.b=b;
	}
	
	public void add()
	{
		c=a+b;
		System.out.println("Addition oa A & B is :" + c);
	}


	public static void main(String[] args) 
	{
		CalculatorConstructor a=new CalculatorConstructor(100,200);
		a.add();

	}

}
