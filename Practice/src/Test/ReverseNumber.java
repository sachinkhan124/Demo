package Test;

public class ReverseNumber {

	public static void main(String[] args) {
//	 int num =12345;
//	 int rev=0 ,temp;
//	 while(num>0)
//	 {
//		 temp =num%10;
//		 rev=rev*10+temp;
//		 num=num/10;
//	 }
//       System.out.println("reverse:"+rev);
//	}

		Long num =-1534236469L;
		Long reverse = reverse(num);
		System.out.println(reverse);
}

	private static Long reverse(Long num) {
		Long temp,rev=0L;
		while(num>0 || num<0)
		{
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		return rev;
	}

//	  int reversed = 0;
//      while (x != 0) {
//          int digit = x % 10;
//          x /= 10;
//          if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
//          if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
//          reversed = reversed * 10 + digit;
//      }
//      return reversed;   
}