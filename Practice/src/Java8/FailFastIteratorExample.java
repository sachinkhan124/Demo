package Java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIteratorExample {

	 public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("One");
	        list.add("Two");
	        list.add("Three");

	        Iterator<String> iterator = list.iterator();

	        while (iterator.hasNext()) {
	            String value = iterator.next();
	            System.out.println(value);
	            
	            // Attempting to modify the list while iterating over it
	            if ("Two".equals(value)) {
	                list.remove(value); // This will cause a ConcurrentModificationException
	                
	            }
	        }
	    }
	}
	

