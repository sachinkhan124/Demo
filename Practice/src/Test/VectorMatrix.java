package Test;

import java.util.Scanner;

public class VectorMatrix {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a size of array");
//        int[] array = new int[sc.nextInt()];
//		System.out.println("Enter a element of array");
//		for (int i = 0; i < array.length; i++) {
//			array[i] = sc.nextInt();
//		}
//		int sum = 0;
//		for (int i = 0; i < array.length; i++) {
//			sum = sum + array[i];
//		}
//		System.out.println(sum);
//
//		int remainingBalls = 0;
//		int numberOfWaysToChoose = 0;
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				if (array[i] == array[j]) {
//
//					remainingBalls = sum - array[i];
//
//				}
//			}
//
//			if (remainingBalls % 2 == 0) {
//				numberOfWaysToChoose++;
//
//			}
//
//		}
//		System.out.println("Numver of ways :" + numberOfWaysToChoose);
//	}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size");
		int [] array = new int [sc.nextInt()];
		System.out.println("Enter a Array:");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		System.out.println(sum);
		int remainings=0;
		int numOfwaysToChoose=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j])
				{	
				remainings=sum-array[i];
				}
			}
			if(remainings%2==0)
			{
				numOfwaysToChoose++;
			}
		}
		System.out.println("Number of ways:"+numOfwaysToChoose);
	}
		
}
