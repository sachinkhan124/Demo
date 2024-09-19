package abstractdemo;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
      int [] number = {1,2,1,2,3,4};
      DuplicateNumber(number);

	}

	private static void DuplicateNumber(int[] number) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicateNo = new HashSet<>();
		for(Integer n : number)
		{
			if(!set.add(n))
		   	{
				duplicateNo.add(n);
			}
		}
		System.out.println("Duplicate Number:"+duplicateNo);
	}


}
