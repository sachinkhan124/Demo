package Multithreadingdemo;

public class Main {

	public static void main(String[] args) {
	 
		Thread t = Thread.currentThread();
		t.setName("my main thread");
		t.setPriority(7);
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
        
	}

}
