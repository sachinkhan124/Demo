package Strings;

import java.util.HashMap;
import java.util.Map;

public class ChracterCount {

	public static void main(String[] args) {
     
//      Map<Character, Integer> map = new HashMap<>();
//      String str = "Hello world";
//      char [] arr = str.toCharArray();
//      for(char c : arr)
//      {
//    	  if(c!=' ')
//    	  {
//    		  if(map.containsKey(c))
//    		  {
//    			  map.put(c, map.get(c)+1);
//    		  }
//    		  else
//    		  {
//    			  map.put(c, 1);
//    		  }
//    	  }
//      }
		  String str = "Hello world";
		  Map<Character, Integer> countMap = countCharacter(str);
		
      for(Map.Entry<Character, Integer> entry : countMap.entrySet())
      {
    	  System.out.println(", "+entry.getKey()+ " occurs "+entry.getValue());
      }
		
		
	}

	private static Map<Character, Integer> countCharacter(String str) {
		
		Map<Character, Integer> count = new HashMap<>();
		
		for(char c : str.toCharArray())
		{
			count.put(c, count.getOrDefault(c, 0)+1);
		}
		
		
		return  count;
	}
	
	

}
