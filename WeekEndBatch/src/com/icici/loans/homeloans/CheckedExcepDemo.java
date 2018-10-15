package com.icici.loans.homeloans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExcepDemo 
{
	
	public static void m1() throws FileNotFoundException 
	{
		BufferedReader r=new BufferedReader(new FileReader("c://abc.txt"));
	}

	public static void main(String[] args) throws FileNotFoundException 
	{
		m1();
	}

}
