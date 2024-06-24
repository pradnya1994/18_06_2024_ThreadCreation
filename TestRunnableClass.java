package javaThreads;

public class TestRunnableClass 
{

	public static void main(String[] args) 
	{

		Example2 example1 = new Example2();		
		Example2 example2 = new Example2();

		Thread t1 = new Thread(example1);
		Thread t2 = new Thread(example2);

		t1.setName("Pradnya");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();		
		t2.start();


	}

}
