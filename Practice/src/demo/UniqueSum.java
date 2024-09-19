package demo;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UniqueSum {

	public static void main(String[] args) {
		int []arr= {1,2,1,3,2,1,4};
		System.out.println(UniqueOfSum(arr));
}

//	public static int UniqueOfSum(int []arr)
//	{
//		int sum=0;
//		Map<Integer, Integer> map = new LinkedHashMap<>();
//		for(Integer n : arr)
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
//		for(Map.Entry<Integer, Integer> entry : map.entrySet())
//		{
//			if(entry.getValue()==1)
//			{
//				sum+=entry.getKey();
//			}
//		}
//		return sum;
//	}
	
	
	public static int UniqueOfSum(int [] arr)
	{
		int sum =0;
		Set<Integer> uniqueNo = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for(Integer n : arr)
		{
			if(!uniqueNo.add(n))
			{
				duplicate.add(n);
			}
		}
		for(Integer n : uniqueNo)
		{
			if(duplicate.add(n))
			{
			   sum=sum+n;
			}
		}
		return sum;
	}
		
	
	

}
