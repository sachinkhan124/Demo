package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
    	int[] rst = new int[2];
    	if(nums== null || nums.length<=1)
    	{
    		return rst;
    	}
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
    	    int temp=target-nums[i];
    	   if(map.containsKey(temp))
    	   {
    		   rst[0]=map.get(temp);
    		   rst[1]=i;
    		   //break;		   
    	   }
    	   map.put(nums[i],i);
       }
       return rst;
    }
    
    public static void main(String[] args)
    {
    	int arr[] = {2,7,13,15};
    	int target =26;
    	int [] result = twoSum(arr,target);
    	System.out.println(Arrays.toString(result));
    }
}