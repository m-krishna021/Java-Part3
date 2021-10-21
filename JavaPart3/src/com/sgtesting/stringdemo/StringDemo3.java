package com.sgtesting.stringdemo;
class Sample
{
	String firstname;
	int age;
	
	Sample(String fn,int age)
	{
		firstname=fn;
		this.age=age;
	}
	
	public String toString()
	{
		return "First Name :"+firstname+" and Age of Employee is :"+this.age;
	}
}
public class StringDemo3 {
	public static void main(String[] args) {
		Sample obj=new Sample("Richard",55);
		System.out.println(obj);

	}

}
