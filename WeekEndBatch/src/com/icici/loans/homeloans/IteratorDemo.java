package com.icici.loans.homeloans;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList< Integer> a=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		
		Iterator<Integer> val = a.iterator();
		while(val.hasNext())
		{
			Integer v = val.next();
			if(v%2==0)
				System.out.println(v);
			else
				val.remove();
		}
		System.out.println(a);
	}

}
