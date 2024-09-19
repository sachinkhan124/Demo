package Multithreadingdemo;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
    private List<Object> list = new ArrayList<>();

    public void addToList(Object obj) {
        list.add(obj); // Object is added to the list and never removed
        
    }

    public static void main(String[] args) {
        MemoryLeakExample example = new MemoryLeakExample();
        for (int i = 0; i < 1000000; i++) {
            example.addToList(new Object());
        }
    }
}
