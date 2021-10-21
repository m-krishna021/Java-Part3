package com.sgtesting.collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

class VectorTest
{
	static void addElements()
	{
		List<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add(1,"Orange");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		Vector<String> obj1=new Vector<String>();
		obj1.add("Green");
		obj1.add("White");
		obj1.add("Blue");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	static void removeElements()
	{
		List<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add(1,"Orange");
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
		List<String> obj=new Vector<String>();
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
		List<String> obj=new Vector<String>();
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
		List<String> obj=new Vector<String>();
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
	
	static void readElements4()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Tomoto");
		System.out.println("Elements :"+obj);
		Enumeration<String> elements=obj.elements();
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
	}
	
	static void rawApproach()
	{
		Vector obj=new Vector();
		System.out.println("Elements :"+obj);
		obj.add(25);
		obj.add('Y');
		obj.add(12.75);
		obj.add("Mango");
		obj.add(true);
		System.out.println("Elements :"+obj);
	}
}
public class VectorDemo {
	public static void main(String[] args) {
	//	VectorTest.addElements();
	//	VectorTest.removeElements();
	//	VectorTest.readElements1();
	//	VectorTest.readElements2();
	//	VectorTest.readElements3();
	//	VectorTest.readElements4();
		VectorTest.rawApproach();
	}

}
