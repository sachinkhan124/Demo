package Test;

public class MinimumNumber {

	public static void main(String[] args) {
		int [] numbers = {2,3,5,6,1,7,8};
		int minimum =findNumber(numbers);
		System.out.println("Minimum Number:"+minimum);

	}

	private static int findNumber(int[] numbers) {
		if(numbers.length==0)
		{
			throw new IllegalArgumentException("Invalid int number");
		}
		int min =numbers[0];
		for(int i=0 ;i<numbers.length;i++)
		{
			if(numbers[i] < min)
			{
				min =numbers[i];
			}
		}
		return min;
	}

}
