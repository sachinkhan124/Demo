package Test;

import java.util.HashMap;

public class IntegerNo {
	
	
	private static final HashMap<Character, Integer>  map = new HashMap<>();
	
	static
	{
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}
   
	 public static int RomanToInt(String s) {
	        int total = 0;
	        int prevValue = 0;

	        
	        for (int i = s.length() - 1; i >= 0; i--) {
	            int currentValue = map.get(s.charAt(i));

	           
	            if (currentValue < prevValue) {
	                total -= currentValue;
	            } else {
	                total += currentValue;
	            }

	            
	            prevValue = currentValue;
	        }

	        return total;
	    }

	 public static void main(String[] args) {
			System.out.println(RomanToInt("LVIII"));
		}



	


}
