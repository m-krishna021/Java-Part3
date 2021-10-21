package com.sgtesting.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TreeMapTest
{
	static void addElements()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("lotus", "Lotus is a national flower of India");
		obj.put("mango", "Mango is a king of the Fruit");
		obj.put("camel", "Camel is a ship of the desert");
		obj.put("peacock", "Peacock is a national bird of India");
		obj.put("bangalore", "Bangalore is a capital city of Karnataka");
		System.out.println("Elements :"+obj);
	}
	
	static void removeElements()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("lotus", "Lotus is a national flower of India");
		obj.put("mango", "Mango is a king of the Fruit");
		obj.put("camel", "Camel is a ship of the desert");
		obj.put("peacock", "Peacock is a national bird of India");
		obj.put("bangalore", "Bangalore is a capital city of Karnataka");
		System.out.println("Elements :"+obj);
		String s=obj.get("mango");
		System.out.println(s);
		obj.remove("mango");
		String s1=obj.get("mango");
		System.out.println(s1);
	}
	
	static void readElements1()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("lotus", "Lotus is a national flower of India");
		obj.put("mango", "Mango is a king of the Fruit");
		obj.put("camel", "Camel is a ship of the desert");
		obj.put("peacock", "Peacock is a national bird of India");
		obj.put("bangalore", "Bangalore is a capital city of Karnataka");
		System.out.println("Elements :"+obj);
		Set set=obj.entrySet();
		Iterator ite=set.iterator();
		while(ite.hasNext())
		{
			Map.Entry<String, String> me=(Map.Entry<String, String>)ite.next();
			System.out.println(me.getKey()+" ---->  "+me.getValue());
		}	
	}
	
	static void readElements2()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("lotus", "Lotus is a national flower of India");
		obj.put("mango", "Mango is a king of the Fruit");
		obj.put("camel", "Camel is a ship of the desert");
		obj.put("peacock", "Peacock is a national bird of India");
		obj.put("bangalore", "Bangalore is a capital city of Karnataka");
		System.out.println("Elements :"+obj);
		
		obj.forEach((k,v) -> System.out.println(k+ " ==> "+ v));
	}
}
public class TreeMapDemo {
	public static void main(String[] args) {
	//	TreeMapTest.addElements();
	//	TreeMapTest.removeElements();
	//	TreeMapTest.readElements1();
		TreeMapTest.readElements2();
	}

}
