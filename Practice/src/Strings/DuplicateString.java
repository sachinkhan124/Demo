package Strings;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {

		
		String arr [] = {"xyz","pqr","xyz","lmn"};
		 DuplicateString(arr);

	}

	private static void DuplicateString(String[] arr) {
		Set<String> set = new HashSet<>();
		Set<String> duplicate = new HashSet<>();
		for(String n :arr)
		{
			if(!set.add(n))
			{
				duplicate.add(n);
			}
		}
 		System.out.println("DuplicateString:"+duplicate);
	}
	
	

}
