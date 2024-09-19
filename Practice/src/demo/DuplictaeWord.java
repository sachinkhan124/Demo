package demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplictaeWord {

	public static void main(String[] args) {

	//	String[] listContainingDuplicates = "a new, boy with new haircut boy, 3pm to boy 8pm margian 3pm to ghost".split("[,\\s]+");
       
//		LinkedHashSet<String> duplicates = new LinkedHashSet<>();
//		Set<String> temp = new HashSet<>();
//		for(String current : listContainingDuplicates)
//		{
//			if(!temp.add(current))
//			{
//				duplicates.add(current);
//			}
//			
//		}
//		System.out.println("Duplicates:"+duplicates);
		
		String str= "a new, boy with new haircut boy, 3pm to boy 8pm margian 3pm to ghost";
		str = str.replaceAll(",", "");

		List<String> duplicates = Arrays.stream(str.split(" "))
		    .filter(s -> !s.isEmpty())
		    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		    .entrySet()
		    .stream()
		    .filter(e -> e.getValue() > 1)
		    .map(e -> e.getKey())
		    .collect(Collectors.toList());
		    
		System.out.println("Duplicate"+duplicates);
	}

}
