package com.icici.loans.eduloans;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<>();
		l.add("ravi");
		l.add("varma");
		l.add("lella");
		
		System.out.println(l);
		
		ListIterator<String> var = l.listIterator();
		while(var.hasNext())
		{
			String val = var.next();
			if(val.contains("varma"))
				var.set("kanth");
			else
				var.remove();
		}
		System.out.println(l);
	}

}
