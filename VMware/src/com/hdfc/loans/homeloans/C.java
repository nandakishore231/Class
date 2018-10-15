package com.hdfc.loans.homeloans;

import com.hdfc.loans.carloans.A;

public class C extends A
{
	
	public void m1()
	{
		System.out.println("iam overridden m1 in class C");
	}
	
	void m3()
	{
		System.out.println("iam m3 in class C");
	}


	public static void main(String[] args) 
	{
		C c=new C();
		c.m3();
		c.m1();
		
		A a=new A();
		a.m1();
		
		A x=new C();
		x.m1();
		
		//C y=new A();
	}

}
