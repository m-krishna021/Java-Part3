package com.sgtesting.stringdemo;
class StringBuilderTest
{
	static void appendDemo()
	{
		StringBuilder s=new StringBuilder("Java");
		StringBuilder s1=s.append(" Programming");
		System.out.println("Appended String :"+s1);
		System.out.println("+++++++++++++++++");
	}
	
	static void insertDemo()
	{
		StringBuilder s=new StringBuilder("It is a palace");
		StringBuilder s1=s.insert(8, "new ");
		System.out.println("Inserted String :"+s1);
		System.out.println("+++++++++++++++++");
	}
	
	static void deleteDemo()
	{
		StringBuilder s=new StringBuilder("It is a new palace");
		StringBuilder s1=s.delete(8, 12);
		System.out.println("Deleted String :"+s1);
		System.out.println("+++++++++++++++++");
	}
	
	static void reverseString()
	{
		StringBuilder s=new StringBuilder("It is a new palace");
		System.out.println("Reverse String :"+s.reverse());
		System.out.println("+++++++++++++++++");
	}
}
public class StringBuilderDemo1 {
	public static void main(String[] args) {
		StringBuilderTest.appendDemo();
		StringBuilderTest.insertDemo();
		StringBuilderTest.deleteDemo();
		StringBuilderTest.reverseString();

	}

}
