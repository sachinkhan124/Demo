package demo;

import java.util.Arrays;

public class AnagramUsingArrays {
	
	public static boolean IsAnagram(String a ,String b)
	{
		boolean ret =false;
		if(a!=null && b!=null)
		{
			char[] arrayA = a.toLowerCase().toCharArray();
			char[] arrayB = b.toLowerCase().toCharArray();
			 Arrays.sort(arrayA);
			 Arrays.sort(arrayB);
			 ret =Arrays.equals(arrayA, arrayB);
			 
		}
		return ret;
	}

	public static void main(String[] args) {
		String a ="Listen";
		String b="Silent";
		boolean ret = IsAnagram(a, b);
		if(ret)
		{
			System.out.println("a and b are anagram");
		}
		else
		{
			System.out.println("a and b arenot anagram");
		}

	}

}
