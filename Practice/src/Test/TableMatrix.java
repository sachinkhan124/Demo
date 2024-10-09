package Test;

import java.util.Scanner;

public class TableMatrix {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int N=sc.nextInt();
//		int M =sc.nextInt();
//		int [] [] result=tableMat(N,M);
//		
//		for(int i=0;i<N;i++)
//		{
//			for(int j=0;j<M;j++)
//			{
//				System.out.print(result[i][j]+" ");
//			}
//			System.out.println();
//		}
//
//	}
//
//	private static int[][] tableMat(int N, int M) {
//		int [] [] result = new int[N][M];
//		for(int i=0;i<N;i++)
//		{
//		   int base =i+1;
//		   for(int j=0;j<M;j++)
//		   {
//			   result[i][j]=base*(j+1);
//		   }
//		}
//		return result;
//	}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row & column :");
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		
		
	}	
}
