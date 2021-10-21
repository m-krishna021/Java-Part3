package com.sgtesting.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ArrayListTest
{
	static void addElements()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add(0,"Orange");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		List<String> obj1=new ArrayList<String>();
		obj1.add("Green");
		obj1.add("White");
		obj1.add("Blue");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	static void removeElements()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Tomoto");
		System.out.println("Elements :"+obj);
		obj.remove(1);
		System.out.println("Elements :"+obj);
		obj.remove("Grapes");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	static void readElements1()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Tomoto");
		System.out.println("Elements :"+obj);
		for(String s:obj)
		{
			System.out.println(s);
		}
	}
	
	static void readElements2()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Tomoto");
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	
	static void readElements3()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Tomoto");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	static void rawApproach()
	{
		ArrayList obj=new ArrayList();
		System.out.println("Elements :"+obj);
		obj.add(25);
		obj.add('Y');
		obj.add(12.75);
		obj.add("Mango");
		obj.add(true);
		System.out.println("Elements :"+obj);
	}
}
public class ArrayListDemo {
	public static void main(String[] args) {
	//	ArrayListTest.addElements();
	//	ArrayListTest.removeElements();
	//	ArrayListTest.readElements1();
	//	ArrayListTest.readElements2();
	//	ArrayListTest.readElements3();
		ArrayListTest.rawApproach();
	}

}
