package com.icici.loans.carloans;

public class ConstructorDemo 
{
	int eno;
	String ename;
	float sal;
	
	/*public  ConstructorDemo()
	{
		System.out.println("iam default parent Constructor...");
	}*/
	
	public ConstructorDemo(int eno, String ename) 
	{
		this(1746);
		this.eno=eno;
		this.ename=ename;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
	}

	public ConstructorDemo(int eno, String ename, float sal) 
	{
		this(1745,"ravikanth");
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	
	}

	public ConstructorDemo(int eno) {
		//this();
		this.eno=eno;
		System.out.println(this.eno);
	}

	public static void main(String[] args) 
	{
		ConstructorDemo emp1=new ConstructorDemo(1744,"ravilella",10000.22f);
		
	}

}
