package Array;

public class Array20 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)     //outer loop
		{
			for(int j=2*7-i;j>i;j--)  //iterate inner loop
			{
				System.out.print(" "); //prints the space
			}
			for(int j=1;j<=i;j++) //iterate inner loop
			{
				System.out.print(j+" "); //prints the number
			}
			System.out.println();
		}

	}

}


