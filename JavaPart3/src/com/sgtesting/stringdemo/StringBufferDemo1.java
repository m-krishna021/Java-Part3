package com.sgtesting.stringdemo;
class StringBufferTest
{
	static void appendDemo()
	{
		StringBuffer s=new StringBuffer("Java");
		StringBuffer s1=s.append(" Programming");
		System.out.println("Appended String :"+s1);
		System.out.println("+++++++++++++++++");
	}
	
	static void insertDemo()
	{
		StringBuffer s=new StringBuffer("It is a palace");
		StringBuffer s1=s.insert(8, "new ");
		System.out.println("Inserted String :"+s1);
		System.out.println("+++++++++++++++++");
	}
	
	static void deleteDemo()
	{
		StringBuffer s=new StringBuffer("It is a new palace");
		StringBuffer s1=s.delete(8, 12);
		System.out.println("Deleted String :"+s1);
		System.out.println("+++++++++++++++++");
	}
	
	static void reverseString()
	{
		StringBuffer s=new StringBuffer("It is a new palace");
		System.out.println("Reverse String :"+s.reverse());
		System.out.println("+++++++++++++++++");
	}
}
public class StringBufferDemo1 {
	public static void main(String[] args) {
		StringBufferTest.appendDemo();
		StringBufferTest.insertDemo();
		StringBufferTest.deleteDemo();
		StringBufferTest.reverseString();
	}

}
