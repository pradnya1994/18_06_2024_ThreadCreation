package javaThreads;

public class Example1 extends Thread
{
	
	public Example1()
	{
		
	}
	
	public void run()
	{
		for(int i = 1; i <= 100000; i++)
		{
			System.out.println(Thread.currentThread()+" : "+i);
			try
			{
				Thread.sleep(0);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
