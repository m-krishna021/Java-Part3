package com.sgtesting.Threads;
class Sample1 implements Runnable
{
	public void run()
	{
		System.out.println("It is a run method statement !!!!");
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		Sample1 job=new Sample1();
		
		Thread t1=new Thread(job);
		t1.setName("alpha");
		t1.start();
	}
}