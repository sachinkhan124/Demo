package Strings;

public class ConvertStringToInt {

	public static void main(String[] args) {
		String str = "1337c0d3";
		int result = StringToInt(str);
		System.out.println("Integer:" + result);

	}

	private static int StringToInt(String s) {
		int i=0,n=s.length();
		while(i< n && s.charAt(i)==' ')
		{
			i++;
		}
		int sign=1;
		while(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-'))
		{
			sign=(s.charAt(i)=='-') ? -1 :1;
		}
		int result=0;
		while(i< n && Character.isDigit(s.charAt(i)))
		{
			int digit = s.charAt(i)-'0';
			
			if(result >(Integer.MAX_VALUE-digit)/10)
			{
				return (sign==1)? Integer.MAX_VALUE:Integer.MIN_VALUE;
			}
			result=result*10+digit;
			i++;
		}
		
		
		return result*sign;
	}

//	private static int StringToInt(String s) {
//		try {
//			return Integer.parseInt(str);
//		}
//		catch(NumberFormatException ex)
//		{
//			throw new IllegalArgumentException("invalid Integer Format");
//		}

		// Step 1: Ignore leading whitespaces
//		int i = 0, n = s.length();
//		while (i < n && s.charAt(i) == ' ') {
//			i++;
//		}
//
//		// Step 2: Check for optional sign
//		int sign = 1;
//		if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
//			sign = (s.charAt(i) == '-') ? -1 : 1;
//			i++;
//		}
//
//		// Step 3: Convert the digits to an integer
//		int result = 0;
//		while (i < n && Character.isDigit(s.charAt(i))) {
//			int digit = s.charAt(i) - '0';
//
//			// Step 4: Handle overflow/underflow
//			if (result > (Integer.MAX_VALUE - digit) / 10) {
//				return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//			}
//
//			result = result * 10 + digit;
//			i++;
//		}
//
//		// Step 5: Return the final integer value with the sign
//		return result * sign;
//	}

}
