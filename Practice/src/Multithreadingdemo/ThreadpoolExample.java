package Multithreadingdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadpoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks to the thread pool
        for (int i = 1; i <= 5; i++) {
            Runnable task = new WorkerThread("Task " + i);
            executor.execute(task);
        }

        //which will cause it to reject new tasks. Two different methods are provided for shutting down an ExecutorService. The shutdown method will allow previously submitted tasks to execute before  Shutdown the executor after task submission
        executor.shutdown();

        // Wait for all tasks to finish
        while (!executor.isTerminated()) {
        }

        System.out.println("All tasks completed.");
    }
}

class WorkerThread implements Runnable {
    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) " + message);
        processTask();
        System.out.println(Thread.currentThread().getName() + " (End)");
    }

    private void processTask() {
        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
