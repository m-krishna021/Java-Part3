package com.sgtesting.collections;
import java.util.HashSet;
import java.util.Iterator;

class HashSetTest
{
	static void addElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Banana");
		obj.add("PineApple");
		obj.add("Grapes");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("Green");
		obj1.add("White");
		obj1.add("Blue");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	static void removeElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Banana");
		obj.add("PineApple");
		obj.add("Grapes");
		System.out.println("Elements :"+obj);
		obj.remove("Apple");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	static void readElements1()
	{
		HashSet<String> obj=new HashSet<String>();
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
		HashSet<String> obj=new HashSet<String>();
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
		HashSet<String> obj=new HashSet<String>();
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
	
	static void rawApproach()
	{
		HashSet obj=new HashSet();
		System.out.println("Elements :"+obj);
		obj.add(25);
		obj.add('Y');
		obj.add(12.75);
		obj.add("Mango");
		obj.add(true);
		System.out.println("Elements :"+obj);
	}
}
public class HashSetDemo {
	public static void main(String[] args) {
		HashSetTest.addElements();
	//	HashSetTest.removeElements();
	//	HashSetTest.readElements1();
	//	HashSetTest.readElements2();
	//	HashSetTest.readElements3();
	//	HashSetTest.rawApproach();
	}

}
