package abstractdemo;

import java.util.HashMap;
import java.util.Map;

public class FindPair {

	public static void main(String[] args) {
    
		int [] arr = {1,2,3,4,7,5,8};
		int num=12;
//		int low=0 ,high=arr.length-1;
//		while(low<high)
//		{
//			if(arr[low] +arr[high] < num)
//			{
//				low++;
//			}
//			else if(arr[low] + arr[high] > num)
//			{
//				high--;
//			}
//			else if(arr[low] + arr[high] == num)
//			{
//				System.out.println("Find pair:"+arr[low]+ ","+arr[high]);
//				low++;
//				high--;
//			}
//			
//		}
		
	 Map<Integer, Integer> map = new HashMap<>();
	 for(int i=0;i<arr.length;i++)
	 {
		 int pair = num-arr[i];
	 
	 if(map.containsKey(pair))
	 {
		 System.out.println("Find pair:"+arr[i]+","+pair);
	 }
	  
	 map.put(arr[i],i);
	 }
	}

}
