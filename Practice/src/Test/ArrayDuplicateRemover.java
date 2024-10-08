package Test;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayDuplicateRemover {
 
	private static int[] removeDuplicate(int[] array) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int num : array)
		{
			set.add(num);
		}
		int [] result = new int [set.size()];
		int i=0;
		for(int num :set)
		{
			result[i++]=num;
		}
		return result;
	}


   public static void main(String[] args)
   {
	   int [] array = {1,2,4,2,5,6};
	   int [] uniqueArray =removeDuplicate(array);
	   System.out.println("Before removing Element:"+Arrays.toString(array));
	   System.out.println("After removing Element:"+Arrays.toString(uniqueArray));
   }

   


   
   
}