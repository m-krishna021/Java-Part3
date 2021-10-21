package com.sgtesting.stringdemo;
public class StringDemo1 {
	public static void main(String[] args) {
		String s1="JAVA";
		String s2="java";
		String s3="JAVA";
		
		String s4=new String("JAVA");
		String s5=new String("java");
		String s6=new String("JAVA");
		
		System.out.println("(s1==s2) :"+(s1==s2));
		System.out.println("(s1==s3) :"+(s1==s3));
		
		System.out.println("(s1==s4) :"+(s1==s4));
		System.out.println("(s4==s5) :"+(s4==s5));
		System.out.println("(s1==s6) :"+(s1==s6));
	}
}
