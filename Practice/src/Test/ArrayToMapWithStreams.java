package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayToMapWithStreams {

	public static void main(String[] args) {
		String[] array = {"apple", "banana", "fdfhhhh"};

        // Converting array to Map using Streams
        Map<Integer, String> map = Arrays.stream(array)
                                         .collect(Collectors.toMap(
                                             element -> Arrays.asList(array).indexOf(element), 
                                             element -> element
                                         ));

        // Printing the Map
        map.forEach((key, value) -> System.out.println("Index: " + key + ", Value: " + value));
		
//		Map<Integer, String> map = new HashMap<>();
//		for(int i=0;i<array.length;i++)
//		{
//			map.put(i, array[i]);
//		}
//		for(Map.Entry<Integer, String> entry : map.entrySet())
//		{
//			System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
//		}
		
    }
}
