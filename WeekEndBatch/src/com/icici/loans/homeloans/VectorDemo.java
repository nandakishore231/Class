package com.icici.loans.homeloans;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<>();
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		
		System.out.println(v);
		Enumeration<Integer> ele = v.elements();
		while(ele.hasMoreElements())
		{
			Integer val = ele.nextElement();
			if(val%2==0)
				System.out.println(val);
		}
		
		System.out.println(v);
	}

}
