package com.icici.loans.homeloans;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<>();
		l.add("ravi");
		l.add("kanth");
		l.add("lella");
		
		System.out.println(l);
		
		ListIterator<String> val = l.listIterator();
		while(val.hasNext())
		{
			String v = val.next();
			if(v.contains("kanth"))
				val.set("ravikanthlella");
			else
				val.remove();
		}
		System.out.println(l);

	}

}
