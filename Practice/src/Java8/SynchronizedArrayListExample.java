package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayListExample {

	public static void main(String[] args) {
        
		List<String> list =  new ArrayList<>();
//		synchronized(list)
//		{	
//			list.add("xyz");
//			list.add("pqr");
//			list.add("rlt");
//	    }
//		
//		synchronized (list) {
//			
//			for(String lists : list)
//			{
//				System.out.println(lists);
//			}
//			
//		}
		
		List<String> synchronizedList = Collections.synchronizedList(list);
		synchronizedList.add("xyz");
		synchronizedList.add("pqr");
		synchronizedList.add("rlt");
		
		
		synchronized (synchronizedList) {
			for(String n : synchronizedList)
			{
				System.out.println(n);
			}
		}
	}
	

}
