package Test;

import java.util.HashSet;

public class Findpair {

	public static void main(String[] args) {
		int [] num = {2,5,6,7,9};
		int target =12;
		findpairs(num,target);
		

	}

	private static void findpairs(int[] num, int target) {
		HashSet<Integer> set = new HashSet<>();
		for(int nums :num )
		{
			int pair = target-nums;
			if(set.contains(pair))
			{
				System.out.println("Find pair:"+nums+","+pair);
			}
			set.add(nums);
		}
		
	}

}
