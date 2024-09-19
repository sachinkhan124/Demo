package Multithreadingdemo;

public class MyRunnable implements Runnable {

	
	@Override
	public void run() {
	
	for(int i=0 ; i<5; i++)
	{
		System.out.println("MyRunnable:"+i);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	}
	
	
	public static void main(String[] args) {
     MyRunnable runnable = new MyRunnable();
     Thread t1 = new Thread(runnable);
     t1.start();
     for(int i=0;i<5;i++)
     {
    	 System.out.println("MainThread:"+i);
    	 try {
			Thread.sleep(1000);
    		 
		} catch (Exception e) {
			System.out.println(e);
		}
     }

	}

	

}
