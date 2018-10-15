package com.icici.loans.carloans;

import java.util.Scanner;

public class ExcepDemo 
{

	public static void main(String[] args) 
	{
		int nr,dr,result=0;
		Scanner sc=new Scanner(System.in);
		
			
		
		while (true) 
		{
			System.out.println("Enter Numarator value :");
			nr=sc.nextInt();
			System.out.println("Enter Denominator value :");
			dr=sc.nextInt();
			
			try 
			{
				result = nr / dr;
				System.out.println(result);
				throw new ExcepDemo("iam user defined ");
				break;
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			} 
		}

	}

}
