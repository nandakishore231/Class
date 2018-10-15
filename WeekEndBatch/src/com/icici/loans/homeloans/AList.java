package com.icici.loans.homeloans;

import java.util.ArrayList;

public class AList {

	public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<>();
		a.add(10);
		a.add("ravilella");
		a.add(12.34f);
		a.add(10);
		a.add(20);
		a.add(30);
		
		System.out.println(a);
		
		Object val = a.get(1);
		
		if(val instanceof String)
		{
			String v1 = (String)val;
			System.out.println(v1);
		}
		else if(val instanceof Integer)
		{
			Integer v2 = (Integer)val;
			System.out.println(v2);
		}

	}

}
