package com.sgtesting.Threads;

class MyClass2 implements Runnable
{
	public void run()
	{
		displayEvenNumbers();
	}
	
	void displayEvenNumbers()
	{
		System.out.println("Display Even Numbers...");
		try
		{
			for(int i=20;i<=40;i++)
			{
				Thread.sleep(1000);
				if(i%2==0)
				{
					System.out.println(Thread.currentThread().getName()+" Displays Even Number :"+i);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class ThreadDemo5 {

	public static void main(String[] args) {
		Runnable job=new MyClass2();
		
		Thread t1=new  Thread(job);
		t1.setName("alpha");
		t1.start();
		
		Thread t2=new Thread(job);
		t2.setName("omega");
		t2.start();
	}

}