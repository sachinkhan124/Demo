package Test;

public class RegularExpression {

	

	    public static void main(String[] args) {
	        String s = "ab";
	        String p = ".*c";
	        boolean result = isMatch(s, p);
	        System.out.println(result);  // Output: false
	    }

	    private static boolean isMatch(String s, String p) {
	        // Base case: if the pattern is empty, return true if the string is also empty
	        if (p.isEmpty()) {
	            return s.isEmpty();
	        }

	        // Check if the first character of s matches the first character of p
	        boolean firstmatch = (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));

	        // Handle the '*' case
	        if (p.length() >= 2 && p.charAt(1) == '*') {
	            // Two cases:
	            // 1. '*' means we can ignore the character before '*' (move pattern ahead)
	            // 2. If the first character matches, we try to match the rest of the string with the current pattern
	            return (isMatch(s, p.substring(2)) ||
	                    (firstmatch && isMatch(s.substring(1), p)));
	        } else {
	            // No '*' case: match the first character and move both string and pattern ahead
	            return firstmatch && isMatch(s.substring(1), p.substring(1));
	        }
	    }
	}



