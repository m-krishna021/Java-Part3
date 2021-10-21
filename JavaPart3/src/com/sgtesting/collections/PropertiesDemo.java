package com.sgtesting.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

class PropertiesTest
{
	static void writeContent()
	{
		FileOutputStream fout=null;
		Properties prop=null;
		try
		{
			fout=new FileOutputStream("H:\\CITY\\Test.properties");
			prop=new Properties();
			prop.setProperty("username", "demoUser1");
			prop.setProperty("password", "Welcome1");
			prop.setProperty("tokenid", "123$325123");
			prop.store(fout, "It is an example Properties");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				prop.clear();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	static void readContent()
	{
		FileInputStream fin=null;
		Properties prop=null;
		try
		{
			fin=new FileInputStream("H:\\CITY\\Test.properties");
			prop=new Properties();
			prop.load(fin);
			
			String s1=prop.getProperty("username");
			System.out.println(s1);
			
			String s2=prop.getProperty("password");
			System.out.println(s2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				prop.clear();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class PropertiesDemo {
	public static void main(String[] args) {
	//	PropertiesTest.writeContent();
		PropertiesTest.readContent();
	}

}
