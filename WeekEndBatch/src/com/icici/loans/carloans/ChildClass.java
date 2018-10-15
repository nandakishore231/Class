package com.icici.loans.carloans;

public class ChildClass extends ConstructorDemo
{
	int p;
	
	public ChildClass(int p) 
	{
		super(1744,"ravilella",12.34f);
		this.p=p;
		System.out.println(this.p);
	}

	public static void main(String[] args) 
	{
		ChildClass c=new ChildClass(1);

	}

}
