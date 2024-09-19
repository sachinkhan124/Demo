package Java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastusingHashmap {

	public static void main(String[] args) {
       
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		
	    Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
	     while(iterator.hasNext())
	     {
	       Map.Entry<Integer, String> entry =  iterator.next();
	       
	       System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
	       if(entry.getKey()==1)
	       {
	    	   map.remove(entry);
	       }
	     }
	    	 
	}

}
