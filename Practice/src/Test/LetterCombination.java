package Test;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
	
	private static final String[] KEYPAD = {
	        "",     // 0 (no letters)
	        "",     // 1 (no letters)
	        "abc",  // 2
	        "def",  // 3
	        "ghi",  // 4
	        "jkl",  // 5
	        "mno",  // 6
	        "pqrs", // 7
	        "tuv",  // 8
	        "wxyz"  // 9
	    };
	
	private static List<String> LetterCombination(String digits) {
		List<String> result = new ArrayList<>();
		if(digits==null || digits.length()==0)
		{
			return result;
		}
		 backtrack(result,new StringBuilder(),digits,0);
		return result;
	}
	
	
	

	private static void backtrack(List<String> result, StringBuilder combinations, String digits, int index) {
		
		if(index==digits.length())
		{
			result.add(combinations.toString());
			return;
		}
		
	    String letters = KEYPAD[digits.charAt(index)-'0'];
	    for(char letter :letters.toCharArray())
	    {
	    	combinations.append(letter);
	    	backtrack(result,combinations,digits,index+1);
	    	combinations.deleteCharAt(combinations.length()-1);
	    }
	}




	public static void main(String[] args) {
		
		   String digits= "23";
		   List<String> combinations = LetterCombination(digits);
		   System.out.println(combinations);

		}




	
	
}
