package com.sgtesting.collections;
class DemoGenerics<T>
{
	private T obj=null;
	public void add(T obj)
	{
		this.obj=obj;
	}
	
	public T get()
	{
		return obj;
	}
}
public class GenericsDemo {
	public static void main(String[] args) {
		//With Generics
		DemoGenerics<Integer> obj1=new DemoGenerics<Integer>();
		obj1.add(10);
		int a=obj1.get();
		System.out.println(a);
		
		obj1.add(20);
		int b=obj1.get();
		System.out.println(b);
		
		//With Generics
		DemoGenerics<String> obj2=new DemoGenerics<String>();
		obj2.add("Apple");
		String s1=obj2.get();
		System.out.println(s1);

		obj2.add("Mango");
		String s2=obj2.get();
		System.out.println(s2);
		
		//Without Generics
		DemoGenerics obj=new DemoGenerics();
		obj.add("Sunflower");
		String s3=(String) obj.get();
		System.out.println(s3);
		obj.add(25);
		int b1=(int) obj.get();
		System.out.println(b1);
	}
}
