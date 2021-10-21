package com.sgtesting.collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

class LinkedListTest
{
	static void addElements()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add(1,"Orange");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		LinkedList<String> obj1=new LinkedList<String>();
		obj1.add("Green");
		obj1.add("White");
		obj1.add("Blue");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	static void removeElements()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Grapes");
		System.out.println("Elements :"+obj);
		obj.remove(2);
		System.out.println("Elements :"+obj);
		obj.remove("Grapes");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	static void readElements1()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Grapes");
		System.out.println("Elements :"+obj);
		for(String s:obj)
		{
			System.out.println(s);
		}
	}
	
	static void readElements2()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Grapes");
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	
	static void readElements3()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Grapes");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	static void readElements4()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Grapes");
		System.out.println("Elements :"+obj);
		ListIterator<String> ite=obj.listIterator();
		
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
		System.out.println("+++++++++++++");
		while(ite.hasPrevious())
		{
			System.out.println(ite.previous());
		}
	}
	
	static void queueDemo()
	{
		Queue<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		System.out.println("Elements :"+obj);
		obj.remove();
		System.out.println("Elements :"+obj);
	}
	
	static void rawApproach()
	{
		LinkedList obj=new LinkedList();
		System.out.println("Elements :"+obj);
		obj.add(25);
		obj.add('Y');
		obj.add(12.75);
		obj.add("Mango");
		obj.add(true);
		System.out.println("Elements :"+obj);
	}
}
public class LinkedListDemo {
	public static void main(String[] args) {
	//	LinkedListTest.addElements();
	//	LinkedListTest.removeElements();
	//	LinkedListTest.readElements1();
	//	LinkedListTest.readElements2();
	//	LinkedListTest.readElements3();
	//	LinkedListTest.readElements4();
	//	LinkedListTest.queueDemo();
		LinkedListTest.rawApproach();
	}

}
