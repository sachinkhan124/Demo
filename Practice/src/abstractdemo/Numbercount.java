package abstractdemo;

import java.util.HashMap;
import java.util.Map;

public class Numbercount {

	public static  void main(String[] args) {
		
		int [] arr = {1,2,4,2,4,3,6,7,2,3};
		
		Map<Integer, Integer> count = new HashMap<>();
		for(Integer n : arr)
		{
			if(count.containsKey(n))
			{
				count.put(n, count.getOrDefault(n, 0)+1);
			}
			else
			{
				count.put(n, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry :count.entrySet())
		{
			System.out.println(","+entry.getKey()+" occurs "+entry.getValue());
		}
	

	
	}

}
