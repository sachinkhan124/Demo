package Test;

import java.util.Arrays;

public class AddNumber {
	

	public static void main(String[] args) {
		int [] num1 = {2,4,3};
		int [] num2 = {7,8,2};
		int [] result = Addnumber(num1,num2);
		System.out.println(Arrays.toString(result));
		
	}

	private static int[] Addnumber(int[] num1, int[] num2) {
		int maxLength = Math.max(num1.length,num2.length);
		int [] result = new int[maxLength+1];
		int carry=0;
		for(int i=0;i<maxLength;i++)
		{
			int digit1=(i<num1.length)? num1[i]:0;
			int digit2=(i<num2.length)? num2[i]:0;
			int sum =digit1+digit2+carry;
			carry = sum/10;
			result[i]=sum%10;
		}
		if(carry>0)
		{
			result[maxLength]=carry;
		}
		if(result[maxLength] ==0)
		{
			return Arrays.copyOf(result, maxLength);
		}
		else
		{
			return result;
		}
		
	}
	
		
	}

