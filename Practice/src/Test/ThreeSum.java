package Test;

import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		int [] num1= {1,7,3};
		int [] num2= {2,5,7};
		int[]  num3= {6,7,3};
		int [] result = AddNumber(num1,num2,num3);
		System.out.println(Arrays.toString(result));

	}

	private static int[] AddNumber(int[] num1, int[] num2, int[] num3) {
		int maxLength = Math.max(num1.length, Math.max(num2.length, num3.length));

		int [] result = new int[maxLength+1];
		int carry=0;
		for(int i=0;i<maxLength;i++)
		{
			int digit1= (i<num1.length)? num1[i]:0;
			int digit2= (i<num2.length)? num2[i]:0;
			int digit3= (i<num3.length)? num3[i]:0;
			int sum=digit1+digit2+digit3+carry;
			carry=sum/10;
			result[i]=sum%10;
		}	 
			if(carry>0)
			{
			    result[maxLength]=carry;
			}
			if(result[maxLength]==0)
			{
				return Arrays.copyOf(result, maxLength);
			}
			else
			{
				return result;
			}
		
		
		
	}

}
