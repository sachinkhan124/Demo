package Multithreadingdemo;

public class CounterThreadmain {

	public static void main(String[] args) {
		     Counter counter = new Counter();
	        CounterThread t1 = new CounterThread(counter);
	        CounterThread t2 = new CounterThread(counter);
//	          t1.start();
//	          t1.start();
//	        try {
//	            t1.join();
//	            t2.join();
//	        } catch (InterruptedException e) {
//	            System.out.println(e);
//	        }
//
//	        System.out.println("Final count: " + counter.getCount());
	    }
}

