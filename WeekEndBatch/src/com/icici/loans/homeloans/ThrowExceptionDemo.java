package com.icici.loans.homeloans;

import java.util.Scanner;

public class ThrowExceptionDemo extends Exception
{

	public ThrowExceptionDemo(String string) 
	{
		super(string);
	}

	public static void main(String[] args) throws ThrowExceptionDemo 
	{
		String num;
		Scanner sc=new Scanner(System.in);
		while (true) 
		{
			try 
			{
				System.out.println("Enter 10 digit alphanumaric value :");
				num = sc.nextLine();
				if (num.length() != 10) 
				{
					throw new ThrowExceptionDemo("Number should be 10 digit");
				}
				else
				{
					System.out.println(num);
					break;
				}
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			} 
		}
	}

}
