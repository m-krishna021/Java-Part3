package com.sgtesting.stringdemo;
/**
 * String Buffer is mutable
 * The object of StringBuffer accepts modifications
 *
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Java");
		System.out.println(s);
		s.append(" Programming");
		System.out.println(s);
		s.append(" Language");
		System.out.println(s);
	}
}
/*
   
StringBuffer s=new StringBuffer();
------------
StringBuffer s=new StringBuffer("Java");
-----------
StringBuffer s=new StringBuffer("Java");
StringBuffer s1=new StringBuffer(s);
-----------
String s=new String("Java");
StringBuffer s1=new StringBuffer(s);
----------
StringBuilder s=new StringBuilder("Java");
StringBuffer s1=new StringBuffer(s);
*/