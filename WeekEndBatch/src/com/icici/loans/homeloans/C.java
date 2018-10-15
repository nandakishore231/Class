package com.icici.loans.homeloans;

import com.icici.loans.carloans.A;
import com.icici.loans.carloans.B;

public class C extends A
{
	public void m1()
	{
		System.out.println("iam overridden m1 from B ");
	}
	
	public void m3()
	{
		System.out.println("iam m3 from C ");
	}

	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		
		C c=new C();
		c.m1();
		c.m3();
		
		
		A obj=new C();
		obj.m1();
		
		C obj1=new A();
		
	}

}
