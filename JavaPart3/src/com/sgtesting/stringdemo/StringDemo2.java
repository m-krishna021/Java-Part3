package com.sgtesting.stringdemo;
class StringExamples1
{
	static void strLength()
	{
		String s=new String("Programming");
		int a=s.length();
		System.out.println("# of Chars :"+a);
		System.out.println("+++++++++++");
	}
	
	static void isEmptyStr()
	{
		String s=new String();
		boolean v1=s.isEmpty();
		System.out.println("Is the given String is Empty ?:"+v1);
		System.out.println("+++++++++++");
	}
	 
	static void getCharAt()
	{
		String s=new String("SGSOFTWARE");
		char ch=s.charAt(1);
		System.out.println("char ch :"+ch);
		System.out.println("+++++++++++");
	}
	
	static void strReplace()
	{
		String s="It is a capital city";
		String s1=s.replace("is", "was");
		System.out.println("Replaced Result :"+s1);
		System.out.println("+++++++++++");
	}
	
	static void strCompare1()
	{
		String s1="JavaScript";
		String s2="JAVASCRIPT";
		System.out.println("s1 and s2 are equal :"+s1.equals(s2));
		System.out.println("s1 and s2 are equal :"+s1.equalsIgnoreCase(s2));
		System.out.println("+++++++++++");
	}
	
	static void strCompare2()
	{
		String s1="JavaScript";
		String s2="JAVASCRIPT";
		System.out.println("s1 and s2 are equal :"+s1.compareTo(s2));
		System.out.println("s1 and s2 are equal :"+s1.compareToIgnoreCase(s2));
		System.out.println("+++++++++++");
	}
	
	static void extractString()
	{
		String s=new String("Programming");
		String s1=s.substring(3);
		System.out.println("Based on Position :"+s1);
		String s2=s.substring(3, 8);
		System.out.println("Based on Range :"+s2);
		System.out.println("+++++++++++");
	}
	
	static void existnaceOfString()
	{
		String s=new String("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");
		System.out.println("Starts With :"+s.startsWith("DAY"));
		System.out.println("Contains :"+s.contains("DAY"));
		System.out.println("ends With :"+s.endsWith("DAY"));
		System.out.println("+++++++++++");
	}
	
	static void getCharArray()
	{
		String s1="JavaScript";
		char ch[]=s1.toCharArray();
		for(char kk:ch)
		{
			System.out.println(kk);
		}
		System.out.println("+++++++++++");
	}
	
	static void splitDemo()
	{
		String s="Apple,Mango,Orange,Banana";
		String s1[]=s.split(",");
		for(String kk:s1)
		{
			System.out.println(kk);
		}
		System.out.println("+++++++++++");
	}
	
	static void convertToString()
	{
		int a=25;
		String s1=String.valueOf(a);
		System.out.println(s1);
		double d=12.75;
		String s2=String.valueOf(d);
		System.out.println(s2);
		System.out.println("+++++++++++");
	}
	
	static void findPosition()
	{
		String s="xxaxxaxxaXXAXXA";
		int a=s.indexOf("A");
		System.out.println("Position of A from Left to Right :"+a);
		int a1=s.indexOf("A", 12);
		System.out.println("Position of A from Left to Right :"+a1);
		System.out.println("+++++++++++");
	}
	
	static void findPositionFromRight()
	{
		String s="xxaxxaxxaXXAXXA";
		int a=s.lastIndexOf("A");
		System.out.println(s.lastIndexOf("xxa"));
		System.out.println("Position of A from Right to Left :"+a);
		int a1=s.lastIndexOf("A", 12);
		System.out.println("Position of A from Right to Left :"+a1);
		System.out.println("+++++++++++");
	}
	
	static void strCase()
	{
		String s="SG SOFTWARE";
		System.out.println("Lower Case :"+s.toLowerCase());
		String s1="sgsoftware";
		System.out.println("Upper Case :"+s.toUpperCase());
		System.out.println("+++++++++++");
	}
}
public class StringDemo2 {
	public static void main(String[] args) {
		StringExamples1.strLength();
		StringExamples1.isEmptyStr();
		StringExamples1.getCharAt();
		StringExamples1.strReplace();
		StringExamples1.strCompare1();
		StringExamples1.strCompare2();
		StringExamples1.extractString();
		StringExamples1.existnaceOfString();
		StringExamples1.getCharArray();
		StringExamples1.splitDemo();
		StringExamples1.convertToString();
		StringExamples1.findPosition();
		StringExamples1.findPositionFromRight();
		StringExamples1.strCase();
	}
}
