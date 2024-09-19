package Java8;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorRemoveExample {

	public static void main(String[] args) {
    
//		 List<Integer> numbers = new ArrayList<>();
//	        for (int i = 1; i <= 10; i++) {
//	            numbers.add(i);
//	        }
//
//	        // Obtaining an iterator
//	        Iterator<Integer> iterator = numbers.iterator();
//
//	        // Removing even numbers during iteration
//	        while (iterator.hasNext()) {
//	            Integer number = iterator.next();
//	            if (number % 2 == 0) {
//	                iterator.remove(); // Safely removes the current element
//	            }
//	        }
//
//	        // Displaying the modified list
//	        System.out.println("List after removing even numbers: " + numbers);
		
//		List<String> list = new ArrayList<>();
//		  list.add("xyz");
//		  list.add("pqr");
//		  list.add("abc");
//		  
//		  ListIterator<String> itr = list.listIterator();
//		  System.out.println("forward direction");
//		   while(itr.hasNext())
//		   {
//			   System.out.println(itr.next());
//		   }
//		
//		   ListIterator<String> iterator = list.listIterator();
//		   System.out.println("backward direction");
//		   while(itr.hasPrevious())
//		   {
//			   System.out.println(itr.previous());
//		   }
//		   
//		   while(itr.hasNext())
//		   {
//			   String test = itr.next();
//			  if(test.equals("pqr"))
//			  {
//				  itr.set("lmn");
//			  }
//		   }
//		   System.out.println("modified list");
//		   for(String n : list)
//		   {
//			   System.out.println(n);
//		   }
		
		Vector<String> vector = new Vector<>();
		 vector.add("abc");
		 vector.add("xyz");
		 vector.add("pqr");
		 
		 Enumeration<String> itr  = vector.elements();
		 while(itr.hasMoreElements())
			 System.out.println(itr.nextElement());
		
	    }

}
