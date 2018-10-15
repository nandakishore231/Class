package com.icici.loans.homeloans;

import java.util.Scanner;

public class DynamicExcep extends Exception
{
	String msg;
	
	public DynamicExcep(String msg) 
	{
		super(msg);
	}

	public static void main(String[] args) throws DynamicExcep 
	{
		//DynamicExcep obj=new DynamicExcep();
		
		String num;
		int sal;
		Scanner sc=new Scanner(System.in);
		while (true) 
		{
			try 
			{
				System.out.println("Please enter 10 digit AlthaNumaric value :");
				num = sc.nextLine();
				if (num.length() != 10) 
				{
					throw new DynamicExcep("Number should be 10 digit value");
				} 
				else 
				{
					System.out.println(num);
				}

				System.out.println("Enter the employee salary:");
				sal = sc.nextInt();
				if (sal <= 5000) 
				{
					throw new DynamicExcep("Salary should be greaterthan 5000");
				} 
				else 
				{
					System.out.println(sal);
				}
			} 
			catch (DynamicExcep msg) 
			{
				System.out.println(msg);
			} 
		}
		

	}

}
