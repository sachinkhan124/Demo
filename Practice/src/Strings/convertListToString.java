package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class convertListToString {

	
	public static void main(String[] args) {
		
     List<String> strings = List.of("xyz","pqr","lmn","fhf");
     
      String myResult = ConvertListToString(strings, ", ");
      System.out.println(myResult);
      
      List<String> list = convertStringToList(myResult,",");
       System.out.println("String to list:"+list);
		
	}

	private static String ConvertListToString(List<String> list, String demiliter) {
	    
		String str1 =  "Home";
		String str2 =  "Home";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2);
		System.out.println(str2.equals(str2));
		
		
		  
  		StringBuilder sb = new StringBuilder();
		for(int i=0; i<list.size();i++)
		{
			sb.append(list.get(i));
			if(i<list.size()-1)
			{
				sb.append(demiliter);
			}
		}
		 
		return sb.toString();
	}
	
//	private static List<String> ConvertStringToList(String str , String demiliter)
//	{
//		String [] spiltArray = str.split(demiliter);
//		return  Arrays.asList(spiltArray);
//		
//	}
	
	private static List<String> convertStringToList(String str, String delimiter) {
	    String[] splitArray = str.split(delimiter);
	    return Arrays.stream(splitArray)
	                 .map(String::trim) // Trim whitespace from each string
	                 .collect(Collectors.toList());
	}

	
}
