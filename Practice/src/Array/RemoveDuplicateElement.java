package Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
//		int [] arr = {1,2,3,1,4,5};
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//			
//			}
//		}
		
		int [] arr= {1,2,3,1,4,5};
		System.out.println(DuplictateNo(arr));
	}

	private static Set<Integer> DuplictateNo(int[] arr) {
	 Set<Integer> set = new HashSet<>();
	 for(int m :arr)
	 {
		 set.add(m);
	 }
	 
	  return set;
	}

}
