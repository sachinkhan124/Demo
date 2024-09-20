package abstractdemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {

	public static void main(String[] args) {
      int [] number = {1,2,1,2,3,3,4};
      DuplicateNumber(number);
	}   
      

//	private static void DuplicateNumber(int[] number) {
//		Set<Integer> set = new HashSet<>();
//		Set<Integer> duplicateNo = new HashSet<>();
//		for(Integer n : number)
//		{
//			if(!set.add(n))
//		   	{
//				duplicateNo.add(n);
//			}
//		}
//		System.out.println("Duplicate Number:"+duplicateNo);
//	}

	private static void DuplicateNumber(int[] number) {
		Set<Integer> uniqueElement = new HashSet<>();
		List<Integer> duplicate = Arrays.stream(number).filter(i -> !uniqueElement.add(i)).boxed().collect(Collectors.toList());
		System.out.println(duplicate);
		
	}

//	private static void DuplicateNumber(int[] number) {
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for(Integer n : number)
//		{
//			if(map.containsKey(n))
//			{
//				map.put(n, map.get(n)+1);
//			}
//			else
//			{
//				map.put(n, 1);
//			}
//		}
//		
//		for(Entry<Integer, Integer> entry :map.entrySet())
//		{
//			if(entry.getValue()>1)
//			{
//		       System.out.println("key"+entry.getKey()+"Value:"+entry.getValue());
//			}
//		}
//		
//	}
	}


