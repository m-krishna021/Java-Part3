package com.sgtesting.serializationdemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) {
		FileInputStream fin=null;
		ObjectInputStream in=null;
		Employee obj=null;
		try
		{
			fin=new FileInputStream("F:\\CITY\\Employee.ser");
			in=new ObjectInputStream(fin);
			obj=(Employee) in.readObject();
			
			obj.displayFirstName("Santosh");
			obj.displayAge(19);
			obj.displayCityName("Bangalore");
			obj.displayAddress("7th Main RPC Layout");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
