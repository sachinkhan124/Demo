package Strings;

public class ReverseString1 {
	
	

	public static void main(String[] args) {
		String str ="hello world";
		String reverseString =reverseString(str);
		System.out.println("ReverseString:"+reverseString);

	}

	private static String reverseString(String str) {
		StringBuilder builder = new StringBuilder(str);
		
		return  builder.reverse().toString();
	}

}
