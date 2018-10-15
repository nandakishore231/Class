package com.icici.loans.homeloans;

import java.util.Scanner;

public class ExcepDemo 
{

	public static void main(String[] args) 
	{
		int nr,dr,result;
		
		while (true) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Numarator value :");
			nr = sc.nextInt();
			System.out.println("Enter Denominator value :");
			dr = sc.nextInt();
			
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;

			}
		
			catch (Exception e) 
			{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("Denominator value should be greater than zero...");
			} 
			
			finally 
			{
				System.out.println("Iam finally Block");
			}
		}

	}

}
