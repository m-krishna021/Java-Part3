package com.sgtesting.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegExpDemo1
{
	static void matchesDemo()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java");
		
		boolean val=match.matches();
		System.out.println(val);
		System.out.println("++++++++++++");
	}
	
	static void findDemo()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jdk jre java jvm java");
		
		boolean val=match.find();
		System.out.println(val);
		System.out.println("++++++++++++");
	}
	
	static void findCountOfMatch()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jdk jre java jvm java");
		int count=0;
		while(match.find())
		{
			count=count+1;
		}
		System.out.println("# of Occurance :"+count);
		System.out.println("++++++++++++");
	}
	
	static void findPositions()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jdk jre java jvm java");
		while(match.find())
		{
			System.out.println("Start Position :"+match.start()+" End Position:"+match.end());
		}
		System.out.println("++++++++++++");
	}
	
	static void replaceDemo()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jdk jre java jvm java");
		String s=match.replaceAll("python");
		System.out.println(s);
		System.out.println("++++++++++++");
	}
	
	static void splitDemo()
	{
		Pattern pattern=Pattern.compile("[!@#$%]");
		String s="Apple!Mango@Banana#Orange$Grapes%PineApple";
		String s1[]=pattern.split(s);
		for(String k:s1)
		{
			System.out.println(k);
		}
	}
}
public class RegularExpressionDemo1 {
	public static void main(String[] args) {
	//	RegExpDemo1.matchesDemo();
	//	RegExpDemo1.findDemo();
	//	RegExpDemo1.findCountOfMatch();
	//	RegExpDemo1.findPositions();
	//	RegExpDemo1.replaceDemo();
		RegExpDemo1.splitDemo();
	}

}
