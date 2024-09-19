package Test;

public class IsPalindrome {

	public static void main(String[] args) {
		String str = "nitin";
		boolean result = palindrome(str);
		System.out.println("result:"+result);

	}

	private static boolean palindrome(String str) {
		String reverse = new StringBuilder(str).reverse().toString();
		return str.equals(reverse);
	}

}
