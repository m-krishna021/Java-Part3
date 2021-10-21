package com.sgtesting.serializationdemo;

import java.io.Serializable;

public class Employee implements Serializable{
	
	public void displayFirstName(String firstname)
	{
		System.out.println("First Name :"+firstname);
	}

	public void displayAge(int Age)
	{
		System.out.println("Age :"+Age);
	}
	
	public void displayCityName(String cityname)
	{
		System.out.println("City Name :"+cityname);
	}
	
	public void displayAddress(String address)
	{
		System.out.println("Address  :"+address);
	}
}
