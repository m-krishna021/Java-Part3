package com.sgtesting.collections;

import java.util.Dictionary;
import java.util.Hashtable;

class HashtableTest
{
	static void addElements()
	{
		Dictionary<String, String> obj=new Hashtable<String, String>();
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
		Dictionary<String, String> obj=new Hashtable<String, String>();
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
}
public class HashtableDemo {
	public static void main(String[] args) {
	//	HashtableTest.addElements();
		HashtableTest.removeElements();
	}

}
