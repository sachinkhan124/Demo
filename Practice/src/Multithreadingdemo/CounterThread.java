package Multithreadingdemo;

public class CounterThread  extends Counter{
	
	  private Counter counter;

	public CounterThread(Counter counter) {
		
		this.counter = counter;
	}
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			counter.Increment();
		}
	}

}
