package com.sgtesting.serializationdemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		Employee obj=null;
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try
		{
			obj=new Employee();
			fout=new FileOutputStream("F:\\CITY\\Employee.ser");
			out=new ObjectOutputStream(fout);
			out.writeObject(obj);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				out.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
