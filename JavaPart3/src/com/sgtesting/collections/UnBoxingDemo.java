package com.sgtesting.collections;
//Convert Wrapper object into Primitive [UnBoxing]
public class UnBoxingDemo {

	public static void main(String[] args) {
		//Wrapper object Integer
		Integer a=Integer.valueOf(125);
		System.out.println("Integer a :"+a);
		
		//Convert it into primitive
		int b=a.intValue();
		System.out.println("int b:"+b);
		
		//Unboxing [convert object to primitive]
		int c=a;
		System.out.println("int c:"+c);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//Wrapper object Double
		Double d=Double.valueOf(12.75);
		System.out.println("Double d:"+d);
		//Convert it into primitive
		double d1=d.doubleValue();
		System.out.println("doubel d1 :"+d1);
		
		//Unboxing [convert object to primitive]
		double d2=d;
		System.out.println("double d2:"+d2);
	}

}
