package javaThreads;

public class Example2 implements Runnable
{

	public Example2()
	{
		
	}
	
	@Override
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
