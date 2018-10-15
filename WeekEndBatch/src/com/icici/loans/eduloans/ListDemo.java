package com.icici.loans.eduloans;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add("ravilella");
		a.add(12.34f);
		a.add(10);
		a.add(50);
		
		System.out.println(a);
		//System.out.println(a.get(2));
		Object val = a.get(1);
		
		if(val instanceof Integer)
		{
			Integer v1 = (Integer)val;
			System.out.println(v1);
		}
		else if(val instanceof String)
		{
			String v1 = (String)val;
			System.out.println(v1);
		}
		

	}

}
