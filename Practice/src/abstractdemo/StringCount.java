package abstractdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCount {

	public static void main(String[] args) {
		String  str = "java j2ee java jsp";
		stringCount(str);
		System.out.println();

	}

	private static void stringCount(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] arr = str.toCharArray();
		for(char c : arr)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		for(Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println("Key:"+entry.getKey()+"value:"+entry.getValue());
			}
		}
		
		
	}

}
