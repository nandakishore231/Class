package com.icici.loans.carloans;

class Parent 
{
	
	
	Number workHard()
	{
		System.out.println("Wakeup early ,Goto College....");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Atmost care....");
	}
}

class Child extends Parent
{
	Object workHard()
	{
		System.out.println("Wakeup anytime ,Goto bar....");
		return 0;
	}
	
	public void love()
	{
		System.out.println("iam in love....");
	}
	
}


public class DriverClass
{
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.workHard();
		p.care();
		
		Child c=new Child();
		c.care();
		c.love();
		c.workHard();
		
		Parent x=new Child();
		x.workHard();
		x.care();
	}
}
