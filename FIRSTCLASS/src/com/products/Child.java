package com.products;

public class Child extends Parent
{
	
	public  Object workHard()
	{
		System.out.println("wakeup anytime goto bar...");
		return 0;
		
	}
	
	public void love()
	{
		System.out.println("iam in love...");
	}
	
	public static void main(String[] args) {
		
		
		Parent obj=new Child();
		obj.workHard();
		
		
	}

	

}
