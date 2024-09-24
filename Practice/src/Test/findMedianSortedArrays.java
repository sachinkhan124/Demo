package Test;

import java.util.Arrays;

public class findMedianSortedArrays {

	public static void main(String[] args) {
		int[] num1= {1,3,5,7};
		int[] num2= {2,4,6,8};
		double result =findMedianSortedArrays(num1,num2);
		System.out.println(result);

	}

	private static double findMedianSortedArrays(int[] num1, int[] num2) {
		
		int[] mergeArray=new int[num1.length+num2.length];
		for(int i=0;i<num1.length;i++)
		{
			mergeArray[i]=num1[i];
		}
		for(int i=0;i<num2.length;i++)
		{
			mergeArray[num1.length+i]=num2[i];
		}
		
		  Arrays.sort(mergeArray);
		  int n = mergeArray.length;
		  if (n % 2 == 1) {
	           return mergeArray[n / 2];
	        } else {
	            
	            return (mergeArray[(n / 2) - 1] + mergeArray[n / 2]) / 2.0;
	        }
	}

}
