package Test;

public class SumOfArray {

	public static void main(String[] args) {
		int [] array = {2,4,5,6,7,8};
		int sum=0;
//		for(int n :array)
//		{
//			sum=sum*n;
//		}
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
         System.out.println(sum);
	}

}
