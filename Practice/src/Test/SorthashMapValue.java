package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SorthashMapValue {

//	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<>();
//		map.put("hsshss", 95);
//		map.put("xyz", 70);
//		map.put("pqr", 15);
//		map.put("rst", 97);
//		map.put("lmn", 37);
//		
//		System.out.println(map);
//		map =sortByValue(map);
//		System.out.println(map);
//		
//
//	}
//
//	private static Map<String, Integer> sortByValue(Map<String, Integer> map) {
//		Map<String, Integer> sort = new LinkedHashMap<>();
//		Set<Entry<String, Integer>> entry = sort.entrySet();
//		System.out.println(entry);
//		
//		List<Entry<String, Integer>> list = new ArrayList<>(entry);
//		 System.out.println(list);
//		 
//		 list.sort((x,y) -> x.getValue().compareTo(y.getValue()));
//		 System.out.println(list);
//		 
//		 for(Entry<String, Integer> lists : sort.entrySet())
//		 {
//			 sort.put(lists.getKey(), lists.getValue());
//		 }
//		return sort;
//	}

		public static void main(String[] args) {
			Map<String, Integer> scores = new HashMap<>();

			scores.put("David", 95);
			scores.put("Jane", 80);
			scores.put("Mary", 97);
			scores.put("Lisa", 78);
			scores.put("Dino", 65);

			System.out.println(scores);

			scores = sortByValue(scores);

			System.out.println(scores);
		}

		private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
			Map<String, Integer> sortedByValue = new LinkedHashMap<>();

			// get the entry set
			Set<Entry<String, Integer>> entrySet = scores.entrySet();
			System.out.println(entrySet);

			// create a list since the set is unordered
			List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
			System.out.println(entryList);

			// sort the list by value
			entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
			System.out.println(entryList);

			// populate the new hash map
			for (Entry<String, Integer> e : entryList)
				sortedByValue.put(e.getKey(), e.getValue());

			return sortedByValue;
		}

	}


