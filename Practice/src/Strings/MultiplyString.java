package Strings;

public class MultiplyString {

	public static void main(String[] args) {
		String num1 = "312";
		String num2 = "222";
		String result = multiplyStrings(num1, num1);
		System.out.println(result.toString());

	}

	private static String multiplyStrings(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}

		
		int[] result = new int[num1.length() + num2.length()];

		
		for (int i = num1.length() - 1; i >= 0; i--) {
			for (int j = num2.length() - 1; j >= 0; j--) {
				int digit1 = num1.charAt(i) - '0';
				int digit2 = num2.charAt(j) - '0';
				int product = digit1 * digit2;

				int p1 = i + j;
				int p2 = i + j + 1;

			
				int sum = product + result[p2];

				result[p2] = sum % 10; 
				result[p1] += sum / 10; 
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int num : result) {
			// Skip leading zeros
			if (!(sb.length() == 0 && num == 0)) {
				sb.append(num);
			}
		}
		   return sb.toString();
	}
}
