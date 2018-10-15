package com.icici.loans.eduloans;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> h=new LinkedHashSet<>();
		h.add(10);
		h.add(20);
		h.add(10);
		h.add(50);
		h.add(30);
		
		System.out.println(h);

	}

}
