package com.sgtesting.collections;

import java.util.Stack;

class StackTest
{
	public static void pushDemo(Stack st,int a)
	{
		st.push(a);
		System.out.println("Element Added :"+a);
	}
	
	public static void popDemo(Stack st)
	{
		int b=(int) st.pop();
		System.out.println("Removed Element :"+b);
	}
}
public class StackDemo {

	public static void main(String[] args) {
		Stack st=new Stack();
		StackTest.pushDemo(st, 10);
		StackTest.pushDemo(st, 20);
		StackTest.pushDemo(st, 30);
		StackTest.pushDemo(st, 40);
		StackTest.pushDemo(st, 50);
		
		StackTest.popDemo(st);

	}

}
