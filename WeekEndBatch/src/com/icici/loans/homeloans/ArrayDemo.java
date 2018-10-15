package com.icici.loans.homeloans;

import java.util.Scanner;

public class ArrayDemo 
{

	public int arrayDemo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size :");
		int asize = sc.nextInt();
		int sum=0;
		
		int[]  a=new int[asize];
		
		System.out.println("Enter Array Elements :");
		for(int i=0;i<asize;i++)
		{
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		//System.out.println("Local Sum of array elements is :" + sum);
		return sum;
	}
	
	public static void main(String[] args) 
	{
		ArrayDemo obj=new ArrayDemo();
		int count = obj.arrayDemo();
		System.out.println("Global Sum of array elements is :" + count);
	}

}
