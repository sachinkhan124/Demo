package Strings;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String str ="abanbcdcdfghd";
		char [] count = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<>();
		for(char c : count)
		{
			if(charCount.containsKey(c))
			{
				charCount.put(c, charCount.get(c)+1);
		
			}
			else
			{
				charCount.put(c, 1);
			}
		}
         System.out.println(charCount);
	}

}
