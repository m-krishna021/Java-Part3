package com.sgtesting.stringdemo;
/*
 * StringBuilder is a mutable and it accepts modifications.
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Java");
		System.out.println(s);
		s.append(" Programming");
		System.out.println(s);
		s.append(" Language");
		System.out.println(s);
	}
}
/*
StringBuilder s=new StringBuilder();
------------
StringBuilder s=new StringBuilder("Java");
------------
StringBuilder s=new StringBuilder("Java");
StringBuilder s1=new StringBuilder(s);
------------
String s=new String("Java");
StringBuilder s1=new StringBuilder(s);
------------
StringBuffer s=new StringBuffer("Java");
StringBuilder s1=new StringBuilder(s);

*/