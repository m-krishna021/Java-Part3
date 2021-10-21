package com.sgtesting.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegExpDemo2
{
	static void regularExpressionTesting1()
	{
		String str="Bangalore recieved 125 mili meter of rain yesterday";
		
		Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
		Matcher match=pattern.matcher(str);
		System.out.println(match.find());
	}
	
	static void regularExpressionTesting2()
	{
		String str="Bangalore recieved 125 mili meter of rain yesterday";
		
		Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
		Matcher match=pattern.matcher(str);
		String s=match.replaceAll("many");
		System.out.println(s);
	}
	
	static void regularExpressionTesting3()
	{
		String str="Bangalore recieved 125 mili meter of rain yesterday";
		
		Pattern pattern=Pattern.compile("[0-9]{3}");
		Matcher match=pattern.matcher(str);
		String s=match.replaceAll("many");
		System.out.println(s);
	}
	
	static void regularExpressionTesting4()
	{
		String str="The temple is at the top of the hill";
		
		Pattern pattern=Pattern.compile("[a-z|A-Z]+");
		Matcher match=pattern.matcher(str);
		while(match.find())
		{
			System.out.println(match.group());
		}
	}
}
public class RegularExpressionDemo2 {
	public static void main(String[] args) {
	//	RegExpDemo2.regularExpressionTesting1();
		RegExpDemo2.regularExpressionTesting2();
	//	RegExpDemo2.regularExpressionTesting3();
	//	RegExpDemo2.regularExpressionTesting4();
	}

}
