package com.icici.loans.homeloans;

public class StringDemo 
{
	
	
	public static void main(String[] args) 
	{
		
		StringBuffer s1=new StringBuffer("ravikanth");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1=s1.append("lella");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		
		/*String s1="ravikanth";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		
		String s2=new String("lella");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		
		//s1=s1+s2;
		s1=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s1.hashCode());*/
		
		
		
	}

}
