package Array;

public class Array3 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=5;i++)//outer loop
		{
			for(int j=1;j<=i;j++)  //inner loop
			{
				System.out.print(num+" ");//space nd increment value
				num++;
			}
			System.out.println();  //next line
		}
	}

}
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15