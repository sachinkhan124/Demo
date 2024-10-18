package Strings;

import java.util.HashSet;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		String str = "pwwkew";
		int result = lengthOfLongestSubstring(str);
		System.out.println(result);

	}

	private static int lengthOfLongestSubstring(String str) {
		HashSet<Character> set = new HashSet<>();
		int maxLength = 0;
		int start = 0;
		for (int end = 0; end < str.length(); end++) {
			Character currentChar = str.charAt(end);
			while (set.contains(currentChar)) {
				set.remove(str.charAt(start));
				start++;
			}
			set.add(currentChar);
			maxLength = Math.max(maxLength, end - start + 1);
		}

		return maxLength;

	}

}
