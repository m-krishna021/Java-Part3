package com.sgtesting.collections;
// Converting Primitive value in to Wrapper Object [Autoboxing]
public class AutoBoxingDemo {
 // Converting Primitive value in to Wrapper Object
	public static void main(String[] args) {
		
		//Primitive value declaration
		int a=125;
		System.out.println("int  a :"+a);
		
		//Convert it into Wrapper object
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b:"+b);
		
		// Converting Primitive value in to Wrapper Object [AutoBoxing]
		Integer c=a;
		System.out.println("Integer c:"+c);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		//Primitive value Declaration
		double d=12.75;
		System.out.println("double d :"+d);
		//Convert it into Wrapper object
		Double d1=Double.valueOf(d);
		System.out.println("Double d1:"+d1);
		// Converting Primitive value in to Wrapper Object [AutoBoxing]
		Double d2=d;
		System.out.println("Double d2 :"+d2);
		

	}

}
