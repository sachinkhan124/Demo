package Java8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateExample {

	public static void main(String[] args) {
		
	Map<String, String> map = new HashMap<>();
	
	map.put("1", "Alice");
	map.put("2", "slice");
	map.put("3", "Alice");
	map.put("4", "expert");
	
	System.out.println("original Map :"+map);
	 removeDuplicates(map);
  
	 System.out.println("Removing Map:"+map);
	}
   
	public static void removeDuplicates(Map<String, String> map)
	{
		Set<String> duplicate = new HashSet<>();
		
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, String> entry = itr.next();
			String value = entry.getValue();
			
			if(!duplicate.add(value))
			{
				itr.remove();
			}
		}
	}
	
}
