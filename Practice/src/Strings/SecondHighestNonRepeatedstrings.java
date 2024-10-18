package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondHighestNonRepeatedstrings {

	public static void main(String[] args) {
     
		List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape", "grape");
		String secondHighestString = NonrepeatedStrings(strings);
		System.out.println(secondHighestString);

	}

	private static String NonrepeatedStrings(List<String> strings) {
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(String str : strings)
		{
			frequencyMap.put(str, frequencyMap.getOrDefault(str, 0)+1);
		}
		String highest = null;
		String secondHighest =null;
		for(Map.Entry<String, Integer> entry : frequencyMap.entrySet())
		{
			if(highest == null || entry.getValue() > frequencyMap.get(highest))
			{
				secondHighest = highest;
				highest = entry.getKey();
			}
			else if(secondHighest == null || entry.getValue() > frequencyMap.get(secondHighest))
			{
				secondHighest = entry.getKey();
			}
		}
		
		return secondHighest;
	}

	
	
}
