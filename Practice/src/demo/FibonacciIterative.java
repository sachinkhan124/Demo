package demo;

import java.util.Scanner;

public class FibonacciIterative {
	
	public static int FibonacciNo(int n)
	{
		if(n<=1)
		{
			return n;
		}
		
		int fib1=0;
		int fib2=1;
		int fibn=0;
		for( int i=2 ;i<=n; i++)
		{
			fibn=fib1+fib2;
			fib1=fib2;
			fib2=fibn;
		}
		return fibn;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		int nFibonacii= FibonacciNo(n);
		System.out.println(nFibonacii);

	}

}
