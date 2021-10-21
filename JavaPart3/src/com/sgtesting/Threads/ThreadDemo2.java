package com.sgtesting.Threads;

class Sample2 implements Runnable
{
	public void run()
	{
		System.out.println("It is a run method statement !!!!");
		displayEvenNumbers();
	}
	
	void displayEvenNumbers()
	{
		System.out.println("Display Even Numbers...");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				System.out.println(Thread.currentThread().getName()+" Displays Even Number :"+i);
			}
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		Sample2 job=new Sample2();
		
		Thread t1=new Thread(job);
		t1.setName("alpha");
		t1.start();
	}
}
