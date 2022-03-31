package com.example.demo;

public class ReverseString {

	public static void main(String [] args)
	{
		///newly added 123
		String n = "hello";
		String ne="";
		int a =n.length()-1;
		for (int i=a;i>=0;i--)
		{
		ne= ne + n.charAt(i);	
		}
		System.out.println(ne);
	}
	}

