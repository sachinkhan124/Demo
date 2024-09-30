package Test;

public class IsPalindrome {

	public static void main(String[] args) {
//		String str = "nitin";
//		boolean result = palindrome(str);
//		System.out.println("result:"+result);
		int num =10;
		boolean result = palindrome(num);
		System.out.println(result);

	}
//
//	private static boolean palindrome(String str) {
//		String reverse = new StringBuilder(str).reverse().toString();
//		return str.equals(reverse);
//	}

	private static boolean palindrome(int num) {
		if (num < 0) {
			return false;
		}
		int temp, rev = 0;
		int originalNo=num;
		while (num != 0) {
			temp = num % 10; //
			rev = rev * 10 + temp;
			num = num / 10;
		}
		return rev == originalNo;

	}

}
