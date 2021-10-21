package com.sgtesting.collections;
class ReadElements
{
	public static<E> void displayElements(E elements[])
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
	}
}
public class GenericElementsReadDemo {
	public static void main(String[] args) {
		
		Integer a[]= {10,20,30,40,50};
		ReadElements.displayElements(a);
		
		String s[]= {"Apple","Mango","Orange"};
		ReadElements.displayElements(s);

		Double d[]= {12.75,6.25,10.15};
		ReadElements.displayElements(d);
	}

}
