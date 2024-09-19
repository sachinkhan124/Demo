package Multithreadingdemo;

public class Test  extends Thread {
	
	
	public void run()
	{
		System.out.println("thread 0: "+Thread.currentThread().getName());
		System.out.println("task");
	}

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println("mainThread:"+t.currentThread().getName());
		t.start();
        
	}

}
