package Test;

import java.util.HashMap;
import java.util.Map;

public class ZigZagConversion {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		String result = convert(s, numRows);
		System.out.println(result); // Output: PAHNAPLSIIGYIR
	}

	//
	//P Y A I H R N A P L S I I GY A I H R N PAYPALISHIRING

	
//	private static String convert(String s, int numRows) {
//		 StringBuilder result = new StringBuilder();
//
//		for (int i = 1; i <= numRows; i++) {
//			for (int j = i; j <= s.length(); j++) {
//				if (i % 2 == 0) {
//					if (j % 2 == 0) {
//						System.out.print(s.charAt(j - 1));
//						 result.append(s.charAt(j - 1));
//					}
//
//					else {
//						System.out.print("");
//						 result.append(s.charAt(j - 1));
//					}
//
//				} else {
//					if (j % 2 != 0) {
//						System.out.print(s.charAt(j - 1));
//						 result.append(s.charAt(j - 1));
//					}
//
//					else {
//						System.out.print("");
//						 result.append(s.charAt(j - 1));
//					}
//
//				}
//
//			}
//			System.out.println();
//		}
//
//		System.out.println(result.length());
//		System.out.println(result);
//		
//		
//		System.out.println();
//	    return null;
//	}

	private static String convert(String s, int numRows) {
		
		if (numRows == 1) return s; // Handle edge case

        Map<Integer, StringBuilder> map = new HashMap<>();
        for (int i = 0; i < numRows; i++) {
            map.put(i, new StringBuilder());
        }

        int rowptr = 0;
        boolean isGoingDown = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.get(rowptr).append(c);

            // Check if we need to reverse direction
            if (rowptr == 0 || rowptr == numRows - 1) {
                isGoingDown = !isGoingDown;
            }

            // Move up or down depending on the direction
            rowptr += isGoingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(map.get(i));
        }

        return result.toString();
    }
}
