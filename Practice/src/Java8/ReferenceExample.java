package Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ReferenceExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("abc","jdld","kdldld","dkfkf");

		Map<Integer, List<String>> namebylength = names.stream().collect(Collectors.groupingBy(String ::length));
		System.out.println(namebylength);
		
		Long count = names.stream().filter(w -> w.length()>4).map(String :: toUpperCase).sorted().count();
		
		System.out.println(count);
		
		
		Map<String, Integer>  map = new HashMap<>();
		map.put("abc", 1);
		map.put("pqr", 2);
		map.put("xyz", 3);
		
		System.out.println("value of Two:"+map.get("pqr"));
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
		  System.out.println("Value:"+entry.getValue()+"Key:"+entry.getKey());
		}
		
		Map<String, Integer> linkedHashmap = new LinkedHashMap<>();
		linkedHashmap.put("abc", 1);
		linkedHashmap.put("pqr", 2);
		linkedHashmap.put("xyz", 3);
		
		System.out.println("Value :"+linkedHashmap.get("pqr"));
		for(Map.Entry<String,Integer> entry : linkedHashmap.entrySet())
		{
			System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
		}
		
		
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("abc", 1);
		treeMap.put("pqr", 2);
		treeMap.put("xyz", 3);
		
		System.out.println("value:"+ treeMap.get("pqr"));
		
		for(Map.Entry<String, Integer> entry : treeMap.entrySet())
		{
			System.out.println("Key:"+entry.getKey()+"value"+entry.getValue());
		}
		
		
	}

}
