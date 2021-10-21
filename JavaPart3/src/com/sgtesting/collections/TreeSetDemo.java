package com.sgtesting.collections;
import java.util.Iterator;
import java.util.TreeSet;

class TreeSetTest
{
	static void addElements()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Banana");
		obj.add("PineApple");
		obj.add("Grapes");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		TreeSet<String> obj1=new TreeSet<String>();
		obj1.add("Green");
		obj1.add("White");
		obj1.add("Blue");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	static void removeElements()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Banana");
		obj.add("PineApple");
		obj.add("Grapes");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		obj.remove("Apple");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	static void readElements1()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Banana");
		obj.add("PineApple");
		obj.add("Grapes");
		System.out.println("Elements :"+obj);
		for(String s:obj)
		{
			System.out.println(s);
		}
	}
	
	static void readElements2()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Banana");
		obj.add("PineApple");
		obj.add("Grapes");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	static void readElements3()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Banana");
		obj.add("PineApple");
		obj.add("Grapes");
		System.out.println("Elements :"+obj);
		Object a[]=obj.toArray();
		for(int i=0;i<a.length;i++)
		{
			String s=(String) a[i];
			System.out.println(s);
		}
	}
}
public class TreeSetDemo {
	public static void main(String[] args) {
	//	TreeSetTest.addElements();
	//	TreeSetTest.removeElements();
	//	TreeSetTest.readElements1();
	//	TreeSetTest.readElements2();
		TreeSetTest.readElements3();
	}

}
