package Test;

public class Factorial {
	
	public static int factorial(int num)
	{
		if(num==0 || num==1)
		{
			return 1;
		}
		else
		{
			return num*factorial(num-1);
		}
	}

	public static void main(String[] args) {
		int number =5;
		int result = factorial(number);
		System.out.println("Factorial:"+result);
//		int num=5,fact=1;
//		for(int i=1;i<=num;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println("factorial:"+fact);
	}
	
}
