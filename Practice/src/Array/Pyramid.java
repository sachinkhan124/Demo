package Array;

public class Pyramid {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			for(int j=7-i;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
//    *
//   * *
// *  *  *